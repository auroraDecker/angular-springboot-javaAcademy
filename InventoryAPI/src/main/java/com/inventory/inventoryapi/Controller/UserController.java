package com.inventory.inventoryapi.Controller;

import com.inventory.inventoryapi.Dto.UserEntityDto;
import com.inventory.inventoryapi.Entity.UserEntity;
import com.inventory.inventoryapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
@Autowired
    private UserService service;
@PostMapping("/user/create")
public List<UserEntityDto>create(@RequestBody UserEntityDto userEntityDto){

  service.create(userEntityDto);

  return service.getAllUsers();
}
@GetMapping("/user")
    public List<UserEntityDto> findAllUserDto()
{
    return service.getAllUsers();
}

    @GetMapping("/user/{id}")
    public UserEntityDto findUserById(@PathVariable Long id)
    {
        return service.getUserById(id);
    }
}