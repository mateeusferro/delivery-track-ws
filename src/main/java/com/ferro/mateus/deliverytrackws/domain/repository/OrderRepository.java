package com.ferro.mateus.deliverytrackws.domain.repository;

import com.ferro.mateus.deliverytrackws.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
