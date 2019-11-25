/*
 * Copyright (C) 2019 DV Bern AG, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

@Library('dvbern-ci') _

def DEPLOYMENT_BUILD = 'build-and-deploy'
def RELEASE_BUILD = 'release'
def SONAR_BUILD = 'sonar-analysis'
def SECURITY_CHECK_BUILD = 'security-check'

properties([
		disableConcurrentBuilds(),
		[
				$class  : 'BuildDiscarderProperty',
				strategy: [$class: 'LogRotator', numToKeepStr: '10']
		],
		[
				$class       : 'GithubProjectProperty',
				displayName  : '',
				projectUrlStr: 'https://github.com/dvbern/kibon-exchange-api-commons/'
		],
		parameters([
				choice(choices: [DEPLOYMENT_BUILD, RELEASE_BUILD, SONAR_BUILD, SECURITY_CHECK_BUILD],
						description: 'What type of build should the pipeline execute?', name: 'buildType'),
				string(defaultValue: '', description: 'This release version', name: 'releaseversion', trim:
						true),
				string(defaultValue: '', description: 'The next release version', name: 'nextreleaseversion',
						trim: true)
		])
])

def mvnVersion = "Maven_3.6.1"
def jdkVersion = "OpenJDK_1.8_222"
// comma separated list of email addresses of all team members (for notification)
def emailRecipients = "fabio.heer@dvbern.ch"

def masterBranchName = "master"
def developBranchName = "develop"
def featureBranchPrefix = "feature"
def releaseBranchPrefix = "release"
def hotfixBranchPrefix = "hotfix"

def genericSh = {cmd ->
	if (isUnix()) {
		sh cmd
	} else {
		bat cmd
	}
}

def doDeploymentBuild = {
	node {
		stage('Checkout') {
			checkout([
					$class           : 'GitSCM',
					branches         : scm.branches,
					extensions       : scm.extensions + [[$class: 'LocalBranch', localBranch: '']],
					userRemoteConfigs: scm.userRemoteConfigs
			])
		}

		String branch = env.BRANCH_NAME.toString()
		currentBuild.displayName = "${branch}-${pomVersion()}-${env.BUILD_NUMBER}"

		stage('Maven build') {
			def handleFailures = {error ->
				if (branch.startsWith(featureBranchPrefix)) {
					// feature branche failures should only notify the feature owner
					step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: emailextrecipients([[$class:
																													 'RequesterRecipientProvider']]), sendToIndividuals: true])

				} else {
					dvbErrorHandling.sendMail(emailRecipients, currentBuild, error)
				}
			}

			// in develop and master branches attempt to deploy the artifacts, otherwise only run to the verify phase.
			def verifyOrDeploy = {
				return (branch.startsWith(masterBranchName) || branch.startsWith(developBranchName)) ? "deploy" :
						"verify"
			}

			try {
				withMaven(jdk: jdkVersion, maven: mvnVersion) {
					genericSh 'mvn -U -Pdvbern.oss -Dmaven.test.failure.ignore=true clean ' + verifyOrDeploy()
				}
				if (currentBuild.result == "UNSTABLE") {
					handleFailures("build is unstable")
				}
			} catch (Exception e) {
				currentBuild.result = "FAILURE"
				handleFailures(e)
				throw e
			}
		}
	}
}

def doRelease = {
	currentBuild.displayName = "Release-${params.releaseversion}-${env.BUILD_NUMBER}"

	node {
		stage('Checkout') {

			checkout([
					$class           : 'GitSCM',
					branches         : [[name: "${developBranchName}"]],
					extensions       : [[$class: 'LocalBranch', localBranch: "${developBranchName}"]],
					userRemoteConfigs: scm.userRemoteConfigs
			])
		}

		stage('Release') {
			try {
				withCredentials([usernamePassword(credentialsId: 'jenkins-github-token', passwordVariable: 'password',

						usernameVariable: 'username')]) {
					withMaven(jdk: jdkVersion, maven: mvnVersion) {
						genericSh "mvn -Pdvbern.oss -B jgitflow:release-start " +
								"-DreleaseVersion=${params.releaseversion} " +
								"-DdevelopmentVersion=${params.nextreleaseversion}-SNAPSHOT " +
								"-Dusername=${username} " +
								"-Dpassword=${password} " +
								"jgitflow:release-finish"
					}
				}
			} catch (Exception e) {
				currentBuild.result = "FAILURE"
				// notify the team
				mail(to: emailRecipients, subject: "${env.JOB_NAME} Release failed", body: "See: " +
						"(<${BUILD_URL}/console|Job>)")
				throw e
			}
		}
	}
}

def doSonarAnalysis = {
	node {
		stage('Checkout') {
			checkout([
					$class           : 'GitSCM',
					branches         : scm.branches,
					extensions       : scm.extensions + [[$class: 'LocalBranch', localBranch: '']],
					userRemoteConfigs: scm.userRemoteConfigs
			])
		}

		String branch = env.BRANCH_NAME.toString()
		currentBuild.displayName = "Sonar Analysis ${branch}-${pomVersion()}-${env.BUILD_NUMBER}"

		stage('Sonar Analysis') {
			try {
				tool name: 'JACOCO_SONAR', type: 'com.cloudbees.jenkins.plugins.customtools.CustomTool'
				tool name: '', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
				withMaven(jdk: jdkVersion, maven: mvnVersion) {
					genericSh './mvnw -U -Pdvbern.oss -B clean ${SONAR_EXTRA_PROPS} ' +
							'${DVB_SONAR_ENABLE_JACOCO_COVERAGE} ' +
							'verify ${SONAR_MAVEN_GOAL}'
				}
				if (currentBuild.result == "UNSTABLE") {
					dvbErrorHandling.sendMail(emailRecipients, currentBuild, "build is unstable")
				}
				jacoco()
			} catch (Exception e) {
				currentBuild.result = "FAILURE"
				dvbErrorHandling.sendMail(emailRecipients, currentBuild, e)
				throw e
			}
		}
	}
}

def doSecurityCheck = {
	node {
		stage('Checkout') {
			checkout([
					$class           : 'GitSCM',
					branches         : scm.branches,
					extensions       : scm.extensions + [[$class: 'LocalBranch', localBranch: '']],
					userRemoteConfigs: scm.userRemoteConfigs
			])
		}

		String branch = env.BRANCH_NAME.toString()
		currentBuild.displayName = "Security Check ${branch}-${pomVersion()}-${env.BUILD_NUMBER}"

		stage('Dependency Check') {
			dependencyCheck additionalArguments: '', odcInstallation: 'latest'
			dependencyCheckPublisher pattern: ''
		}
	}
}

def pomVersion() {
	def pom = readMavenPom file: 'pom.xml'
	return pom.version
}

switch (params.buildType) {
case DEPLOYMENT_BUILD:
	doDeploymentBuild()
	break
case RELEASE_BUILD:
	doRelease()
	break
case SONAR_BUILD:
	doSonarAnalysis()
	break;
case SECURITY_CHECK_BUILD:
	doSecurityCheck()
	break;
default:
	doDeploymentBuild()
}
