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
@Table(name = EbookProduct.TABLE_NAME)
public class EbookProduct extends Product {
    public static final String TABLE_NAME = "ebook_products";
    private static final String AUTHOR = "author";
    private static final String GENRE = "genre";
    private static final String PUBLISH_DATE = "publish_date";
    private static final String LANGUAGE = "language";
    private static final String NUMBER_OF_PAGES = "number_of_pages";

    @Column(name = EbookProduct.AUTHOR)
    private String author;

    @Column(name = EbookProduct.GENRE)
    private String genre;

    @Column(name = EbookProduct.PUBLISH_DATE)
    private Long publishDate;

    @Column(name = EbookProduct.LANGUAGE)
    private String language;

    @Column(name = EbookProduct.NUMBER_OF_PAGES)
    private Integer numberOfPages;
}