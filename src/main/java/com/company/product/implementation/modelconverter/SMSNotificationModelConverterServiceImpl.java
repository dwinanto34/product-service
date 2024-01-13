package com.company.product.implementation.modelconverter;

import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.dto.SMSStockNotificationDTO;
import com.company.product.service.modelconverter.NotificationModelConverterService;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationModelConverterServiceImpl implements NotificationModelConverterService<SMSStockNotificationDTO, RetailProductDTO> {
    @Override
    public SMSStockNotificationDTO constructNotificationVO(RetailProductDTO retailProductDTO) {
        return SMSStockNotificationDTO.builder()
                .phoneNumber("PHONE NUMBER")
                .smsTemplate("SMS_PRODUCT_CREATED_NOTIFICATION_TEMPLATE")
                .productName(retailProductDTO.getName())
                .stockQuantity(retailProductDTO.getStockQuantity())
                .build();
    }
}
