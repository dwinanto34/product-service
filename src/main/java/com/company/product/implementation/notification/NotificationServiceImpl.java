package com.company.product.implementation.notification;

import com.company.product.model.dto.EmailStockNotificationDTO;
import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.dto.SMSStockNotificationDTO;
import com.company.product.service.modelconverter.NotificationModelConverterService;
import com.company.product.service.notification.NotificationService;
import com.company.product.service.notification.StockNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService<RetailProductDTO> {
    private static final String SMS = "sms";
    private static final String EMAIL = "email";
    private static final Integer STOCK_THRESHOLD = 10;

    @Value("${notification.type}")
    private String notificationType;

    private StockNotificationService smsStockNotificationService;
    private StockNotificationService emailStockNotificationService;
    private NotificationModelConverterService smsNotificationModelConverterService;
    private NotificationModelConverterService emailNotificationModelConverterService;

    @Autowired
    public NotificationServiceImpl(
            @Qualifier("SMSStockNotificationServiceImpl") StockNotificationService smsStockNotificationService,
            @Qualifier("emailStockNotificationServiceImpl") StockNotificationService emailStockNotificationService,
            @Qualifier("SMSNotificationModelConverterServiceImpl") NotificationModelConverterService smsNotificationModelConverterService,
            @Qualifier("emailNotificationModelConverterServiceImpl") NotificationModelConverterService emailNotificationModelConverterService
    ) {
        this.smsStockNotificationService = smsStockNotificationService;
        this.emailStockNotificationService = emailStockNotificationService;
        this.emailNotificationModelConverterService = emailNotificationModelConverterService;
        this.smsNotificationModelConverterService = smsNotificationModelConverterService;
    }

    @Override
    public void sendLowQuantityNotification(RetailProductDTO retailProductDTO) {
        if (retailProductDTO.getStockQuantity() > STOCK_THRESHOLD) {
            return;
        }

        if (EMAIL.equals(notificationType)) {
            EmailStockNotificationDTO notificationDTO = (EmailStockNotificationDTO) emailNotificationModelConverterService.constructNotificationVO(retailProductDTO);
            emailStockNotificationService.sendNotification(notificationDTO);
        } else if (SMS.equals(notificationType)) {
            SMSStockNotificationDTO notificationDTO = (SMSStockNotificationDTO) smsNotificationModelConverterService.constructNotificationVO(retailProductDTO);
            smsStockNotificationService.sendNotification(notificationDTO);
        }
    }
}
