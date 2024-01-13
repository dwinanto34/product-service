package com.company.product.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = RetailProduct.TABLE_NAME)
public class RetailProduct extends Product {
    public static final String TABLE_NAME = "retail_products";
    private static final String EXPIRED_DATE = "expired_date";
    private static final String STOCK_QUANTITY = "stock_quantity";
    private static final String SIZE = "size";
    private static final String SIZE_UNIT = "size_unit";
    private static final String WEIGHT = "weight";
    private static final String WEIGHT_UNIT = "weight_unit";

    @Column(name = RetailProduct.EXPIRED_DATE)
    private Long expiredDate;

    @Column(name = RetailProduct.STOCK_QUANTITY)
    private Integer stockQuantity;

    @Column(name = RetailProduct.SIZE)
    private Float size;

    @Column(name = RetailProduct.SIZE_UNIT)
    private String sizeUnit;

    @Column(name = RetailProduct.WEIGHT)
    private Float weight;

    @Column(name = RetailProduct.WEIGHT_UNIT)
    private String weightUnit;
}
