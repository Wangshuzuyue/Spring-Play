package com.hzw.springboot.jdbc.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bank_customer")
public class BankCustomerDO {
    @Id
    private Long id;

    /**
     * 客户ID
     */
    @Column(name = "identity_id")
    private Long identityId;

    /**
     * 客户名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 社会统一信用代码
     */
    private String usci;

    /**
     * 备注
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return name
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取客户ID
     *
     * @return identity_id - 客户ID
     */
    public Long getIdentityId() {
        return identityId;
    }

    /**
     * 设置客户ID
     *
     * @param identityId 客户ID
     */
    public void setIdentityId(Long identityId) {
        this.identityId = identityId;
    }

    /**
     * 获取客户名称
     *
     * @return customer_name - 客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户名称
     *
     * @param customerName 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 获取社会统一信用代码
     *
     * @return usci - 社会统一信用代码
     */
    public String getUsci() {
        return usci;
    }

    /**
     * 设置社会统一信用代码
     *
     * @param usci 社会统一信用代码
     */
    public void setUsci(String usci) {
        this.usci = usci == null ? null : usci.trim();
    }

    /**
     * 获取备注
     *
     * @return description - 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注
     *
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}