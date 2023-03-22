package com.inventory.inventoryapi.Data;

import com.inventory.inventoryapi.Dto.UserEntityDto;
import com.inventory.inventoryapi.Entity.UserEntity;
import com.inventory.inventoryapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersData {
    @Autowired
    UserService userService;
    @Autowired
    public void setData(){
        UserEntityDto userEntity = new UserEntityDto();
        userEntity.setRole("ADMIN");
        userEntity.setUsername("Aurora");
        userEntity.setPassword("A");
        userService.create(userEntity);

        UserEntityDto userEntity2 = new UserEntityDto();
        userEntity.setRole("ADMIN");
        userEntity.setUsername("Brad");
        userEntity.setPassword("B");
        userService.create(userEntity);
    }
}
