package com.inventory.inventoryapi;

import com.inventory.inventoryapi.Dto.CatalogEntityDto;
import com.inventory.inventoryapi.Entity.CatalogEntity;
import com.inventory.inventoryapi.Respostories.CatalogEntityRepository;
import com.inventory.inventoryapi.Services.CatalogService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CatalogServiceTest {
    private CatalogEntityRepository repository;

    private CatalogService service;

    @BeforeEach
    public void setUp(){
        service = new CatalogService();
        repository = mock(CatalogEntityRepository.class);
        service.setRepository(repository);
    }

    @Test()
    @DisplayName("Mock setup Complete")
    public void assertInjectedValuesAreNotNull(){
        assertNotNull(repository);
        assertNotNull(service);
    }

    @Test()
    @DisplayName("Mock findAll catalog")
    public void findAll(){
        List<CatalogEntity> catalogEntities = new ArrayList<>();
        CatalogEntity catalogEntity = new CatalogEntity();
        catalogEntity.setDescription("lalal testy test");
        catalogEntity.setCatalogId(1L);
        catalogEntity.setInventoryId(1L);
        catalogEntities.add(catalogEntity);
        when(repository.findAll()).thenReturn(catalogEntities);
        List<CatalogEntityDto> returned = service.findAll();
        verify(repository, atLeastOnce()).findAll();

       assertNotNull(returned);
       assertThat(returned.size()).isEqualTo(1);

    }
    @Test()
    @DisplayName("Mock create Catalog")
    public void createCatalog(){
        CatalogEntity catalogEntity = new CatalogEntity();
        catalogEntity.setCatalogId(1L);
        catalogEntity.setDescription("testomg");
        catalogEntity.setInventoryId(1L);

        CatalogEntityDto catalogEntityDto = new CatalogEntityDto();
        catalogEntityDto.setCatalogId(1L);
        catalogEntityDto.setDescription("testomg");
        catalogEntityDto.setInventoryId(1L);
        //given
        given(repository.save(catalogEntity)).willReturn(catalogEntity);
        //when
       // when(repository.save(any(CatalogEntity.class))).then( catalogEntity);
        CatalogEntity returned = service.save(catalogEntityDto);

        assertEquals(catalogEntity,returned);


    }


}
