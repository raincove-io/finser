FROM maven:3.6.1-slim as builder
COPY . /app
WORKDIR /app
RUN mvn -B package

FROM openjdk:8u212-jre
COPY --from=builder /app/target/finser.jar /
ENTRYPOINT ["java", "-jar", "/finser.jar"]
