package com.company.product.implementation.product;

import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.entity.RetailProduct;
import com.company.product.repository.RetailProductRepository;
import com.company.product.service.product.ProductService;
import com.company.product.utils.DateHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RetailProductServiceImpl implements ProductService<RetailProductDTO> {
    private RetailProductRepository retailProductRepository;

    @Autowired
    public RetailProductServiceImpl(RetailProductRepository retailProductRepository) {
        this.retailProductRepository = retailProductRepository;
    }

    @Override
    public void save(RetailProductDTO retailProductDTO) {
        try {
            RetailProduct retailProduct = RetailProduct.builder()
                    .name(retailProductDTO.getName())
                    .description(retailProductDTO.getDescription())
                    .rating(retailProductDTO.getRating())
                    .availability(retailProductDTO.isAvailability())
                    .price(retailProductDTO.getPrice())
                    .expiredDate(DateHelperUtil.convertToEpoch(retailProductDTO.getExpiredDate()))
                    .stockQuantity(retailProductDTO.getStockQuantity())
                    .size(retailProductDTO.getSize())
                    .sizeUnit(retailProductDTO.getSizeUnit())
                    .weight(retailProductDTO.getWeight())
                    .weightUnit(retailProductDTO.getWeightUnit())
                    .build();

            retailProductRepository.save(retailProduct);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

