FROM bellsoft/liberica-openjdk-alpine:17 as build

MAINTAINER fylyheng/corebacking

COPY target/loan_service-1.0.0.jar loan_service-1-0-0.jar

ENTRYPOINT ["java", "-jar", "/loan_service-1-0-0.jar"]


# mvn clean package -P uat -Dmaven.test.skip
# docker build . -t fylyheng/cb-loan-service

# docker run -p 8103:8103 --name loan_service fylyheng/cb-loan-service
# docker run --network bridge -p 8103:8103 --name loan_service fylyheng/cb-loan-service
# docker run --network local_server -p 8103:8103 --name loan_service fylyheng/cb-loan-service