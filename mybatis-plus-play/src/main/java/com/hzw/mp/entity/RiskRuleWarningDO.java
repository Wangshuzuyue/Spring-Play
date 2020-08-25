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
@TableName("risk_rule_warning")
public class RiskRuleWarningDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.INPUT)
    private String id;

    private String ruleId;

    private String subjectId;

    private String name;

    private String className;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;

    private String description;

    private String status;

    private String assetFrom;

    /**
     * 预警持续天数
     */
    private Integer lastingDays;

    /**
     * 业务类型
     */
    private String bizType;

    /**
     * 权限组ID
     */
    private String permissionGroupId;

    /**
     * 资金方
     */
    private String fundParty;

    /**
     * 资金模式
     */
    private String fundMode;


}
