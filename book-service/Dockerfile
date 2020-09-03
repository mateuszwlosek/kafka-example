FROM maven:3.6.3-jdk-11

WORKDIR /app

ADD . /app
RUN mvn clean package -Ddir=app
RUN mv target/book-service-1.0.0.jar book-service-1.0.0.jar

ENTRYPOINT java $JAVA_OPTS -Djavax.net.ssl.keyStore=/etc/kafka/secrets/kafka.keystore.jks -Djavax.net.ssl.keyStorePassword=$(cat /etc/kafka/secrets/keystore_creds) -Djavax.net.ssl.trustStore=/etc/kafka/secrets/kafka.truststore.jks -Djavax.net.ssl.trustStorePassword=$(cat /etc/kafka/secrets/truststore_creds) -Djava.security.egd=file:/dev/.urandom -jar book-service-1.0.0.jar
