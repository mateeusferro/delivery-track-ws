package com.ferro.mateus.deliverytrackws.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderSubscription {
    private Long customerId;
    private Long orderId;
    private LocalDateTime subscriptionTime;
    private Boolean active;
}
