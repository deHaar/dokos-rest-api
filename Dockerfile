FROM gradle:jdk22 as builder

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle clean build -x test

FROM eclipse-temurin:22-jre as finalApp

ENTRYPOINT ["sudo", "mkdir", "/app/"]

WORKDIR app

COPY --from=builder /home/gradle/src/build/libs/dokos-rest-api-0.0.1-SNAPSHOT.jar /app

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/app/dokos-rest-api.jar"]