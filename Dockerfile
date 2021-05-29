FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/HtprojectApplication-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "HtprojectApplication-1.0-SNAPSHOT.jar"]