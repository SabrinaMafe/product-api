package com.sabrinamafe.product.product_api.repository;

import com.sabrinamafe.product.product_api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
