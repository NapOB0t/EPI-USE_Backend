## Use the official OpenJDK 17 image as a base
#FROM openjdk:21-jdk-slim
#
## Set the working directory in the container
#WORKDIR /app
#
## Copy the JAR file into the container
## Ensure the JAR file path is correct relative to the build context
#COPY EPU-Management/target/EPU-Management-0.0.1-SNAPSHOT.jar app.jar
#
## Expose the port your application runs on
#EXPOSE 8081
#
## Command to run your application
#ENTRYPOINT ["java", "-jar", "app.jar"]

# Step 1: Use a Maven image with Java 21 to build the application
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /app

# Copy the source code into the Docker image
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Step 2: Use a smaller JDK 21 image to run the application
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copy the built .jar file from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your app runs on (default for Spring Boot is 8080)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

