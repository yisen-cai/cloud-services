FROM openjdk:8-jdk-alpine
MAINTAINER YISEN CAI <yisen614@gmail.com>

ENTRYPOINT ["java", "-jar", "/usr/share/cloud-services/provider.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
ARG JAR_FILE

ADD target/${JAR_FILE} /usr/share/cloud-services/provider.jar

#RUN ["ls -la /usr/share/cloud-services"]