package com.inventory.inventoryapi.Dto;

import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import com.inventory.inventoryapi.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A DTO for the {@link com.inventory.inventoryapi.Entity.ManufacturerEntity} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ManufacturerEntityDto implements Serializable {
    private Long manufacturerId;
    private String companyName;

    public ManufacturerEntityDto(ManufacturerEntity manufacturerEntity) {
        this.companyName= manufacturerEntity.getCompanyName();
        this.manufacturerId = manufacturerEntity.getManufacturerId();

    }



    public List<ManufacturerEntityDto> getDtoListFromEntity(List<ManufacturerEntity> manufacturerEntities){

        List<ManufacturerEntityDto> manufacturerEntityDtoList = new ArrayList<>();
        for (ManufacturerEntity manufacturerEntity: manufacturerEntities
        ) {
            ManufacturerEntityDto manufacturer = new ManufacturerEntityDto();
            manufacturer.setManufacturerId(manufacturerEntity.getManufacturerId());
            manufacturer.setCompanyName(manufacturerEntity.getCompanyName());
            manufacturerEntityDtoList.add(manufacturer);
        }
        return manufacturerEntityDtoList;
    }
    public ManufacturerEntity makeDtoAnEntity(ManufacturerEntityDto manufacturerEntityDto){
        ManufacturerEntity manufacturerEntity = new ManufacturerEntity();
       manufacturerEntity.setCompanyName(manufacturerEntityDto.getCompanyName());
       manufacturerEntity.setManufacturerId(manufacturerEntityDto.getManufacturerId());
       return manufacturerEntity;
    }
}