package com.bobooy.ems.service;

import com.bobooy.ems.mapper.EmployeeMapper;
import com.bobooy.ems.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author BoBooY
 * @date 2022/9/26 23:45
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int save(Employee employee) {
        return employeeMapper.save(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public Collection<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeMapper.getEmployee(id);
    }

    @Override
    public int delete(Integer id) {
        return employeeMapper.delete(id);
    }
}
