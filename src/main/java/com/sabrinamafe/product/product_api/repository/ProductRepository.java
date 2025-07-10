package com.sabrinamafe.product.product_api.repository;

import com.sabrinamafe.product.product_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, org.springframework.data.jpa.repository.JpaSpecificationExecutor<Product> {
}

