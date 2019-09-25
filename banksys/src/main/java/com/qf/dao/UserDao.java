package com.qf.dao;

import com.qf.entity.User;

public interface UserDao {

    public User findByCode(String bankCode);
}
