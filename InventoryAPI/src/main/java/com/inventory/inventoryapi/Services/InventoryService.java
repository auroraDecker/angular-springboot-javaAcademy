package com.inventory.inventoryapi.Services;

import com.inventory.inventoryapi.Dto.InventoryEntityDto;
import com.inventory.inventoryapi.Entity.InventoryEntity;
import com.inventory.inventoryapi.Respostories.InventoryEntityRepository;
import jakarta.persistence.Column;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@NoArgsConstructor
@Component
@Setter
public class InventoryService {
    @Autowired
    InventoryEntityRepository inventoryEntityRepository;

    public Page<InventoryEntity> findAll(Pageable pageable){
         return inventoryEntityRepository.findAll(pageable);
    }
    public InventoryEntity save(InventoryEntityDto inventoryEntityDto){
      return inventoryEntityRepository.save(inventoryEntityDto.makeDtoAnEntity(inventoryEntityDto));
    }

}
