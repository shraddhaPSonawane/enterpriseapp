FROM openjdk:8

COPY target/enterpriseapp.jar app.jar	

ENTRYPOINT ["java", "-jar", "/app.jar"]