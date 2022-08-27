FROM --platform=linux/amd64 adoptopenjdk/openjdk11:alpine
RUN apk add bash --no-cache
RUN apk add nano --no-cache
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]