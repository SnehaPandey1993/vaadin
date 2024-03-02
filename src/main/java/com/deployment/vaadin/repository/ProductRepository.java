package com.deployment.vaadin.repository;

import com.deployment.vaadin.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
