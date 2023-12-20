FROM openjdk:17
WORKDIR /app
COPY target/dateTest-1.0-SNAPSHOT.jar /app/Gap.jar
ENTRYPOINT ["java","-jar","Gap.jar"]