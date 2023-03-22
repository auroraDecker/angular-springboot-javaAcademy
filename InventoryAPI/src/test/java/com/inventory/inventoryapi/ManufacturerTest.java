package com.inventory.inventoryapi;
import com.inventory.inventoryapi.Dto.ManufacturerEntityDto;
import com.inventory.inventoryapi.Entity.ManufacturerEntity;
import com.inventory.inventoryapi.Respostories.ManufacturerEntityRepository;
import com.inventory.inventoryapi.Services.ManufacturerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ManufacturerTest {
    private ManufacturerService service;

    private ManufacturerEntityRepository repository;
    @BeforeEach
    public void setUp(){
        service = new ManufacturerService();
        repository = mock(ManufacturerEntityRepository.class);
        service.setRepository(repository);
    }
    @Test()
    @DisplayName("Mock setup Complete")
    public void assertInjectedValuesAreNotNull(){
        assertNotNull(repository);
        assertNotNull(service);
    }

    @Test()
    @DisplayName("Mock findAll Manufacturer")
    public void findAll(){
        List<ManufacturerEntity> manufacturerEntities = new ArrayList<>();
        ManufacturerEntity bmw = new ManufacturerEntity();
        bmw.setManufacturerId(1L);
        bmw.setCompanyName("BMW");
        manufacturerEntities.add(bmw);

        ManufacturerEntity gm = new ManufacturerEntity();
        gm.setCompanyName("GM");
        gm.setManufacturerId(2L);
        manufacturerEntities.add(gm);

        when(repository.findAll()).thenReturn(manufacturerEntities);
        List<ManufacturerEntityDto> returned = service.findAll();

        assertNotNull(returned);
        assertThat(returned.size()).isEqualTo(2);

    }
    @Test
    @DisplayName("Mock create Manufacturer")
    public void create() {
    ManufacturerEntityDto dto = new ManufacturerEntityDto(5L,"Ford");
    ManufacturerEntity entity = new ManufacturerEntity(5L,"Ford");
    when(repository.save(any(ManufacturerEntity.class))).thenReturn(entity);
    ManufacturerEntity returned = service.create(dto);
    assertEquals(entity, returned);


    }
}
