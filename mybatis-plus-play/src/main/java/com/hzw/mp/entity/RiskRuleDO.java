package com.hzw.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-12-05
 */
@Data
@Accessors(chain = true)
@TableName("risk_rule")
public class RiskRuleDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.INPUT)
    private String id;

    private String name;

    private String className;

    private String riskRuleTemplateId;

    private String evalType;

    private String inputType;

    private String status;

    /**
     * 规则解释
     */
    private String comment;

    /**
     * 实际执行阶段，贷前:PRE_LOAN, 发行:ISSUE ，置换:REPLACE,逗号分隔
     */
    private String evalPhase;

    /**
     * 可选字典条目
     */
    private String dictEntry;


}
