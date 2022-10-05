package com.bobooy.ems;

import com.bobooy.ems.mapper.EmployeeMapper;
import com.bobooy.ems.mapper.UserMapper;
import com.bobooy.ems.pojo.Department;
import com.bobooy.ems.pojo.Employee;
import com.bobooy.ems.pojo.User;
import com.bobooy.ems.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

@SpringBootTest
class EmsApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void contextLoads()  {
        Department department = new Department(101, null);
        Employee employee = new Employee(1011,"BoBooY2","2514539306@qq.com",1,department,new Date());
        System.out.println(employeeMapper.updateEmployee(employee));
    }
}
