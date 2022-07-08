FROM openjdk:11

COPY target/enterpriseapp.jar app.jar	

ENTRYPOINT ["java", "-jar", "/app.jar"]