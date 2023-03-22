package com.inventory.inventoryapi.Respostories;

import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ManufacturerEntityRepository extends JpaRepository<ManufacturerEntity, Long> {
}