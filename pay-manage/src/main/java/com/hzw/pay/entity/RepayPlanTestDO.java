/*
*
* RepayPlanTestDO.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-09-23
*/
package com.hzw.pay.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RepayPlanTestDO implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 资产id
     */
    private String assetId;

    /**
     * 期数
     */
    private Integer termNo;

    /**
     * 应还款日
     */
    private Integer repayDate;

    /**
     * 名义月供金额
     */
    private BigDecimal nameInstalmentsAmount;

    /**
     * 应还款金额
     */
    private BigDecimal repayAmount;

    /**
     * 应还款本金
     */
    private BigDecimal repayPrincipal;

    /**
     * 应还款利息
     */
    private BigDecimal repayInterest;

    /**
     * 还款状态
     */
    private String repayStatus;

    /**
     * 实际还款金额
     */
    private BigDecimal factRepayAmount;

    /**
     * 结清日期
     */
    private Integer finishFactRepayDate;

    /**
     * 罚息
     */
    private BigDecimal penaltyInterst;

    /**
     * 优惠方式
     */
    private String benefitType;

    /**
     * 优惠金额
     */
    private BigDecimal benefit;

    /**
     * 实际优惠金额
     */
    private BigDecimal factBenefit;

    /**
     * 最大逾期天数
     */
    private Integer maxOverdueDays;

    /**
     * 创建时间戳
     */
    private Date createDateTime;

    /**
     * 剩余本金
     */
    private BigDecimal leftPrincipal;

    /**
     * 提前结清金额
     */
    private BigDecimal preendAmount;

    /**
     * 资产来源
     */
    private String assetFrom;

    /**
     * 权限组ID
     */
    private String permissionGroupId;

    /**
     * 应还手续费
     */
    private BigDecimal repayPoundage;

    /**
     * 应还其他费用
     */
    private BigDecimal repayOtherChange;

    /**
     * 实际还款本金
     */
    private BigDecimal factRepayPrincipal;

    /**
     * 实际还款利息
     */
    private BigDecimal factRepayInterest;

    /**
     * 实际还款手续费
     */
    private BigDecimal factRepayPoundage;

    /**
     * 实际还款其他费用
     */
    private BigDecimal factRepayOtherChange;

    /**
     * 导入的清算日期
     */
    private Integer impClearDate;

    /**
     * 资产还款类型
     */
    private String assetRepayType;

    /**
     * 已核销金额
     */
    private BigDecimal verifiedAmount;

    /**
     * 首次实际还款日期
     */
    private Integer firstFactRepayDate;

    /**
     * 核销状态
     */
    private String verifyStatus;

    /**
     * 回购后核销金额
     */
    private BigDecimal verifiedAmountAfterBuyBack;

    /**
     * 多余金额是否已退回标志
     */
    private String hasRedundancyAmountBackFlag;

    /**
     * 资金方
     */
    private String fundParty;

    /**
     * 是否在融资计划中
     */
    private String isInFinancing;

    /**
     * 保证金金额
     */
    private BigDecimal marginAmount;

    /**
     * repay_plan_test
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
     * 资产id
     * @return asset_id 资产id
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * 资产id
     * @param assetId 资产id
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId == null ? null : assetId.trim();
    }

    /**
     * 期数
     * @return term_no 期数
     */
    public Integer getTermNo() {
        return termNo;
    }

    /**
     * 期数
     * @param termNo 期数
     */
    public void setTermNo(Integer termNo) {
        this.termNo = termNo;
    }

    /**
     * 应还款日
     * @return repay_date 应还款日
     */
    public Integer getRepayDate() {
        return repayDate;
    }

    /**
     * 应还款日
     * @param repayDate 应还款日
     */
    public void setRepayDate(Integer repayDate) {
        this.repayDate = repayDate;
    }

    /**
     * 名义月供金额
     * @return name_instalments_amount 名义月供金额
     */
    public BigDecimal getNameInstalmentsAmount() {
        return nameInstalmentsAmount;
    }

    /**
     * 名义月供金额
     * @param nameInstalmentsAmount 名义月供金额
     */
    public void setNameInstalmentsAmount(BigDecimal nameInstalmentsAmount) {
        this.nameInstalmentsAmount = nameInstalmentsAmount;
    }

    /**
     * 应还款金额
     * @return repay_amount 应还款金额
     */
    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    /**
     * 应还款金额
     * @param repayAmount 应还款金额
     */
    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    /**
     * 应还款本金
     * @return repay_principal 应还款本金
     */
    public BigDecimal getRepayPrincipal() {
        return repayPrincipal;
    }

    /**
     * 应还款本金
     * @param repayPrincipal 应还款本金
     */
    public void setRepayPrincipal(BigDecimal repayPrincipal) {
        this.repayPrincipal = repayPrincipal;
    }

    /**
     * 应还款利息
     * @return repay_interest 应还款利息
     */
    public BigDecimal getRepayInterest() {
        return repayInterest;
    }

    /**
     * 应还款利息
     * @param repayInterest 应还款利息
     */
    public void setRepayInterest(BigDecimal repayInterest) {
        this.repayInterest = repayInterest;
    }

    /**
     * 还款状态
     * @return repay_status 还款状态
     */
    public String getRepayStatus() {
        return repayStatus;
    }

    /**
     * 还款状态
     * @param repayStatus 还款状态
     */
    public void setRepayStatus(String repayStatus) {
        this.repayStatus = repayStatus == null ? null : repayStatus.trim();
    }

    /**
     * 实际还款金额
     * @return fact_repay_amount 实际还款金额
     */
    public BigDecimal getFactRepayAmount() {
        return factRepayAmount;
    }

    /**
     * 实际还款金额
     * @param factRepayAmount 实际还款金额
     */
    public void setFactRepayAmount(BigDecimal factRepayAmount) {
        this.factRepayAmount = factRepayAmount;
    }

    /**
     * 结清日期
     * @return finish_fact_repay_date 结清日期
     */
    public Integer getFinishFactRepayDate() {
        return finishFactRepayDate;
    }

    /**
     * 结清日期
     * @param finishFactRepayDate 结清日期
     */
    public void setFinishFactRepayDate(Integer finishFactRepayDate) {
        this.finishFactRepayDate = finishFactRepayDate;
    }

    /**
     * 罚息
     * @return penalty_interst 罚息
     */
    public BigDecimal getPenaltyInterst() {
        return penaltyInterst;
    }

    /**
     * 罚息
     * @param penaltyInterst 罚息
     */
    public void setPenaltyInterst(BigDecimal penaltyInterst) {
        this.penaltyInterst = penaltyInterst;
    }

    /**
     * 优惠方式
     * @return benefit_type 优惠方式
     */
    public String getBenefitType() {
        return benefitType;
    }

    /**
     * 优惠方式
     * @param benefitType 优惠方式
     */
    public void setBenefitType(String benefitType) {
        this.benefitType = benefitType == null ? null : benefitType.trim();
    }

    /**
     * 优惠金额
     * @return benefit 优惠金额
     */
    public BigDecimal getBenefit() {
        return benefit;
    }

    /**
     * 优惠金额
     * @param benefit 优惠金额
     */
    public void setBenefit(BigDecimal benefit) {
        this.benefit = benefit;
    }

    /**
     * 实际优惠金额
     * @return fact_benefit 实际优惠金额
     */
    public BigDecimal getFactBenefit() {
        return factBenefit;
    }

    /**
     * 实际优惠金额
     * @param factBenefit 实际优惠金额
     */
    public void setFactBenefit(BigDecimal factBenefit) {
        this.factBenefit = factBenefit;
    }

    /**
     * 最大逾期天数
     * @return max_overdue_days 最大逾期天数
     */
    public Integer getMaxOverdueDays() {
        return maxOverdueDays;
    }

    /**
     * 最大逾期天数
     * @param maxOverdueDays 最大逾期天数
     */
    public void setMaxOverdueDays(Integer maxOverdueDays) {
        this.maxOverdueDays = maxOverdueDays;
    }

    /**
     * 创建时间戳
     * @return create_date_time 创建时间戳
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 创建时间戳
     * @param createDateTime 创建时间戳
     */
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * 剩余本金
     * @return left_principal 剩余本金
     */
    public BigDecimal getLeftPrincipal() {
        return leftPrincipal;
    }

    /**
     * 剩余本金
     * @param leftPrincipal 剩余本金
     */
    public void setLeftPrincipal(BigDecimal leftPrincipal) {
        this.leftPrincipal = leftPrincipal;
    }

    /**
     * 提前结清金额
     * @return preend_amount 提前结清金额
     */
    public BigDecimal getPreendAmount() {
        return preendAmount;
    }

    /**
     * 提前结清金额
     * @param preendAmount 提前结清金额
     */
    public void setPreendAmount(BigDecimal preendAmount) {
        this.preendAmount = preendAmount;
    }

    /**
     * 资产来源
     * @return asset_from 资产来源
     */
    public String getAssetFrom() {
        return assetFrom;
    }

    /**
     * 资产来源
     * @param assetFrom 资产来源
     */
    public void setAssetFrom(String assetFrom) {
        this.assetFrom = assetFrom == null ? null : assetFrom.trim();
    }

    /**
     * 权限组ID
     * @return permission_group_id 权限组ID
     */
    public String getPermissionGroupId() {
        return permissionGroupId;
    }

    /**
     * 权限组ID
     * @param permissionGroupId 权限组ID
     */
    public void setPermissionGroupId(String permissionGroupId) {
        this.permissionGroupId = permissionGroupId == null ? null : permissionGroupId.trim();
    }

    /**
     * 应还手续费
     * @return repay_poundage 应还手续费
     */
    public BigDecimal getRepayPoundage() {
        return repayPoundage;
    }

    /**
     * 应还手续费
     * @param repayPoundage 应还手续费
     */
    public void setRepayPoundage(BigDecimal repayPoundage) {
        this.repayPoundage = repayPoundage;
    }

    /**
     * 应还其他费用
     * @return repay_other_change 应还其他费用
     */
    public BigDecimal getRepayOtherChange() {
        return repayOtherChange;
    }

    /**
     * 应还其他费用
     * @param repayOtherChange 应还其他费用
     */
    public void setRepayOtherChange(BigDecimal repayOtherChange) {
        this.repayOtherChange = repayOtherChange;
    }

    /**
     * 实际还款本金
     * @return fact_repay_principal 实际还款本金
     */
    public BigDecimal getFactRepayPrincipal() {
        return factRepayPrincipal;
    }

    /**
     * 实际还款本金
     * @param factRepayPrincipal 实际还款本金
     */
    public void setFactRepayPrincipal(BigDecimal factRepayPrincipal) {
        this.factRepayPrincipal = factRepayPrincipal;
    }

    /**
     * 实际还款利息
     * @return fact_repay_interest 实际还款利息
     */
    public BigDecimal getFactRepayInterest() {
        return factRepayInterest;
    }

    /**
     * 实际还款利息
     * @param factRepayInterest 实际还款利息
     */
    public void setFactRepayInterest(BigDecimal factRepayInterest) {
        this.factRepayInterest = factRepayInterest;
    }

    /**
     * 实际还款手续费
     * @return fact_repay_poundage 实际还款手续费
     */
    public BigDecimal getFactRepayPoundage() {
        return factRepayPoundage;
    }

    /**
     * 实际还款手续费
     * @param factRepayPoundage 实际还款手续费
     */
    public void setFactRepayPoundage(BigDecimal factRepayPoundage) {
        this.factRepayPoundage = factRepayPoundage;
    }

    /**
     * 实际还款其他费用
     * @return fact_repay_other_change 实际还款其他费用
     */
    public BigDecimal getFactRepayOtherChange() {
        return factRepayOtherChange;
    }

    /**
     * 实际还款其他费用
     * @param factRepayOtherChange 实际还款其他费用
     */
    public void setFactRepayOtherChange(BigDecimal factRepayOtherChange) {
        this.factRepayOtherChange = factRepayOtherChange;
    }

    /**
     * 导入的清算日期
     * @return imp_clear_date 导入的清算日期
     */
    public Integer getImpClearDate() {
        return impClearDate;
    }

    /**
     * 导入的清算日期
     * @param impClearDate 导入的清算日期
     */
    public void setImpClearDate(Integer impClearDate) {
        this.impClearDate = impClearDate;
    }

    /**
     * 资产还款类型
     * @return asset_repay_type 资产还款类型
     */
    public String getAssetRepayType() {
        return assetRepayType;
    }

    /**
     * 资产还款类型
     * @param assetRepayType 资产还款类型
     */
    public void setAssetRepayType(String assetRepayType) {
        this.assetRepayType = assetRepayType == null ? null : assetRepayType.trim();
    }

    /**
     * 已核销金额
     * @return verified_amount 已核销金额
     */
    public BigDecimal getVerifiedAmount() {
        return verifiedAmount;
    }

    /**
     * 已核销金额
     * @param verifiedAmount 已核销金额
     */
    public void setVerifiedAmount(BigDecimal verifiedAmount) {
        this.verifiedAmount = verifiedAmount;
    }

    /**
     * 首次实际还款日期
     * @return first_fact_repay_date 首次实际还款日期
     */
    public Integer getFirstFactRepayDate() {
        return firstFactRepayDate;
    }

    /**
     * 首次实际还款日期
     * @param firstFactRepayDate 首次实际还款日期
     */
    public void setFirstFactRepayDate(Integer firstFactRepayDate) {
        this.firstFactRepayDate = firstFactRepayDate;
    }

    /**
     * 核销状态
     * @return verify_status 核销状态
     */
    public String getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 核销状态
     * @param verifyStatus 核销状态
     */
    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus == null ? null : verifyStatus.trim();
    }

    /**
     * 回购后核销金额
     * @return verified_amount_after_buy_back 回购后核销金额
     */
    public BigDecimal getVerifiedAmountAfterBuyBack() {
        return verifiedAmountAfterBuyBack;
    }

    /**
     * 回购后核销金额
     * @param verifiedAmountAfterBuyBack 回购后核销金额
     */
    public void setVerifiedAmountAfterBuyBack(BigDecimal verifiedAmountAfterBuyBack) {
        this.verifiedAmountAfterBuyBack = verifiedAmountAfterBuyBack;
    }

    /**
     * 多余金额是否已退回标志
     * @return has_redundancy_amount_back_flag 多余金额是否已退回标志
     */
    public String getHasRedundancyAmountBackFlag() {
        return hasRedundancyAmountBackFlag;
    }

    /**
     * 多余金额是否已退回标志
     * @param hasRedundancyAmountBackFlag 多余金额是否已退回标志
     */
    public void setHasRedundancyAmountBackFlag(String hasRedundancyAmountBackFlag) {
        this.hasRedundancyAmountBackFlag = hasRedundancyAmountBackFlag == null ? null : hasRedundancyAmountBackFlag.trim();
    }

    /**
     * 资金方
     * @return fund_party 资金方
     */
    public String getFundParty() {
        return fundParty;
    }

    /**
     * 资金方
     * @param fundParty 资金方
     */
    public void setFundParty(String fundParty) {
        this.fundParty = fundParty == null ? null : fundParty.trim();
    }

    /**
     * 是否在融资计划中
     * @return is_in_financing 是否在融资计划中
     */
    public String getIsInFinancing() {
        return isInFinancing;
    }

    /**
     * 是否在融资计划中
     * @param isInFinancing 是否在融资计划中
     */
    public void setIsInFinancing(String isInFinancing) {
        this.isInFinancing = isInFinancing == null ? null : isInFinancing.trim();
    }

    /**
     * 保证金金额
     * @return margin_amount 保证金金额
     */
    public BigDecimal getMarginAmount() {
        return marginAmount;
    }

    /**
     * 保证金金额
     * @param marginAmount 保证金金额
     */
    public void setMarginAmount(BigDecimal marginAmount) {
        this.marginAmount = marginAmount;
    }

    /**
     *
     * @mbg.generated
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
        RepayPlanTestDO other = (RepayPlanTestDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAssetId() == null ? other.getAssetId() == null : this.getAssetId().equals(other.getAssetId()))
            && (this.getTermNo() == null ? other.getTermNo() == null : this.getTermNo().equals(other.getTermNo()))
            && (this.getRepayDate() == null ? other.getRepayDate() == null : this.getRepayDate().equals(other.getRepayDate()))
            && (this.getNameInstalmentsAmount() == null ? other.getNameInstalmentsAmount() == null : this.getNameInstalmentsAmount().equals(other.getNameInstalmentsAmount()))
            && (this.getRepayAmount() == null ? other.getRepayAmount() == null : this.getRepayAmount().equals(other.getRepayAmount()))
            && (this.getRepayPrincipal() == null ? other.getRepayPrincipal() == null : this.getRepayPrincipal().equals(other.getRepayPrincipal()))
            && (this.getRepayInterest() == null ? other.getRepayInterest() == null : this.getRepayInterest().equals(other.getRepayInterest()))
            && (this.getRepayStatus() == null ? other.getRepayStatus() == null : this.getRepayStatus().equals(other.getRepayStatus()))
            && (this.getFactRepayAmount() == null ? other.getFactRepayAmount() == null : this.getFactRepayAmount().equals(other.getFactRepayAmount()))
            && (this.getFinishFactRepayDate() == null ? other.getFinishFactRepayDate() == null : this.getFinishFactRepayDate().equals(other.getFinishFactRepayDate()))
            && (this.getPenaltyInterst() == null ? other.getPenaltyInterst() == null : this.getPenaltyInterst().equals(other.getPenaltyInterst()))
            && (this.getBenefitType() == null ? other.getBenefitType() == null : this.getBenefitType().equals(other.getBenefitType()))
            && (this.getBenefit() == null ? other.getBenefit() == null : this.getBenefit().equals(other.getBenefit()))
            && (this.getFactBenefit() == null ? other.getFactBenefit() == null : this.getFactBenefit().equals(other.getFactBenefit()))
            && (this.getMaxOverdueDays() == null ? other.getMaxOverdueDays() == null : this.getMaxOverdueDays().equals(other.getMaxOverdueDays()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()))
            && (this.getLeftPrincipal() == null ? other.getLeftPrincipal() == null : this.getLeftPrincipal().equals(other.getLeftPrincipal()))
            && (this.getPreendAmount() == null ? other.getPreendAmount() == null : this.getPreendAmount().equals(other.getPreendAmount()))
            && (this.getAssetFrom() == null ? other.getAssetFrom() == null : this.getAssetFrom().equals(other.getAssetFrom()))
            && (this.getPermissionGroupId() == null ? other.getPermissionGroupId() == null : this.getPermissionGroupId().equals(other.getPermissionGroupId()))
            && (this.getRepayPoundage() == null ? other.getRepayPoundage() == null : this.getRepayPoundage().equals(other.getRepayPoundage()))
            && (this.getRepayOtherChange() == null ? other.getRepayOtherChange() == null : this.getRepayOtherChange().equals(other.getRepayOtherChange()))
            && (this.getFactRepayPrincipal() == null ? other.getFactRepayPrincipal() == null : this.getFactRepayPrincipal().equals(other.getFactRepayPrincipal()))
            && (this.getFactRepayInterest() == null ? other.getFactRepayInterest() == null : this.getFactRepayInterest().equals(other.getFactRepayInterest()))
            && (this.getFactRepayPoundage() == null ? other.getFactRepayPoundage() == null : this.getFactRepayPoundage().equals(other.getFactRepayPoundage()))
            && (this.getFactRepayOtherChange() == null ? other.getFactRepayOtherChange() == null : this.getFactRepayOtherChange().equals(other.getFactRepayOtherChange()))
            && (this.getImpClearDate() == null ? other.getImpClearDate() == null : this.getImpClearDate().equals(other.getImpClearDate()))
            && (this.getAssetRepayType() == null ? other.getAssetRepayType() == null : this.getAssetRepayType().equals(other.getAssetRepayType()))
            && (this.getVerifiedAmount() == null ? other.getVerifiedAmount() == null : this.getVerifiedAmount().equals(other.getVerifiedAmount()))
            && (this.getFirstFactRepayDate() == null ? other.getFirstFactRepayDate() == null : this.getFirstFactRepayDate().equals(other.getFirstFactRepayDate()))
            && (this.getVerifyStatus() == null ? other.getVerifyStatus() == null : this.getVerifyStatus().equals(other.getVerifyStatus()))
            && (this.getVerifiedAmountAfterBuyBack() == null ? other.getVerifiedAmountAfterBuyBack() == null : this.getVerifiedAmountAfterBuyBack().equals(other.getVerifiedAmountAfterBuyBack()))
            && (this.getHasRedundancyAmountBackFlag() == null ? other.getHasRedundancyAmountBackFlag() == null : this.getHasRedundancyAmountBackFlag().equals(other.getHasRedundancyAmountBackFlag()))
            && (this.getFundParty() == null ? other.getFundParty() == null : this.getFundParty().equals(other.getFundParty()))
            && (this.getIsInFinancing() == null ? other.getIsInFinancing() == null : this.getIsInFinancing().equals(other.getIsInFinancing()))
            && (this.getMarginAmount() == null ? other.getMarginAmount() == null : this.getMarginAmount().equals(other.getMarginAmount()));
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        result = prime * result + ((getTermNo() == null) ? 0 : getTermNo().hashCode());
        result = prime * result + ((getRepayDate() == null) ? 0 : getRepayDate().hashCode());
        result = prime * result + ((getNameInstalmentsAmount() == null) ? 0 : getNameInstalmentsAmount().hashCode());
        result = prime * result + ((getRepayAmount() == null) ? 0 : getRepayAmount().hashCode());
        result = prime * result + ((getRepayPrincipal() == null) ? 0 : getRepayPrincipal().hashCode());
        result = prime * result + ((getRepayInterest() == null) ? 0 : getRepayInterest().hashCode());
        result = prime * result + ((getRepayStatus() == null) ? 0 : getRepayStatus().hashCode());
        result = prime * result + ((getFactRepayAmount() == null) ? 0 : getFactRepayAmount().hashCode());
        result = prime * result + ((getFinishFactRepayDate() == null) ? 0 : getFinishFactRepayDate().hashCode());
        result = prime * result + ((getPenaltyInterst() == null) ? 0 : getPenaltyInterst().hashCode());
        result = prime * result + ((getBenefitType() == null) ? 0 : getBenefitType().hashCode());
        result = prime * result + ((getBenefit() == null) ? 0 : getBenefit().hashCode());
        result = prime * result + ((getFactBenefit() == null) ? 0 : getFactBenefit().hashCode());
        result = prime * result + ((getMaxOverdueDays() == null) ? 0 : getMaxOverdueDays().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        result = prime * result + ((getLeftPrincipal() == null) ? 0 : getLeftPrincipal().hashCode());
        result = prime * result + ((getPreendAmount() == null) ? 0 : getPreendAmount().hashCode());
        result = prime * result + ((getAssetFrom() == null) ? 0 : getAssetFrom().hashCode());
        result = prime * result + ((getPermissionGroupId() == null) ? 0 : getPermissionGroupId().hashCode());
        result = prime * result + ((getRepayPoundage() == null) ? 0 : getRepayPoundage().hashCode());
        result = prime * result + ((getRepayOtherChange() == null) ? 0 : getRepayOtherChange().hashCode());
        result = prime * result + ((getFactRepayPrincipal() == null) ? 0 : getFactRepayPrincipal().hashCode());
        result = prime * result + ((getFactRepayInterest() == null) ? 0 : getFactRepayInterest().hashCode());
        result = prime * result + ((getFactRepayPoundage() == null) ? 0 : getFactRepayPoundage().hashCode());
        result = prime * result + ((getFactRepayOtherChange() == null) ? 0 : getFactRepayOtherChange().hashCode());
        result = prime * result + ((getImpClearDate() == null) ? 0 : getImpClearDate().hashCode());
        result = prime * result + ((getAssetRepayType() == null) ? 0 : getAssetRepayType().hashCode());
        result = prime * result + ((getVerifiedAmount() == null) ? 0 : getVerifiedAmount().hashCode());
        result = prime * result + ((getFirstFactRepayDate() == null) ? 0 : getFirstFactRepayDate().hashCode());
        result = prime * result + ((getVerifyStatus() == null) ? 0 : getVerifyStatus().hashCode());
        result = prime * result + ((getVerifiedAmountAfterBuyBack() == null) ? 0 : getVerifiedAmountAfterBuyBack().hashCode());
        result = prime * result + ((getHasRedundancyAmountBackFlag() == null) ? 0 : getHasRedundancyAmountBackFlag().hashCode());
        result = prime * result + ((getFundParty() == null) ? 0 : getFundParty().hashCode());
        result = prime * result + ((getIsInFinancing() == null) ? 0 : getIsInFinancing().hashCode());
        result = prime * result + ((getMarginAmount() == null) ? 0 : getMarginAmount().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(id);
        sb.append(", assetId=").append(assetId);
        sb.append(", termNo=").append(termNo);
        sb.append(", repayDate=").append(repayDate);
        sb.append(", nameInstalmentsAmount=").append(nameInstalmentsAmount);
        sb.append(", repayAmount=").append(repayAmount);
        sb.append(", repayPrincipal=").append(repayPrincipal);
        sb.append(", repayInterest=").append(repayInterest);
        sb.append(", repayStatus=").append(repayStatus);
        sb.append(", factRepayAmount=").append(factRepayAmount);
        sb.append(", finishFactRepayDate=").append(finishFactRepayDate);
        sb.append(", penaltyInterst=").append(penaltyInterst);
        sb.append(", benefitType=").append(benefitType);
        sb.append(", benefit=").append(benefit);
        sb.append(", factBenefit=").append(factBenefit);
        sb.append(", maxOverdueDays=").append(maxOverdueDays);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", leftPrincipal=").append(leftPrincipal);
        sb.append(", preendAmount=").append(preendAmount);
        sb.append(", assetFrom=").append(assetFrom);
        sb.append(", permissionGroupId=").append(permissionGroupId);
        sb.append(", repayPoundage=").append(repayPoundage);
        sb.append(", repayOtherChange=").append(repayOtherChange);
        sb.append(", factRepayPrincipal=").append(factRepayPrincipal);
        sb.append(", factRepayInterest=").append(factRepayInterest);
        sb.append(", factRepayPoundage=").append(factRepayPoundage);
        sb.append(", factRepayOtherChange=").append(factRepayOtherChange);
        sb.append(", impClearDate=").append(impClearDate);
        sb.append(", assetRepayType=").append(assetRepayType);
        sb.append(", verifiedAmount=").append(verifiedAmount);
        sb.append(", firstFactRepayDate=").append(firstFactRepayDate);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", verifiedAmountAfterBuyBack=").append(verifiedAmountAfterBuyBack);
        sb.append(", hasRedundancyAmountBackFlag=").append(hasRedundancyAmountBackFlag);
        sb.append(", fundParty=").append(fundParty);
        sb.append(", isInFinancing=").append(isInFinancing);
        sb.append(", marginAmount=").append(marginAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}