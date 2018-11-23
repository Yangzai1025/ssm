package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //查询全部数据的方法
    @RequestMapping("/selectAll")
    public String selectAll(Map map){

        //调用业务类查询全部数据的方法
        List<User> userList = userService.selectAll();
        System.out.println(userList);
        //将数据放入到map集合
        map.put("userList",userList);
        //返回一个字符串通过视图解析器解析成地址指向一个jsp
        return "index";
    }

}
