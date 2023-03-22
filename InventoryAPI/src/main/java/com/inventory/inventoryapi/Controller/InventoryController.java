package com.inventory.inventoryapi.Controller;

import com.inventory.inventoryapi.Dto.InventoryEntityDto;
import com.inventory.inventoryapi.Entity.InventoryEntity;
import com.inventory.inventoryapi.Services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class InventoryController {
    @Autowired
   private InventoryService service;
    @GetMapping("/inventory")
    public Page<InventoryEntity> getInventoryList(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size)
    {
        Pageable paging = PageRequest.of(page,size);
        return service.findAll(paging);}

    @PostMapping("/inventory")
    public InventoryEntity create(InventoryEntityDto inventoryEntityDto){
        return service.save(inventoryEntityDto);
    }
}
