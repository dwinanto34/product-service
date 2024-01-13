package com.company.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class SMSStockNotificationDTO extends StockNotificationDTO {
    private String phoneNumber;
    private String smsTemplate;
}
