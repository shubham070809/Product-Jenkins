package com.example.productjenkins.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="productTable")
public class Product {

    @Id
    @Column(name="productId")
    private String productId;
    @Column(name="productName")
    private String productName;
    @Column(name="productPrice")
    private Double productPrice;
}
