FROM openjdk:17-jdk-alpine

WORKDIR /template

COPY target/*.jar /template/app.jar

EXPOSE 8080

CMD java -XX:+UseContainerSupport -Xmx512m -jar app.jar