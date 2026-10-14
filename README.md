# TP Microservices Project

This project is a Docker-based microservice stack composed of:

- ms-registry: Eureka service registry
- ms-gateway: Spring Cloud Gateway
- ms-formation: formation service
- ms-scolarite: scolarite service

## Architecture

The application uses a standard gateway + registry layout:

1. Eureka registry exposes service discovery.
2. Gateway routes incoming requests to the relevant backend service.
3. Business services register with Eureka and expose REST APIs.

## Ports

- Registry: 8888
- Gateway: 7777
- Formation: 8084
- Scolarite: 8083

## Run with Docker

From this folder:

```bash
docker compose up --build
```

This builds or starts the microservice containers defined in docker-compose.yml.

## Run with Maven

You can also build and run each service manually:

```bash
cd ms-registry
./mvnw clean package
java -jar target/*.jar
```

Then repeat the same pattern for the gateway and the two services.

## Useful checks

- Eureka dashboard: http://localhost:8888
- Gateway endpoint: http://localhost:7777
- Service endpoints depend on the application routes defined in the gateway and service configuration.
