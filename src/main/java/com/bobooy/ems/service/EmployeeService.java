package com.bobooy.ems.service;

import com.bobooy.ems.mapper.EmployeeMapper;
import com.bobooy.ems.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author BoBooY
 * @date 2022/9/26 23:44
 */
public interface EmployeeService {
    //添加员工
    public int save(Employee employee);

    //查询全体员工信息
    public Collection<Employee> getAll();

    // 通过ID查询员工
    public Employee getEmployee(Integer id);

    //修改员工
    public int updateEmployee(Employee employee);

    // 删除员工
    public int delete(Integer id);
}
