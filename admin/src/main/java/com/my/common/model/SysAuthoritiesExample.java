package com.my.common.model;

import java.util.ArrayList;
import java.util.List;

public class SysAuthoritiesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public SysAuthoritiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
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

        public Criteria andAuthorityIdIsNull() {
            addCriterion("AUTHORITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("AUTHORITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(String value) {
            addCriterion("AUTHORITY_ID =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(String value) {
            addCriterion("AUTHORITY_ID <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(String value) {
            addCriterion("AUTHORITY_ID >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(String value) {
            addCriterion("AUTHORITY_ID <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLike(String value) {
            addCriterion("AUTHORITY_ID like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotLike(String value) {
            addCriterion("AUTHORITY_ID not like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<String> values) {
            addCriterion("AUTHORITY_ID in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<String> values) {
            addCriterion("AUTHORITY_ID not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkIsNull() {
            addCriterion("AUTHORITY_MARK is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkIsNotNull() {
            addCriterion("AUTHORITY_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkEqualTo(String value) {
            addCriterion("AUTHORITY_MARK =", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotEqualTo(String value) {
            addCriterion("AUTHORITY_MARK <>", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkGreaterThan(String value) {
            addCriterion("AUTHORITY_MARK >", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_MARK >=", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLessThan(String value) {
            addCriterion("AUTHORITY_MARK <", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_MARK <=", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkLike(String value) {
            addCriterion("AUTHORITY_MARK like", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotLike(String value) {
            addCriterion("AUTHORITY_MARK not like", value, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkIn(List<String> values) {
            addCriterion("AUTHORITY_MARK in", values, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotIn(List<String> values) {
            addCriterion("AUTHORITY_MARK not in", values, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkBetween(String value1, String value2) {
            addCriterion("AUTHORITY_MARK between", value1, value2, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityMarkNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_MARK not between", value1, value2, "authorityMark");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("AUTHORITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("AUTHORITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("AUTHORITY_NAME =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("AUTHORITY_NAME <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("AUTHORITY_NAME >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NAME >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("AUTHORITY_NAME <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NAME <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("AUTHORITY_NAME like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("AUTHORITY_NAME not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("AUTHORITY_NAME in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("AUTHORITY_NAME not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NAME between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NAME not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNull() {
            addCriterion("AUTHORITY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNotNull() {
            addCriterion("AUTHORITY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescEqualTo(String value) {
            addCriterion("AUTHORITY_DESC =", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotEqualTo(String value) {
            addCriterion("AUTHORITY_DESC <>", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThan(String value) {
            addCriterion("AUTHORITY_DESC >", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_DESC >=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThan(String value) {
            addCriterion("AUTHORITY_DESC <", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_DESC <=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLike(String value) {
            addCriterion("AUTHORITY_DESC like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotLike(String value) {
            addCriterion("AUTHORITY_DESC not like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIn(List<String> values) {
            addCriterion("AUTHORITY_DESC in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotIn(List<String> values) {
            addCriterion("AUTHORITY_DESC not in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescBetween(String value1, String value2) {
            addCriterion("AUTHORITY_DESC between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_DESC not between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("MESSAGE =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("MESSAGE <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("MESSAGE >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("MESSAGE <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("MESSAGE like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("MESSAGE not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("MESSAGE in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("MESSAGE not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("MESSAGE between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("MESSAGE not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNull() {
            addCriterion("IS_SYS is null");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNotNull() {
            addCriterion("IS_SYS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSysEqualTo(String value) {
            addCriterion("IS_SYS =", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotEqualTo(String value) {
            addCriterion("IS_SYS <>", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThan(String value) {
            addCriterion("IS_SYS >", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SYS >=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThan(String value) {
            addCriterion("IS_SYS <", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThanOrEqualTo(String value) {
            addCriterion("IS_SYS <=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLike(String value) {
            addCriterion("IS_SYS like", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotLike(String value) {
            addCriterion("IS_SYS not like", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysIn(List<String> values) {
            addCriterion("IS_SYS in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotIn(List<String> values) {
            addCriterion("IS_SYS not in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysBetween(String value1, String value2) {
            addCriterion("IS_SYS between", value1, value2, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotBetween(String value1, String value2) {
            addCriterion("IS_SYS not between", value1, value2, "isSys");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNull() {
            addCriterion("MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(String value) {
            addCriterion("MODULE_ID =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(String value) {
            addCriterion("MODULE_ID <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(String value) {
            addCriterion("MODULE_ID >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE_ID >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(String value) {
            addCriterion("MODULE_ID <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(String value) {
            addCriterion("MODULE_ID <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLike(String value) {
            addCriterion("MODULE_ID like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotLike(String value) {
            addCriterion("MODULE_ID not like", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<String> values) {
            addCriterion("MODULE_ID in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<String> values) {
            addCriterion("MODULE_ID not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(String value1, String value2) {
            addCriterion("MODULE_ID between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(String value1, String value2) {
            addCriterion("MODULE_ID not between", value1, value2, "moduleId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_authorities
     *
     * @mbggenerated do_not_delete_during_merge Sat Feb 07 23:54:01 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_authorities
     *
     * @mbggenerated Sat Feb 07 23:54:01 CST 2015
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