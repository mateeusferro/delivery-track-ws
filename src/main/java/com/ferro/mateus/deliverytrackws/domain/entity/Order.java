package com.ferro.mateus.deliverytrackws.domain.entity;

import com.ferro.mateus.deliverytrackws.domain.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private OrderStatus status;
    private Long customerId;
    private LocalDateTime orderDate;
    private LocalDateTime deliveryDate;
    private String trackingId;
    private BigDecimal totalPrice;
}
