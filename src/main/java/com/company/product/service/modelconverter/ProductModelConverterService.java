package com.company.product.service.modelconverter;

import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.inbound.kafka.RetailProductRequest;

public interface ProductModelConverterService {
    RetailProductDTO convert(RetailProductRequest retailProductRequest);
}
