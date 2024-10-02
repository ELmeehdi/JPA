# Use a base image (e.g., for a Java application)
FROM openjdk:8-jdk


# Copy your project files into the container
COPY . /target/JPA-0.0.1-SNAPSHOT.jar JPA-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","JPA-0.0.1-SNAPSHOT.jar"]
