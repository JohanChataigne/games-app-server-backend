FROM eclipse-temurin:17.0.3_7-jdk

EXPOSE 8080

COPY build/libs/*.jar /opt/app.jar

CMD java $JAVA_OPTS -Duser.timezone=UTC -jar /opt/app.jar