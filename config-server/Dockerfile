FROM registry.cn-beijing.aliyuncs.com/yisen614/openjdk:8-runtime
MAINTAINER YISEN CAI <yisen614@gmail.com>

#ENTRYPOINT ["java", "-jar", "/usr/share/cloud-services/server.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib

# Add the service itself
ARG JAR_FILE

ADD target/${JAR_FILE} /usr/share/cloud-services/server.jar