package cn.org.cerambycidae.testmybaits.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerQuestionExample() {
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

        public Criteria andAqContextIsNull() {
            addCriterion("aq_context is null");
            return (Criteria) this;
        }

        public Criteria andAqContextIsNotNull() {
            addCriterion("aq_context is not null");
            return (Criteria) this;
        }

        public Criteria andAqContextEqualTo(String value) {
            addCriterion("aq_context =", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextNotEqualTo(String value) {
            addCriterion("aq_context <>", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextGreaterThan(String value) {
            addCriterion("aq_context >", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextGreaterThanOrEqualTo(String value) {
            addCriterion("aq_context >=", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextLessThan(String value) {
            addCriterion("aq_context <", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextLessThanOrEqualTo(String value) {
            addCriterion("aq_context <=", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextLike(String value) {
            addCriterion("aq_context like", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextNotLike(String value) {
            addCriterion("aq_context not like", value, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextIn(List<String> values) {
            addCriterion("aq_context in", values, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextNotIn(List<String> values) {
            addCriterion("aq_context not in", values, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextBetween(String value1, String value2) {
            addCriterion("aq_context between", value1, value2, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqContextNotBetween(String value1, String value2) {
            addCriterion("aq_context not between", value1, value2, "aqContext");
            return (Criteria) this;
        }

        public Criteria andAqTimeIsNull() {
            addCriterion("aq_time is null");
            return (Criteria) this;
        }

        public Criteria andAqTimeIsNotNull() {
            addCriterion("aq_time is not null");
            return (Criteria) this;
        }

        public Criteria andAqTimeEqualTo(Date value) {
            addCriterion("aq_time =", value, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeNotEqualTo(Date value) {
            addCriterion("aq_time <>", value, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeGreaterThan(Date value) {
            addCriterion("aq_time >", value, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aq_time >=", value, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeLessThan(Date value) {
            addCriterion("aq_time <", value, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeLessThanOrEqualTo(Date value) {
            addCriterion("aq_time <=", value, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeIn(List<Date> values) {
            addCriterion("aq_time in", values, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeNotIn(List<Date> values) {
            addCriterion("aq_time not in", values, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeBetween(Date value1, Date value2) {
            addCriterion("aq_time between", value1, value2, "aqTime");
            return (Criteria) this;
        }

        public Criteria andAqTimeNotBetween(Date value1, Date value2) {
            addCriterion("aq_time not between", value1, value2, "aqTime");
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