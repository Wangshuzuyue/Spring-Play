/*
*
* RepayPlanTestDOExample.java
* Copyright(C) 2017-2020 fendo公司
* @date 2019-09-23
*/
package com.hzw.pay.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepayPlanTestDOExample {
    /**
     * repay_plan_test
     */
    protected String orderByClause;

    /**
     * repay_plan_test
     */
    protected boolean distinct;

    /**
     * repay_plan_test
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public RepayPlanTestDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * repay_plan_test null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNull() {
            addCriterion("asset_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetIdIsNotNull() {
            addCriterion("asset_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetIdEqualTo(String value) {
            addCriterion("asset_id =", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotEqualTo(String value) {
            addCriterion("asset_id <>", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThan(String value) {
            addCriterion("asset_id >", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdGreaterThanOrEqualTo(String value) {
            addCriterion("asset_id >=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThan(String value) {
            addCriterion("asset_id <", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLessThanOrEqualTo(String value) {
            addCriterion("asset_id <=", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdLike(String value) {
            addCriterion("asset_id like", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotLike(String value) {
            addCriterion("asset_id not like", value, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdIn(List<String> values) {
            addCriterion("asset_id in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotIn(List<String> values) {
            addCriterion("asset_id not in", values, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdBetween(String value1, String value2) {
            addCriterion("asset_id between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andAssetIdNotBetween(String value1, String value2) {
            addCriterion("asset_id not between", value1, value2, "assetId");
            return (Criteria) this;
        }

        public Criteria andTermNoIsNull() {
            addCriterion("term_no is null");
            return (Criteria) this;
        }

        public Criteria andTermNoIsNotNull() {
            addCriterion("term_no is not null");
            return (Criteria) this;
        }

        public Criteria andTermNoEqualTo(Integer value) {
            addCriterion("term_no =", value, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoNotEqualTo(Integer value) {
            addCriterion("term_no <>", value, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoGreaterThan(Integer value) {
            addCriterion("term_no >", value, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_no >=", value, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoLessThan(Integer value) {
            addCriterion("term_no <", value, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoLessThanOrEqualTo(Integer value) {
            addCriterion("term_no <=", value, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoIn(List<Integer> values) {
            addCriterion("term_no in", values, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoNotIn(List<Integer> values) {
            addCriterion("term_no not in", values, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoBetween(Integer value1, Integer value2) {
            addCriterion("term_no between", value1, value2, "termNo");
            return (Criteria) this;
        }

        public Criteria andTermNoNotBetween(Integer value1, Integer value2) {
            addCriterion("term_no not between", value1, value2, "termNo");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNull() {
            addCriterion("repay_date is null");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNotNull() {
            addCriterion("repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDateEqualTo(Integer value) {
            addCriterion("repay_date =", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotEqualTo(Integer value) {
            addCriterion("repay_date <>", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThan(Integer value) {
            addCriterion("repay_date >", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_date >=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThan(Integer value) {
            addCriterion("repay_date <", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThanOrEqualTo(Integer value) {
            addCriterion("repay_date <=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateIn(List<Integer> values) {
            addCriterion("repay_date in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotIn(List<Integer> values) {
            addCriterion("repay_date not in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateBetween(Integer value1, Integer value2) {
            addCriterion("repay_date between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_date not between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountIsNull() {
            addCriterion("name_instalments_amount is null");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountIsNotNull() {
            addCriterion("name_instalments_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountEqualTo(BigDecimal value) {
            addCriterion("name_instalments_amount =", value, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountNotEqualTo(BigDecimal value) {
            addCriterion("name_instalments_amount <>", value, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountGreaterThan(BigDecimal value) {
            addCriterion("name_instalments_amount >", value, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("name_instalments_amount >=", value, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountLessThan(BigDecimal value) {
            addCriterion("name_instalments_amount <", value, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("name_instalments_amount <=", value, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountIn(List<BigDecimal> values) {
            addCriterion("name_instalments_amount in", values, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountNotIn(List<BigDecimal> values) {
            addCriterion("name_instalments_amount not in", values, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("name_instalments_amount between", value1, value2, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andNameInstalmentsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("name_instalments_amount not between", value1, value2, "nameInstalmentsAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountIsNull() {
            addCriterion("repay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRepayAmountIsNotNull() {
            addCriterion("repay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAmountEqualTo(BigDecimal value) {
            addCriterion("repay_amount =", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountNotEqualTo(BigDecimal value) {
            addCriterion("repay_amount <>", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountGreaterThan(BigDecimal value) {
            addCriterion("repay_amount >", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_amount >=", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountLessThan(BigDecimal value) {
            addCriterion("repay_amount <", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_amount <=", value, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountIn(List<BigDecimal> values) {
            addCriterion("repay_amount in", values, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountNotIn(List<BigDecimal> values) {
            addCriterion("repay_amount not in", values, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_amount between", value1, value2, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_amount not between", value1, value2, "repayAmount");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalIsNull() {
            addCriterion("repay_principal is null");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalIsNotNull() {
            addCriterion("repay_principal is not null");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalEqualTo(BigDecimal value) {
            addCriterion("repay_principal =", value, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("repay_principal <>", value, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalGreaterThan(BigDecimal value) {
            addCriterion("repay_principal >", value, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_principal >=", value, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalLessThan(BigDecimal value) {
            addCriterion("repay_principal <", value, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_principal <=", value, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalIn(List<BigDecimal> values) {
            addCriterion("repay_principal in", values, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("repay_principal not in", values, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_principal between", value1, value2, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_principal not between", value1, value2, "repayPrincipal");
            return (Criteria) this;
        }

        public Criteria andRepayInterestIsNull() {
            addCriterion("repay_interest is null");
            return (Criteria) this;
        }

        public Criteria andRepayInterestIsNotNull() {
            addCriterion("repay_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRepayInterestEqualTo(BigDecimal value) {
            addCriterion("repay_interest =", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestNotEqualTo(BigDecimal value) {
            addCriterion("repay_interest <>", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestGreaterThan(BigDecimal value) {
            addCriterion("repay_interest >", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_interest >=", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestLessThan(BigDecimal value) {
            addCriterion("repay_interest <", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_interest <=", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestIn(List<BigDecimal> values) {
            addCriterion("repay_interest in", values, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestNotIn(List<BigDecimal> values) {
            addCriterion("repay_interest not in", values, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_interest between", value1, value2, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_interest not between", value1, value2, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIsNull() {
            addCriterion("repay_status is null");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIsNotNull() {
            addCriterion("repay_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepayStatusEqualTo(String value) {
            addCriterion("repay_status =", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotEqualTo(String value) {
            addCriterion("repay_status <>", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusGreaterThan(String value) {
            addCriterion("repay_status >", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("repay_status >=", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLessThan(String value) {
            addCriterion("repay_status <", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLessThanOrEqualTo(String value) {
            addCriterion("repay_status <=", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusLike(String value) {
            addCriterion("repay_status like", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotLike(String value) {
            addCriterion("repay_status not like", value, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusIn(List<String> values) {
            addCriterion("repay_status in", values, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotIn(List<String> values) {
            addCriterion("repay_status not in", values, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusBetween(String value1, String value2) {
            addCriterion("repay_status between", value1, value2, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andRepayStatusNotBetween(String value1, String value2) {
            addCriterion("repay_status not between", value1, value2, "repayStatus");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountIsNull() {
            addCriterion("fact_repay_amount is null");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountIsNotNull() {
            addCriterion("fact_repay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountEqualTo(BigDecimal value) {
            addCriterion("fact_repay_amount =", value, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountNotEqualTo(BigDecimal value) {
            addCriterion("fact_repay_amount <>", value, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountGreaterThan(BigDecimal value) {
            addCriterion("fact_repay_amount >", value, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_amount >=", value, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountLessThan(BigDecimal value) {
            addCriterion("fact_repay_amount <", value, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_amount <=", value, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountIn(List<BigDecimal> values) {
            addCriterion("fact_repay_amount in", values, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountNotIn(List<BigDecimal> values) {
            addCriterion("fact_repay_amount not in", values, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_amount between", value1, value2, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFactRepayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_amount not between", value1, value2, "factRepayAmount");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateIsNull() {
            addCriterion("finish_fact_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateIsNotNull() {
            addCriterion("finish_fact_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateEqualTo(Integer value) {
            addCriterion("finish_fact_repay_date =", value, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateNotEqualTo(Integer value) {
            addCriterion("finish_fact_repay_date <>", value, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateGreaterThan(Integer value) {
            addCriterion("finish_fact_repay_date >", value, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_fact_repay_date >=", value, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateLessThan(Integer value) {
            addCriterion("finish_fact_repay_date <", value, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateLessThanOrEqualTo(Integer value) {
            addCriterion("finish_fact_repay_date <=", value, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateIn(List<Integer> values) {
            addCriterion("finish_fact_repay_date in", values, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateNotIn(List<Integer> values) {
            addCriterion("finish_fact_repay_date not in", values, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateBetween(Integer value1, Integer value2) {
            addCriterion("finish_fact_repay_date between", value1, value2, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinishFactRepayDateNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_fact_repay_date not between", value1, value2, "finishFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstIsNull() {
            addCriterion("penalty_interst is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstIsNotNull() {
            addCriterion("penalty_interst is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstEqualTo(BigDecimal value) {
            addCriterion("penalty_interst =", value, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstNotEqualTo(BigDecimal value) {
            addCriterion("penalty_interst <>", value, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstGreaterThan(BigDecimal value) {
            addCriterion("penalty_interst >", value, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("penalty_interst >=", value, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstLessThan(BigDecimal value) {
            addCriterion("penalty_interst <", value, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("penalty_interst <=", value, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstIn(List<BigDecimal> values) {
            addCriterion("penalty_interst in", values, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstNotIn(List<BigDecimal> values) {
            addCriterion("penalty_interst not in", values, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("penalty_interst between", value1, value2, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("penalty_interst not between", value1, value2, "penaltyInterst");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeIsNull() {
            addCriterion("benefit_type is null");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeIsNotNull() {
            addCriterion("benefit_type is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeEqualTo(String value) {
            addCriterion("benefit_type =", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeNotEqualTo(String value) {
            addCriterion("benefit_type <>", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeGreaterThan(String value) {
            addCriterion("benefit_type >", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("benefit_type >=", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeLessThan(String value) {
            addCriterion("benefit_type <", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeLessThanOrEqualTo(String value) {
            addCriterion("benefit_type <=", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeLike(String value) {
            addCriterion("benefit_type like", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeNotLike(String value) {
            addCriterion("benefit_type not like", value, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeIn(List<String> values) {
            addCriterion("benefit_type in", values, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeNotIn(List<String> values) {
            addCriterion("benefit_type not in", values, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeBetween(String value1, String value2) {
            addCriterion("benefit_type between", value1, value2, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitTypeNotBetween(String value1, String value2) {
            addCriterion("benefit_type not between", value1, value2, "benefitType");
            return (Criteria) this;
        }

        public Criteria andBenefitIsNull() {
            addCriterion("benefit is null");
            return (Criteria) this;
        }

        public Criteria andBenefitIsNotNull() {
            addCriterion("benefit is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitEqualTo(BigDecimal value) {
            addCriterion("benefit =", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitNotEqualTo(BigDecimal value) {
            addCriterion("benefit <>", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitGreaterThan(BigDecimal value) {
            addCriterion("benefit >", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("benefit >=", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitLessThan(BigDecimal value) {
            addCriterion("benefit <", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("benefit <=", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitIn(List<BigDecimal> values) {
            addCriterion("benefit in", values, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitNotIn(List<BigDecimal> values) {
            addCriterion("benefit not in", values, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("benefit between", value1, value2, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("benefit not between", value1, value2, "benefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitIsNull() {
            addCriterion("fact_benefit is null");
            return (Criteria) this;
        }

        public Criteria andFactBenefitIsNotNull() {
            addCriterion("fact_benefit is not null");
            return (Criteria) this;
        }

        public Criteria andFactBenefitEqualTo(BigDecimal value) {
            addCriterion("fact_benefit =", value, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitNotEqualTo(BigDecimal value) {
            addCriterion("fact_benefit <>", value, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitGreaterThan(BigDecimal value) {
            addCriterion("fact_benefit >", value, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_benefit >=", value, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitLessThan(BigDecimal value) {
            addCriterion("fact_benefit <", value, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_benefit <=", value, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitIn(List<BigDecimal> values) {
            addCriterion("fact_benefit in", values, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitNotIn(List<BigDecimal> values) {
            addCriterion("fact_benefit not in", values, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_benefit between", value1, value2, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andFactBenefitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_benefit not between", value1, value2, "factBenefit");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysIsNull() {
            addCriterion("max_overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysIsNotNull() {
            addCriterion("max_overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysEqualTo(Integer value) {
            addCriterion("max_overdue_days =", value, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysNotEqualTo(Integer value) {
            addCriterion("max_overdue_days <>", value, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysGreaterThan(Integer value) {
            addCriterion("max_overdue_days >", value, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_overdue_days >=", value, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysLessThan(Integer value) {
            addCriterion("max_overdue_days <", value, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("max_overdue_days <=", value, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysIn(List<Integer> values) {
            addCriterion("max_overdue_days in", values, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysNotIn(List<Integer> values) {
            addCriterion("max_overdue_days not in", values, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("max_overdue_days between", value1, value2, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("max_overdue_days not between", value1, value2, "maxOverdueDays");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNull() {
            addCriterion("create_date_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNotNull() {
            addCriterion("create_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeEqualTo(Date value) {
            addCriterion("create_date_time =", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotEqualTo(Date value) {
            addCriterion("create_date_time <>", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThan(Date value) {
            addCriterion("create_date_time >", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date_time >=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThan(Date value) {
            addCriterion("create_date_time <", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_date_time <=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIn(List<Date> values) {
            addCriterion("create_date_time in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotIn(List<Date> values) {
            addCriterion("create_date_time not in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeBetween(Date value1, Date value2) {
            addCriterion("create_date_time between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_date_time not between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalIsNull() {
            addCriterion("left_principal is null");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalIsNotNull() {
            addCriterion("left_principal is not null");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalEqualTo(BigDecimal value) {
            addCriterion("left_principal =", value, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("left_principal <>", value, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalGreaterThan(BigDecimal value) {
            addCriterion("left_principal >", value, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("left_principal >=", value, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalLessThan(BigDecimal value) {
            addCriterion("left_principal <", value, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("left_principal <=", value, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalIn(List<BigDecimal> values) {
            addCriterion("left_principal in", values, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("left_principal not in", values, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left_principal between", value1, value2, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andLeftPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("left_principal not between", value1, value2, "leftPrincipal");
            return (Criteria) this;
        }

        public Criteria andPreendAmountIsNull() {
            addCriterion("preend_amount is null");
            return (Criteria) this;
        }

        public Criteria andPreendAmountIsNotNull() {
            addCriterion("preend_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPreendAmountEqualTo(BigDecimal value) {
            addCriterion("preend_amount =", value, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountNotEqualTo(BigDecimal value) {
            addCriterion("preend_amount <>", value, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountGreaterThan(BigDecimal value) {
            addCriterion("preend_amount >", value, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("preend_amount >=", value, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountLessThan(BigDecimal value) {
            addCriterion("preend_amount <", value, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("preend_amount <=", value, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountIn(List<BigDecimal> values) {
            addCriterion("preend_amount in", values, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountNotIn(List<BigDecimal> values) {
            addCriterion("preend_amount not in", values, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preend_amount between", value1, value2, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andPreendAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("preend_amount not between", value1, value2, "preendAmount");
            return (Criteria) this;
        }

        public Criteria andAssetFromIsNull() {
            addCriterion("asset_from is null");
            return (Criteria) this;
        }

        public Criteria andAssetFromIsNotNull() {
            addCriterion("asset_from is not null");
            return (Criteria) this;
        }

        public Criteria andAssetFromEqualTo(String value) {
            addCriterion("asset_from =", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromNotEqualTo(String value) {
            addCriterion("asset_from <>", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromGreaterThan(String value) {
            addCriterion("asset_from >", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromGreaterThanOrEqualTo(String value) {
            addCriterion("asset_from >=", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromLessThan(String value) {
            addCriterion("asset_from <", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromLessThanOrEqualTo(String value) {
            addCriterion("asset_from <=", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromLike(String value) {
            addCriterion("asset_from like", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromNotLike(String value) {
            addCriterion("asset_from not like", value, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromIn(List<String> values) {
            addCriterion("asset_from in", values, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromNotIn(List<String> values) {
            addCriterion("asset_from not in", values, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromBetween(String value1, String value2) {
            addCriterion("asset_from between", value1, value2, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andAssetFromNotBetween(String value1, String value2) {
            addCriterion("asset_from not between", value1, value2, "assetFrom");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdIsNull() {
            addCriterion("permission_group_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdIsNotNull() {
            addCriterion("permission_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdEqualTo(String value) {
            addCriterion("permission_group_id =", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdNotEqualTo(String value) {
            addCriterion("permission_group_id <>", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdGreaterThan(String value) {
            addCriterion("permission_group_id >", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("permission_group_id >=", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdLessThan(String value) {
            addCriterion("permission_group_id <", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdLessThanOrEqualTo(String value) {
            addCriterion("permission_group_id <=", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdLike(String value) {
            addCriterion("permission_group_id like", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdNotLike(String value) {
            addCriterion("permission_group_id not like", value, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdIn(List<String> values) {
            addCriterion("permission_group_id in", values, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdNotIn(List<String> values) {
            addCriterion("permission_group_id not in", values, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdBetween(String value1, String value2) {
            addCriterion("permission_group_id between", value1, value2, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andPermissionGroupIdNotBetween(String value1, String value2) {
            addCriterion("permission_group_id not between", value1, value2, "permissionGroupId");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageIsNull() {
            addCriterion("repay_poundage is null");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageIsNotNull() {
            addCriterion("repay_poundage is not null");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageEqualTo(BigDecimal value) {
            addCriterion("repay_poundage =", value, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageNotEqualTo(BigDecimal value) {
            addCriterion("repay_poundage <>", value, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageGreaterThan(BigDecimal value) {
            addCriterion("repay_poundage >", value, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_poundage >=", value, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageLessThan(BigDecimal value) {
            addCriterion("repay_poundage <", value, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_poundage <=", value, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageIn(List<BigDecimal> values) {
            addCriterion("repay_poundage in", values, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageNotIn(List<BigDecimal> values) {
            addCriterion("repay_poundage not in", values, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_poundage between", value1, value2, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayPoundageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_poundage not between", value1, value2, "repayPoundage");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeIsNull() {
            addCriterion("repay_other_change is null");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeIsNotNull() {
            addCriterion("repay_other_change is not null");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeEqualTo(BigDecimal value) {
            addCriterion("repay_other_change =", value, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeNotEqualTo(BigDecimal value) {
            addCriterion("repay_other_change <>", value, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeGreaterThan(BigDecimal value) {
            addCriterion("repay_other_change >", value, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_other_change >=", value, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeLessThan(BigDecimal value) {
            addCriterion("repay_other_change <", value, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_other_change <=", value, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeIn(List<BigDecimal> values) {
            addCriterion("repay_other_change in", values, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeNotIn(List<BigDecimal> values) {
            addCriterion("repay_other_change not in", values, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_other_change between", value1, value2, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andRepayOtherChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_other_change not between", value1, value2, "repayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalIsNull() {
            addCriterion("fact_repay_principal is null");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalIsNotNull() {
            addCriterion("fact_repay_principal is not null");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalEqualTo(BigDecimal value) {
            addCriterion("fact_repay_principal =", value, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("fact_repay_principal <>", value, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalGreaterThan(BigDecimal value) {
            addCriterion("fact_repay_principal >", value, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_principal >=", value, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalLessThan(BigDecimal value) {
            addCriterion("fact_repay_principal <", value, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_principal <=", value, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalIn(List<BigDecimal> values) {
            addCriterion("fact_repay_principal in", values, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("fact_repay_principal not in", values, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_principal between", value1, value2, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_principal not between", value1, value2, "factRepayPrincipal");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestIsNull() {
            addCriterion("fact_repay_interest is null");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestIsNotNull() {
            addCriterion("fact_repay_interest is not null");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestEqualTo(BigDecimal value) {
            addCriterion("fact_repay_interest =", value, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestNotEqualTo(BigDecimal value) {
            addCriterion("fact_repay_interest <>", value, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestGreaterThan(BigDecimal value) {
            addCriterion("fact_repay_interest >", value, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_interest >=", value, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestLessThan(BigDecimal value) {
            addCriterion("fact_repay_interest <", value, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_interest <=", value, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestIn(List<BigDecimal> values) {
            addCriterion("fact_repay_interest in", values, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestNotIn(List<BigDecimal> values) {
            addCriterion("fact_repay_interest not in", values, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_interest between", value1, value2, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_interest not between", value1, value2, "factRepayInterest");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageIsNull() {
            addCriterion("fact_repay_poundage is null");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageIsNotNull() {
            addCriterion("fact_repay_poundage is not null");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageEqualTo(BigDecimal value) {
            addCriterion("fact_repay_poundage =", value, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageNotEqualTo(BigDecimal value) {
            addCriterion("fact_repay_poundage <>", value, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageGreaterThan(BigDecimal value) {
            addCriterion("fact_repay_poundage >", value, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_poundage >=", value, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageLessThan(BigDecimal value) {
            addCriterion("fact_repay_poundage <", value, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_poundage <=", value, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageIn(List<BigDecimal> values) {
            addCriterion("fact_repay_poundage in", values, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageNotIn(List<BigDecimal> values) {
            addCriterion("fact_repay_poundage not in", values, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_poundage between", value1, value2, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayPoundageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_poundage not between", value1, value2, "factRepayPoundage");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeIsNull() {
            addCriterion("fact_repay_other_change is null");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeIsNotNull() {
            addCriterion("fact_repay_other_change is not null");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeEqualTo(BigDecimal value) {
            addCriterion("fact_repay_other_change =", value, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeNotEqualTo(BigDecimal value) {
            addCriterion("fact_repay_other_change <>", value, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeGreaterThan(BigDecimal value) {
            addCriterion("fact_repay_other_change >", value, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_other_change >=", value, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeLessThan(BigDecimal value) {
            addCriterion("fact_repay_other_change <", value, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fact_repay_other_change <=", value, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeIn(List<BigDecimal> values) {
            addCriterion("fact_repay_other_change in", values, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeNotIn(List<BigDecimal> values) {
            addCriterion("fact_repay_other_change not in", values, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_other_change between", value1, value2, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andFactRepayOtherChangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fact_repay_other_change not between", value1, value2, "factRepayOtherChange");
            return (Criteria) this;
        }

        public Criteria andImpClearDateIsNull() {
            addCriterion("imp_clear_date is null");
            return (Criteria) this;
        }

        public Criteria andImpClearDateIsNotNull() {
            addCriterion("imp_clear_date is not null");
            return (Criteria) this;
        }

        public Criteria andImpClearDateEqualTo(Integer value) {
            addCriterion("imp_clear_date =", value, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateNotEqualTo(Integer value) {
            addCriterion("imp_clear_date <>", value, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateGreaterThan(Integer value) {
            addCriterion("imp_clear_date >", value, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("imp_clear_date >=", value, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateLessThan(Integer value) {
            addCriterion("imp_clear_date <", value, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateLessThanOrEqualTo(Integer value) {
            addCriterion("imp_clear_date <=", value, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateIn(List<Integer> values) {
            addCriterion("imp_clear_date in", values, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateNotIn(List<Integer> values) {
            addCriterion("imp_clear_date not in", values, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateBetween(Integer value1, Integer value2) {
            addCriterion("imp_clear_date between", value1, value2, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andImpClearDateNotBetween(Integer value1, Integer value2) {
            addCriterion("imp_clear_date not between", value1, value2, "impClearDate");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeIsNull() {
            addCriterion("asset_repay_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeIsNotNull() {
            addCriterion("asset_repay_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeEqualTo(String value) {
            addCriterion("asset_repay_type =", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeNotEqualTo(String value) {
            addCriterion("asset_repay_type <>", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeGreaterThan(String value) {
            addCriterion("asset_repay_type >", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("asset_repay_type >=", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeLessThan(String value) {
            addCriterion("asset_repay_type <", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeLessThanOrEqualTo(String value) {
            addCriterion("asset_repay_type <=", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeLike(String value) {
            addCriterion("asset_repay_type like", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeNotLike(String value) {
            addCriterion("asset_repay_type not like", value, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeIn(List<String> values) {
            addCriterion("asset_repay_type in", values, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeNotIn(List<String> values) {
            addCriterion("asset_repay_type not in", values, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeBetween(String value1, String value2) {
            addCriterion("asset_repay_type between", value1, value2, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andAssetRepayTypeNotBetween(String value1, String value2) {
            addCriterion("asset_repay_type not between", value1, value2, "assetRepayType");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountIsNull() {
            addCriterion("verified_amount is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountIsNotNull() {
            addCriterion("verified_amount is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountEqualTo(BigDecimal value) {
            addCriterion("verified_amount =", value, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountNotEqualTo(BigDecimal value) {
            addCriterion("verified_amount <>", value, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountGreaterThan(BigDecimal value) {
            addCriterion("verified_amount >", value, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("verified_amount >=", value, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountLessThan(BigDecimal value) {
            addCriterion("verified_amount <", value, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("verified_amount <=", value, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountIn(List<BigDecimal> values) {
            addCriterion("verified_amount in", values, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountNotIn(List<BigDecimal> values) {
            addCriterion("verified_amount not in", values, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verified_amount between", value1, value2, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verified_amount not between", value1, value2, "verifiedAmount");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateIsNull() {
            addCriterion("first_fact_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateIsNotNull() {
            addCriterion("first_fact_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateEqualTo(Integer value) {
            addCriterion("first_fact_repay_date =", value, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateNotEqualTo(Integer value) {
            addCriterion("first_fact_repay_date <>", value, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateGreaterThan(Integer value) {
            addCriterion("first_fact_repay_date >", value, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_fact_repay_date >=", value, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateLessThan(Integer value) {
            addCriterion("first_fact_repay_date <", value, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateLessThanOrEqualTo(Integer value) {
            addCriterion("first_fact_repay_date <=", value, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateIn(List<Integer> values) {
            addCriterion("first_fact_repay_date in", values, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateNotIn(List<Integer> values) {
            addCriterion("first_fact_repay_date not in", values, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateBetween(Integer value1, Integer value2) {
            addCriterion("first_fact_repay_date between", value1, value2, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstFactRepayDateNotBetween(Integer value1, Integer value2) {
            addCriterion("first_fact_repay_date not between", value1, value2, "firstFactRepayDate");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(String value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(String value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(String value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(String value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(String value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLike(String value) {
            addCriterion("verify_status like", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotLike(String value) {
            addCriterion("verify_status not like", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<String> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<String> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(String value1, String value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(String value1, String value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackIsNull() {
            addCriterion("verified_amount_after_buy_back is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackIsNotNull() {
            addCriterion("verified_amount_after_buy_back is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackEqualTo(BigDecimal value) {
            addCriterion("verified_amount_after_buy_back =", value, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackNotEqualTo(BigDecimal value) {
            addCriterion("verified_amount_after_buy_back <>", value, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackGreaterThan(BigDecimal value) {
            addCriterion("verified_amount_after_buy_back >", value, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("verified_amount_after_buy_back >=", value, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackLessThan(BigDecimal value) {
            addCriterion("verified_amount_after_buy_back <", value, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackLessThanOrEqualTo(BigDecimal value) {
            addCriterion("verified_amount_after_buy_back <=", value, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackIn(List<BigDecimal> values) {
            addCriterion("verified_amount_after_buy_back in", values, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackNotIn(List<BigDecimal> values) {
            addCriterion("verified_amount_after_buy_back not in", values, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verified_amount_after_buy_back between", value1, value2, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andVerifiedAmountAfterBuyBackNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("verified_amount_after_buy_back not between", value1, value2, "verifiedAmountAfterBuyBack");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagIsNull() {
            addCriterion("has_redundancy_amount_back_flag is null");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagIsNotNull() {
            addCriterion("has_redundancy_amount_back_flag is not null");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagEqualTo(String value) {
            addCriterion("has_redundancy_amount_back_flag =", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagNotEqualTo(String value) {
            addCriterion("has_redundancy_amount_back_flag <>", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagGreaterThan(String value) {
            addCriterion("has_redundancy_amount_back_flag >", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagGreaterThanOrEqualTo(String value) {
            addCriterion("has_redundancy_amount_back_flag >=", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagLessThan(String value) {
            addCriterion("has_redundancy_amount_back_flag <", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagLessThanOrEqualTo(String value) {
            addCriterion("has_redundancy_amount_back_flag <=", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagLike(String value) {
            addCriterion("has_redundancy_amount_back_flag like", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagNotLike(String value) {
            addCriterion("has_redundancy_amount_back_flag not like", value, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagIn(List<String> values) {
            addCriterion("has_redundancy_amount_back_flag in", values, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagNotIn(List<String> values) {
            addCriterion("has_redundancy_amount_back_flag not in", values, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagBetween(String value1, String value2) {
            addCriterion("has_redundancy_amount_back_flag between", value1, value2, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andHasRedundancyAmountBackFlagNotBetween(String value1, String value2) {
            addCriterion("has_redundancy_amount_back_flag not between", value1, value2, "hasRedundancyAmountBackFlag");
            return (Criteria) this;
        }

        public Criteria andFundPartyIsNull() {
            addCriterion("fund_party is null");
            return (Criteria) this;
        }

        public Criteria andFundPartyIsNotNull() {
            addCriterion("fund_party is not null");
            return (Criteria) this;
        }

        public Criteria andFundPartyEqualTo(String value) {
            addCriterion("fund_party =", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyNotEqualTo(String value) {
            addCriterion("fund_party <>", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyGreaterThan(String value) {
            addCriterion("fund_party >", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyGreaterThanOrEqualTo(String value) {
            addCriterion("fund_party >=", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyLessThan(String value) {
            addCriterion("fund_party <", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyLessThanOrEqualTo(String value) {
            addCriterion("fund_party <=", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyLike(String value) {
            addCriterion("fund_party like", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyNotLike(String value) {
            addCriterion("fund_party not like", value, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyIn(List<String> values) {
            addCriterion("fund_party in", values, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyNotIn(List<String> values) {
            addCriterion("fund_party not in", values, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyBetween(String value1, String value2) {
            addCriterion("fund_party between", value1, value2, "fundParty");
            return (Criteria) this;
        }

        public Criteria andFundPartyNotBetween(String value1, String value2) {
            addCriterion("fund_party not between", value1, value2, "fundParty");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingIsNull() {
            addCriterion("is_in_financing is null");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingIsNotNull() {
            addCriterion("is_in_financing is not null");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingEqualTo(String value) {
            addCriterion("is_in_financing =", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingNotEqualTo(String value) {
            addCriterion("is_in_financing <>", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingGreaterThan(String value) {
            addCriterion("is_in_financing >", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingGreaterThanOrEqualTo(String value) {
            addCriterion("is_in_financing >=", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingLessThan(String value) {
            addCriterion("is_in_financing <", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingLessThanOrEqualTo(String value) {
            addCriterion("is_in_financing <=", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingLike(String value) {
            addCriterion("is_in_financing like", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingNotLike(String value) {
            addCriterion("is_in_financing not like", value, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingIn(List<String> values) {
            addCriterion("is_in_financing in", values, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingNotIn(List<String> values) {
            addCriterion("is_in_financing not in", values, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingBetween(String value1, String value2) {
            addCriterion("is_in_financing between", value1, value2, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andIsInFinancingNotBetween(String value1, String value2) {
            addCriterion("is_in_financing not between", value1, value2, "isInFinancing");
            return (Criteria) this;
        }

        public Criteria andMarginAmountIsNull() {
            addCriterion("margin_amount is null");
            return (Criteria) this;
        }

        public Criteria andMarginAmountIsNotNull() {
            addCriterion("margin_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMarginAmountEqualTo(BigDecimal value) {
            addCriterion("margin_amount =", value, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountNotEqualTo(BigDecimal value) {
            addCriterion("margin_amount <>", value, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountGreaterThan(BigDecimal value) {
            addCriterion("margin_amount >", value, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("margin_amount >=", value, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountLessThan(BigDecimal value) {
            addCriterion("margin_amount <", value, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("margin_amount <=", value, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountIn(List<BigDecimal> values) {
            addCriterion("margin_amount in", values, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountNotIn(List<BigDecimal> values) {
            addCriterion("margin_amount not in", values, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin_amount between", value1, value2, "marginAmount");
            return (Criteria) this;
        }

        public Criteria andMarginAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("margin_amount not between", value1, value2, "marginAmount");
            return (Criteria) this;
        }
    }

    /**
     *  * repay_plan_test
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * repay_plan_test null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}