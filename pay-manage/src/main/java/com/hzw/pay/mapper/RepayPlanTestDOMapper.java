/*
*
* RepayPlanTestDOMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-09-23
*/
package com.hzw.pay.mapper;

import com.hzw.pay.entity.RepayPlanTestDO;
import com.hzw.pay.entity.RepayPlanTestDOExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface RepayPlanTestDOMapper {
    /**
     *
     * @mbg.generated
     */
    @SelectProvider(type=RepayPlanTestDOSqlProvider.class, method="countByExample")
    long countByExample(RepayPlanTestDOExample example);

    /**
     *
     * @mbg.generated
     */
    @DeleteProvider(type=RepayPlanTestDOSqlProvider.class, method="deleteByExample")
    int deleteByExample(RepayPlanTestDOExample example);

    /**
     *
     * @mbg.generated
     */
    @Delete({
        "delete from repay_plan_test",
        "where name = #{name,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    @Insert({
        "insert into repay_plan_test (name, asset_id, ",
        "term_no, repay_date, ",
        "name_instalments_amount, repay_amount, ",
        "repay_principal, repay_interest, ",
        "repay_status, fact_repay_amount, ",
        "finish_fact_repay_date, penalty_interst, ",
        "benefit_type, benefit, ",
        "fact_benefit, max_overdue_days, ",
        "create_date_time, left_principal, ",
        "preend_amount, asset_from, ",
        "permission_group_id, repay_poundage, ",
        "repay_other_change, fact_repay_principal, ",
        "fact_repay_interest, fact_repay_poundage, ",
        "fact_repay_other_change, imp_clear_date, ",
        "asset_repay_type, verified_amount, ",
        "first_fact_repay_date, verify_status, ",
        "verified_amount_after_buy_back, has_redundancy_amount_back_flag, ",
        "fund_party, is_in_financing, ",
        "margin_amount)",
        "values (#{name,jdbcType=BIGINT}, #{assetId,jdbcType=VARCHAR}, ",
        "#{termNo,jdbcType=INTEGER}, #{repayDate,jdbcType=INTEGER}, ",
        "#{nameInstalmentsAmount,jdbcType=DECIMAL}, #{repayAmount,jdbcType=DECIMAL}, ",
        "#{repayPrincipal,jdbcType=DECIMAL}, #{repayInterest,jdbcType=DECIMAL}, ",
        "#{repayStatus,jdbcType=VARCHAR}, #{factRepayAmount,jdbcType=DECIMAL}, ",
        "#{finishFactRepayDate,jdbcType=INTEGER}, #{penaltyInterst,jdbcType=DECIMAL}, ",
        "#{benefitType,jdbcType=VARCHAR}, #{benefit,jdbcType=DECIMAL}, ",
        "#{factBenefit,jdbcType=DECIMAL}, #{maxOverdueDays,jdbcType=INTEGER}, ",
        "#{createDateTime,jdbcType=TIMESTAMP}, #{leftPrincipal,jdbcType=DECIMAL}, ",
        "#{preendAmount,jdbcType=DECIMAL}, #{assetFrom,jdbcType=VARCHAR}, ",
        "#{permissionGroupId,jdbcType=VARCHAR}, #{repayPoundage,jdbcType=DECIMAL}, ",
        "#{repayOtherChange,jdbcType=DECIMAL}, #{factRepayPrincipal,jdbcType=DECIMAL}, ",
        "#{factRepayInterest,jdbcType=DECIMAL}, #{factRepayPoundage,jdbcType=DECIMAL}, ",
        "#{factRepayOtherChange,jdbcType=DECIMAL}, #{impClearDate,jdbcType=INTEGER}, ",
        "#{assetRepayType,jdbcType=VARCHAR}, #{verifiedAmount,jdbcType=DECIMAL}, ",
        "#{firstFactRepayDate,jdbcType=INTEGER}, #{verifyStatus,jdbcType=VARCHAR}, ",
        "#{verifiedAmountAfterBuyBack,jdbcType=DECIMAL}, #{hasRedundancyAmountBackFlag,jdbcType=VARCHAR}, ",
        "#{fundParty,jdbcType=VARCHAR}, #{isInFinancing,jdbcType=VARCHAR}, ",
        "#{marginAmount,jdbcType=DECIMAL})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="name", before=true, resultType=Long.class)
    int insert(RepayPlanTestDO record);

    /**
     *
     * @mbg.generated
     */
    @InsertProvider(type=RepayPlanTestDOSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="name", before=true, resultType=Long.class)
    int insertSelective(RepayPlanTestDO record);

    /**
     *
     * @mbg.generated
     */
    @SelectProvider(type=RepayPlanTestDOSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="name", property="name", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="asset_id", property="assetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="term_no", property="termNo", jdbcType=JdbcType.INTEGER),
        @Result(column="repay_date", property="repayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="name_instalments_amount", property="nameInstalmentsAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_amount", property="repayAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_principal", property="repayPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_interest", property="repayInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_status", property="repayStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="fact_repay_amount", property="factRepayAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="finish_fact_repay_date", property="finishFactRepayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="penalty_interst", property="penaltyInterst", jdbcType=JdbcType.DECIMAL),
        @Result(column="benefit_type", property="benefitType", jdbcType=JdbcType.VARCHAR),
        @Result(column="benefit", property="benefit", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_benefit", property="factBenefit", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_overdue_days", property="maxOverdueDays", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date_time", property="createDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="left_principal", property="leftPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="preend_amount", property="preendAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="asset_from", property="assetFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="permission_group_id", property="permissionGroupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="repay_poundage", property="repayPoundage", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_other_change", property="repayOtherChange", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_principal", property="factRepayPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_interest", property="factRepayInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_poundage", property="factRepayPoundage", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_other_change", property="factRepayOtherChange", jdbcType=JdbcType.DECIMAL),
        @Result(column="imp_clear_date", property="impClearDate", jdbcType=JdbcType.INTEGER),
        @Result(column="asset_repay_type", property="assetRepayType", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified_amount", property="verifiedAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_fact_repay_date", property="firstFactRepayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="verify_status", property="verifyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified_amount_after_buy_back", property="verifiedAmountAfterBuyBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="has_redundancy_amount_back_flag", property="hasRedundancyAmountBackFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="fund_party", property="fundParty", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_in_financing", property="isInFinancing", jdbcType=JdbcType.VARCHAR),
        @Result(column="margin_amount", property="marginAmount", jdbcType=JdbcType.DECIMAL)
    })
    List<RepayPlanTestDO> selectByExample(RepayPlanTestDOExample example);

    /**
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "name, asset_id, term_no, repay_date, name_instalments_amount, repay_amount, repay_principal, ",
        "repay_interest, repay_status, fact_repay_amount, finish_fact_repay_date, penalty_interst, ",
        "benefit_type, benefit, fact_benefit, max_overdue_days, create_date_time, left_principal, ",
        "preend_amount, asset_from, permission_group_id, repay_poundage, repay_other_change, ",
        "fact_repay_principal, fact_repay_interest, fact_repay_poundage, fact_repay_other_change, ",
        "imp_clear_date, asset_repay_type, verified_amount, first_fact_repay_date, verify_status, ",
        "verified_amount_after_buy_back, has_redundancy_amount_back_flag, fund_party, ",
        "is_in_financing, margin_amount",
        "from repay_plan_test",
        "where name = #{name,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="name", property="name", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="asset_id", property="assetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="term_no", property="termNo", jdbcType=JdbcType.INTEGER),
        @Result(column="repay_date", property="repayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="name_instalments_amount", property="nameInstalmentsAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_amount", property="repayAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_principal", property="repayPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_interest", property="repayInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_status", property="repayStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="fact_repay_amount", property="factRepayAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="finish_fact_repay_date", property="finishFactRepayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="penalty_interst", property="penaltyInterst", jdbcType=JdbcType.DECIMAL),
        @Result(column="benefit_type", property="benefitType", jdbcType=JdbcType.VARCHAR),
        @Result(column="benefit", property="benefit", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_benefit", property="factBenefit", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_overdue_days", property="maxOverdueDays", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date_time", property="createDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="left_principal", property="leftPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="preend_amount", property="preendAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="asset_from", property="assetFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="permission_group_id", property="permissionGroupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="repay_poundage", property="repayPoundage", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_other_change", property="repayOtherChange", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_principal", property="factRepayPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_interest", property="factRepayInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_poundage", property="factRepayPoundage", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_other_change", property="factRepayOtherChange", jdbcType=JdbcType.DECIMAL),
        @Result(column="imp_clear_date", property="impClearDate", jdbcType=JdbcType.INTEGER),
        @Result(column="asset_repay_type", property="assetRepayType", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified_amount", property="verifiedAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_fact_repay_date", property="firstFactRepayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="verify_status", property="verifyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified_amount_after_buy_back", property="verifiedAmountAfterBuyBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="has_redundancy_amount_back_flag", property="hasRedundancyAmountBackFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="fund_party", property="fundParty", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_in_financing", property="isInFinancing", jdbcType=JdbcType.VARCHAR),
        @Result(column="margin_amount", property="marginAmount", jdbcType=JdbcType.DECIMAL)
    })
    RepayPlanTestDO selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated
     */
    @UpdateProvider(type=RepayPlanTestDOSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RepayPlanTestDO record, @Param("example") RepayPlanTestDOExample example);

    /**
     *
     * @mbg.generated
     */
    @UpdateProvider(type=RepayPlanTestDOSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RepayPlanTestDO record, @Param("example") RepayPlanTestDOExample example);

    /**
     *
     * @mbg.generated
     */
    @UpdateProvider(type=RepayPlanTestDOSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(RepayPlanTestDO record);

    /**
     *
     * @mbg.generated
     */
    @Update({
        "update repay_plan_test",
        "set asset_id = #{assetId,jdbcType=VARCHAR},",
          "term_no = #{termNo,jdbcType=INTEGER},",
          "repay_date = #{repayDate,jdbcType=INTEGER},",
          "name_instalments_amount = #{nameInstalmentsAmount,jdbcType=DECIMAL},",
          "repay_amount = #{repayAmount,jdbcType=DECIMAL},",
          "repay_principal = #{repayPrincipal,jdbcType=DECIMAL},",
          "repay_interest = #{repayInterest,jdbcType=DECIMAL},",
          "repay_status = #{repayStatus,jdbcType=VARCHAR},",
          "fact_repay_amount = #{factRepayAmount,jdbcType=DECIMAL},",
          "finish_fact_repay_date = #{finishFactRepayDate,jdbcType=INTEGER},",
          "penalty_interst = #{penaltyInterst,jdbcType=DECIMAL},",
          "benefit_type = #{benefitType,jdbcType=VARCHAR},",
          "benefit = #{benefit,jdbcType=DECIMAL},",
          "fact_benefit = #{factBenefit,jdbcType=DECIMAL},",
          "max_overdue_days = #{maxOverdueDays,jdbcType=INTEGER},",
          "create_date_time = #{createDateTime,jdbcType=TIMESTAMP},",
          "left_principal = #{leftPrincipal,jdbcType=DECIMAL},",
          "preend_amount = #{preendAmount,jdbcType=DECIMAL},",
          "asset_from = #{assetFrom,jdbcType=VARCHAR},",
          "permission_group_id = #{permissionGroupId,jdbcType=VARCHAR},",
          "repay_poundage = #{repayPoundage,jdbcType=DECIMAL},",
          "repay_other_change = #{repayOtherChange,jdbcType=DECIMAL},",
          "fact_repay_principal = #{factRepayPrincipal,jdbcType=DECIMAL},",
          "fact_repay_interest = #{factRepayInterest,jdbcType=DECIMAL},",
          "fact_repay_poundage = #{factRepayPoundage,jdbcType=DECIMAL},",
          "fact_repay_other_change = #{factRepayOtherChange,jdbcType=DECIMAL},",
          "imp_clear_date = #{impClearDate,jdbcType=INTEGER},",
          "asset_repay_type = #{assetRepayType,jdbcType=VARCHAR},",
          "verified_amount = #{verifiedAmount,jdbcType=DECIMAL},",
          "first_fact_repay_date = #{firstFactRepayDate,jdbcType=INTEGER},",
          "verify_status = #{verifyStatus,jdbcType=VARCHAR},",
          "verified_amount_after_buy_back = #{verifiedAmountAfterBuyBack,jdbcType=DECIMAL},",
          "has_redundancy_amount_back_flag = #{hasRedundancyAmountBackFlag,jdbcType=VARCHAR},",
          "fund_party = #{fundParty,jdbcType=VARCHAR},",
          "is_in_financing = #{isInFinancing,jdbcType=VARCHAR},",
          "margin_amount = #{marginAmount,jdbcType=DECIMAL}",
        "where name = #{name,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(RepayPlanTestDO record);

    @Select({
        "select",
        "name, asset_id, term_no, repay_date, name_instalments_amount, repay_amount, repay_principal, ",
        "repay_interest, repay_status, fact_repay_amount, finish_fact_repay_date, penalty_interst, ",
        "benefit_type, benefit, fact_benefit, max_overdue_days, create_date_time, left_principal, ",
        "preend_amount, asset_from, permission_group_id, repay_poundage, repay_other_change, ",
        "fact_repay_principal, fact_repay_interest, fact_repay_poundage, fact_repay_other_change, ",
        "imp_clear_date, asset_repay_type, verified_amount, first_fact_repay_date, verify_status, ",
        "verified_amount_after_buy_back, has_redundancy_amount_back_flag, fund_party, ",
        "is_in_financing, margin_amount",
        "from repay_plan_test"
    })
    @Results(id = "repayplantestdo", value= {
        @Result(column="name", property="name", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="asset_id", property="assetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="term_no", property="termNo", jdbcType=JdbcType.INTEGER),
        @Result(column="repay_date", property="repayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="name_instalments_amount", property="nameInstalmentsAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_amount", property="repayAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_principal", property="repayPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_interest", property="repayInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_status", property="repayStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="fact_repay_amount", property="factRepayAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="finish_fact_repay_date", property="finishFactRepayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="penalty_interst", property="penaltyInterst", jdbcType=JdbcType.DECIMAL),
        @Result(column="benefit_type", property="benefitType", jdbcType=JdbcType.VARCHAR),
        @Result(column="benefit", property="benefit", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_benefit", property="factBenefit", jdbcType=JdbcType.DECIMAL),
        @Result(column="max_overdue_days", property="maxOverdueDays", jdbcType=JdbcType.INTEGER),
        @Result(column="create_date_time", property="createDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="left_principal", property="leftPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="preend_amount", property="preendAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="asset_from", property="assetFrom", jdbcType=JdbcType.VARCHAR),
        @Result(column="permission_group_id", property="permissionGroupId", jdbcType=JdbcType.VARCHAR),
        @Result(column="repay_poundage", property="repayPoundage", jdbcType=JdbcType.DECIMAL),
        @Result(column="repay_other_change", property="repayOtherChange", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_principal", property="factRepayPrincipal", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_interest", property="factRepayInterest", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_poundage", property="factRepayPoundage", jdbcType=JdbcType.DECIMAL),
        @Result(column="fact_repay_other_change", property="factRepayOtherChange", jdbcType=JdbcType.DECIMAL),
        @Result(column="imp_clear_date", property="impClearDate", jdbcType=JdbcType.INTEGER),
        @Result(column="asset_repay_type", property="assetRepayType", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified_amount", property="verifiedAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="first_fact_repay_date", property="firstFactRepayDate", jdbcType=JdbcType.INTEGER),
        @Result(column="verify_status", property="verifyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="verified_amount_after_buy_back", property="verifiedAmountAfterBuyBack", jdbcType=JdbcType.DECIMAL),
        @Result(column="has_redundancy_amount_back_flag", property="hasRedundancyAmountBackFlag", jdbcType=JdbcType.VARCHAR),
        @Result(column="fund_party", property="fundParty", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_in_financing", property="isInFinancing", jdbcType=JdbcType.VARCHAR),
        @Result(column="margin_amount", property="marginAmount", jdbcType=JdbcType.DECIMAL)
    })
    List<RepayPlanTestDO> selectAll();
}