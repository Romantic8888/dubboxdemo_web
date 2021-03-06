package cn.itcast.dubboxdemo.controller;

import cn.itcast.dubbodemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//这是controller和ResponseBody的结合
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;
    @RequestMapping("/showName")
    @ResponseBody
    public String showName(String name)
    {
        return  userService.getName(name);
    }


}
