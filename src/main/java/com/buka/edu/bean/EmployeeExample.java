package com.buka.edu.bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUBirdayIsNull() {
            addCriterion("u_birday is null");
            return (Criteria) this;
        }

        public Criteria andUBirdayIsNotNull() {
            addCriterion("u_birday is not null");
            return (Criteria) this;
        }

        public Criteria andUBirdayEqualTo(String value) {
            addCriterion("u_birday =", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayNotEqualTo(String value) {
            addCriterion("u_birday <>", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayGreaterThan(String value) {
            addCriterion("u_birday >", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayGreaterThanOrEqualTo(String value) {
            addCriterion("u_birday >=", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayLessThan(String value) {
            addCriterion("u_birday <", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayLessThanOrEqualTo(String value) {
            addCriterion("u_birday <=", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayLike(String value) {
            addCriterion("u_birday like", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayNotLike(String value) {
            addCriterion("u_birday not like", value, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayIn(List<String> values) {
            addCriterion("u_birday in", values, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayNotIn(List<String> values) {
            addCriterion("u_birday not in", values, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayBetween(String value1, String value2) {
            addCriterion("u_birday between", value1, value2, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUBirdayNotBetween(String value1, String value2) {
            addCriterion("u_birday not between", value1, value2, "uBirday");
            return (Criteria) this;
        }

        public Criteria andUMoneyIsNull() {
            addCriterion("u_money is null");
            return (Criteria) this;
        }

        public Criteria andUMoneyIsNotNull() {
            addCriterion("u_money is not null");
            return (Criteria) this;
        }

        public Criteria andUMoneyEqualTo(Double value) {
            addCriterion("u_money =", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyNotEqualTo(Double value) {
            addCriterion("u_money <>", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyGreaterThan(Double value) {
            addCriterion("u_money >", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("u_money >=", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyLessThan(Double value) {
            addCriterion("u_money <", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyLessThanOrEqualTo(Double value) {
            addCriterion("u_money <=", value, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyIn(List<Double> values) {
            addCriterion("u_money in", values, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyNotIn(List<Double> values) {
            addCriterion("u_money not in", values, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyBetween(Double value1, Double value2) {
            addCriterion("u_money between", value1, value2, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUMoneyNotBetween(Double value1, Double value2) {
            addCriterion("u_money not between", value1, value2, "uMoney");
            return (Criteria) this;
        }

        public Criteria andUDidIsNull() {
            addCriterion("u_did is null");
            return (Criteria) this;
        }

        public Criteria andUDidIsNotNull() {
            addCriterion("u_did is not null");
            return (Criteria) this;
        }

        public Criteria andUDidEqualTo(Integer value) {
            addCriterion("u_did =", value, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidNotEqualTo(Integer value) {
            addCriterion("u_did <>", value, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidGreaterThan(Integer value) {
            addCriterion("u_did >", value, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_did >=", value, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidLessThan(Integer value) {
            addCriterion("u_did <", value, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidLessThanOrEqualTo(Integer value) {
            addCriterion("u_did <=", value, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidIn(List<Integer> values) {
            addCriterion("u_did in", values, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidNotIn(List<Integer> values) {
            addCriterion("u_did not in", values, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidBetween(Integer value1, Integer value2) {
            addCriterion("u_did between", value1, value2, "uDid");
            return (Criteria) this;
        }

        public Criteria andUDidNotBetween(Integer value1, Integer value2) {
            addCriterion("u_did not between", value1, value2, "uDid");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
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