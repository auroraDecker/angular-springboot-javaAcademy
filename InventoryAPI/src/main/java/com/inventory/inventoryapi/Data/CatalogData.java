package com.inventory.inventoryapi.Data;

import com.inventory.inventoryapi.Dto.CatalogEntityDto;
import com.inventory.inventoryapi.Services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogData {
    @Autowired
    CatalogService catalogService;
    @Autowired
    public void setData(){
        CatalogEntityDto catalogEntityDto = new CatalogEntityDto();
        catalogEntityDto.setInventoryId(1L);
        catalogEntityDto.setDescription("A bright car that shines brightly");
        catalogService.save(catalogEntityDto);
    }
}
