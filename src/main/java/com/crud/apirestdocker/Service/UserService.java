package com.crud.apirestdocker.Service;

import java.util.List;

import com.crud.apirestdocker.dto.UserDto;

public interface UserService {
    
    List<UserDto> getAllUsers();

    UserDto getUserById(Long userid);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(Long userid, UserDto userDto);

    void deleteUser(Long userid);

}
