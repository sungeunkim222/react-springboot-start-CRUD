package com.kimcho.backend.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Test_table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cus_name;
    private Integer cus_age;
}