package com.inventory.inventoryapi.Services;

import com.inventory.inventoryapi.Dto.ManufacturerEntityDto;
import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import com.inventory.inventoryapi.Respostories.ManufacturerEntityRepository;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Setter
@NoArgsConstructor
public class ManufacturerService {

    @Autowired
    ManufacturerEntityRepository repository;

    public List<ManufacturerEntityDto> findAll(){
        ManufacturerEntityDto manufacturerEntityDto = new ManufacturerEntityDto();
        return manufacturerEntityDto.getDtoListFromEntity(repository.findAll());
    }
    public ManufacturerEntity create(ManufacturerEntityDto manufacturerEntityDto){
       try{  return repository.save( manufacturerEntityDto.makeDtoAnEntity(manufacturerEntityDto));}
       catch (Exception e){
           System.out.println( e.getMessage() + " " + e.getCause());
       }
        return repository.save( manufacturerEntityDto.makeDtoAnEntity(manufacturerEntityDto));
    }

    }
