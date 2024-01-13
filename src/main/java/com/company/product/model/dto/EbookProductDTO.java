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
public class EbookProductDTO extends ProductDTO {
    private String author;
    private String genre;
    private Date publishDate;
    private String language;
    private Integer numberOfPages;
}
