# Demo of springboot app run by Docker
Demo of springboot app run by Docker

## What you'll need
- Docker CE

## Stack
- Docker
- Java
- Spring Boot
- NGINX
- Maven

##Steps
- Step1: build the jar file under target folder
$ mvn clean install 
//rename the jar file as sbootdockerdemo.jar which is available for docker to run later.

- Step2: Create a DockerFile
FROM java:8
EXPOSE 8080
ADD /target/sbootdockerdemo.jar sbootdockerdemo.jar
ENTRYPOINT ["java", "-jar", “sbootdockerdemo.jar"]

- Step3: Run Docker command to create the docker image and load it up to container.
$ docker build -f DockerFile -t sbootdockerdemo .

//see list of images if it include sbootdockerdemo
$ docker images 

## Run
$ docker run -p 8080:8080 sbootdockerdemo 

//run the app on browser
http://localhost:8080/index
