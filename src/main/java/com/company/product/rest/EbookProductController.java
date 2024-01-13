package com.company.product.rest;

import com.company.product.model.dto.EbookProductDTO;
import com.company.product.model.inbound.rest.EbookProductRequest;
import com.company.product.service.modelconverter.ProductModelConverterService;
import com.company.product.service.product.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ebooks")
public class EbookProductController {
    private ProductService productService;
    private ProductModelConverterService productModelConverterService;

    public EbookProductController(
            @Qualifier("ebookProductServiceImpl") ProductService productService,
            ProductModelConverterService productModelConverterService
    ) {
        this.productService = productService;
        this.productModelConverterService = productModelConverterService;
    }

    @PostMapping()
    public ResponseEntity<String> addEbookProduct(
            @RequestBody EbookProductRequest ebookProductRequest
    ) throws Exception {
        try {
            EbookProductDTO ebookProductDTO = productModelConverterService.convert(ebookProductRequest);
            productService.save(ebookProductDTO);
            return ResponseEntity.ok("Product added successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}