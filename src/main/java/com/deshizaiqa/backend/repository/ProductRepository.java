package com.deshizaiqa.backend.repository;

import com.deshizaiqa.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}