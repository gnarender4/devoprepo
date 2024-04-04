FROM openjdk:17-jdk
LABEL authors="Gude Narender"

# Assuming your Maven build produces a single JAR file in the target directory.
# Adjust the JAR_FILE path to point to your Maven project's target directory.
ARG JAR_FILE=target/*.jar

# Add the application's jar file to the container
ADD ${JAR_FILE} app.jar

# Expose the port your app runs on
EXPOSE 9090

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
