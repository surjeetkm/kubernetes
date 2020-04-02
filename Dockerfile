FROM openjdk:8
RUN mkdir /opt/app1
ENV PROJECT_HOME /opt/app1
COPY /target/kubernetes-microservice.jar $PROJECT_HOME/kubernetes-microservice.jar
WORKDIR $PROJECT_HOME
CMD ["java"," -jar","./kubernetes-microservice.jar"]