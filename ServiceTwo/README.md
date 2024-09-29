# practice1

This project uses Quarkus, the Supersonic Subatomic Java Framework.

## Description
1. Microservices:
    Develop  Quarkus microservice named serviceTwo
2. Asynchronous & Reactive RESTful Services in JAX-RS:
     Implemented a REST client that consume the 3 APIs from the serviceOne microservice
3. JAX-RS Filter:
   Filter to log request and response details.
4. JAX-RS Exception Handling:
   Ensure that service gracefully handles and returns appropriate response for
   the POST request that throwing an exception from serviceOne .
5. Fault Tolerance:
    Integrate fault tolerance into one of your services using Quarkus' fault tolerance
   features.
    Implement retry and circuit breaker mechanisms to handle failures gracefully.

## Technologies
- Quarkus
- Java 17

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script

# Run serviceOne
cd Practice1\ServiceOne
./mvnw quarkus:dev

# Run serviceTwo
cd Practice1\ServiceTwo
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/practice1-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Provided Code

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
