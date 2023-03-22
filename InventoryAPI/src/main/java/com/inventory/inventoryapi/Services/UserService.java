package com.inventory.inventoryapi.Services;

import com.inventory.inventoryapi.Dto.UserEntityDto;
import com.inventory.inventoryapi.Entity.UserEntity;
import com.inventory.inventoryapi.Respostories.UserEntityRepository;
import jakarta.persistence.EntityManager;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@NoArgsConstructor
@Component
@Setter
public class UserService {
    public UserService(UserEntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @Autowired
    UserEntityRepository entityRepository;
    public UserEntityDto getUserById(Long id){
        UserEntityDto userEntityDto = new UserEntityDto(entityRepository.getById(id));
       return userEntityDto;
    }
    public List<UserEntityDto> getAllUsers(){
        UserEntityDto userEntityDto = new UserEntityDto();
        return userEntityDto.getDtoListFromEntity(entityRepository.findAll());
    }
    public UserEntity create(UserEntityDto userEntityDto){
      return   entityRepository.save(userEntityDto.makeDtoAnEntity(userEntityDto));

    }
    public void delete(UserEntityDto userEntityDto){
        UserEntity userEntity = new UserEntity();

    }




}
