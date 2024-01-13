package com.company.product.kafka.consumer;

import com.company.product.model.inbound.kafka.RetailProductRequest;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RetailProductListener {
    @KafkaListener(topics = "${kafka.topic.consumer.retail.product}")
    public void handleRetailProductMessage(ConsumerRecord<String, RetailProductRequest> record) {
        try {
            RetailProductRequest retailProductRequest = record.value();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
