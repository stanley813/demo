FROM openjdk:8

MAINTAINER ecdata weix@ecdatainfo.com
#TODO:
ADD target/*.jar app.jar

EXPOSE 6868

ENTRYPOINT ["java", "-jar", "/app.jar"]
