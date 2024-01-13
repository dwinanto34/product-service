package com.company.product.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@MappedSuperclass
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product extends BaseEntity {
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String RATING = "rating";
    private static final String AVAILABILITY = "availability";
    private static final String PRICE = "price";

    @Column(name = Product.NAME)
    private String name;

    @Column(name = Product.DESCRIPTION)
    private String description;

    @Column(name = Product.RATING)
    private Float rating;

    @Column(name = Product.AVAILABILITY)
    private boolean availability;

    @Column(name = Product.PRICE)
    private BigDecimal price;
}
