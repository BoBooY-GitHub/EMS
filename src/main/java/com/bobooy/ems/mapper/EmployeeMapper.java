package com.bobooy.ems.mapper;

import com.bobooy.ems.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author BoBooY
 * @date 2022/9/26 23:23
 */
@Mapper
@Repository
public interface EmployeeMapper {
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
