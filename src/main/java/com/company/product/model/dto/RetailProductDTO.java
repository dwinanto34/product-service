package com.company.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RetailProductDTO extends ProductDTO {
    private Date expiredDate;
    private Integer stockQuantity;
    private float size;
    private String sizeUnit;
    private float weight;
    private String weightUnit;
}
