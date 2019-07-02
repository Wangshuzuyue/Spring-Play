package com.hzw.spring.usermanage.provider.mapper;

import com.hzw.spring.usermanage.provider.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface UserMapper extends Mapper<User>{
    User selectByUserId(Integer userId);

}