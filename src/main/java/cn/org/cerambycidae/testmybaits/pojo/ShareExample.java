package cn.org.cerambycidae.testmybaits.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShareExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNull() {
            addCriterion("s_title is null");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNotNull() {
            addCriterion("s_title is not null");
            return (Criteria) this;
        }

        public Criteria andSTitleEqualTo(String value) {
            addCriterion("s_title =", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotEqualTo(String value) {
            addCriterion("s_title <>", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThan(String value) {
            addCriterion("s_title >", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThanOrEqualTo(String value) {
            addCriterion("s_title >=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThan(String value) {
            addCriterion("s_title <", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThanOrEqualTo(String value) {
            addCriterion("s_title <=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLike(String value) {
            addCriterion("s_title like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotLike(String value) {
            addCriterion("s_title not like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleIn(List<String> values) {
            addCriterion("s_title in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotIn(List<String> values) {
            addCriterion("s_title not in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleBetween(String value1, String value2) {
            addCriterion("s_title between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotBetween(String value1, String value2) {
            addCriterion("s_title not between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTagIsNull() {
            addCriterion("s_tag is null");
            return (Criteria) this;
        }

        public Criteria andSTagIsNotNull() {
            addCriterion("s_tag is not null");
            return (Criteria) this;
        }

        public Criteria andSTagEqualTo(String value) {
            addCriterion("s_tag =", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagNotEqualTo(String value) {
            addCriterion("s_tag <>", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagGreaterThan(String value) {
            addCriterion("s_tag >", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagGreaterThanOrEqualTo(String value) {
            addCriterion("s_tag >=", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagLessThan(String value) {
            addCriterion("s_tag <", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagLessThanOrEqualTo(String value) {
            addCriterion("s_tag <=", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagLike(String value) {
            addCriterion("s_tag like", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagNotLike(String value) {
            addCriterion("s_tag not like", value, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagIn(List<String> values) {
            addCriterion("s_tag in", values, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagNotIn(List<String> values) {
            addCriterion("s_tag not in", values, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagBetween(String value1, String value2) {
            addCriterion("s_tag between", value1, value2, "sTag");
            return (Criteria) this;
        }

        public Criteria andSTagNotBetween(String value1, String value2) {
            addCriterion("s_tag not between", value1, value2, "sTag");
            return (Criteria) this;
        }

        public Criteria andSContextIsNull() {
            addCriterion("s_context is null");
            return (Criteria) this;
        }

        public Criteria andSContextIsNotNull() {
            addCriterion("s_context is not null");
            return (Criteria) this;
        }

        public Criteria andSContextEqualTo(String value) {
            addCriterion("s_context =", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextNotEqualTo(String value) {
            addCriterion("s_context <>", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextGreaterThan(String value) {
            addCriterion("s_context >", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextGreaterThanOrEqualTo(String value) {
            addCriterion("s_context >=", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextLessThan(String value) {
            addCriterion("s_context <", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextLessThanOrEqualTo(String value) {
            addCriterion("s_context <=", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextLike(String value) {
            addCriterion("s_context like", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextNotLike(String value) {
            addCriterion("s_context not like", value, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextIn(List<String> values) {
            addCriterion("s_context in", values, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextNotIn(List<String> values) {
            addCriterion("s_context not in", values, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextBetween(String value1, String value2) {
            addCriterion("s_context between", value1, value2, "sContext");
            return (Criteria) this;
        }

        public Criteria andSContextNotBetween(String value1, String value2) {
            addCriterion("s_context not between", value1, value2, "sContext");
            return (Criteria) this;
        }

        public Criteria andSPicIsNull() {
            addCriterion("s_pic is null");
            return (Criteria) this;
        }

        public Criteria andSPicIsNotNull() {
            addCriterion("s_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSPicEqualTo(String value) {
            addCriterion("s_pic =", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotEqualTo(String value) {
            addCriterion("s_pic <>", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicGreaterThan(String value) {
            addCriterion("s_pic >", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicGreaterThanOrEqualTo(String value) {
            addCriterion("s_pic >=", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicLessThan(String value) {
            addCriterion("s_pic <", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicLessThanOrEqualTo(String value) {
            addCriterion("s_pic <=", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicLike(String value) {
            addCriterion("s_pic like", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotLike(String value) {
            addCriterion("s_pic not like", value, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicIn(List<String> values) {
            addCriterion("s_pic in", values, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotIn(List<String> values) {
            addCriterion("s_pic not in", values, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicBetween(String value1, String value2) {
            addCriterion("s_pic between", value1, value2, "sPic");
            return (Criteria) this;
        }

        public Criteria andSPicNotBetween(String value1, String value2) {
            addCriterion("s_pic not between", value1, value2, "sPic");
            return (Criteria) this;
        }

        public Criteria andSLikeIsNull() {
            addCriterion("s_like is null");
            return (Criteria) this;
        }

        public Criteria andSLikeIsNotNull() {
            addCriterion("s_like is not null");
            return (Criteria) this;
        }

        public Criteria andSLikeEqualTo(Integer value) {
            addCriterion("s_like =", value, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeNotEqualTo(Integer value) {
            addCriterion("s_like <>", value, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeGreaterThan(Integer value) {
            addCriterion("s_like >", value, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_like >=", value, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeLessThan(Integer value) {
            addCriterion("s_like <", value, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeLessThanOrEqualTo(Integer value) {
            addCriterion("s_like <=", value, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeIn(List<Integer> values) {
            addCriterion("s_like in", values, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeNotIn(List<Integer> values) {
            addCriterion("s_like not in", values, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeBetween(Integer value1, Integer value2) {
            addCriterion("s_like between", value1, value2, "sLike");
            return (Criteria) this;
        }

        public Criteria andSLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_like not between", value1, value2, "sLike");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(Date value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(Date value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(Date value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(Date value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<Date> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<Date> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(Date value1, Date value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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