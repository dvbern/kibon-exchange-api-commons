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

properties([
	disableConcurrentBuilds(),
	[$class: 'BuildDiscarderProperty', strategy: [$class: 'LogRotator', numToKeepStr: '10']],
	[
		$class       : 'GithubProjectProperty',
		displayName  : '',
		projectUrlStr: 'https://github.com/dvbern/kibon-exchange-api-commons/'
	],
	parameters([
		booleanParam(defaultValue: false, description: 'Do you want to perform a Release?', name:
			'performRelease'),
		string(defaultValue: '', description: 'This release version', name: 'releaseversion', trim:
			true),
		string(defaultValue: '', description: 'The next release version', name: 'nextreleaseversion',
			trim: true)
	])
])

def jdkVersion = "Temurin_jdk-17.0.1+12"
// comma separated list of email addresses of all team members (for notification)
def recipients = "fabio.heer@dvbern.ch"

def masterBranchName = "master"
def developBranchName = "develop"
def featureBranchPrefix = "feature"
def releaseBranchPrefix = "release"
def hotfixBranchPrefix = "hotfix"

if (params.performRelease) {
	// see https://issues.jenkins-ci.org/browse/JENKINS-53512
	def releaseVersion = params.releaseversion
	def nextReleaseVersion = params.nextreleaseversion
	def credentials = "jenkins-github-token"

	dvbJGitFlowRelease {
		releaseversion = releaseVersion
		nextreleaseversion = nextReleaseVersion
		emailRecipients = recipients
		credentialsId = credentials
	}
} else {
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
		currentBuild.displayName = "${branch}-${dvbMaven.pomVersion()}-${env.BUILD_NUMBER}"

		stage('Maven build') {
			def handleFailures = {error ->
				if (branch.startsWith(featureBranchPrefix)) {
					// feature branche failures should only notify the feature owner
					step([
						$class                  : 'Mailer',
						notifyEveryUnstableBuild: true,
						recipients              : emailextrecipients([[$class: 'RequesterRecipientProvider']]),
						sendToIndividuals       : true])

				} else {
					dvbErrorHandling.sendMail(recipients, currentBuild, error)
				}
			}

			// in develop and master branches attempt to deploy the artifacts, otherwise only run to the verify phase.
			def verifyOrDeploy = {
				return (branch.startsWith(masterBranchName) || branch.startsWith(developBranchName)) ?
					"deploy" :
					"verify"
			}

			try {
				withCredentials([
					usernamePassword(
						credentialsId: 'schema-registry-credentials',
						passwordVariable: 'SCHEMA_REGISTRY_PW',
						usernameVariable: 'SCHEMA_REGISTRY_USER'),
					usernamePassword(
						credentialsId: 'schema-registry-uris',
						passwordVariable: 'BASE_URIS',
						usernameVariable: 'BASE_URI_DEV')
				]) {
					withMaven(jdk: jdkVersion) {
						dvbUtil.genericSh './mvnw -U -Pdvbern.oss -Dmaven.test.failure.ignore=true clean ' +
							verifyOrDeploy()
					}
					if (currentBuild.result == "UNSTABLE") {
						handleFailures("build is unstable")
					}
				}
			} catch (Exception e) {
				currentBuild.result = "FAILURE"
				handleFailures(e)
				throw e
			}
		}
	}
}
