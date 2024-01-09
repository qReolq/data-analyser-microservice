# Data analyser microservice

This application receives data from [Data generator service](https://github.com/qReolq/data-generator-microservice) with Apache Kafka and stores it in MongoDb.

Next, data is processed by [Data store service](https://github.com/qReolq/data-store-microservice).

### Technologies
Spring(Boot, JPA), Docker, MongoDB, Apache Kafka, CI/CD(Github actions)

### Usage

To start an application you need to pass variables to .env file.

Application is running on port 8082.

## Quick start
You can run all applications via <code>docker-compose.yaml</code> from <code>docker</code> folder.

It contains all needed configs.

1. Clone this repo into folder.

```Bash
git clone https://github.com/qReolq/data-analyser-microservice.git
cd data-analyser-microservice/docker
```
2. Start docker compose
```Bash
docker compose up
```
