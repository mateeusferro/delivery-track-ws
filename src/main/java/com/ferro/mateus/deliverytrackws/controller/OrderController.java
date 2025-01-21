package com.ferro.mateus.deliverytrackws.controller;

import com.ferro.mateus.deliverytrackws.controller.dto.OrderDTO;
import com.ferro.mateus.deliverytrackws.domain.entity.Order;
import com.ferro.mateus.deliverytrackws.service.OrderService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private final OrderService orderService;
    private final SimpMessagingTemplate messagingTemplate;

    public OrderController(OrderService orderService, SimpMessagingTemplate messagingTemplate) {
        this.orderService = orderService;
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/order-tracking")
    public void orderStatus(OrderDTO orderDTO) {
        System.out.println("HEREEEEEEEEEEEEEEEE");
        Order orderToSave = Order.builder()
                .deliveryDate(orderDTO.deliveryDate())
                .status(orderDTO.status())
                .orderDate(orderDTO.orderDate())
                .totalPrice(orderDTO.totalPrice())
                .build();
        Order savedOrder = orderService.save(orderToSave);
        messagingTemplate.convertAndSend("/topic/order-status", savedOrder);
    }
}