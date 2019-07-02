package com.hzw.spring.usermanage.provider.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzw.spring.usermanage.api.service.UserService;
import com.hzw.spring.usermanage.provider.entity.ReportIdNoLocation;
import com.hzw.spring.usermanage.provider.entity.User;
import com.hzw.spring.usermanage.provider.mapper.ReportIdNoLocationMapper;
import com.hzw.spring.usermanage.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by huangzuwang on 18/1/29.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ReportIdNoLocationMapper reportIdNoLocationMapper;
    
    @Override
    public int add(User user) {

        return userMapper.insert(user);
    }

    @Override
    public User get(Integer key) {
        Example userExample = new Example(User.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andGreaterThan("userId",1);
        List<User> users = userMapper.selectByExample(userExample);
        User user = users.get(0);

        User user1 = userMapper.selectByUserId(key);

        Example locationExample = new Example(ReportIdNoLocation.class);
        Example.Criteria criteria1 = locationExample.createCriteria();
        criteria1.andIsNotNull("id");
        List<ReportIdNoLocation> reportIdNoLocation = reportIdNoLocationMapper.selectByExample(locationExample);
        return user;
    }

    @Override
    public PageInfo<User> page(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(userList, 10);
        return pageInfo;
    }
}
