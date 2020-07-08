FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ARG JAR_FILE=demo.jar
ARG LIB=/demo_lib
ADD ${JAR_FILE} demo.jar
ADD ${LIB} demo_lib
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]