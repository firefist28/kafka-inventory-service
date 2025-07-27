package com.firefist.inventory_service.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String topic = "inventory-confirmed";
    public void sendConfirmation(String message) {
        kafkaTemplate.send(topic, message);
        System.out.println("Inventory confirmation sent: " + message);
    }
}
