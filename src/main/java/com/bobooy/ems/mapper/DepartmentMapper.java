package com.bobooy.ems.mapper;

import com.bobooy.ems.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author BoBooY
 * @date 2022/9/27 0:01
 */
@Mapper
@Repository
public interface DepartmentMapper {
    //获取所有部门的信息
    Collection<Department> getDepartments();

    // 通过ID查询部门
    Department getDepartmentById(Integer id);
}
