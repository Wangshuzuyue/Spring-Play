package com.hzw.spring.usermanage.provider.service;

import com.github.pagehelper.PageInfo;
import com.hzw.spring.usermanage.api.service.UserService;
import com.hzw.spring.usermanage.provider.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by huangzuwang on 18/1/29.
 */

@Service
public class UserServiceImpl implements UserService{

//    @Autowired
//    private UserMapper userMapper;
//
//    @Autowired
//    private ReportIdNoLocationMapper reportIdNoLocationMapper;
    
    @Override
    public int add(User user) {

//        return userMapper.insert(user);
        return 0;
    }

    @Override
    public User get(Integer key) {
//        Example userExample = new Example(User.class);
//        Example.Criteria criteria = userExample.createCriteria();
//        criteria.andGreaterThan("userId",1);
//        List<User> users = userMapper.selectByExample(userExample);
//        User user = users.get(0);
//
//        User user1 = userMapper.selectByUserId(key);

//        Example locationExample = new Example(ReportIdNoLocation.class);
//        Example.Criteria criteria1 = locationExample.createCriteria();
//        criteria1.andIsNotNull("name");
//        List<ReportIdNoLocation> reportIdNoLocation = reportIdNoLocationMapper.selectByExample(locationExample);
//        return user;
        User user = new User();
        user.setUserId(123);
        user.setUserName("hzw1231");
        user.setPassword("dddddssss");
        user.setPhone("13666666666");
        return user;
    }

    @Override
    public PageInfo<User> page(Integer pageNum, Integer pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        List<User> userList = userMapper.selectAll();
//        PageInfo<User> pageInfo = new PageInfo<>(userList, 10);
        return null;
    }
}
