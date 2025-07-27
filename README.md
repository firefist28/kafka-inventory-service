# kafka-inventory-service

# 📦 Inventory Service

The **Inventory Service** is a Spring Boot microservice that listens to Kafka for incoming orders and confirms inventory availability.

---

## 📌 Features

- Consumes order events from Kafka (`orders` topic)
- Simulates inventory validation
- Publishes confirmation to Kafka (`inventory-confirmed` topic)

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Apache Kafka
- Gradle

---

## 🔄 Kafka Topics

| Topic Name        | Role                              |
|-------------------|-----------------------------------|
| `orders`     | Consumed to receive new orders   |
| `inventory-confirmed` | Published to confirm inventory   |


