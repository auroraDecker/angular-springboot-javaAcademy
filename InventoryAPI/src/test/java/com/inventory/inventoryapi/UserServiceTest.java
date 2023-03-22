package com.inventory.inventoryapi;

import com.inventory.inventoryapi.Dto.UserEntityDto;
import com.inventory.inventoryapi.Entity.UserEntity;
import com.inventory.inventoryapi.Respostories.UserEntityRepository;
import com.inventory.inventoryapi.Services.UserService;
import jakarta.persistence.EntityManager;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class UserServiceTest {

    private UserEntityRepository dataSource;

    private UserService userService;
    @Autowired
    EntityManager entityManager;
    
    @BeforeEach
    public void setUp(){
        userService = new UserService();
        dataSource = mock(UserEntityRepository.class);
        userService.setEntityRepository(dataSource);
    }
    @Test
    @DisplayName("Mock setup Complete")
    public void assertInjectedValuesAreNotNull(){
        assertNotNull(dataSource);
        assertNotNull(userService);
    }
    @Test
    @DisplayName("Mock create user")
    public void create(){
        UserEntityDto userEntityDto = new UserEntityDto(null,"aurora","aurora","admin");
        UserEntity userEntity = new UserEntity(1L,"aurora","aurora","admin");
        when(dataSource.save(any(UserEntity.class))).thenReturn(userEntity);
        UserEntity returned = userService.create(userEntityDto);

        assertEquals(userEntity,returned);
    }
    @Test
    @DisplayName("Mock findAll user")
    public void findAll(){
        List<UserEntity> userEntities = new ArrayList<>();
        UserEntity userEntity = new UserEntity(1L,"aurora","aurora","admin");
userEntities.add(userEntity);
        when(dataSource.findAll()).thenReturn(userEntities);
        List<UserEntityDto> returned = userService.getAllUsers();
        verify(dataSource, atLeastOnce()).findAll();

    assertNotNull(returned);
        assertThat(returned.size()).isEqualTo(1);
    }
    @Test
    @DisplayName("Mock Find By Id")
    public void findById(){
        UserEntity userEntity = new UserEntity(1L,"aurora","aurora","admin");
        UserEntityDto userEntityDto = new UserEntityDto(1L,"aurora","aurora","admin");
        //given
        when(dataSource.getById(1L)).thenReturn(userEntity);
        //when
        UserEntityDto saved = userService.getUserById(1L);

        //then
        assertThat(saved).isNotNull();
    }
}
