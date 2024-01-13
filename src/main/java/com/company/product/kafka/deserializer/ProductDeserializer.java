package com.company.product.kafka.deserializer;

import com.company.product.model.inbound.kafka.RetailProductRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ProductDeserializer implements Deserializer<RetailProductRequest> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public RetailProductRequest deserialize(String s, byte[] bytes) {
        try {
            return objectMapper.readValue(bytes, RetailProductRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
