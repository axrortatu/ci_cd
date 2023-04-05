# syntax=docker/dockerfile:1

FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/spring-app.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]