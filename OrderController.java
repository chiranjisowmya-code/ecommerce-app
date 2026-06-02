package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Order;
import com.example.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order placeOrder(
            @RequestParam Long productId,
            @RequestParam int quantity,
            @RequestParam Long userId) {

        return service.placeOrder(
                productId,
                quantity,
                userId
        );
    }
}