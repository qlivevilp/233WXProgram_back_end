package cn.org.cerambycidae.testmybaits.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentShareExample() {
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

        public Criteria andCsTimeIsNull() {
            addCriterion("cs_time is null");
            return (Criteria) this;
        }

        public Criteria andCsTimeIsNotNull() {
            addCriterion("cs_time is not null");
            return (Criteria) this;
        }

        public Criteria andCsTimeEqualTo(Date value) {
            addCriterion("cs_time =", value, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeNotEqualTo(Date value) {
            addCriterion("cs_time <>", value, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeGreaterThan(Date value) {
            addCriterion("cs_time >", value, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cs_time >=", value, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeLessThan(Date value) {
            addCriterion("cs_time <", value, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeLessThanOrEqualTo(Date value) {
            addCriterion("cs_time <=", value, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeIn(List<Date> values) {
            addCriterion("cs_time in", values, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeNotIn(List<Date> values) {
            addCriterion("cs_time not in", values, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeBetween(Date value1, Date value2) {
            addCriterion("cs_time between", value1, value2, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsTimeNotBetween(Date value1, Date value2) {
            addCriterion("cs_time not between", value1, value2, "csTime");
            return (Criteria) this;
        }

        public Criteria andCsContextIsNull() {
            addCriterion("cs_context is null");
            return (Criteria) this;
        }

        public Criteria andCsContextIsNotNull() {
            addCriterion("cs_context is not null");
            return (Criteria) this;
        }

        public Criteria andCsContextEqualTo(String value) {
            addCriterion("cs_context =", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextNotEqualTo(String value) {
            addCriterion("cs_context <>", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextGreaterThan(String value) {
            addCriterion("cs_context >", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextGreaterThanOrEqualTo(String value) {
            addCriterion("cs_context >=", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextLessThan(String value) {
            addCriterion("cs_context <", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextLessThanOrEqualTo(String value) {
            addCriterion("cs_context <=", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextLike(String value) {
            addCriterion("cs_context like", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextNotLike(String value) {
            addCriterion("cs_context not like", value, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextIn(List<String> values) {
            addCriterion("cs_context in", values, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextNotIn(List<String> values) {
            addCriterion("cs_context not in", values, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextBetween(String value1, String value2) {
            addCriterion("cs_context between", value1, value2, "csContext");
            return (Criteria) this;
        }

        public Criteria andCsContextNotBetween(String value1, String value2) {
            addCriterion("cs_context not between", value1, value2, "csContext");
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