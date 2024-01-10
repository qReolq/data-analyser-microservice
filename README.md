# Data analyser microservice

This application receives data from [Data generator service](https://github.com/qReolq/data-generator-microservice) with Apache Kafka and stores it in MongoDB.

Next, data is processed by [Data store service](https://github.com/qReolq/data-store-microservice).

### Technologies
Spring(Boot, JPA), Docker, MongoDB, Apache Kafka, CI/CD(Github actions)

### Environments
To start an application you need to pass variables to .env file.

- `KAFKA_BOOTSTRAP_SERVERS` - bootstrap server in Kafka
- `KAFKA_SUBSCRIBED_TOPICS` - kafka subscribed topics
- `MONGO_AUTHENTICATION_DATABASE` - mongoDB Authentication Database
- `MONGO_USERNAME` - username for MongoDB
- `MONGO_PASSWORD` - password for MongoDB
- `MONGO_DATABASE` - name of MongoDB
- `MONGO_PORT` - port of MongoDB
- `MONGO_HOST` - host of MongoDB

## Quick start
You can run all applications via <code>docker-compose.yaml</code> from <code>docker</code> folder.

Application is running on port 8082.

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
