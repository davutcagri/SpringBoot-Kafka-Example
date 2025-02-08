# 🚀 Spring Boot Kafka Example

This project demonstrates an example application built with **Spring Boot**, **Apache Kafka**, and **Docker**. It showcases how to integrate Kafka for messaging within a Spring Boot application and containerize the system using Docker.

## 📌 Table of Contents

1. [✨ Features](#-features)
2. [⚙️ Prerequisites](#-prerequisites)
3. [🛠️ Steps](#-steps)

## ✨ Features

- **Spring Boot** for microservices architecture.
- Messaging with **Apache Kafka**.
- Easy deployment using **Docker Compose**.
- Dynamic configuration using `application.yml`.

## ⚙️ Prerequisites

Make sure you have the following installed:

- ☕ **Java 17+**
- 🔨 **Maven 3.8+**
- 🐳 **Docker & Docker Compose**

## 🛠️ Steps

### 1️⃣ Start the Kafka container using Docker Compose:
```bash
docker-compose up -d
```
This will initialize the Kafka container.

### 2️⃣ Start the producer and consumer services:
Navigate to the producer service directory and run:
```bash
mvn spring-boot:run
```
Navigate to the consumer service directory and run:
```bash
mvn spring-boot:run
```

### 3️⃣ Send test requests:
Example request to send a message:
```plaintext
POST /kafka/send?topic={Topic Name}-topic&message={Message}
```
Use **Postman** or another API client for easier testing.

### 4️⃣ View the sent messages:
- 📡 Access Kafka UI at `http://localhost:8090` to monitor messages.
- 📜 Alternatively, view messages in the consumer service console.
