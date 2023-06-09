FROM eclipse-temurin:19
VOLUME /tmp
ARG JAR_FILE=build/libs/SpringDatabaseOrderService.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
