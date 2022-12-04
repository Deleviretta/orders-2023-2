# orders-2023-2

## Technology:

- Java 17
- Maven 3.8.6

## Project structure

### Modules:

- api (orders-api) - data structures (java records), public interfaces
- application (orders-application) - domain logic implementation
- infrastructure (orders-infrastructure) - infrastructure implementation details required by domain (application)

### Versioning:

Using `$revision` mechanism (https://maven.apache.org/maven-ci-friendly.html)
