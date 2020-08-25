package com.hzw.mp.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 企业表
 * </p>
 *
 * @author ${author}
 * @since 2019-12-03
 */
@Data
@Accessors(chain = true)
@TableName("company_info")
@KeySequence("snowWorkerIDGenerator")
public class CompanyInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    /**
     * 企业代码（统一社会信用代码）
     */
    private String companyNo;

    /**
     * 证件注册时间
     */
    private LocalDateTime certfcateRegistTime;

    /**
     * 证件失效时间
     */
    private LocalDateTime certfcateExpireTime;

    /**
     * 规模
     */
    private String scale;

    private String registAddress;

    /**
     * 所在国家
     */
    private String registCountry;

    /**
     * 国标行业分类（主营）
     */
    private String nationalStandardBranch;

    /**
     * 职工人数
     */
    private Integer staffCount;

    /**
     * 营业收入
     */
    private Integer businessIncome;

    /**
     * 企业实际经营国家
     */
    private String realBusinessCountry;

    /**
     * 办公地址
     */
    private String officeAddress;

    /**
     * 行业码表信息
     */
    private String businessCode;

    private Long identityId;

    private String appCode;

    /**
     * 0未通过 1通过 99 未验证
     */
    private Boolean checkState;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 0-否  1-是 99-其他
     */
    private Integer hasChannel;


}
