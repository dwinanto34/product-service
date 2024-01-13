package com.company.product.implementation.modelconverter;

import com.company.product.model.dto.EmailStockNotificationDTO;
import com.company.product.model.dto.RetailProductDTO;
import com.company.product.service.modelconverter.NotificationModelConverterService;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationModelConverterServiceImpl implements NotificationModelConverterService<EmailStockNotificationDTO, RetailProductDTO> {
    @Override
    public EmailStockNotificationDTO constructNotificationVO(RetailProductDTO retailProductDTO) {
        return EmailStockNotificationDTO.builder()
                .emailAddress("EMAIL ADDRESS")
                .emailTemplate("EMAIL_PRODUCT_CREATED_NOTIFICATION_TEMPLATE")
                .productName(retailProductDTO.getName())
                .stockQuantity(retailProductDTO.getStockQuantity())
                .build();
    }
}
