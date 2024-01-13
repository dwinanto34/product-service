package com.company.product.service.notification;

import com.company.product.model.dto.StockNotificationDTO;

public interface StockNotificationService<T extends StockNotificationDTO> {
    void sendNotification(T stockNotificationDTO);
}
