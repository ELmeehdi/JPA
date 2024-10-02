# Use a base image (e.g., for a Java application)
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy your project files into the container
COPY . .

# Command to run your application (adjust this as needed)
CMD ["java", "-jar", "target/JPA-0.0.1-SNAPSHOT.jar"]
