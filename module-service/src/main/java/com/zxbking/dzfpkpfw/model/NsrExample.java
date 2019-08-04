package com.zxbking.dzfpkpfw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     */
    public NsrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @param orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @param distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @param criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
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
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNsrmcIsNull() {
            addCriterion("nsrmc is null");
            return (Criteria) this;
        }

        public Criteria andNsrmcIsNotNull() {
            addCriterion("nsrmc is not null");
            return (Criteria) this;
        }

        public Criteria andNsrmcEqualTo(String value) {
            addCriterion("nsrmc =", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotEqualTo(String value) {
            addCriterion("nsrmc <>", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcGreaterThan(String value) {
            addCriterion("nsrmc >", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcGreaterThanOrEqualTo(String value) {
            addCriterion("nsrmc >=", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcLessThan(String value) {
            addCriterion("nsrmc <", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcLessThanOrEqualTo(String value) {
            addCriterion("nsrmc <=", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcLike(String value) {
            addCriterion("nsrmc like", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotLike(String value) {
            addCriterion("nsrmc not like", value, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcIn(List<String> values) {
            addCriterion("nsrmc in", values, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotIn(List<String> values) {
            addCriterion("nsrmc not in", values, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcBetween(String value1, String value2) {
            addCriterion("nsrmc between", value1, value2, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrmcNotBetween(String value1, String value2) {
            addCriterion("nsrmc not between", value1, value2, "nsrmc");
            return (Criteria) this;
        }

        public Criteria andNsrbmIsNull() {
            addCriterion("nsrbm is null");
            return (Criteria) this;
        }

        public Criteria andNsrbmIsNotNull() {
            addCriterion("nsrbm is not null");
            return (Criteria) this;
        }

        public Criteria andNsrbmEqualTo(String value) {
            addCriterion("nsrbm =", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmNotEqualTo(String value) {
            addCriterion("nsrbm <>", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmGreaterThan(String value) {
            addCriterion("nsrbm >", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmGreaterThanOrEqualTo(String value) {
            addCriterion("nsrbm >=", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmLessThan(String value) {
            addCriterion("nsrbm <", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmLessThanOrEqualTo(String value) {
            addCriterion("nsrbm <=", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmLike(String value) {
            addCriterion("nsrbm like", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmNotLike(String value) {
            addCriterion("nsrbm not like", value, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmIn(List<String> values) {
            addCriterion("nsrbm in", values, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmNotIn(List<String> values) {
            addCriterion("nsrbm not in", values, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmBetween(String value1, String value2) {
            addCriterion("nsrbm between", value1, value2, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andNsrbmNotBetween(String value1, String value2) {
            addCriterion("nsrbm not between", value1, value2, "nsrbm");
            return (Criteria) this;
        }

        public Criteria andValidMarkIsNull() {
            addCriterion("valid_mark is null");
            return (Criteria) this;
        }

        public Criteria andValidMarkIsNotNull() {
            addCriterion("valid_mark is not null");
            return (Criteria) this;
        }

        public Criteria andValidMarkEqualTo(Integer value) {
            addCriterion("valid_mark =", value, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkNotEqualTo(Integer value) {
            addCriterion("valid_mark <>", value, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkGreaterThan(Integer value) {
            addCriterion("valid_mark >", value, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_mark >=", value, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkLessThan(Integer value) {
            addCriterion("valid_mark <", value, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkLessThanOrEqualTo(Integer value) {
            addCriterion("valid_mark <=", value, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkIn(List<Integer> values) {
            addCriterion("valid_mark in", values, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkNotIn(List<Integer> values) {
            addCriterion("valid_mark not in", values, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkBetween(Integer value1, Integer value2) {
            addCriterion("valid_mark between", value1, value2, "validMark");
            return (Criteria) this;
        }

        public Criteria andValidMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_mark not between", value1, value2, "validMark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
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