package com.hzw.springboot.jdbc.controller;

import com.hzw.springboot.jdbc.entity.BankCustomerDO;
import com.hzw.springboot.jdbc.entity.User;
import com.hzw.springboot.jdbc.repository.BankCustomerMapper;
import com.hzw.springboot.jdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangzuwang
 * @date: 2019-09-10 18:09
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BankCustomerMapper bankCustomerMapper;

    /**
     * MVC 方式
     * @param user
     * @return
     */
    @PostMapping("/save")
    public String save(@RequestBody User user){
        System.out.printf(">>>>>>>>[%s] Save User:[%s]\n",Thread.currentThread().getName(), user);
//        return userRepository.save(user);
//        boolean save = userRepository.platformTransactionSave(user);
//        if (save){
//            return "save:保存成功";
//        }
        return "save:保存失败";
    }

    /**
     * webFlux 方式 【不用写Controller, 见webfluxConfiguration】
     * @param request
     * @return
     */

    /**
     *
     * @param bankCustomerDO
     * @return
     */

    @PostMapping("/getByKey")
    public Object getByKey(@RequestBody BankCustomerDO bankCustomerDO){
        BankCustomerDO bankCustomerDO1 = bankCustomerMapper.selectByPrimaryKey(bankCustomerDO);
        //或者
        return bankCustomerMapper.selectByPrimaryKey(4);
    }

    /**
     * 条件查询 和 排序
     * @param bankCustomerDO
     * @return
     */
    @PostMapping("/get")
    public Object get(@RequestBody BankCustomerDO bankCustomerDO){
        Example example = new Example(BankCustomerDO.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("customerName", bankCustomerDO.getCustomerName());
        //正序
//        example.orderBy("customerName");
        //倒序
        example.setOrderByClause("customer_name desc");
        return bankCustomerMapper.selectByExample(example);
    }

    /**
     * or 条件
     * @param bankCustomerDO
     * @return
     */
    @PostMapping("/get2")
    public Object get2(@RequestBody BankCustomerDO bankCustomerDO){
        Example example = new Example(BankCustomerDO.class);
        Example.Criteria criteria1 = example.createCriteria();

        List<String> customerNames = new ArrayList<>();
        customerNames.add(bankCustomerDO.getCustomerName());
        customerNames.add("北京智尊保共生科技有限公司4");
        criteria1.andIn(" ",customerNames);

        Example.Criteria criteria2 = example.createCriteria();
        criteria2.andEqualTo("customerName", "北京智尊保共生科技有限公司2");
        example.or(criteria2);

        Example.Criteria criteria3 = example.createCriteria();
        criteria3.andEqualTo("customerName", "北京智尊保共生科技有限公司3");
        example.or(criteria3);

        return bankCustomerMapper.selectByExample(example);
    }

}
