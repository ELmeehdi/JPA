# Use a base image (e.g., for a Java application)
FROM java:8


# Copy your project files into the container
COPY . /target/JPA-0.0.1-SNAPSHOT.jar JPA-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","JPA-0.0.1-SNAPSHOT.jar"]
