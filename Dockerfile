FROM amazoncorretto:17

LABEL version="1.0"

EXPOSE 8080:8080

WORKDIR /app

COPY target/Docker-demo-0.0.1-SNAPSHOT.jar /app/docker-demo.jar

ENTRYPOINT ["java","-jar","docker-demo.jar"]