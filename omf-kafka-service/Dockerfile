FROM openjdk:8

COPY ./target/omf-kafka-service*.jar omf-kafka-service.jar

EXPOSE 8400

CMD ["java","-jar","omf-kafka-service.jar"]