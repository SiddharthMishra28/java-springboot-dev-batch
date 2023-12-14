package com.ahasan.item.repo;

import com.ahasan.item.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<ItemEntity, Long> {

}
