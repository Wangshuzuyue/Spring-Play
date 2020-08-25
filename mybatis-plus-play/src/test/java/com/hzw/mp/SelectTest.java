package com.hzw.mp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.hzw.mp.entity.CompanyInfoDO;
import com.hzw.mp.entity.RiskRuleResultDO;
import com.hzw.mp.entity.RiskRuleWarningDO;
import com.hzw.mp.mapper.CompanyInfoMapper;
import com.hzw.mp.mapper.RiskCheckMapper;
import com.hzw.mp.mapper.RiskRuleResultMapper;
import com.hzw.mp.mapper.RiskRuleWarningMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: huangzuwang
 * @date: 2019-11-29 11:18
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectTest {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Autowired
    private RiskCheckMapper riskCheckMapper;

    @Autowired
    private RiskRuleWarningMapper riskRuleWarningMapper;

    @Autowired
    private RiskRuleResultMapper riskRuleResultMapper;


    @Test
    public void selectDiy(){
        RiskRuleResultDO myOne = riskRuleResultMapper.getMyOne("0009418d36f34db4a2b2b554a64d09d1");
        System.out.println(">>>>>>结果输出:" + myOne);
    }

    /**
     * insert 并获取插入的主键
     */
    @Test
    public void insert(){
        LambdaQueryWrapper<CompanyInfoDO> queryWrapper = Wrappers.lambdaQuery();
        CompanyInfoDO riskCheckDO = new CompanyInfoDO();
        riskCheckDO
                .setCompanyNo("no12321")
                .setName("aaabbb");
        //影响行数
        long result = (1 << 17L) - 1;
        int insert = companyInfoMapper.insert(riskCheckDO);
        System.out.println(">>>>>>结果输出:" + riskCheckDO.getId());
    }

    /**
     * 根据entity进行select【需要实体继承Model接口】
     */
//    @Test
//    public void selectByEntity(){
//        LambdaQueryWrapper<CompanyInfoDO> queryWrapper = Wrappers.lambdaQuery();
//        CompanyInfoDO companyInfoDO = new CompanyInfoDO();
//        List<CompanyInfoDO> companyInfoDOS = companyInfoDO
//                .setId(1232111L)
//                .setName("hzwTest")
//                .setCompanyNo("12321")
//                .selectList(queryWrapper);
//        System.out.println(">>>>>>结果输出:" + companyInfoDOS);
//    }

    /**
     * 根据entity直接update【需要实体继承Model接口】
     */
//    @Test
//    public void updateByEntity(){
//        CompanyInfoDO companyInfoDO = new CompanyInfoDO();
//        boolean update = companyInfoDO
//                .setId(1232111L)
//                .setName("hzwTest")
//                .setCompanyNo("12321")
//                .updateById();
//        System.out.println(">>>>>>结果输出:" + update);
//    }


    /**
     * Lambda条件构造器1
     */
    @Test
    public void selectByLambda(){
        LambdaQueryWrapper<CompanyInfoDO> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper
                //可以选择要查的字段
                .select(CompanyInfoDO::getId, CompanyInfoDO::getCompanyNo, CompanyInfoDO::getName)
                //等于
                .eq(CompanyInfoDO::getCompanyNo, "914503005718144707")
                //右模糊
                .likeRight(CompanyInfoDO::getName, "上海")
                //大于等于
                .ge(CompanyInfoDO::getCreateTime, new Date())
                //小于
                .lt(CompanyInfoDO::getUpdateTime, new Date())
                .orderByDesc(CompanyInfoDO::getName);
        List<CompanyInfoDO> companyInfoDOs = companyInfoMapper.selectList(queryWrapper);
        System.out.println(">>>>>>结果输出:" + companyInfoDOs.toString());
    }

    /**
     * Lambda条件构造器【链式】
     */
    @Test
    public void selectByLambdaChain(){
        LambdaQueryChainWrapper<CompanyInfoDO> queryWrapper = new LambdaQueryChainWrapper<>(companyInfoMapper);
        List<CompanyInfoDO> companyInfoDOList = queryWrapper
                //可以选择要查的字段
                .select(CompanyInfoDO::getId, CompanyInfoDO::getCompanyNo, CompanyInfoDO::getName)
                //等于【参数1, boolean:判空条件； 参数2，列名；  参数3，值】
                .eq(StringUtils.isNotEmpty("914503005718144707"), CompanyInfoDO::getCompanyNo, "914503005718144707")
                //右模糊
                .likeRight(StringUtils.isNotEmpty("上海"), CompanyInfoDO::getName, "上海")
                //大于等于
                .ge(CompanyInfoDO::getCreateTime, new Date())
                //小于
                .lt(CompanyInfoDO::getUpdateTime, new Date())
                .between(CompanyInfoDO::getCreateTime, new Date(), new Date())
                .orderByDesc(CompanyInfoDO::getName)
                //直接链式
                .list();
        System.out.println(">>>>>>结果输出:" + companyInfoDOList.toString());
    }

    /**
     * group, order
     */
    @Test
    public void groupAndOrder(){
        QueryWrapper<CompanyInfoDO> queryWrapper = Wrappers.query();
        queryWrapper.select("sum(check_state) as sumState", "name").groupBy("name").orderByAsc("name");
        //可以定义一个实体
        List<Map<String, Object>> maps = companyInfoMapper.selectMaps(queryWrapper);
        System.out.println(">>>>>>结果输出:" + maps);
    }


    /**
     * select
     */
    @Test
    public void select(){
        //selectAll
        List<CompanyInfoDO> companyInfoDOs = companyInfoMapper.selectList(null);

        //selectBatchIds
        List<Long> ids = new ArrayList<>();
        ids.add(612010473084293120L);
        ids.add(612372664077651968L);
        companyInfoMapper.selectBatchIds(ids);


        System.out.println(">>>>>>结果输出:" + companyInfoDOs.toString());
    }

    /**
     * 分页【需要先配置物理分页插件】【封装成starter】
     */
    @Test
    public void page(){
        //参数1 当前页， 参数2 pageSize
        Page<RiskRuleWarningDO> page = new Page<>(1, 10000);
        LambdaQueryWrapper<RiskRuleWarningDO> queryWrapper = Wrappers.lambdaQuery();
//        queryWrapper.le(RiskRuleResultDO::getCreateTime, new Date());
        //可以定义一个实体
        IPage<RiskRuleWarningDO> iPage = riskRuleWarningMapper.selectPage(page, queryWrapper);
        System.out.println(">>>>>>结果输出:" + iPage);
    }


    /**
     * 子查询【建议单独写】
     */
    @Test
    public void subQuery(){
        LambdaQueryWrapper<CompanyInfoDO> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.inSql(CompanyInfoDO::getId, "select company_id from companysub_info where create_time > 20191101");
        //可以定义一个实体
        List<CompanyInfoDO> companyInfoDOS = companyInfoMapper.selectList(queryWrapper);
        System.out.println(">>>>>>结果输出:" + companyInfoDOS);
    }

    /**
     * 自定义Sql, 带条件构造器
     */
    @Test
    public void selectDiyWithWrapper(){
        QueryWrapper<CompanyInfoDO> queryWrapper = Wrappers.query();
        queryWrapper
                .likeRight("ci.regist_address", "湖北省")
                .isNotNull("csi.phone_no");
//        List<CompanyInfoDO> companyInfoDOs = companyInfoMapper.selectDiyWithWrapper(queryWrapper);
//        System.out.println(">>>>>>结果输出:" + companyInfoDOs.toString());
    }
}
