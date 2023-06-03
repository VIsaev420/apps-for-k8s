FROM openjdk:17.0.2-slim
COPY ../target/hello-world-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
