FROM openjdk:11
ADD target/sample-api-0.0.1-SNAPSHOT.jar sample-api.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "sample-api.jar"]