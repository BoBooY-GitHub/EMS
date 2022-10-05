package com.bobooy.ems.service;

import com.bobooy.ems.mapper.UserMapper;
import com.bobooy.ems.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author BoBooY
 * @date 2022/9/19 19:37
 */

public interface UserService {
    User getUser(String userName);
}
