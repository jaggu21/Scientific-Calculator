FROM openjdk:8
COPY ./target/Scientific_Calculator-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scientific_Calculator-0.0.1-SNAPSHOT.jar"]
