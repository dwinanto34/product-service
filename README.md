# Product service

## Getting Started
This repository serves as a showcase for a product service, implementing best practices and principles.

## Tech stacks:
- Java
- Maven
- Spring
- PostgreSQL
- Kafka

## Features:
- [Consume retail products from Kafka](https://github.com/dwinanto34/product-service/commit/634ee9cbdf7623280b4aa8ab087edf3140402f5a) and [save them to database](https://github.com/dwinanto34/product-service/commit/3cf045e325456bc275d79b610c85379183b3d228)
- [Implement an API for creating digital ebook products](https://github.com/dwinanto34/product-service/commit/3221e57886c6bd0df3206ef00ff92bbb0efae64b)
- [Notification for low quantity alerts](https://github.com/dwinanto34/product-service/commit/03193cbbee45736c73830f8763d4f811308efaf5)

## Database Setup

To set up the necessary database tables, [execute this SQL script](https://github.com/dwinanto34/product-service/commit/06035487ae36ea34bea5df6daf464649d2d929c7)

## For adding retail products
**Topic:** `retail_product_topic`

**Payload Sample:**
```json
{
  "productName": "Sample Product",
  "productDescription": "This is a sample product description.",
  "productRating": 4.5,
  "productAvailability": true,
  "productPrice": 49.99,
  "expiredDate": "2024-12-31T23:59:59.999Z",
  "stockQuantity": 1,
  "size": 10.0,
  "sizeUnit": "cm",
  "weight": 500.0,
  "weightUnit": "g"
}
```

## For adding digital ebook products
**Endpoint:** `POST` `localhost:8080/ebooks`

**Payload Sample:**
```json
{
  "ebookName": "Sample Ebook",
  "ebookDescription": "A sample ebook description.",
  "ebookRating": 4.5,
  "ebookAvailability": true,
  "ebookPrice": 19.99,
  "author": "John Doe",
  "genre": "Fiction",
  "publishDate": "2024-01-15T12:30:00Z",
  "language": "English",
  "numberOfPages": 300
}
```
