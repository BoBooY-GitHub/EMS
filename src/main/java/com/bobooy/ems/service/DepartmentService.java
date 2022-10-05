package com.bobooy.ems.service;

import com.bobooy.ems.pojo.Department;

import java.util.Collection;

/**
 * @author BoBooY
 * @date 2022/10/2 10:31
 */
public interface DepartmentService {
    //获取所有部门的信息
    Collection<Department> getDepartments();

    // 通过ID查询部门
    Department getDepartmentById(Integer id);
}
