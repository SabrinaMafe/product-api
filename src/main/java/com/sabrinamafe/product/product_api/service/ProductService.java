package com.sabrinamafe.product.product_api.service;

import com.sabrinamafe.product.product_api.model.Product;
import com.sabrinamafe.product.product_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Page<Product> findByFilters(String name, Long categoryId, BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable) {
        return productRepository.findAll((root, query, cb) -> {
            var predicates = cb.conjunction();

            if (name != null && !name.isBlank()) {
                predicates.getExpressions().add(cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%"));
            }

            if (categoryId != null) {
                predicates.getExpressions().add(cb.equal(root.get("category").get("id"), categoryId));
            }

            if (minPrice != null) {
                predicates.getExpressions().add(cb.greaterThanOrEqualTo(root.get("price"), minPrice));
            }

            if (maxPrice != null) {
                predicates.getExpressions().add(cb.lessThanOrEqualTo(root.get("price"), maxPrice));
            }

            return predicates;
        }, pageable);
    }

}
