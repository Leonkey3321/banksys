package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.entity.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User login(String bankCode, String password) {
        User user = userDao.findByCode(bankCode);
        if(user == null){
            throw new RuntimeException("卡号错误");
        }
        if(!user.getPassword().equals(password)){
            throw new RuntimeException("密码错误");
        }

        return user;
    }
}
