/*
*
* RepayPlanTestDOSqlProvider.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-09-23
*/
package com.hzw.pay.mapper;

import com.hzw.pay.entity.RepayPlanTestDO;
import com.hzw.pay.entity.RepayPlanTestDOExample.Criteria;
import com.hzw.pay.entity.RepayPlanTestDOExample.Criterion;
import com.hzw.pay.entity.RepayPlanTestDOExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RepayPlanTestDOSqlProvider {

    /**
     *
     * @mbg.generated
     */
    public String countByExample(RepayPlanTestDOExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("repay_plan_test");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String deleteByExample(RepayPlanTestDOExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("repay_plan_test");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String insertSelective(RepayPlanTestDO record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("repay_plan_test");
        
        sql.VALUES("name", "#{name,jdbcType=BIGINT}");
        
        if (record.getAssetId() != null) {
            sql.VALUES("asset_id", "#{assetId,jdbcType=VARCHAR}");
        }
        
        if (record.getTermNo() != null) {
            sql.VALUES("term_no", "#{termNo,jdbcType=INTEGER}");
        }
        
        if (record.getRepayDate() != null) {
            sql.VALUES("repay_date", "#{repayDate,jdbcType=INTEGER}");
        }
        
        if (record.getNameInstalmentsAmount() != null) {
            sql.VALUES("name_instalments_amount", "#{nameInstalmentsAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayAmount() != null) {
            sql.VALUES("repay_amount", "#{repayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayPrincipal() != null) {
            sql.VALUES("repay_principal", "#{repayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayInterest() != null) {
            sql.VALUES("repay_interest", "#{repayInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayStatus() != null) {
            sql.VALUES("repay_status", "#{repayStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getFactRepayAmount() != null) {
            sql.VALUES("fact_repay_amount", "#{factRepayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFinishFactRepayDate() != null) {
            sql.VALUES("finish_fact_repay_date", "#{finishFactRepayDate,jdbcType=INTEGER}");
        }
        
        if (record.getPenaltyInterst() != null) {
            sql.VALUES("penalty_interst", "#{penaltyInterst,jdbcType=DECIMAL}");
        }
        
        if (record.getBenefitType() != null) {
            sql.VALUES("benefit_type", "#{benefitType,jdbcType=VARCHAR}");
        }
        
        if (record.getBenefit() != null) {
            sql.VALUES("benefit", "#{benefit,jdbcType=DECIMAL}");
        }
        
        if (record.getFactBenefit() != null) {
            sql.VALUES("fact_benefit", "#{factBenefit,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxOverdueDays() != null) {
            sql.VALUES("max_overdue_days", "#{maxOverdueDays,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDateTime() != null) {
            sql.VALUES("create_date_time", "#{createDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLeftPrincipal() != null) {
            sql.VALUES("left_principal", "#{leftPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getPreendAmount() != null) {
            sql.VALUES("preend_amount", "#{preendAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAssetFrom() != null) {
            sql.VALUES("asset_from", "#{assetFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getPermissionGroupId() != null) {
            sql.VALUES("permission_group_id", "#{permissionGroupId,jdbcType=VARCHAR}");
        }
        
        if (record.getRepayPoundage() != null) {
            sql.VALUES("repay_poundage", "#{repayPoundage,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayOtherChange() != null) {
            sql.VALUES("repay_other_change", "#{repayOtherChange,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayPrincipal() != null) {
            sql.VALUES("fact_repay_principal", "#{factRepayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayInterest() != null) {
            sql.VALUES("fact_repay_interest", "#{factRepayInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayPoundage() != null) {
            sql.VALUES("fact_repay_poundage", "#{factRepayPoundage,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayOtherChange() != null) {
            sql.VALUES("fact_repay_other_change", "#{factRepayOtherChange,jdbcType=DECIMAL}");
        }
        
        if (record.getImpClearDate() != null) {
            sql.VALUES("imp_clear_date", "#{impClearDate,jdbcType=INTEGER}");
        }
        
        if (record.getAssetRepayType() != null) {
            sql.VALUES("asset_repay_type", "#{assetRepayType,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifiedAmount() != null) {
            sql.VALUES("verified_amount", "#{verifiedAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFirstFactRepayDate() != null) {
            sql.VALUES("first_fact_repay_date", "#{firstFactRepayDate,jdbcType=INTEGER}");
        }
        
        if (record.getVerifyStatus() != null) {
            sql.VALUES("verify_status", "#{verifyStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifiedAmountAfterBuyBack() != null) {
            sql.VALUES("verified_amount_after_buy_back", "#{verifiedAmountAfterBuyBack,jdbcType=DECIMAL}");
        }
        
        if (record.getHasRedundancyAmountBackFlag() != null) {
            sql.VALUES("has_redundancy_amount_back_flag", "#{hasRedundancyAmountBackFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getFundParty() != null) {
            sql.VALUES("fund_party", "#{fundParty,jdbcType=VARCHAR}");
        }
        
        if (record.getIsInFinancing() != null) {
            sql.VALUES("is_in_financing", "#{isInFinancing,jdbcType=VARCHAR}");
        }
        
        if (record.getMarginAmount() != null) {
            sql.VALUES("margin_amount", "#{marginAmount,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String selectByExample(RepayPlanTestDOExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("name");
        } else {
            sql.SELECT("name");
        }
        sql.SELECT("asset_id");
        sql.SELECT("term_no");
        sql.SELECT("repay_date");
        sql.SELECT("name_instalments_amount");
        sql.SELECT("repay_amount");
        sql.SELECT("repay_principal");
        sql.SELECT("repay_interest");
        sql.SELECT("repay_status");
        sql.SELECT("fact_repay_amount");
        sql.SELECT("finish_fact_repay_date");
        sql.SELECT("penalty_interst");
        sql.SELECT("benefit_type");
        sql.SELECT("benefit");
        sql.SELECT("fact_benefit");
        sql.SELECT("max_overdue_days");
        sql.SELECT("create_date_time");
        sql.SELECT("left_principal");
        sql.SELECT("preend_amount");
        sql.SELECT("asset_from");
        sql.SELECT("permission_group_id");
        sql.SELECT("repay_poundage");
        sql.SELECT("repay_other_change");
        sql.SELECT("fact_repay_principal");
        sql.SELECT("fact_repay_interest");
        sql.SELECT("fact_repay_poundage");
        sql.SELECT("fact_repay_other_change");
        sql.SELECT("imp_clear_date");
        sql.SELECT("asset_repay_type");
        sql.SELECT("verified_amount");
        sql.SELECT("first_fact_repay_date");
        sql.SELECT("verify_status");
        sql.SELECT("verified_amount_after_buy_back");
        sql.SELECT("has_redundancy_amount_back_flag");
        sql.SELECT("fund_party");
        sql.SELECT("is_in_financing");
        sql.SELECT("margin_amount");
        sql.FROM("repay_plan_test");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        RepayPlanTestDO record = (RepayPlanTestDO) parameter.get("record");
        RepayPlanTestDOExample example = (RepayPlanTestDOExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("repay_plan_test");
        
        if (record.getId() != null) {
            sql.SET("name = #{record.name,jdbcType=BIGINT}");
        }
        
        if (record.getAssetId() != null) {
            sql.SET("asset_id = #{record.assetId,jdbcType=VARCHAR}");
        }
        
        if (record.getTermNo() != null) {
            sql.SET("term_no = #{record.termNo,jdbcType=INTEGER}");
        }
        
        if (record.getRepayDate() != null) {
            sql.SET("repay_date = #{record.repayDate,jdbcType=INTEGER}");
        }
        
        if (record.getNameInstalmentsAmount() != null) {
            sql.SET("name_instalments_amount = #{record.nameInstalmentsAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayAmount() != null) {
            sql.SET("repay_amount = #{record.repayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayPrincipal() != null) {
            sql.SET("repay_principal = #{record.repayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayInterest() != null) {
            sql.SET("repay_interest = #{record.repayInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayStatus() != null) {
            sql.SET("repay_status = #{record.repayStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getFactRepayAmount() != null) {
            sql.SET("fact_repay_amount = #{record.factRepayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFinishFactRepayDate() != null) {
            sql.SET("finish_fact_repay_date = #{record.finishFactRepayDate,jdbcType=INTEGER}");
        }
        
        if (record.getPenaltyInterst() != null) {
            sql.SET("penalty_interst = #{record.penaltyInterst,jdbcType=DECIMAL}");
        }
        
        if (record.getBenefitType() != null) {
            sql.SET("benefit_type = #{record.benefitType,jdbcType=VARCHAR}");
        }
        
        if (record.getBenefit() != null) {
            sql.SET("benefit = #{record.benefit,jdbcType=DECIMAL}");
        }
        
        if (record.getFactBenefit() != null) {
            sql.SET("fact_benefit = #{record.factBenefit,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxOverdueDays() != null) {
            sql.SET("max_overdue_days = #{record.maxOverdueDays,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDateTime() != null) {
            sql.SET("create_date_time = #{record.createDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLeftPrincipal() != null) {
            sql.SET("left_principal = #{record.leftPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getPreendAmount() != null) {
            sql.SET("preend_amount = #{record.preendAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAssetFrom() != null) {
            sql.SET("asset_from = #{record.assetFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getPermissionGroupId() != null) {
            sql.SET("permission_group_id = #{record.permissionGroupId,jdbcType=VARCHAR}");
        }
        
        if (record.getRepayPoundage() != null) {
            sql.SET("repay_poundage = #{record.repayPoundage,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayOtherChange() != null) {
            sql.SET("repay_other_change = #{record.repayOtherChange,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayPrincipal() != null) {
            sql.SET("fact_repay_principal = #{record.factRepayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayInterest() != null) {
            sql.SET("fact_repay_interest = #{record.factRepayInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayPoundage() != null) {
            sql.SET("fact_repay_poundage = #{record.factRepayPoundage,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayOtherChange() != null) {
            sql.SET("fact_repay_other_change = #{record.factRepayOtherChange,jdbcType=DECIMAL}");
        }
        
        if (record.getImpClearDate() != null) {
            sql.SET("imp_clear_date = #{record.impClearDate,jdbcType=INTEGER}");
        }
        
        if (record.getAssetRepayType() != null) {
            sql.SET("asset_repay_type = #{record.assetRepayType,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifiedAmount() != null) {
            sql.SET("verified_amount = #{record.verifiedAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFirstFactRepayDate() != null) {
            sql.SET("first_fact_repay_date = #{record.firstFactRepayDate,jdbcType=INTEGER}");
        }
        
        if (record.getVerifyStatus() != null) {
            sql.SET("verify_status = #{record.verifyStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifiedAmountAfterBuyBack() != null) {
            sql.SET("verified_amount_after_buy_back = #{record.verifiedAmountAfterBuyBack,jdbcType=DECIMAL}");
        }
        
        if (record.getHasRedundancyAmountBackFlag() != null) {
            sql.SET("has_redundancy_amount_back_flag = #{record.hasRedundancyAmountBackFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getFundParty() != null) {
            sql.SET("fund_party = #{record.fundParty,jdbcType=VARCHAR}");
        }
        
        if (record.getIsInFinancing() != null) {
            sql.SET("is_in_financing = #{record.isInFinancing,jdbcType=VARCHAR}");
        }
        
        if (record.getMarginAmount() != null) {
            sql.SET("margin_amount = #{record.marginAmount,jdbcType=DECIMAL}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("repay_plan_test");
        
        sql.SET("name = #{record.name,jdbcType=BIGINT}");
        sql.SET("asset_id = #{record.assetId,jdbcType=VARCHAR}");
        sql.SET("term_no = #{record.termNo,jdbcType=INTEGER}");
        sql.SET("repay_date = #{record.repayDate,jdbcType=INTEGER}");
        sql.SET("name_instalments_amount = #{record.nameInstalmentsAmount,jdbcType=DECIMAL}");
        sql.SET("repay_amount = #{record.repayAmount,jdbcType=DECIMAL}");
        sql.SET("repay_principal = #{record.repayPrincipal,jdbcType=DECIMAL}");
        sql.SET("repay_interest = #{record.repayInterest,jdbcType=DECIMAL}");
        sql.SET("repay_status = #{record.repayStatus,jdbcType=VARCHAR}");
        sql.SET("fact_repay_amount = #{record.factRepayAmount,jdbcType=DECIMAL}");
        sql.SET("finish_fact_repay_date = #{record.finishFactRepayDate,jdbcType=INTEGER}");
        sql.SET("penalty_interst = #{record.penaltyInterst,jdbcType=DECIMAL}");
        sql.SET("benefit_type = #{record.benefitType,jdbcType=VARCHAR}");
        sql.SET("benefit = #{record.benefit,jdbcType=DECIMAL}");
        sql.SET("fact_benefit = #{record.factBenefit,jdbcType=DECIMAL}");
        sql.SET("max_overdue_days = #{record.maxOverdueDays,jdbcType=INTEGER}");
        sql.SET("create_date_time = #{record.createDateTime,jdbcType=TIMESTAMP}");
        sql.SET("left_principal = #{record.leftPrincipal,jdbcType=DECIMAL}");
        sql.SET("preend_amount = #{record.preendAmount,jdbcType=DECIMAL}");
        sql.SET("asset_from = #{record.assetFrom,jdbcType=VARCHAR}");
        sql.SET("permission_group_id = #{record.permissionGroupId,jdbcType=VARCHAR}");
        sql.SET("repay_poundage = #{record.repayPoundage,jdbcType=DECIMAL}");
        sql.SET("repay_other_change = #{record.repayOtherChange,jdbcType=DECIMAL}");
        sql.SET("fact_repay_principal = #{record.factRepayPrincipal,jdbcType=DECIMAL}");
        sql.SET("fact_repay_interest = #{record.factRepayInterest,jdbcType=DECIMAL}");
        sql.SET("fact_repay_poundage = #{record.factRepayPoundage,jdbcType=DECIMAL}");
        sql.SET("fact_repay_other_change = #{record.factRepayOtherChange,jdbcType=DECIMAL}");
        sql.SET("imp_clear_date = #{record.impClearDate,jdbcType=INTEGER}");
        sql.SET("asset_repay_type = #{record.assetRepayType,jdbcType=VARCHAR}");
        sql.SET("verified_amount = #{record.verifiedAmount,jdbcType=DECIMAL}");
        sql.SET("first_fact_repay_date = #{record.firstFactRepayDate,jdbcType=INTEGER}");
        sql.SET("verify_status = #{record.verifyStatus,jdbcType=VARCHAR}");
        sql.SET("verified_amount_after_buy_back = #{record.verifiedAmountAfterBuyBack,jdbcType=DECIMAL}");
        sql.SET("has_redundancy_amount_back_flag = #{record.hasRedundancyAmountBackFlag,jdbcType=VARCHAR}");
        sql.SET("fund_party = #{record.fundParty,jdbcType=VARCHAR}");
        sql.SET("is_in_financing = #{record.isInFinancing,jdbcType=VARCHAR}");
        sql.SET("margin_amount = #{record.marginAmount,jdbcType=DECIMAL}");
        
        RepayPlanTestDOExample example = (RepayPlanTestDOExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(RepayPlanTestDO record) {
        SQL sql = new SQL();
        sql.UPDATE("repay_plan_test");
        
        if (record.getAssetId() != null) {
            sql.SET("asset_id = #{assetId,jdbcType=VARCHAR}");
        }
        
        if (record.getTermNo() != null) {
            sql.SET("term_no = #{termNo,jdbcType=INTEGER}");
        }
        
        if (record.getRepayDate() != null) {
            sql.SET("repay_date = #{repayDate,jdbcType=INTEGER}");
        }
        
        if (record.getNameInstalmentsAmount() != null) {
            sql.SET("name_instalments_amount = #{nameInstalmentsAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayAmount() != null) {
            sql.SET("repay_amount = #{repayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayPrincipal() != null) {
            sql.SET("repay_principal = #{repayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayInterest() != null) {
            sql.SET("repay_interest = #{repayInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayStatus() != null) {
            sql.SET("repay_status = #{repayStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getFactRepayAmount() != null) {
            sql.SET("fact_repay_amount = #{factRepayAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFinishFactRepayDate() != null) {
            sql.SET("finish_fact_repay_date = #{finishFactRepayDate,jdbcType=INTEGER}");
        }
        
        if (record.getPenaltyInterst() != null) {
            sql.SET("penalty_interst = #{penaltyInterst,jdbcType=DECIMAL}");
        }
        
        if (record.getBenefitType() != null) {
            sql.SET("benefit_type = #{benefitType,jdbcType=VARCHAR}");
        }
        
        if (record.getBenefit() != null) {
            sql.SET("benefit = #{benefit,jdbcType=DECIMAL}");
        }
        
        if (record.getFactBenefit() != null) {
            sql.SET("fact_benefit = #{factBenefit,jdbcType=DECIMAL}");
        }
        
        if (record.getMaxOverdueDays() != null) {
            sql.SET("max_overdue_days = #{maxOverdueDays,jdbcType=INTEGER}");
        }
        
        if (record.getCreateDateTime() != null) {
            sql.SET("create_date_time = #{createDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLeftPrincipal() != null) {
            sql.SET("left_principal = #{leftPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getPreendAmount() != null) {
            sql.SET("preend_amount = #{preendAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAssetFrom() != null) {
            sql.SET("asset_from = #{assetFrom,jdbcType=VARCHAR}");
        }
        
        if (record.getPermissionGroupId() != null) {
            sql.SET("permission_group_id = #{permissionGroupId,jdbcType=VARCHAR}");
        }
        
        if (record.getRepayPoundage() != null) {
            sql.SET("repay_poundage = #{repayPoundage,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayOtherChange() != null) {
            sql.SET("repay_other_change = #{repayOtherChange,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayPrincipal() != null) {
            sql.SET("fact_repay_principal = #{factRepayPrincipal,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayInterest() != null) {
            sql.SET("fact_repay_interest = #{factRepayInterest,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayPoundage() != null) {
            sql.SET("fact_repay_poundage = #{factRepayPoundage,jdbcType=DECIMAL}");
        }
        
        if (record.getFactRepayOtherChange() != null) {
            sql.SET("fact_repay_other_change = #{factRepayOtherChange,jdbcType=DECIMAL}");
        }
        
        if (record.getImpClearDate() != null) {
            sql.SET("imp_clear_date = #{impClearDate,jdbcType=INTEGER}");
        }
        
        if (record.getAssetRepayType() != null) {
            sql.SET("asset_repay_type = #{assetRepayType,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifiedAmount() != null) {
            sql.SET("verified_amount = #{verifiedAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getFirstFactRepayDate() != null) {
            sql.SET("first_fact_repay_date = #{firstFactRepayDate,jdbcType=INTEGER}");
        }
        
        if (record.getVerifyStatus() != null) {
            sql.SET("verify_status = #{verifyStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getVerifiedAmountAfterBuyBack() != null) {
            sql.SET("verified_amount_after_buy_back = #{verifiedAmountAfterBuyBack,jdbcType=DECIMAL}");
        }
        
        if (record.getHasRedundancyAmountBackFlag() != null) {
            sql.SET("has_redundancy_amount_back_flag = #{hasRedundancyAmountBackFlag,jdbcType=VARCHAR}");
        }
        
        if (record.getFundParty() != null) {
            sql.SET("fund_party = #{fundParty,jdbcType=VARCHAR}");
        }
        
        if (record.getIsInFinancing() != null) {
            sql.SET("is_in_financing = #{isInFinancing,jdbcType=VARCHAR}");
        }
        
        if (record.getMarginAmount() != null) {
            sql.SET("margin_amount = #{marginAmount,jdbcType=DECIMAL}");
        }
        
        sql.WHERE("name = #{name,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, RepayPlanTestDOExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}