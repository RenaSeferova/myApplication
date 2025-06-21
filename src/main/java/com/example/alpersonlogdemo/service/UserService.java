package com.example.alpersonlogdemo.service;

import com.example.alpersonlogdemo.UserDto.UserRequestDTO;
import com.example.alpersonlogdemo.UserDto.UserResponseDTO;

import java.util.List;

public interface UserService {

    UserResponseDTO createUser(UserRequestDTO request);

    UserResponseDTO getUserById(Long id);

    List<UserResponseDTO>getAllUsers();

    UserResponseDTO updateUser(Long id , UserRequestDTO request);

    void deleteUser(Long id);

}

