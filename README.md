# 📦 product-api

A RESTful API for managing products and categories, with filtering, pagination and sorting. Built with Java, Spring Boot and Spring Data JPA.

## 🚀 Features

* CRUD for Products
* CRUD for Categories
* Relationship: each Product belongs to a Category
* Filtering by category, price range, and name
* Pagination and sorting support
* API documentation with Swagger/OpenAPI

## 🛠️ Technologies

* Java 17
* Spring Boot 3.x
* Spring Data JPA
* H2 Database
* Lombok
* Swagger/OpenAPI

## 📦 How to run

```bash
./mvnw spring-boot:run
```

Access Swagger UI at: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

Access H2 Console at: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## 📂 Structure

* `Product`: entity representing products with name, description, price, and category
* `Category`: entity representing product categories
* `ProductController`: exposes endpoints for managing products
* `CategoryController`: exposes endpoints for managing categories

---

✨ *Thank you for visiting this project!*
