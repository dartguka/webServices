package com.gmoura.webservices.repositories;

import com.gmoura.webservices.entities.Order;
import com.gmoura.webservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
