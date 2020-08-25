package com.hzw.play.mycat.controller;

import com.hzw.play.mycat.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huangzuwang
 * @date: 2019-10-20 23:48
 * @description:
 */
@RequestMapping("/sysUser")
@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/get1/{id}")
    public Object get1(@PathVariable String id) {
        return "1返回:" + sysUserService.findUserByFirstDb(Long.valueOf(id));
    }

    @RequestMapping("/get2/{id}")
    public Object get2(@PathVariable String id) {
        return "2返回:" + sysUserService.findUserBySecondDb(Long.valueOf(id));
    }

}
