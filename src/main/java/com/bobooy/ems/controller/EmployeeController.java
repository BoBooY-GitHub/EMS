package com.bobooy.ems.controller;

import com.bobooy.ems.mapper.EmployeeMapper;
import com.bobooy.ems.pojo.Department;
import com.bobooy.ems.pojo.Employee;
import com.bobooy.ems.service.DepartmentService;
import com.bobooy.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author BoBooY
 * @date 2022/9/26 23:20
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    //跳转到员工信息页面
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeService.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    //跳转到添加页面
    @GetMapping("/add")
    public String add(Model model) {
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("depts", departments);
        // System.out.println(departments);
        return "emp/add";
    }

    //添加员工
    @PostMapping("/addEmp")
    public String addEmp(Employee employee) {
        int save = employeeService.save(employee);
        if(save > 0) {
            System.out.println("添加成功！");
        } else {
            System.out.println("添加失败！");
        }
        return "redirect:/emps";
    }

    //跳转修改页面
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id,Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    //修改员工信息
    @PostMapping("/updateEmp")
    public String update(Employee employee) {
        int update = employeeService.updateEmployee(employee);
        if(update > 0) {
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        return "redirect:/emps";
    }

    //删除员工
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        int delete = employeeService.delete(id);
        if(delete > 0)
            System.out.println("删除成功！");
        else {
            System.out.println("删除失败！");
        }
        return "redirect:/emps";
    }
}
