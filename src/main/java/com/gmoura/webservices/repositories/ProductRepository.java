package com.gmoura.webservices.repositories;

import com.gmoura.webservices.entities.Category;
import com.gmoura.webservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
