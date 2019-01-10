FROM openjdk:8-jdk
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ARG JAR_FILE
COPY ${JAR_FILE} /app.jar
