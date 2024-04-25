FROM eclipse-temurin:17
EXPOSE 8080
COPY target/hello-0.0.4-SNAPSHOT.jar hello-0.0.4-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/hello-0.0.4-SNAPSHOT.jar"]