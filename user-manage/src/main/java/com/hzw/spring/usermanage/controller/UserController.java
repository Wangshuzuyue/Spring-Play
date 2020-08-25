package com.hzw.spring.usermanage.controller;

import com.hzw.spring.usermanage.api.service.UserService;
import com.hzw.spring.usermanage.provider.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangzuwang on 18/1/24.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
    public Object add(User user){
        System.out.println("12321");
        return userService.add(user);
    }

    @RequestMapping(value = "/get", method = {RequestMethod.GET,RequestMethod.POST})
    public Object get(@Param(value = "key") Integer key){
        return userService.get(key);
    }

    @RequestMapping(value = "/page", method = {RequestMethod.GET,RequestMethod.POST})
    public Object get(@Param(value = "pageNum") Integer pageNum, @Param(value = "pageSize") Integer pageSize){
        return userService.page(pageNum, pageSize);
    }

    public static void main(String[] args) {
        String str1 = "1,2,3,,";
        String[] split = str1.split(",");
        System.out.println(">>>>>> " + split.length);
        String s = get(String.class);
        System.out.println(s);
    }

    public static <T> T get(Class<T> clazz){
        Integer i = 1;
        return (T)i;
    }
}
