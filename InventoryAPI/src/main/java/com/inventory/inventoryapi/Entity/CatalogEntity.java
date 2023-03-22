package com.inventory.inventoryapi.Entity;

import com.inventory.inventoryapi.Dto.CatalogEntityDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "catalog")
public class CatalogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "catalog_id", nullable = false)
    private Long catalogId;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId;



}
