package com.inventory.inventoryapi.Respostories;

import com.inventory.inventoryapi.Entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryEntityRepository extends JpaRepository<InventoryEntity, Long> {
}