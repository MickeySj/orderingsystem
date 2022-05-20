package com.msj.repository;

import com.msj.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);
}
