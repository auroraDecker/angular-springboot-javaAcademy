package com.inventory.inventoryapi.Entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@Entity
@Table(name = "manufacturer")
public class ManufacturerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "manufacturer_id", nullable = false)
    private Long manufacturerId;
@JsonAlias("companyName")
    @Column(name="company_name", nullable = false)
    private String companyName;

    public ManufacturerEntity() {

    }
}