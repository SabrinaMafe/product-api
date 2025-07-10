# 📦 Product API

A RESTful API for managing products and categories, built with Java and Spring Boot.

## 🚀 Features

* CRUD for Products and Categories
* Dynamic filtering, pagination, and sorting
* API documentation with Swagger UI
* H2 in-memory database for development/demo

## 🔧 Technologies

* Java 17
* Spring Boot 3.2.x
* Spring Data JPA
* H2 Database
* SpringDoc OpenAPI 2.5.0
* Lombok

## 🌐 Public Demo

* 🔗 **Swagger UI:** [https://product-api-mtqm.onrender.com/swagger-ui/index.html](https://product-api-mtqm.onrender.com/swagger-ui/index.html)

## 📦 How to run locally

1️⃣ **Clone the repository:**

```bash
git clone https://github.com/SabrinaMafe/product-api.git
```

2️⃣ **Build the project:**

```bash
./mvnw clean install
```

3️⃣ **Run the application:**

```bash
./mvnw spring-boot:run
```

4️⃣ **Access locally:**

* Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
* H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## ⚙️ Default credentials

* H2 Database:

    * JDBC URL: `jdbc:h2:mem:productdb`
    * User: `sa`
    * Password: *(empty)*

## ✨ Author

Sabrina Mafé
[LinkedIn](https://l1nk.dev/povrg)
Email: [sabrinamafe21@gmail.com](mailto:sabrinamafe21@gmail.com)

---

## 🔖 Planned Improvements (To-Do)

* Migrate from H2 to PostgreSQL with real persistence.
* Add authentication and authorization using JWT (Spring Security).
* Implement unit and integration tests (JUnit + Mockito).
* Add Docker support and Docker Compose configuration.
* Set up CI/CD pipeline with GitHub Actions.
* Improve API versioning (e.g., `/api/v1`).
* Enhance Swagger/OpenAPI documentation with annotations.
* Implement better error handling with standardized error responses.
* Optional: build a simple React frontend to consume this API.

---

*Thank you for visiting this repository! ⭐*
