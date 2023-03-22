package com.inventory.inventoryapi.Data;

import com.inventory.inventoryapi.Dto.ManufacturerEntityDto;
import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import com.inventory.inventoryapi.Services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerData {
    @Autowired
    ManufacturerService service;
    @Autowired
    public void setData(){
        ManufacturerEntityDto bmwCompany = new ManufacturerEntityDto(1L,"BMW");
        service.create(bmwCompany);
        ManufacturerEntityDto gmCompany = new ManufacturerEntityDto(2L,"GeneralMotors");
        service.create(gmCompany);

    }
}
