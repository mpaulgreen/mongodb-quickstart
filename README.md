## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```
## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```


# Running mongo on localhost
```docker-compose up -d``` <br>

```docker ps // you can identify the container kogito-mongodb container running``` <br>

```docker exec -it kogito-mongodb mongo``` <br>

# To build the image and push it to quay registry

```./mvnw package -Dquarkus.container-image.build=true``` <br>

```docker image tag mrigankapaul/mongodb-quickstart:1.0.0-SNAPSHOT quay.io/mpaulgreen/mongodb-quickstart:3``` <br>

```docker push quay.io/mpaulgreen/mongodb-quickstart:3``` <br>

