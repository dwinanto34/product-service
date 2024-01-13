package com.company.product.service.modelconverter;

import com.company.product.model.dto.EbookProductDTO;
import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.inbound.kafka.RetailProductRequest;
import com.company.product.model.inbound.rest.EbookProductRequest;

public interface ProductModelConverterService {
    RetailProductDTO convert(RetailProductRequest retailProductRequest);

    EbookProductDTO convert(EbookProductRequest ebookProductRequest);
}
