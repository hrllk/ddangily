package com.rnj.ddangily.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MasterConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MasterConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andMasterConfigIdIsNull() {
            addCriterion("master_config_id is null");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdIsNotNull() {
            addCriterion("master_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdEqualTo(Long value) {
            addCriterion("master_config_id =", value, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdNotEqualTo(Long value) {
            addCriterion("master_config_id <>", value, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdGreaterThan(Long value) {
            addCriterion("master_config_id >", value, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("master_config_id >=", value, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdLessThan(Long value) {
            addCriterion("master_config_id <", value, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("master_config_id <=", value, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdIn(List<Long> values) {
            addCriterion("master_config_id in", values, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdNotIn(List<Long> values) {
            addCriterion("master_config_id not in", values, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdBetween(Long value1, Long value2) {
            addCriterion("master_config_id between", value1, value2, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("master_config_id not between", value1, value2, "masterConfigId");
            return (Criteria) this;
        }

        public Criteria andMasterTypeIsNull() {
            addCriterion("master_type is null");
            return (Criteria) this;
        }

        public Criteria andMasterTypeIsNotNull() {
            addCriterion("master_type is not null");
            return (Criteria) this;
        }

        public Criteria andMasterTypeEqualTo(String value) {
            addCriterion("master_type =", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeNotEqualTo(String value) {
            addCriterion("master_type <>", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeGreaterThan(String value) {
            addCriterion("master_type >", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("master_type >=", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeLessThan(String value) {
            addCriterion("master_type <", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeLessThanOrEqualTo(String value) {
            addCriterion("master_type <=", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeLike(String value) {
            addCriterion("master_type like", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeNotLike(String value) {
            addCriterion("master_type not like", value, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeIn(List<String> values) {
            addCriterion("master_type in", values, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeNotIn(List<String> values) {
            addCriterion("master_type not in", values, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeBetween(String value1, String value2) {
            addCriterion("master_type between", value1, value2, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterTypeNotBetween(String value1, String value2) {
            addCriterion("master_type not between", value1, value2, "masterType");
            return (Criteria) this;
        }

        public Criteria andMasterKeyIsNull() {
            addCriterion("master_key is null");
            return (Criteria) this;
        }

        public Criteria andMasterKeyIsNotNull() {
            addCriterion("master_key is not null");
            return (Criteria) this;
        }

        public Criteria andMasterKeyEqualTo(String value) {
            addCriterion("master_key =", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyNotEqualTo(String value) {
            addCriterion("master_key <>", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyGreaterThan(String value) {
            addCriterion("master_key >", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyGreaterThanOrEqualTo(String value) {
            addCriterion("master_key >=", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyLessThan(String value) {
            addCriterion("master_key <", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyLessThanOrEqualTo(String value) {
            addCriterion("master_key <=", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyLike(String value) {
            addCriterion("master_key like", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyNotLike(String value) {
            addCriterion("master_key not like", value, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyIn(List<String> values) {
            addCriterion("master_key in", values, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyNotIn(List<String> values) {
            addCriterion("master_key not in", values, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyBetween(String value1, String value2) {
            addCriterion("master_key between", value1, value2, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterKeyNotBetween(String value1, String value2) {
            addCriterion("master_key not between", value1, value2, "masterKey");
            return (Criteria) this;
        }

        public Criteria andMasterValueIsNull() {
            addCriterion("master_value is null");
            return (Criteria) this;
        }

        public Criteria andMasterValueIsNotNull() {
            addCriterion("master_value is not null");
            return (Criteria) this;
        }

        public Criteria andMasterValueEqualTo(String value) {
            addCriterion("master_value =", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueNotEqualTo(String value) {
            addCriterion("master_value <>", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueGreaterThan(String value) {
            addCriterion("master_value >", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueGreaterThanOrEqualTo(String value) {
            addCriterion("master_value >=", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueLessThan(String value) {
            addCriterion("master_value <", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueLessThanOrEqualTo(String value) {
            addCriterion("master_value <=", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueLike(String value) {
            addCriterion("master_value like", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueNotLike(String value) {
            addCriterion("master_value not like", value, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueIn(List<String> values) {
            addCriterion("master_value in", values, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueNotIn(List<String> values) {
            addCriterion("master_value not in", values, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueBetween(String value1, String value2) {
            addCriterion("master_value between", value1, value2, "masterValue");
            return (Criteria) this;
        }

        public Criteria andMasterValueNotBetween(String value1, String value2) {
            addCriterion("master_value not between", value1, value2, "masterValue");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Byte value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Byte value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Byte value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Byte value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Byte value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Byte value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Byte> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Byte> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Byte value1, Byte value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Byte value1, Byte value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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