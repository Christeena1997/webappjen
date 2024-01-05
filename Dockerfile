FROM eclipse-temurin:17
COPY target/webappjen.jar webappjen.jar
CMD [ "java","-jar","webappjen.jar" ]