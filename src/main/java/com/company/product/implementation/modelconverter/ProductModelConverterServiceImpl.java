package com.company.product.implementation.modelconverter;

import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.inbound.kafka.RetailProductRequest;
import com.company.product.service.modelconverter.ProductModelConverterService;
import org.springframework.stereotype.Service;

@Service
public class ProductModelConverterServiceImpl implements ProductModelConverterService {
    @Override
    public RetailProductDTO convert(RetailProductRequest retailProductRequest) {
        return RetailProductDTO.builder()
                .name(retailProductRequest.getProductName())
                .description(retailProductRequest.getProductDescription())
                .rating(retailProductRequest.getProductRating())
                .price(retailProductRequest.getProductPrice())
                .availability(retailProductRequest.isProductAvailability())
                .expiredDate(retailProductRequest.getExpiredDate())
                .stockQuantity(retailProductRequest.getStockQuantity())
                .size(retailProductRequest.getSize())
                .sizeUnit(retailProductRequest.getSizeUnit())
                .weight(retailProductRequest.getWeight())
                .weightUnit(retailProductRequest.getWeightUnit())
                .build();
    }
}
