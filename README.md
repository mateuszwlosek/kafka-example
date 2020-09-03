# Kafka - Example

Example of [Apache Kafka](https://kafka.apache.org/) usage with [Spring Boot](https://projects.spring.io/spring-boot/).
 
Used [Docker](https://www.docker.com/) to containerize environment.  

## Kafka
* Uses SSL authentication
* 3 instances running

## Spring Boot services
* Use 3 instances of kafka
* Use keystore and truststore with passwords from files  
![Services](https://user-images.githubusercontent.com/15820051/91637457-2ca88d80-e9ce-11ea-8f80-ef54087eead1.png)

## How to run the environment?

### Before you start
* Make sure you have `Docker` and `docker-compose` installed.

[Docker CE INSTALLATION](https://docs.docker.com/install/linux/docker-ce/ubuntu/)  
[Docker Compose INSTALLATION](https://docs.docker.com/compose/install/#prerequisites)

### Start the environment
1. Build services:
    `docker-compose build`
2. Run services:
    `docker-compose up`
3. Request book-service:

``` 
curl --location --request POST 'localhost:6060/book/buy' --header 'Content-Type: application/json' --data-raw '{
	"accountId": 1,
	"bookId": 2,
	"deliveryDetails": {
		"street": "abc",
		"houseNumber": "123",
		"zipCode": "123456",
		"country": "ABC",
		"region": "CBA"
	}
}'
```

### How to generate certificates
1. Download [script](https://github.com/confluentinc/confluent-platform-security-tools/blob/master/kafka-generate-ssl.sh).
2. Run it and type `kafka` in those fields: `Common Name`, ` first and last name`. Also, use the same password every time when asked.
3. Replace generated `kafka.keystore` and `kafka.trustore` with the old ones in `certificates`.
4. Change password in `certificates/trustore_creds`, `certificates/keystore_creds`, `certificates/sslkey_creds`

