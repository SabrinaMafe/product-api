# 📦 product-api

A RESTful API for managing products and categories, with filtering, pagination, sorting, validation and standardized error handling. Built with Java, Spring Boot and Spring Data JPA.

## 🚀 Features

* CRUD for Products
* CRUD for Categories
* Relationship: each Product belongs to a Category
* Filtering by category, name (partial match), price range
* Pagination and sorting support
* Field validation with meaningful error responses
* Global exception handling for validation and unexpected errors
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

## 📂 API Overview

### Products Endpoints

* `GET /api/products`: List products (supports filters and pagination)

    * Query parameters:

        * `name`: filter by partial name
        * `categoryId`: filter by category ID
        * `minPrice`: filter by minimum price
        * `maxPrice`: filter by maximum price
        * `page`, `size`, `sort`: pagination and sorting

* `POST /api/products`: Create product (requires valid fields)

    * Example request body:

      ```json
      {
        "name": "Example Product",
        "description": "Optional description",
        "price": 100.00,
        "category": { "id": 1 }
      }
      ```

* `GET /api/products/{id}`: Get product by ID

* `DELETE /api/products/{id}`: Delete product by ID

### Categories Endpoints

* `GET /api/categories`: List all categories

* `POST /api/categories`: Create category

    * Example request body:

      ```json
      {
        "name": "Electronics"
      }
      ```

* `GET /api/categories/{id}`: Get category by ID

* `DELETE /api/categories/{id}`: Delete category by ID

## ✅ Validation rules

* `Product.name`: required, non-blank
* `Product.price`: required, positive number
* `Product.category`: required
* `Category.name`: required, non-blank

## ⚠️ Error handling

Validation errors return `400 Bad Request` with detailed field errors:

```json
{
  "timestamp": "2023-01-01T12:00:00",
  "status": 400,
  "message": "Validation failed",
  "errors": {
    "name": "must not be blank",
    "price": "must be greater than 0"
  }
}
```

---

✨ *Thank you for visiting this project!*
