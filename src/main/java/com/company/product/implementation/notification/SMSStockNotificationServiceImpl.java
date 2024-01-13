package com.company.product.implementation.notification;

import com.company.product.model.dto.SMSStockNotificationDTO;
import com.company.product.service.notification.StockNotificationService;
import org.springframework.stereotype.Service;

@Service
public class SMSStockNotificationServiceImpl implements StockNotificationService<SMSStockNotificationDTO> {
    @Override
    public void sendNotification(SMSStockNotificationDTO smsStockNotificationDTO) {
        String smsLog = new StringBuilder("Sending SMS using template: ")
                .append(smsStockNotificationDTO.getSmsTemplate())
                .append(" ")
                .append("to ")
                .append(smsStockNotificationDTO.getPhoneNumber())
                .append(" ")
                .append("telling them that stock for ")
                .append(smsStockNotificationDTO.getProductName())
                .append(" ")
                .append("is running low. Current stock: ")
                .append(smsStockNotificationDTO.getStockQuantity())
                .toString();

        System.out.println(smsLog);
    }
}
