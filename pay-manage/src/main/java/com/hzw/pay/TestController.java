package com.hzw.pay;

import com.hzw.pay.entity.RepayPlanTestDO;
import com.hzw.pay.entity.RepayPlanTestDOExample;
import com.hzw.pay.mapper.RepayPlanTestDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2019-09-05 17:23
 * @description:
 */
@Controller
@RequestMapping("/test")
public class TestController{

    @Autowired
    private Map<String, TestInterFace> map;

    @Autowired(required = false)
    private RepayPlanTestDOMapper repayPlanTestDOMapper;

    @GetMapping(value = "/test")
    public String test(){
        for (TestInterFace interFace : map.values()){
            Class<? extends TestInterFace> aClass = interFace.getClass();
            NameMapping annotation = aClass.getAnnotation(NameMapping.class);
            for (String name : annotation.names()){
                System.out.println(interFace.getClass() + " >>> " + name);
            }

        }
        return map.toString();
    }

    @GetMapping("/mybatisTest")
    public String mybatisTest(){
        System.out.println("12321");
        RepayPlanTestDOExample e = new RepayPlanTestDOExample();
        RepayPlanTestDOExample.Criteria criteria = e.createCriteria();
        criteria.andAssetFromEqualTo("A");
        List<RepayPlanTestDO> repayPlanTestDOS = repayPlanTestDOMapper.selectByExample(e);
        return "qwertyui";
    }

    public static void main(String[] args) {
        List<RepayPlanTestDO> list = new ArrayList<>();

        RepayPlanTestDO repayPlanTestDO1 = new RepayPlanTestDO();
        repayPlanTestDO1.setAssetFrom("ABC");
        list.add(repayPlanTestDO1);
        RepayPlanTestDO repayPlanTestDO2 = new RepayPlanTestDO();
        repayPlanTestDO2.setAssetFrom("DEF");
        list.add(repayPlanTestDO2);
        List<RepayPlanTestDO> newList = new ArrayList<>();
        Collections.copy(list, newList);
        System.out.println("");
    }
}
