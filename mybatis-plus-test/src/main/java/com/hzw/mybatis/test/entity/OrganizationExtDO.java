package com.hzw.mybatis.test.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 分期机构补充信息表
 * </p>
 *
 * @author ${author}
 * @since 2019-12-02
 */
@Data
@Accessors(chain = true)
@TableName("organization_ext")
public class OrganizationExtDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构id
     */
    private Long agencyId;

    /**
     * 机构编码
     */
    private String organizationCode;

    /**
     * 机构Logo
     */
    private String organizationLogo;

    /**
     * 机构官网
     */
    private String organizationWebsite;

    /**
     * 机构线索url
     */
    private String organizationUrl;

    /**
     * 资金方名称
     */
    private String bankSrcName;

    /**
     * 资金方编码
     */
    private String bankSrcNo;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 线索码值
     */
    private String clueNo;


}
