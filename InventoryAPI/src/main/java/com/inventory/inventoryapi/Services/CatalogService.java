package com.inventory.inventoryapi.Services;

import com.inventory.inventoryapi.Dto.CatalogEntityDto;
import com.inventory.inventoryapi.Entity.CatalogEntity;
import com.inventory.inventoryapi.Respostories.CatalogEntityRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Setter

@Component
public class CatalogService {
    @Autowired
    CatalogEntityRepository repository;
    public List<CatalogEntityDto> findAll(){
        CatalogEntityDto catalogEntityDto = new CatalogEntityDto();
        return  catalogEntityDto.getDtoListFromEntity(repository.findAll());
    }
    public CatalogEntity save(CatalogEntityDto catalogEntityDto){
        return repository.save(catalogEntityDto.makeDtoAnEntity(catalogEntityDto));
    }


}
