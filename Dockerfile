FROM openjdk:8
ADD target/kubernetes-microservice.jar kubernetes-microservice.jar
EXPOSE 8080
ENTRYPOINT ["java"," -jar","kubernetes-microservice.jar"]