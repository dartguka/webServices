package com.gmoura.webservices.repositories;

import com.gmoura.webservices.entities.OrderItem;
import com.gmoura.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
