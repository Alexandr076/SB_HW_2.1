FROM openjdk:17-alpine

EXPOSE 8080

ADD target/SB_HW_2_1-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
