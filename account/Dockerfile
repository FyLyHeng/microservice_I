FROM bellsoft/liberica-openjdk-alpine:17 as build

MAINTAINER fylyheng/corebacking

COPY target/account-0.0.1-SNAPSHOT.jar account-1-0-0.jar

ENTRYPOINT ["java", "-jar", "/account-1-0-0.jar"]




#mvn build jar.file cmd
# mvn clean package -P staging -Dmaven.test.skip
# mvn clean package -Dmaven.test.skip

#build docker image cmd
# docker build . -t fylyheng/cb-account-service


#run docker container
#docker run --name account_service -p 8102:8102 fylyheng/cb-account-service  ->track mode
#docker run --name account_service -d -p 8102:8102 fylyheng/cb-account-service  ->detect mode (close track-log)


