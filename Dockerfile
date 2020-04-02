FROM openjdk:8
EXPOSE 8080
ADD target/kubernetes-microservice.jar kubernetes-microservice.jar
ENTRYPOINT ["java","-jar","kubernetes-microservice.jar"]