package com.ferro.mateus.deliverytrackws.service.impl;

import com.ferro.mateus.deliverytrackws.domain.entity.Order;
import com.ferro.mateus.deliverytrackws.domain.repository.OrderRepository;
import com.ferro.mateus.deliverytrackws.service.OrderService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
