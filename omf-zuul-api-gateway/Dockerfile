FROM openjdk:8

COPY ./target/omf-zuul-api-gateway*.jar omf-zuul-api-gateway.jar

EXPOSE 8765

CMD ["java","-jar","omf-zuul-api-gateway.jar"]