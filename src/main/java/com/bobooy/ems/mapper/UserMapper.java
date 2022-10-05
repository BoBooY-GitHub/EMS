package com.bobooy.ems.mapper;

import com.bobooy.ems.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author BoBooY
 * @date 2022/9/18 22:26
 */
@Mapper
@Repository
public interface UserMapper {
    User getUser(String userName);
}
