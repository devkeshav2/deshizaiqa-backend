package com.deshizaiqa.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
@Getter
@Setter
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rating;
    private String improve;

    @Column(columnDefinition = "TEXT")
    private String suggestion;

    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
}
