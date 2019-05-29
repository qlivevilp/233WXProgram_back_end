package cn.org.cerambycidae.testmybaits.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_id not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQTitleIsNull() {
            addCriterion("q_title is null");
            return (Criteria) this;
        }

        public Criteria andQTitleIsNotNull() {
            addCriterion("q_title is not null");
            return (Criteria) this;
        }

        public Criteria andQTitleEqualTo(String value) {
            addCriterion("q_title =", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotEqualTo(String value) {
            addCriterion("q_title <>", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleGreaterThan(String value) {
            addCriterion("q_title >", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleGreaterThanOrEqualTo(String value) {
            addCriterion("q_title >=", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleLessThan(String value) {
            addCriterion("q_title <", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleLessThanOrEqualTo(String value) {
            addCriterion("q_title <=", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleLike(String value) {
            addCriterion("q_title like", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotLike(String value) {
            addCriterion("q_title not like", value, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleIn(List<String> values) {
            addCriterion("q_title in", values, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotIn(List<String> values) {
            addCriterion("q_title not in", values, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleBetween(String value1, String value2) {
            addCriterion("q_title between", value1, value2, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTitleNotBetween(String value1, String value2) {
            addCriterion("q_title not between", value1, value2, "qTitle");
            return (Criteria) this;
        }

        public Criteria andQTagIsNull() {
            addCriterion("q_tag is null");
            return (Criteria) this;
        }

        public Criteria andQTagIsNotNull() {
            addCriterion("q_tag is not null");
            return (Criteria) this;
        }

        public Criteria andQTagEqualTo(String value) {
            addCriterion("q_tag =", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagNotEqualTo(String value) {
            addCriterion("q_tag <>", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagGreaterThan(String value) {
            addCriterion("q_tag >", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagGreaterThanOrEqualTo(String value) {
            addCriterion("q_tag >=", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagLessThan(String value) {
            addCriterion("q_tag <", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagLessThanOrEqualTo(String value) {
            addCriterion("q_tag <=", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagLike(String value) {
            addCriterion("q_tag like", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagNotLike(String value) {
            addCriterion("q_tag not like", value, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagIn(List<String> values) {
            addCriterion("q_tag in", values, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagNotIn(List<String> values) {
            addCriterion("q_tag not in", values, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagBetween(String value1, String value2) {
            addCriterion("q_tag between", value1, value2, "qTag");
            return (Criteria) this;
        }

        public Criteria andQTagNotBetween(String value1, String value2) {
            addCriterion("q_tag not between", value1, value2, "qTag");
            return (Criteria) this;
        }

        public Criteria andQContextIsNull() {
            addCriterion("q_context is null");
            return (Criteria) this;
        }

        public Criteria andQContextIsNotNull() {
            addCriterion("q_context is not null");
            return (Criteria) this;
        }

        public Criteria andQContextEqualTo(String value) {
            addCriterion("q_context =", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextNotEqualTo(String value) {
            addCriterion("q_context <>", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextGreaterThan(String value) {
            addCriterion("q_context >", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextGreaterThanOrEqualTo(String value) {
            addCriterion("q_context >=", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextLessThan(String value) {
            addCriterion("q_context <", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextLessThanOrEqualTo(String value) {
            addCriterion("q_context <=", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextLike(String value) {
            addCriterion("q_context like", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextNotLike(String value) {
            addCriterion("q_context not like", value, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextIn(List<String> values) {
            addCriterion("q_context in", values, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextNotIn(List<String> values) {
            addCriterion("q_context not in", values, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextBetween(String value1, String value2) {
            addCriterion("q_context between", value1, value2, "qContext");
            return (Criteria) this;
        }

        public Criteria andQContextNotBetween(String value1, String value2) {
            addCriterion("q_context not between", value1, value2, "qContext");
            return (Criteria) this;
        }

        public Criteria andQPicIsNull() {
            addCriterion("q_pic is null");
            return (Criteria) this;
        }

        public Criteria andQPicIsNotNull() {
            addCriterion("q_pic is not null");
            return (Criteria) this;
        }

        public Criteria andQPicEqualTo(String value) {
            addCriterion("q_pic =", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicNotEqualTo(String value) {
            addCriterion("q_pic <>", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicGreaterThan(String value) {
            addCriterion("q_pic >", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicGreaterThanOrEqualTo(String value) {
            addCriterion("q_pic >=", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicLessThan(String value) {
            addCriterion("q_pic <", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicLessThanOrEqualTo(String value) {
            addCriterion("q_pic <=", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicLike(String value) {
            addCriterion("q_pic like", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicNotLike(String value) {
            addCriterion("q_pic not like", value, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicIn(List<String> values) {
            addCriterion("q_pic in", values, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicNotIn(List<String> values) {
            addCriterion("q_pic not in", values, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicBetween(String value1, String value2) {
            addCriterion("q_pic between", value1, value2, "qPic");
            return (Criteria) this;
        }

        public Criteria andQPicNotBetween(String value1, String value2) {
            addCriterion("q_pic not between", value1, value2, "qPic");
            return (Criteria) this;
        }

        public Criteria andQLikeIsNull() {
            addCriterion("q_like is null");
            return (Criteria) this;
        }

        public Criteria andQLikeIsNotNull() {
            addCriterion("q_like is not null");
            return (Criteria) this;
        }

        public Criteria andQLikeEqualTo(Integer value) {
            addCriterion("q_like =", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeNotEqualTo(Integer value) {
            addCriterion("q_like <>", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeGreaterThan(Integer value) {
            addCriterion("q_like >", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_like >=", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeLessThan(Integer value) {
            addCriterion("q_like <", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeLessThanOrEqualTo(Integer value) {
            addCriterion("q_like <=", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeIn(List<Integer> values) {
            addCriterion("q_like in", values, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeNotIn(List<Integer> values) {
            addCriterion("q_like not in", values, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeBetween(Integer value1, Integer value2) {
            addCriterion("q_like between", value1, value2, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("q_like not between", value1, value2, "qLike");
            return (Criteria) this;
        }

        public Criteria andQTimeIsNull() {
            addCriterion("q_time is null");
            return (Criteria) this;
        }

        public Criteria andQTimeIsNotNull() {
            addCriterion("q_time is not null");
            return (Criteria) this;
        }

        public Criteria andQTimeEqualTo(Date value) {
            addCriterion("q_time =", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotEqualTo(Date value) {
            addCriterion("q_time <>", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeGreaterThan(Date value) {
            addCriterion("q_time >", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("q_time >=", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLessThan(Date value) {
            addCriterion("q_time <", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLessThanOrEqualTo(Date value) {
            addCriterion("q_time <=", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeIn(List<Date> values) {
            addCriterion("q_time in", values, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotIn(List<Date> values) {
            addCriterion("q_time not in", values, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeBetween(Date value1, Date value2) {
            addCriterion("q_time between", value1, value2, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotBetween(Date value1, Date value2) {
            addCriterion("q_time not between", value1, value2, "qTime");
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