package com.inventory.inventoryapi.Respostories;

import com.inventory.inventoryapi.Entity.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CatalogEntityRepository extends JpaRepository<CatalogEntity, Long> {
}