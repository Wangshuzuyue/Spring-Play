package com.hzw.spring.usermanage.dubbo;

import com.hzw.rpc.api.service.LoginService;

/**
 * @author: huangzuwang
 * @date: 2019-07-24 15:30
 * @description:
 */

public class LoginServiceImpl implements LoginService {

    @Override
    public String login(String username, String password){
        System.out.println(">>>>>>获取到访问:" + username + " " + password);
        if("admin".equals(username) && "admin".equals(password)){

            return "SUCCESS";
        }
        return "FAILED";
    }
}
