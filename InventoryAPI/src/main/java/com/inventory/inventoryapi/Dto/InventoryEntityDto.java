package com.inventory.inventoryapi.Dto;

import com.inventory.inventoryapi.Entity.InventoryEntity;
import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A DTO for the {@link com.inventory.inventoryapi.Entity.InventoryEntity} entity
 */
@NoArgsConstructor
@Data
public class InventoryEntityDto implements Serializable {
    private Long inventoryId;
    private Long serialNumber;
    private int numberOfWheels;
    private Long manufacturerId;
    private String color;

    public InventoryEntityDto(Long inventoryId, Long serialNumber, int numberOfWheels, Long manufacturerId, String color) {
        this.inventoryId = inventoryId;
        this.serialNumber = serialNumber;
        this.numberOfWheels = numberOfWheels;
        this.manufacturerId = manufacturerId;
        this.color = color;

    }

    public InventoryEntityDto(Long serialNumber, int numberOfWheels, Long manufacturerId, String color) {
        this.serialNumber = serialNumber;
        this.numberOfWheels = numberOfWheels;
        this.manufacturerId = manufacturerId;
        this.color = color;
    }

    public InventoryEntityDto(InventoryEntity inventoryEntity) {
        this.inventoryId = inventoryEntity.getInventoryId();
        this.serialNumber = inventoryEntity.getSerialNumber();
        this.numberOfWheels = inventoryEntity.getNumberOfWheels();
        this.manufacturerId = inventoryEntity.getManufacturerId();
        this.color=inventoryEntity.getColor();
    }
    public List<InventoryEntityDto> getDtoListFromEntity(List<InventoryEntity> inventoryEntities){

        List<InventoryEntityDto> inventoryEntityDtos = new ArrayList<>();
        for (InventoryEntity inventoryEntity: inventoryEntities
        ) {
            InventoryEntityDto inventory = new InventoryEntityDto();
            inventory.setManufacturerId(inventoryEntity.getManufacturerId());
            inventory.setInventoryId(inventoryEntity.getInventoryId());
            inventory.setSerialNumber(inventoryEntity.getSerialNumber());
            inventory.setNumberOfWheels(inventoryEntity.getNumberOfWheels());
            inventory.setColor(inventoryEntity.getColor());
            inventoryEntityDtos.add(inventory);
        }
        return inventoryEntityDtos;
    }
    public InventoryEntity makeDtoAnEntity(InventoryEntityDto inventoryEntityDto){
        InventoryEntity inventoryEntity = new InventoryEntity();
        inventoryEntity.setManufacturerId(inventoryEntityDto.getManufacturerId());
        inventoryEntity.setSerialNumber(inventoryEntityDto.getSerialNumber());
        inventoryEntity.setNumberOfWheels(inventoryEntityDto.getNumberOfWheels());
        inventoryEntity.setColor(inventoryEntityDto.getColor());
        return inventoryEntity;
    }
}
