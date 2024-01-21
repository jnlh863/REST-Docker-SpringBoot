package com.crud.apirestdocker.Service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.apirestdocker.Repository.UserRepository;
import com.crud.apirestdocker.Service.UserService;
import com.crud.apirestdocker.User.User;
import com.crud.apirestdocker.dto.UserDto;
import com.crud.apirestdocker.exception.ResourceNotFoundException;
import com.crud.apirestdocker.mapper.UserMapper;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor 
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map((user) -> UserMapper.maptoUserDto(user)).collect(Collectors.toList()); 
    }

    @Override
    public UserDto getUserById(Long userid) {
        User user = userRepository.findById(userid).orElseThrow(
            () -> new ResourceNotFoundException("User don't exist with this id : " + userid));
        return UserMapper.maptoUserDto(user);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.maptoUser(userDto);
        User save = userRepository.save(user);
        return UserMapper.maptoUserDto(save);
    }

    @Override
    public UserDto updateUser(Long userid, UserDto userDto) {
        User user = userRepository.findById(userid).orElseThrow(
            () -> new ResourceNotFoundException("User don't exist with this id : " + userid));

        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setEmail(userDto.getEmail());

        User update = userRepository.save(user);

        return UserMapper.maptoUserDto(update);
    }

    @Override
    public void deleteUser(Long userid) {
        userRepository.findById(userid).orElseThrow(
            () -> new ResourceNotFoundException("User don't exist with this id : " + userid));
        userRepository.deleteById(userid);
    }
    
}
