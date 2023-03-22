package com.inventory.inventoryapi.Respostories;

import com.inventory.inventoryapi.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {
}