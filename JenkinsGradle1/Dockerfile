FROM openjdk:17-jdk
LABEL authors="Gude Narender"

ARG JAR_FILE=build/libs/*.jar

# Add the application's jar file into the container
ADD ${JAR_FILE} app.jar

# Expose the port your app runs on
EXPOSE 9090

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]