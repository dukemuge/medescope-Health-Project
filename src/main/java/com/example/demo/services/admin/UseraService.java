package com.jackrutorial.service;

import com.jackrutorial.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}