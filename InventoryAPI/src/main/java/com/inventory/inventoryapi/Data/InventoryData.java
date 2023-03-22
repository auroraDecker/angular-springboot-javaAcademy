package com.inventory.inventoryapi.Data;

import com.inventory.inventoryapi.Dto.InventoryEntityDto;
import com.inventory.inventoryapi.Entity.InventoryEntity;
import com.inventory.inventoryapi.Services.InventoryService;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@ComponentScan()
@Service
public class InventoryData {
    @Autowired
    InventoryService inventoryService;
@Autowired
    public void setData() {
/*
         InventoryEntityDto inventoryEntityDto = new InventoryEntityDto();
         inventoryEntityDto.setColor("pink");
         inventoryEntityDto.setSerialNumber(9000L);
         inventoryEntityDto.setManufacturerId(2L);
         inventoryEntityDto.setNumberOfWheels(4);
 inventoryService.save(inventoryEntityDto);
         InventoryEntityDto inventoryEntityDto2 = new InventoryEntityDto();
         inventoryEntityDto.setColor("red");
         inventoryEntityDto.setSerialNumber(9400L);
         inventoryEntityDto.setManufacturerId(3L);
         inventoryEntityDto.setNumberOfWheels(4);

     }

 */
         Long serialNumberCounter = 1000L;
         Long inventoryIdCounter = 2000L;
         int[] numberOfWheels = new int[]{2, 4, 6, 8};
         Long manufacturerId = 5000L;
         int numberOfWheelsCounter = 0;
         int colorCounter = 0;
         String[] colors = new String[]{"red", "green", "blue", "pink"};
         for (int i = 0; i < 45; i++) {
             InventoryEntityDto inventoryEntityDto = new InventoryEntityDto( serialNumberCounter, numberOfWheels[numberOfWheelsCounter], (long) manufacturerId, colors[colorCounter]);
             inventoryService.save(inventoryEntityDto);
             serialNumberCounter++;
             inventoryIdCounter++;
             manufacturerId++;
             if (numberOfWheelsCounter < 3 || colorCounter < 3) {
                 numberOfWheelsCounter++;
                 colorCounter++;


             } else {
                 numberOfWheelsCounter = 0;
                 colorCounter = 0;
             }
         }
     }


}
