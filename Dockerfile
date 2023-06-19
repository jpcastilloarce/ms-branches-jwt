FROM adoptopenjdk:17-jdk-hotspot

COPY target/ms-branches-jwt-0.0.1-SNAPSHOT.jar ms-branches-jwt.jar

EXPOSE 8080

CMD ["java", "-jar", "ms-branches-jwt.jar"]