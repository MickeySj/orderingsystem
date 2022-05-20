package com.msj.repository;

import com.msj.entity.User;

public interface UserRepository {
    public User login(String username,String password);
}
