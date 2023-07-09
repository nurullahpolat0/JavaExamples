FROM openjdk:17-alpine

ARG JAR_FILE

COPY target/restfull-service-0.0.1-SNAPSHOT.jar restfull-service-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "restfull-service-0.0.1-SNAPSHOT.jar"]