package com.company.product.implementation.notification;

import com.company.product.model.dto.EmailStockNotificationDTO;
import com.company.product.service.notification.StockNotificationService;
import org.springframework.stereotype.Service;

@Service
public class EmailStockNotificationServiceImpl implements StockNotificationService<EmailStockNotificationDTO> {
    @Override
    public void sendNotification(EmailStockNotificationDTO emailStockNotificationDTO) {
        String emailLog = new StringBuilder("Sending e-mail using template: ")
                .append(emailStockNotificationDTO.getEmailTemplate())
                .append(" ")
                .append("to ")
                .append(emailStockNotificationDTO.getEmailAddress())
                .append(" ")
                .append("telling them that stock for ")
                .append(emailStockNotificationDTO.getProductName())
                .append(" ")
                .append("is running low. Current stock: ")
                .append(emailStockNotificationDTO.getStockQuantity())
                .toString();

        System.out.println(emailLog);
    }
}
