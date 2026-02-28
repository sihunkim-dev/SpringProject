package com.demotutorial.demo_thymeleaf.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="users")
@Data
@RequiredArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private Long userId;


}
