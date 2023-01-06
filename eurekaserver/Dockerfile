FROM adoptopenjdk/openjdk11-openj9:alpine-jre

LABEL maintainer="yisasthemanuel@gmail.com"

ARG JAR_FILE

ADD ${JAR_FILE} /app.jar 

EXPOSE 8761

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
