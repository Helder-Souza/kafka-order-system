# Kafka Order System

Este projeto simula um sistema baseado em arquitetura de **mensageria com Apache Kafka**, usando dois serviços separados:

- **Pedido Producer**: envia eventos de pedidos para o tópico Kafka.
- **Pedido Consumer**: consome os eventos de pedidos do tópico.

## 🛠 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Apache Kafka
- Docker & Docker Compose
- Kafka UI (interface web para visualizar tópicos e mensagens)

---

## 📂 Estrutura do Projeto

```bash
kafka-order-system/
├── order-producer/         # Projeto Producer (Spring Boot)
├── order-consumer/         # Projeto Consumer (Spring Boot)
├── infra/                   # Infraestrutura com Kafka, Zookeeper, Kafka UI
│   └── docker-compose.yml
└── README.md                # Documentação do projeto
```

---

## 🚀 Como rodar localmente

```bash
cd infra
docker-compose up -d
```

#### Acesse o kafka UI: http://localhost:8080

### Inicie os serviços em terminais separados

```bash
cd order-producer
./mvnw spring-boot:run
```

```bash
cd order-consumer
./mvnw spring-boot:run
```

## ✍️ Autor
### Helder Souza - [@heldersouza](https://github.com/Helder-Souza)