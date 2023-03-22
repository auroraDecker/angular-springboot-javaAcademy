package com.inventory.inventoryapi;
import com.inventory.inventoryapi.Dto.CatalogEntityDto;
import com.inventory.inventoryapi.Dto.InventoryEntityDto;
import com.inventory.inventoryapi.Entity.InventoryEntity;
import com.inventory.inventoryapi.Respostories.CatalogEntityRepository;
import com.inventory.inventoryapi.Respostories.InventoryEntityRepository;
import com.inventory.inventoryapi.Services.CatalogService;
import com.inventory.inventoryapi.Services.InventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class InventoryServiceTest {

    private InventoryEntityRepository repository;

    private InventoryService service;

    @BeforeEach
    public void setUp(){
        service = new InventoryService();
        repository = mock(InventoryEntityRepository.class);
        service.setInventoryEntityRepository(repository);
    }

    @Test()
    @DisplayName("Mock setup Complete")
    public void assertInjectedValuesAreNotNull(){
        assertNotNull(repository);
        assertNotNull(service);
    }
    @Test()
    @DisplayName("Mock findAll Inventory")
    public void findAll(){
        List<InventoryEntity> inventoryEntities = new ArrayList<>();
        InventoryEntity inventoryEntity = new InventoryEntity();
        inventoryEntity.setInventoryId(1L);
        inventoryEntity.setSerialNumber(200L);
        inventoryEntity.setManufacturerId(1L);
        inventoryEntity.setNumberOfWheels(4);
        inventoryEntity.setColor("red");
        inventoryEntities.add(inventoryEntity);

        InventoryEntity inventoryEntity1 = new InventoryEntity();
        inventoryEntity1.setInventoryId(2L);
        inventoryEntity1.setSerialNumber(250L);
        inventoryEntity1.setManufacturerId(4L);
        inventoryEntity1.setNumberOfWheels(4);
        inventoryEntity1.setColor("red");
        inventoryEntities.add(inventoryEntity1);

        when(repository.findAll()).thenReturn(inventoryEntities);
        List<InventoryEntityDto> returned = service.findAll();
        verify(repository, atLeastOnce()).findAll();

        assertNotNull(returned);
        assertThat(returned.size()).isEqualTo(2);

    }
}
