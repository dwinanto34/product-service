package com.company.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductDTO {
    private String name;
    private String description;
    private float rating;
    private boolean availability;
    private BigDecimal price;
}
