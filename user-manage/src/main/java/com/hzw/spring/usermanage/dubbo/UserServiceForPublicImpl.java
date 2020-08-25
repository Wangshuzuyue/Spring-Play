package com.hzw.spring.usermanage.dubbo;

import com.hzw.rpc.api.service.UserServiceForPublic;
import org.springframework.stereotype.Service;

/**
 * Created by huangzuwang on 18/1/29.
 */

@Service
public class UserServiceForPublicImpl implements UserServiceForPublic {


    @Override
    public String getInfo(String s, String s1) {
        System.out.println(">>>UserServiceForPublicImpl:" + s + " " + s1);
        return "获取到用户信息:" + s + " " + s1;
    }
}
