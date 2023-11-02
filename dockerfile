FROM amazoncorretto:17-alpine-jdk
VOLUME /tmp
COPY apiEncryptionKey.jks apiEncryptionKey.jks
COPY target/PosAppApiConfigServer-0.0.1-SNAPSHOT.jar ConfigServer.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev./urandom","-jar","ConfigSerer.jar"]