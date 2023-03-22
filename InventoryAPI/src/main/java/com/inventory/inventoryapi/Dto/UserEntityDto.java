package com.inventory.inventoryapi.Dto;

import com.inventory.inventoryapi.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A DTO for the {@link com.inventory.inventoryapi.Entity.UserEntity} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntityDto implements Serializable {
    private Long userID;
    private String username;
    private String password;
    private String role;


    public UserEntityDto(UserEntity userEntity) {
    this.userID = userEntity.getUserID();
     this.username = userEntity.getUsername();
     this.password = userEntity.getPassword();
     this.role = userEntity.getRole();
    }
    public List<UserEntityDto> getDtoListFromEntity(List<UserEntity> userEntities){

        List<UserEntityDto> userEntityDtoList = new ArrayList<>();
        for (UserEntity user: userEntities
             ) {
            UserEntityDto userEntityDto = new UserEntityDto();
            userEntityDto.setUserID(user.getUserID());
            userEntityDto.setUsername(user.getUsername());
            userEntityDto.setPassword(user.getPassword());
            userEntityDto.setRole(user.getRole());
            userEntityDtoList.add(userEntityDto);
        }
        return userEntityDtoList;
    }
    public UserEntity makeDtoAnEntity(UserEntityDto userEntityDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(getUsername());
        userEntity.setPassword(getPassword());
        userEntity.setRole(getRole());
        return userEntity;
    }


}