FROM openjdk:8
EXPOSE 5000
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} hello-service.jar
ENTRYPOINT ["java","-jar","/hello-service.jar"]