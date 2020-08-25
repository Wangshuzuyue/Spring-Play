package com.hzw.spring.usermanage.provider.mapper;

import com.hzw.spring.usermanage.provider.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


@Repository
public interface UserMapper extends Mapper<User>{
    User selectByUserId(Integer userId);

}