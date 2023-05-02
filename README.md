# kiBon Exchange API Commons

This project contains DTOs and utils that are shared between kiBon and the exchange service.

These are kiBon-internal DTOs.

# Avro Schema Evolution - Dos and Don'ts

* Make sure to only edit the *.avsc files - the Java classes are automatically generated by the avro-maven-plugin
* When adding a new field, make sure to specify a `default:` value. When there is no default value for a field, a new
  consumer cannot determine the correct value for the field when parsing an old record.
* Only fields with a default value may be removed. Otherwise new records cannot be parsed by old consumers.
* Never rename the base `name` and `namespace`. The name and namespace is used by KafkaAvroDeserializer
  with `avro.specific.reader = true`, to generate a specific record instance, e.g. `VerfuegungEventDTO.class`. If a
  Kafka topic receives messages with another name/namespace, an old message consumer will crash, since it doesn't
  contain the new class in it's class path.

## How-To update a schema

### Simple case: same DTO, new field with default value

Let's assume that only a new field needs to be added, for which a default value can be defined (e.g. NULL). In that
case, modify the avsc file directly. `mvn clean install` will generate a new Java file with the new schema and the AVRO
deserializer will take care of migrating old events to the new schema (giving them the default value for the undefined
new field.)

### Complicated Case: DTO hierarchy changes fundamentally

If the structure of the schema is a complex change, for example when extracting some parts to a shared DTO, it might be
desired to create a new avsc file inorder to create Java classes for both, old and new version. These classes can then
be used to test schema migration. Note: this is not recommended for simple changes (see above) due to the additional
complexity with nested/shared avsc files.

1. Rename `InstitutionEventDTO.avsc` to `InstitutionEventDTOv1.avsc` (just to make sure all files have a version suffix)
2. Copy `InstitutionEventDTOv1.avsc` to `InstitutionEventDTOv2.avsc`
3. Add the version suffix to the `name` attribute in the old schema `InstitutionEventDTOv1.avsc` to make sure there is
   no conflict when generating the classes.
4. Update the subject reference in the `kafka-schema-registry-maven-plugin` configuration in `pom.xml`.
5. Add the new attribute with a default value (e.g. null, empty string)
6. Run `mvn clean install` to generate the class files.

The version-suffixed classes must actually not be used in production. Automatic deserialisazion relies on finding a
class with a matching name and package in the class-path, e.g. corresponding to the `name` and `namespace` attributes of
the Avro schema. Thus, the suffixes may not be used to generate or read events in production. However, we can use the
suffixed versions to test schema compatibility.
