# Dockerfile para product-api
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

# 🔧 Corrigir permissões dentro do container
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/product-api-0.0.1-SNAPSHOT.jar"]
