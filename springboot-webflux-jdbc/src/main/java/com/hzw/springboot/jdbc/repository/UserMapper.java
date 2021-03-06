package com.hzw.springboot.jdbc.repository;

import com.hzw.springboot.jdbc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author: huangzuwang
 * @date: 2019-11-26 18:52
 * @description:
 */
@Mapper
@Component("userMapper")
public interface UserMapper extends TKMapper<User>{
}
