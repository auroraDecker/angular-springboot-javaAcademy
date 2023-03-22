package com.inventory.inventoryapi.Controller;

import com.inventory.inventoryapi.Dto.CatalogEntityDto;
import com.inventory.inventoryapi.Entity.CatalogEntity;
import com.inventory.inventoryapi.Services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping("/api")
public class CatalogController {
    @Autowired
    CatalogService service;
    @GetMapping("/catalog")
    public List<CatalogEntityDto> findAllCatalogs(){
        return service.findAll();
    }
    @PostMapping("/catalog")
    public CatalogEntity save(@RequestBody CatalogEntityDto dto){
        return service.save(dto);
    }
}
