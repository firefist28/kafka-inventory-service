package com.firefist.inventory_service.consumer;

import com.firefist.inventory_service.kafka.InventoryProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderConsumer {

    private final InventoryProducer inventoryProducer;

    @KafkaListener (topics="orders", groupId = "inventory-group")
    public void consume (String orderMessage){
        log.info("Received order event: {}", orderMessage);
        // Simulate inventory check
        log.info("Checking inventory for: {}", orderMessage);

        boolean isInStock = true; // Assume all products are in stock for now

        // Publish confirmation
        if (isInStock) {
            inventoryProducer.sendConfirmation("Inventory confirmed for: " + orderMessage);
        } else {
            log.warn("Inventory not available for: {}", orderMessage);
        }

    }
}
