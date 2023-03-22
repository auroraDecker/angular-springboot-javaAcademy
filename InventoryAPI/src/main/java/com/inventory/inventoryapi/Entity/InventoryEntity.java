package com.inventory.inventoryapi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "inventory")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "serial_number", nullable = false)
    private Long serialNumber;
    @Column(name = "number_of_wheels", nullable = false)
    private int numberOfWheels;

    @Column(name = "manufacturer_id", nullable = false)
    private Long manufacturerId;

@Column
    private String color;

}
