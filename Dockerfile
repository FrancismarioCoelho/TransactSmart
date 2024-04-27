FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/banking-api-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java", "-jar", "banking-api-0.0.1-SNAPSHOT.jar"]
