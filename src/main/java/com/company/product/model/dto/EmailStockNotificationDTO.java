package com.company.product.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class EmailStockNotificationDTO extends StockNotificationDTO {
    private String emailAddress;
    private String emailTemplate;
}
