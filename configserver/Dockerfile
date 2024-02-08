FROM bellsoft/liberica-openjdk-alpine:17 as build

MAINTAINER fylyheng/corebacking

COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-1-0-0.jar

ENTRYPOINT ["java", "-jar", "/configserver-1-0-0.jar"]




#mvn build jar.file cmd
# mvn clean package -Dmaven.test.skip

#build docker image cmd
# docker build . -t fylyheng/cb-config-server


#run docker container ->track mode
# docker run --name cb-config-server -p 8071:8071 fylyheng/cb-config-server