package com.zxbking.dzfpkpfw.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     */
    public InvoiceExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andLastUserIsNull() {
            addCriterion("last_user is null");
            return (Criteria) this;
        }

        public Criteria andLastUserIsNotNull() {
            addCriterion("last_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastUserEqualTo(String value) {
            addCriterion("last_user =", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserNotEqualTo(String value) {
            addCriterion("last_user <>", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserGreaterThan(String value) {
            addCriterion("last_user >", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserGreaterThanOrEqualTo(String value) {
            addCriterion("last_user >=", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserLessThan(String value) {
            addCriterion("last_user <", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserLessThanOrEqualTo(String value) {
            addCriterion("last_user <=", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserLike(String value) {
            addCriterion("last_user like", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserNotLike(String value) {
            addCriterion("last_user not like", value, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserIn(List<String> values) {
            addCriterion("last_user in", values, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserNotIn(List<String> values) {
            addCriterion("last_user not in", values, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserBetween(String value1, String value2) {
            addCriterion("last_user between", value1, value2, "lastUser");
            return (Criteria) this;
        }

        public Criteria andLastUserNotBetween(String value1, String value2) {
            addCriterion("last_user not between", value1, value2, "lastUser");
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

        public Criteria andNsrsbhIsNull() {
            addCriterion("nsrsbh is null");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIsNotNull() {
            addCriterion("nsrsbh is not null");
            return (Criteria) this;
        }

        public Criteria andNsrsbhEqualTo(String value) {
            addCriterion("nsrsbh =", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotEqualTo(String value) {
            addCriterion("nsrsbh <>", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhGreaterThan(String value) {
            addCriterion("nsrsbh >", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhGreaterThanOrEqualTo(String value) {
            addCriterion("nsrsbh >=", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLessThan(String value) {
            addCriterion("nsrsbh <", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLessThanOrEqualTo(String value) {
            addCriterion("nsrsbh <=", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLike(String value) {
            addCriterion("nsrsbh like", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotLike(String value) {
            addCriterion("nsrsbh not like", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIn(List<String> values) {
            addCriterion("nsrsbh in", values, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotIn(List<String> values) {
            addCriterion("nsrsbh not in", values, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhBetween(String value1, String value2) {
            addCriterion("nsrsbh between", value1, value2, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotBetween(String value1, String value2) {
            addCriterion("nsrsbh not between", value1, value2, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andGsAddressIsNull() {
            addCriterion("gs_address is null");
            return (Criteria) this;
        }

        public Criteria andGsAddressIsNotNull() {
            addCriterion("gs_address is not null");
            return (Criteria) this;
        }

        public Criteria andGsAddressEqualTo(String value) {
            addCriterion("gs_address =", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressNotEqualTo(String value) {
            addCriterion("gs_address <>", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressGreaterThan(String value) {
            addCriterion("gs_address >", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("gs_address >=", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressLessThan(String value) {
            addCriterion("gs_address <", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressLessThanOrEqualTo(String value) {
            addCriterion("gs_address <=", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressLike(String value) {
            addCriterion("gs_address like", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressNotLike(String value) {
            addCriterion("gs_address not like", value, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressIn(List<String> values) {
            addCriterion("gs_address in", values, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressNotIn(List<String> values) {
            addCriterion("gs_address not in", values, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressBetween(String value1, String value2) {
            addCriterion("gs_address between", value1, value2, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsAddressNotBetween(String value1, String value2) {
            addCriterion("gs_address not between", value1, value2, "gsAddress");
            return (Criteria) this;
        }

        public Criteria andGsPhoneIsNull() {
            addCriterion("gs_phone is null");
            return (Criteria) this;
        }

        public Criteria andGsPhoneIsNotNull() {
            addCriterion("gs_phone is not null");
            return (Criteria) this;
        }

        public Criteria andGsPhoneEqualTo(String value) {
            addCriterion("gs_phone =", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneNotEqualTo(String value) {
            addCriterion("gs_phone <>", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneGreaterThan(String value) {
            addCriterion("gs_phone >", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("gs_phone >=", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneLessThan(String value) {
            addCriterion("gs_phone <", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneLessThanOrEqualTo(String value) {
            addCriterion("gs_phone <=", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneLike(String value) {
            addCriterion("gs_phone like", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneNotLike(String value) {
            addCriterion("gs_phone not like", value, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneIn(List<String> values) {
            addCriterion("gs_phone in", values, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneNotIn(List<String> values) {
            addCriterion("gs_phone not in", values, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneBetween(String value1, String value2) {
            addCriterion("gs_phone between", value1, value2, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andGsPhoneNotBetween(String value1, String value2) {
            addCriterion("gs_phone not between", value1, value2, "gsPhone");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountIsNull() {
            addCriterion("tax_able_amount is null");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountIsNotNull() {
            addCriterion("tax_able_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountEqualTo(BigDecimal value) {
            addCriterion("tax_able_amount =", value, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountNotEqualTo(BigDecimal value) {
            addCriterion("tax_able_amount <>", value, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountGreaterThan(BigDecimal value) {
            addCriterion("tax_able_amount >", value, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_able_amount >=", value, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountLessThan(BigDecimal value) {
            addCriterion("tax_able_amount <", value, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_able_amount <=", value, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountIn(List<BigDecimal> values) {
            addCriterion("tax_able_amount in", values, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountNotIn(List<BigDecimal> values) {
            addCriterion("tax_able_amount not in", values, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_able_amount between", value1, value2, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxAbleAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_able_amount not between", value1, value2, "taxAbleAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountIsNull() {
            addCriterion("tax_free_amount is null");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountIsNotNull() {
            addCriterion("tax_free_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountEqualTo(BigDecimal value) {
            addCriterion("tax_free_amount =", value, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountNotEqualTo(BigDecimal value) {
            addCriterion("tax_free_amount <>", value, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountGreaterThan(BigDecimal value) {
            addCriterion("tax_free_amount >", value, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_free_amount >=", value, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountLessThan(BigDecimal value) {
            addCriterion("tax_free_amount <", value, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_free_amount <=", value, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountIn(List<BigDecimal> values) {
            addCriterion("tax_free_amount in", values, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountNotIn(List<BigDecimal> values) {
            addCriterion("tax_free_amount not in", values, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_free_amount between", value1, value2, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andTaxFreeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_free_amount not between", value1, value2, "taxFreeAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFpTimeIsNull() {
            addCriterion("fp_time is null");
            return (Criteria) this;
        }

        public Criteria andFpTimeIsNotNull() {
            addCriterion("fp_time is not null");
            return (Criteria) this;
        }

        public Criteria andFpTimeEqualTo(Date value) {
            addCriterion("fp_time =", value, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeNotEqualTo(Date value) {
            addCriterion("fp_time <>", value, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeGreaterThan(Date value) {
            addCriterion("fp_time >", value, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fp_time >=", value, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeLessThan(Date value) {
            addCriterion("fp_time <", value, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeLessThanOrEqualTo(Date value) {
            addCriterion("fp_time <=", value, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeIn(List<Date> values) {
            addCriterion("fp_time in", values, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeNotIn(List<Date> values) {
            addCriterion("fp_time not in", values, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeBetween(Date value1, Date value2) {
            addCriterion("fp_time between", value1, value2, "fpTime");
            return (Criteria) this;
        }

        public Criteria andFpTimeNotBetween(Date value1, Date value2) {
            addCriterion("fp_time not between", value1, value2, "fpTime");
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