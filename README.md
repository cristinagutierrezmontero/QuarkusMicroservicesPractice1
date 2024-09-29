# Practice1
 
# ServiceOne


## Description

1. Microservice:
    Quarkus microservice named service-one 
2. Asynchronous & Reactive RESTful Services in JAX-RS:
   - Implement a reactive asynchronous GET request and return a result after a
   simulated delay (e.g., 2 seconds).
   - Implement a reactive asynchronous POST request that accept a mocked request
   body and return “success” string as a response
   - Implement a reactive asynchronous POST request that throwing an exception
   service-two microservice 
3. JAX-RS Filters and Interceptors:
   ○ Implement an interceptor to add a custom header to
   responses.
   
## Technologies
- Quarkus
- Java 17

## Running the application in dev mode

```shell script
# Run service-one
cd Practice1\ServiceOne
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.



## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

# ServiceTwo


## Description
1. Microservice:
    Develop Quarkus microservice named serviceTwo
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

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

# Collections


## Postman collection ServiceOne: 
Service_one.postman_collection.json

## Postman collection ServiceTwo: 
Service_Two.postman_collection.json



