package com.company.product.service.product;

import com.company.product.model.dto.ProductDTO;

public interface ProductService <T extends ProductDTO> {
    void save(T productRequest);
}
