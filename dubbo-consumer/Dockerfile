FROM openjdk:8-jre
MAINTAINER YISEN CAI <yisen614@gmail.com>

ENTRYPOINT ["java", "-jar", "/usr/share/cloud-services/consumer.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib

# Add the service itself
ARG JAR_FILE

ADD target/${JAR_FILE} /usr/share/cloud-services/consumer.jar

#RUN ["/bin/ls -la /usr/share/cloud-services"]