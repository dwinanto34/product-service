package com.company.product.model.inbound.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EbookProductRequest {
    private String ebookName;
    private String ebookDescription;
    private float ebookRating;
    private boolean ebookAvailability;
    private BigDecimal ebookPrice;
    private String author;
    private String genre;
    private Date publishDate;
    private String language;
    private Integer numberOfPages;
}
