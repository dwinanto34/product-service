package com.company.product.kafka.consumer;

import com.company.product.model.dto.RetailProductDTO;
import com.company.product.model.inbound.kafka.RetailProductRequest;
import com.company.product.service.modelconverter.ProductModelConverterService;
import com.company.product.service.notification.NotificationService;
import com.company.product.service.product.ProductService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RetailProductListener {
    private ProductService productService;
    private ProductModelConverterService productModelConverterService;
    private NotificationService notificationService;

    @Autowired
    public RetailProductListener(
            @Qualifier("retailProductServiceImpl") ProductService productService,
            ProductModelConverterService productModelConverterService,
            NotificationService notificationService
    ) {
        this.productService = productService;
        this.productModelConverterService = productModelConverterService;
        this.notificationService = notificationService;
    }

    @KafkaListener(topics = "${kafka.topic.consumer.retail.product}")
    public void handleRetailProductMessage(ConsumerRecord<String, RetailProductRequest> record) {
        try {
            RetailProductRequest retailProductRequest = record.value();

            RetailProductDTO retailProductDTO = productModelConverterService.convert(retailProductRequest);
            productService.save(retailProductDTO);

            notificationService.sendLowQuantityNotification(retailProductDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
