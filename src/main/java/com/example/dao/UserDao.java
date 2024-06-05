package com.example.dao;

import com.example.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}