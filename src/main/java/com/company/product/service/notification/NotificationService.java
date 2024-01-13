package com.company.product.service.notification;

import com.company.product.model.dto.ProductDTO;

public interface NotificationService<T extends ProductDTO> {
    void sendLowQuantityNotification(T productDTO);
}
