FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew build --no-daemon

COPY build/libs/*.jar /app/ci.jar

EXPOSE 7000

ENTRYPOINT ["java", "-jar", "ci.jar"]