# Use the official OpenJDK 17 image as a base
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
# Ensure the JAR file path is correct relative to the build context
COPY EPU-Management/target/EPU-Management-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8081

# Command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]


