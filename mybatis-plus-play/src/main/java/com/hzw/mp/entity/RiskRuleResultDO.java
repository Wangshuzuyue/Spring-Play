package com.hzw.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("risk_rule_result")
public class RiskRuleResultDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.INPUT)
    private String id;

    private String ruleId;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 风控对象ID［资产id，质押物id］
     */
    private String subjectId;

    /**
     * 是否准入成功
     */
    private String status;

    private LocalDateTime updatedAt;

    private String description;

    /**
     * 权限组ID
     */
    private String permissionGroupId;

    /**
     * 资金方
     */
    private String fundParty;

    /**
     * 资产来源
     */
    private String assetFrom;

    /**
     * 业务类型
     */
    private String bizType;


}
