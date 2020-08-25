/*
*
* CompanyInfoDO.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-09-19
*/
package com.hzw.mybatis.lessxml.entity;

import java.io.Serializable;
import java.util.Date;
public class CompanyInfoDO implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 企业代码（统一社会信用代码）
     */
    private String companyNo;

    /**
     * 证件注册时间
     */
    private Date certfcateRegistTime;

    /**
     * 证件失效时间
     */
    private Date certfcateExpireTime;

    /**
     * 规模
     */
    private String scale;

    /**
     * 
     */
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

    /**
     * 
     */
    private Long identityId;

    /**
     * 
     */
    private String appCode;

    /**
     * 0未通过 1通过
     */
    private Integer checkState;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * company_info
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return name
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 企业代码（统一社会信用代码）
     * @return company_no 企业代码（统一社会信用代码）
     */
    public String getCompanyNo() {
        return companyNo;
    }

    /**
     * 企业代码（统一社会信用代码）
     * @param companyNo 企业代码（统一社会信用代码）
     */
    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo == null ? null : companyNo.trim();
    }

    /**
     * 证件注册时间
     * @return certfcate_regist_time 证件注册时间
     */
    public Date getCertfcateRegistTime() {
        return certfcateRegistTime;
    }

    /**
     * 证件注册时间
     * @param certfcateRegistTime 证件注册时间
     */
    public void setCertfcateRegistTime(Date certfcateRegistTime) {
        this.certfcateRegistTime = certfcateRegistTime;
    }

    /**
     * 证件失效时间
     * @return certfcate_expire_time 证件失效时间
     */
    public Date getCertfcateExpireTime() {
        return certfcateExpireTime;
    }

    /**
     * 证件失效时间
     * @param certfcateExpireTime 证件失效时间
     */
    public void setCertfcateExpireTime(Date certfcateExpireTime) {
        this.certfcateExpireTime = certfcateExpireTime;
    }

    /**
     * 规模
     * @return scale 规模
     */
    public String getScale() {
        return scale;
    }

    /**
     * 规模
     * @param scale 规模
     */
    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    /**
     * 
     * @return regist_address 
     */
    public String getRegistAddress() {
        return registAddress;
    }

    /**
     * 
     * @param registAddress 
     */
    public void setRegistAddress(String registAddress) {
        this.registAddress = registAddress == null ? null : registAddress.trim();
    }

    /**
     * 所在国家
     * @return regist_country 所在国家
     */
    public String getRegistCountry() {
        return registCountry;
    }

    /**
     * 所在国家
     * @param registCountry 所在国家
     */
    public void setRegistCountry(String registCountry) {
        this.registCountry = registCountry == null ? null : registCountry.trim();
    }

    /**
     * 国标行业分类（主营）
     * @return national_standard_branch 国标行业分类（主营）
     */
    public String getNationalStandardBranch() {
        return nationalStandardBranch;
    }

    /**
     * 国标行业分类（主营）
     * @param nationalStandardBranch 国标行业分类（主营）
     */
    public void setNationalStandardBranch(String nationalStandardBranch) {
        this.nationalStandardBranch = nationalStandardBranch == null ? null : nationalStandardBranch.trim();
    }

    /**
     * 职工人数
     * @return staff_count 职工人数
     */
    public Integer getStaffCount() {
        return staffCount;
    }

    /**
     * 职工人数
     * @param staffCount 职工人数
     */
    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }

    /**
     * 营业收入
     * @return business_income 营业收入
     */
    public Integer getBusinessIncome() {
        return businessIncome;
    }

    /**
     * 营业收入
     * @param businessIncome 营业收入
     */
    public void setBusinessIncome(Integer businessIncome) {
        this.businessIncome = businessIncome;
    }

    /**
     * 企业实际经营国家
     * @return real_business_country 企业实际经营国家
     */
    public String getRealBusinessCountry() {
        return realBusinessCountry;
    }

    /**
     * 企业实际经营国家
     * @param realBusinessCountry 企业实际经营国家
     */
    public void setRealBusinessCountry(String realBusinessCountry) {
        this.realBusinessCountry = realBusinessCountry == null ? null : realBusinessCountry.trim();
    }

    /**
     * 办公地址
     * @return office_address 办公地址
     */
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * 办公地址
     * @param officeAddress 办公地址
     */
    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress == null ? null : officeAddress.trim();
    }

    /**
     * 行业码表信息
     * @return business_code 行业码表信息
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 行业码表信息
     * @param businessCode 行业码表信息
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * 
     * @return identity_id 
     */
    public Long getIdentityId() {
        return identityId;
    }

    /**
     * 
     * @param identityId 
     */
    public void setIdentityId(Long identityId) {
        this.identityId = identityId;
    }

    /**
     * 
     * @return app_code 
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * 
     * @param appCode 
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    /**
     * 0未通过 1通过
     * @return check_state 0未通过 1通过
     */
    public Integer getCheckState() {
        return checkState;
    }

    /**
     * 0未通过 1通过
     * @param checkState 0未通过 1通过
     */
    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CompanyInfoDO other = (CompanyInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCompanyNo() == null ? other.getCompanyNo() == null : this.getCompanyNo().equals(other.getCompanyNo()))
            && (this.getCertfcateRegistTime() == null ? other.getCertfcateRegistTime() == null : this.getCertfcateRegistTime().equals(other.getCertfcateRegistTime()))
            && (this.getCertfcateExpireTime() == null ? other.getCertfcateExpireTime() == null : this.getCertfcateExpireTime().equals(other.getCertfcateExpireTime()))
            && (this.getScale() == null ? other.getScale() == null : this.getScale().equals(other.getScale()))
            && (this.getRegistAddress() == null ? other.getRegistAddress() == null : this.getRegistAddress().equals(other.getRegistAddress()))
            && (this.getRegistCountry() == null ? other.getRegistCountry() == null : this.getRegistCountry().equals(other.getRegistCountry()))
            && (this.getNationalStandardBranch() == null ? other.getNationalStandardBranch() == null : this.getNationalStandardBranch().equals(other.getNationalStandardBranch()))
            && (this.getStaffCount() == null ? other.getStaffCount() == null : this.getStaffCount().equals(other.getStaffCount()))
            && (this.getBusinessIncome() == null ? other.getBusinessIncome() == null : this.getBusinessIncome().equals(other.getBusinessIncome()))
            && (this.getRealBusinessCountry() == null ? other.getRealBusinessCountry() == null : this.getRealBusinessCountry().equals(other.getRealBusinessCountry()))
            && (this.getOfficeAddress() == null ? other.getOfficeAddress() == null : this.getOfficeAddress().equals(other.getOfficeAddress()))
            && (this.getBusinessCode() == null ? other.getBusinessCode() == null : this.getBusinessCode().equals(other.getBusinessCode()))
            && (this.getIdentityId() == null ? other.getIdentityId() == null : this.getIdentityId().equals(other.getIdentityId()))
            && (this.getAppCode() == null ? other.getAppCode() == null : this.getAppCode().equals(other.getAppCode()))
            && (this.getCheckState() == null ? other.getCheckState() == null : this.getCheckState().equals(other.getCheckState()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCompanyNo() == null) ? 0 : getCompanyNo().hashCode());
        result = prime * result + ((getCertfcateRegistTime() == null) ? 0 : getCertfcateRegistTime().hashCode());
        result = prime * result + ((getCertfcateExpireTime() == null) ? 0 : getCertfcateExpireTime().hashCode());
        result = prime * result + ((getScale() == null) ? 0 : getScale().hashCode());
        result = prime * result + ((getRegistAddress() == null) ? 0 : getRegistAddress().hashCode());
        result = prime * result + ((getRegistCountry() == null) ? 0 : getRegistCountry().hashCode());
        result = prime * result + ((getNationalStandardBranch() == null) ? 0 : getNationalStandardBranch().hashCode());
        result = prime * result + ((getStaffCount() == null) ? 0 : getStaffCount().hashCode());
        result = prime * result + ((getBusinessIncome() == null) ? 0 : getBusinessIncome().hashCode());
        result = prime * result + ((getRealBusinessCountry() == null) ? 0 : getRealBusinessCountry().hashCode());
        result = prime * result + ((getOfficeAddress() == null) ? 0 : getOfficeAddress().hashCode());
        result = prime * result + ((getBusinessCode() == null) ? 0 : getBusinessCode().hashCode());
        result = prime * result + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        result = prime * result + ((getAppCode() == null) ? 0 : getAppCode().hashCode());
        result = prime * result + ((getCheckState() == null) ? 0 : getCheckState().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(id);
        sb.append(", name=").append(name);
        sb.append(", companyNo=").append(companyNo);
        sb.append(", certfcateRegistTime=").append(certfcateRegistTime);
        sb.append(", certfcateExpireTime=").append(certfcateExpireTime);
        sb.append(", scale=").append(scale);
        sb.append(", registAddress=").append(registAddress);
        sb.append(", registCountry=").append(registCountry);
        sb.append(", nationalStandardBranch=").append(nationalStandardBranch);
        sb.append(", staffCount=").append(staffCount);
        sb.append(", businessIncome=").append(businessIncome);
        sb.append(", realBusinessCountry=").append(realBusinessCountry);
        sb.append(", officeAddress=").append(officeAddress);
        sb.append(", businessCode=").append(businessCode);
        sb.append(", identityId=").append(identityId);
        sb.append(", appCode=").append(appCode);
        sb.append(", checkState=").append(checkState);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}