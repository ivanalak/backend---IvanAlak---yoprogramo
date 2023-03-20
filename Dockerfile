FROM amazoncorretto:16-alpine-jdk
MAINTAINER ivanalak
COPY target\Portfolio-IA-0.0.1-SNAPSHOT.jar Portfolio-IA-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Portfolio-IA-0.0.1-SNAPSHOT.jar"]