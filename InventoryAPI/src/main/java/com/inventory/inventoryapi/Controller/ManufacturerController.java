package com.inventory.inventoryapi.Controller;

import com.inventory.inventoryapi.Dto.ManufacturerEntityDto;
import com.inventory.inventoryapi.Dto.UserEntityDto;
import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import com.inventory.inventoryapi.Services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ManufacturerController {
    @Autowired
    ManufacturerService manufacturerService;

    @GetMapping("/manufacturer")
    public List<ManufacturerEntityDto> findAllUserDto()
    {
        return manufacturerService.findAll();
    }

    @PostMapping("/manufacturer")
    public ManufacturerEntity createManufacturer(@RequestBody ManufacturerEntityDto entityDto){
       try {
           return manufacturerService.create(entityDto);}
       catch (Exception e){
           System.out.println("Error Messages: "+ e.getMessage() + " " + e.getCause());
       }
        return manufacturerService.create(entityDto);

}
}
