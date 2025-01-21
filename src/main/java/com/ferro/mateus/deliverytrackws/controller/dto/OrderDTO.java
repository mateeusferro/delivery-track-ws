package com.ferro.mateus.deliverytrackws.controller.dto;

import com.ferro.mateus.deliverytrackws.domain.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderDTO(OrderStatus status, LocalDateTime orderDate,
                       LocalDateTime deliveryDate, String trackingId, BigDecimal totalPrice) {
}
