package com.crud.apirestdocker.mapper;

import com.crud.apirestdocker.User.User;
import com.crud.apirestdocker.dto.UserDto;

public class UserMapper {

    public static UserDto maptoUserDto(User user){
        return new UserDto(
            user.getId(),
            user.getFirstname(),
            user.getLastname(),
            user.getEmail()
        );
    }


    public static User maptoUser(UserDto userDto){
        return new User(
            userDto.getId(),
            userDto.getFirstname(),
            userDto.getLastname(),
            userDto.getEmail()
        );
    }
 
}
