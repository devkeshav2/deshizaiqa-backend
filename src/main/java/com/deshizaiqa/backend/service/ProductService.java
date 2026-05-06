package com.deshizaiqa.backend.service;

import com.deshizaiqa.backend.entity.Product;
import com.deshizaiqa.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        product.setItemImage("no_image");
        product.setCreatedDate(LocalDateTime.now());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product updateProduct(Product product) {

        Product existingProduct = productRepository.findById(product.getId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setType(product.getType());
        existingProduct.setTag(product.getTag());
        existingProduct.setEnabled(product.getEnabled());
        existingProduct.setUpdatedDate(LocalDateTime.now());

        return productRepository.save(existingProduct);
    }
}