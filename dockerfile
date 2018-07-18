FROM openjdk:8
COPY target/gs-rest-service-0.1.0.jar /usr/app/app.jar
WORKDIR /usr/app
RUN java -jar app.jar
CMD ["java", "-jar", "app.jar"]