FROM openjdk:11
LABEL maintainer="devneps.com"
ADD target/spring-boot-example1-0.0.1-SNAPSHOT.jar spring-boot-example1.jar
ENTRYPOINT ["java", "-jar", "spring-boot-example1.jar"]