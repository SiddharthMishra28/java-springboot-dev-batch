package com.ahasan.sales.repo;

import com.ahasan.sales.entity.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepo extends JpaRepository<SalesEntity, Long> {

	SalesEntity findBySaleId(Long userId);
}
