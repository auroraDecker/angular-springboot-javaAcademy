package com.inventory.inventoryapi.Dto;

import com.inventory.inventoryapi.Entity.CatalogEntity;
import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A DTO for the {@link com.inventory.inventoryapi.Entity.CatalogEntity} entity
 */
@NoArgsConstructor
@Data
public class CatalogEntityDto implements Serializable {
    private Long catalogId;
    private String description;
    private Long inventoryId;


    public CatalogEntityDto(CatalogEntity catalogEntity) {
        this.catalogId = catalogEntity.getCatalogId();
        this.description = catalogEntity.getDescription();
        this.inventoryId = catalogEntity.getInventoryId();
    }

    public List<CatalogEntityDto> getDtoListFromEntity(List<CatalogEntity> catalogEntities){
        List<CatalogEntityDto> catalogEntityDtos = new ArrayList<>();
        for(CatalogEntity catalog:catalogEntities){
            CatalogEntityDto catalogEntityDto = new CatalogEntityDto();
            catalogEntityDto.setDescription(catalog.getDescription());
            catalogEntityDto.setInventoryId(catalog.getInventoryId());
            catalogEntityDto.setCatalogId(catalog.getCatalogId());
            catalogEntityDtos.add(catalogEntityDto);
        }
        return  catalogEntityDtos;
    }
    public CatalogEntity makeDtoAnEntity(CatalogEntityDto catalog){
        CatalogEntity catalogEntity = new CatalogEntity();
        catalogEntity.setCatalogId(catalog.getCatalogId());
        catalogEntity.setInventoryId(catalog.getInventoryId());
        catalogEntity.setDescription(catalog.getDescription());
        return catalogEntity;
    }

}

