package com.company.product.model.inbound.kafka;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailProductRequest {
    private String productName;
    private String productDescription;
    private float productRating;
    private boolean productAvailability;
    private BigDecimal productPrice;
    private Date expiredDate;
    private Integer stockQuantity;
    private float size;
    private String sizeUnit;
    private float weight;
    private String weightUnit;
}
