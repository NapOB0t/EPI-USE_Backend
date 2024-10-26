FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/EPU-Management-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8081

# Command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
