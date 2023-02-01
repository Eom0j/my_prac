package com.example.soloPractice.order.service;

import com.example.soloPractice.order.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    public Order createOrder(Order order) {
        return order;
    }

    public Order findOrder(long OrderId) {
        return new Order(1L, 1L);
    }

    public List<Order> findOrders() {
        return List.of(new Order(1L, 1L),
                new Order(2L, 2L));
    }

    public Order deleteOrder(long OrderId) {
        return null;
    }
}
