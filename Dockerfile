FROM alpine:latest

RUN apk add openjdk17
COPY build/libs/k8s.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]