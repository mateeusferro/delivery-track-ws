package com.ferro.mateus.deliverytrackws.domain.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {
    ORDER_RECEIVED("Order Received"),
    PREPARING("Preparing"),
    OUT_FOR_DELIVERY("Out for Delivery"),
    DELIVERED("Delivered");

    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
