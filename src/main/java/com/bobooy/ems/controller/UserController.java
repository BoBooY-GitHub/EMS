package com.bobooy.ems.controller;

import com.bobooy.ems.mapper.UserMapper;
import com.bobooy.ems.pojo.User;
import com.bobooy.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author BoBooY
 * @date 2022/9/19 17:05
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    //登录
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String userName, @RequestParam("password") String pwd, Model model, HttpSession session) {
        User user = userService.getUser(userName);
        if (user != null && user.getUserName().equals(userName) && user.getPwd().equals(pwd)) {
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg","用户名或密码错误！");
            return "index";
        }
    }

    //退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); //使当前session失效
        return "redirect:/index.html";
    }

}
