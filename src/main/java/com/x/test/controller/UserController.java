package com.x.test.controller;

import com.x.test.bean.User;
import com.x.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //value的路径可以自定义
    @RequestMapping(value="aaa/bbb/ccc/ddd", method= RequestMethod.GET)
    public String search(User user, Model model) {
        List list = userService.list(user);
        model.addAttribute("list",list);
        return "user/list";
    }
}
