package com.hzw.mp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 保单退保信息
 * </p>
 *
 * @author ${author}
 * @since 2019-12-03
 */
@Data
@Accessors(chain = true)
@TableName("insurance_policy_return_info")
public class InsurancePolicyReturnInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.AUTO)
    private Long id;

    /**
     * 保单号
     */
    private String policyNo;

    /**
     * 分期机构ID
     */
    private Long agencyId;

    /**
     * 客户ID
     */
    private Long identityId;

    /**
     * 退保金额
     */
    private BigDecimal returnAmount;

    /**
     * 保险计费天数
     */
    private Integer chargingDays;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 复核状态
     */
    private Integer recheckStatus;

    /**
     * 备注
     */
    private String remark;


}
