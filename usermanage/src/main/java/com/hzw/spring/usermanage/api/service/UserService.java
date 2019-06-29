package com.hzw.spring.usermanage.api.service;

import com.hzw.spring.usermanage.provider.entity.User;

/**
 * Created by huangzuwang on 18/1/29.
 */
public interface UserService {

    int add(User user);

    User get(Integer key);

}
