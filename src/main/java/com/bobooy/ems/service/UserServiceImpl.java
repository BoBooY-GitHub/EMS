package com.bobooy.ems.service;

import com.bobooy.ems.mapper.UserMapper;
import com.bobooy.ems.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BoBooY
 * @date 2022/9/19 19:39
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userName) {
        return userMapper.getUser(userName);
    }
}
