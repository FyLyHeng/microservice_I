FROM bellsoft/liberica-openjdk-alpine:17 as build

MAINTAINER fylyheng/corebacking

COPY target/account-0.0.1-SNAPSHOT.jar account-1-0-0.jar

ENTRYPOINT ["java", "-jar", "/account-1-0-0.jar"]


#build docker image cmd
#docker build . -t fylyheng-corebacking/account


#run docker container
#docker run -p 8102:8102 corebacking/account  ->track mode
#docker run -d -p 8102:8102 corebacking/account  ->detect mode (close track-log)


#check service log
#docekr logs {container_id} //view exist log
#docekr logs -f {container_id} //view real-time log
# ex : docekr log ec0f8cbb206e


#start existing image
#docker start corebacking/account