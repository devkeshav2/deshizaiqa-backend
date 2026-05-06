package com.deshizaiqa.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String type;
    private String itemImage;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean enabled;
    private String tag;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}