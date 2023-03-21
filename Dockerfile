FROM amazoncorretto:17
MAINTAINER ivanalak
COPY target/Portfolio-IA-0.0.1-SNAPSHOT.jar Portfolio-IA-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Portfolio-IA-0.0.1-SNAPSHOT.jar"]