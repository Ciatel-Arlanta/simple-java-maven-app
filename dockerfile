FROM openjdk:27-ea-jdk-slim
WORKDIR /app
COPY target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
