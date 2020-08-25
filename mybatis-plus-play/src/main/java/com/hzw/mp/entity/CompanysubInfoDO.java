package com.hzw.mp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 企业表子表
 * </p>
 *
 * @author ${author}
 * @since 2019-12-03
 */
@Data
@Accessors(chain = true)
@TableName("companysub_info")
public class CompanysubInfoDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "name", type = IdType.INPUT)
    private Long id;

    private String name;

    private String sex;

    /**
     * 国籍
     */
    private String country;

    private String phoneNo;

    private String officePhoneNo;

    /**
     * 附属类型
     */
    private String subType;

    /**
     * 附属状态
     */
    private String subState;

    /**
     * 证件类型
     */
    private String idType;

    /**
     * 证件号码
     */
    private String idNo;

    private Long companyId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String isPerson;

    private String mail;


}
