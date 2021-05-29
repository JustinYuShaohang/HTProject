FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/Htproject-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "Htproject-0.0.1-SNAPSHOT.jar"]