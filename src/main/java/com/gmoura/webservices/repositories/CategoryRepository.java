package com.gmoura.webservices.repositories;

import com.gmoura.webservices.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
