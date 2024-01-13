package com.company.product.service.modelconverter;

import com.company.product.model.dto.ProductDTO;

public interface NotificationModelConverterService<T, U extends ProductDTO> {
    T constructNotificationVO(U productDTO);
}
