Consumer Implementation
The Consumer Service listens to the configured Kafka topic using Spring Kafka's @KafkaListener annotation.
Whenever a new message is published, the consumer receives and processes it asynchronously.

This project demonstrates event-driven microservices communication using Apache Kafka.
Kafkauser-Service publishes messages to a Kafka topic, while the Consumer Service independently receives and processes those messages asynchronously.
This approach improves service decoupling and supports scalable communication between distributed applications.

Implements asynchronous communication between microservices.
Uses Kafka Producer to publish messages.
Uses Kafka Consumer to receive messages.
Creates and manages Kafka topics through CMD.
Uses ZooKeeper and Kafka server for local Kafka setup.
Reduces direct dependency between producer and consumer services.
Enables event-driven communication.

Technologies Used
Java
Spring Boot
Spring Kafka
Apache Kafka
Apache ZooKeeper
Maven
