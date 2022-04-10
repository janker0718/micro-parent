package top.janker.jmall.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsRefundOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsRefundOrderExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andDeliverySnIsNull() {
            addCriterion("delivery_sn is null");
            return (Criteria) this;
        }

        public Criteria andDeliverySnIsNotNull() {
            addCriterion("delivery_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverySnEqualTo(String value) {
            addCriterion("delivery_sn =", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotEqualTo(String value) {
            addCriterion("delivery_sn <>", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnGreaterThan(String value) {
            addCriterion("delivery_sn >", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_sn >=", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnLessThan(String value) {
            addCriterion("delivery_sn <", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnLessThanOrEqualTo(String value) {
            addCriterion("delivery_sn <=", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnLike(String value) {
            addCriterion("delivery_sn like", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotLike(String value) {
            addCriterion("delivery_sn not like", value, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnIn(List<String> values) {
            addCriterion("delivery_sn in", values, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotIn(List<String> values) {
            addCriterion("delivery_sn not in", values, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnBetween(String value1, String value2) {
            addCriterion("delivery_sn between", value1, value2, "deliverySn");
            return (Criteria) this;
        }

        public Criteria andDeliverySnNotBetween(String value1, String value2) {
            addCriterion("delivery_sn not between", value1, value2, "deliverySn");
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

        public Criteria andTransferProvinceIsNull() {
            addCriterion("transfer_province is null");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceIsNotNull() {
            addCriterion("transfer_province is not null");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceEqualTo(String value) {
            addCriterion("transfer_province =", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceNotEqualTo(String value) {
            addCriterion("transfer_province <>", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceGreaterThan(String value) {
            addCriterion("transfer_province >", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_province >=", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceLessThan(String value) {
            addCriterion("transfer_province <", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceLessThanOrEqualTo(String value) {
            addCriterion("transfer_province <=", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceLike(String value) {
            addCriterion("transfer_province like", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceNotLike(String value) {
            addCriterion("transfer_province not like", value, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceIn(List<String> values) {
            addCriterion("transfer_province in", values, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceNotIn(List<String> values) {
            addCriterion("transfer_province not in", values, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceBetween(String value1, String value2) {
            addCriterion("transfer_province between", value1, value2, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferProvinceNotBetween(String value1, String value2) {
            addCriterion("transfer_province not between", value1, value2, "transferProvince");
            return (Criteria) this;
        }

        public Criteria andTransferCityIsNull() {
            addCriterion("transfer_city is null");
            return (Criteria) this;
        }

        public Criteria andTransferCityIsNotNull() {
            addCriterion("transfer_city is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCityEqualTo(String value) {
            addCriterion("transfer_city =", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotEqualTo(String value) {
            addCriterion("transfer_city <>", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityGreaterThan(String value) {
            addCriterion("transfer_city >", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_city >=", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityLessThan(String value) {
            addCriterion("transfer_city <", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityLessThanOrEqualTo(String value) {
            addCriterion("transfer_city <=", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityLike(String value) {
            addCriterion("transfer_city like", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotLike(String value) {
            addCriterion("transfer_city not like", value, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityIn(List<String> values) {
            addCriterion("transfer_city in", values, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotIn(List<String> values) {
            addCriterion("transfer_city not in", values, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityBetween(String value1, String value2) {
            addCriterion("transfer_city between", value1, value2, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferCityNotBetween(String value1, String value2) {
            addCriterion("transfer_city not between", value1, value2, "transferCity");
            return (Criteria) this;
        }

        public Criteria andTransferAreaIsNull() {
            addCriterion("transfer_area is null");
            return (Criteria) this;
        }

        public Criteria andTransferAreaIsNotNull() {
            addCriterion("transfer_area is not null");
            return (Criteria) this;
        }

        public Criteria andTransferAreaEqualTo(String value) {
            addCriterion("transfer_area =", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaNotEqualTo(String value) {
            addCriterion("transfer_area <>", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaGreaterThan(String value) {
            addCriterion("transfer_area >", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_area >=", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaLessThan(String value) {
            addCriterion("transfer_area <", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaLessThanOrEqualTo(String value) {
            addCriterion("transfer_area <=", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaLike(String value) {
            addCriterion("transfer_area like", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaNotLike(String value) {
            addCriterion("transfer_area not like", value, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaIn(List<String> values) {
            addCriterion("transfer_area in", values, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaNotIn(List<String> values) {
            addCriterion("transfer_area not in", values, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaBetween(String value1, String value2) {
            addCriterion("transfer_area between", value1, value2, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferAreaNotBetween(String value1, String value2) {
            addCriterion("transfer_area not between", value1, value2, "transferArea");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressIsNull() {
            addCriterion("transfer_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressIsNotNull() {
            addCriterion("transfer_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressEqualTo(String value) {
            addCriterion("transfer_detail_address =", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressNotEqualTo(String value) {
            addCriterion("transfer_detail_address <>", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressGreaterThan(String value) {
            addCriterion("transfer_detail_address >", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_detail_address >=", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressLessThan(String value) {
            addCriterion("transfer_detail_address <", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("transfer_detail_address <=", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressLike(String value) {
            addCriterion("transfer_detail_address like", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressNotLike(String value) {
            addCriterion("transfer_detail_address not like", value, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressIn(List<String> values) {
            addCriterion("transfer_detail_address in", values, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressNotIn(List<String> values) {
            addCriterion("transfer_detail_address not in", values, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressBetween(String value1, String value2) {
            addCriterion("transfer_detail_address between", value1, value2, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferDetailAddressNotBetween(String value1, String value2) {
            addCriterion("transfer_detail_address not between", value1, value2, "transferDetailAddress");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNull() {
            addCriterion("transfer_name is null");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNotNull() {
            addCriterion("transfer_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNameEqualTo(String value) {
            addCriterion("transfer_name =", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotEqualTo(String value) {
            addCriterion("transfer_name <>", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThan(String value) {
            addCriterion("transfer_name >", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_name >=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThan(String value) {
            addCriterion("transfer_name <", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThanOrEqualTo(String value) {
            addCriterion("transfer_name <=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLike(String value) {
            addCriterion("transfer_name like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotLike(String value) {
            addCriterion("transfer_name not like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameIn(List<String> values) {
            addCriterion("transfer_name in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotIn(List<String> values) {
            addCriterion("transfer_name not in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameBetween(String value1, String value2) {
            addCriterion("transfer_name between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotBetween(String value1, String value2) {
            addCriterion("transfer_name not between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneIsNull() {
            addCriterion("transfer_phone is null");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneIsNotNull() {
            addCriterion("transfer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneEqualTo(String value) {
            addCriterion("transfer_phone =", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneNotEqualTo(String value) {
            addCriterion("transfer_phone <>", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneGreaterThan(String value) {
            addCriterion("transfer_phone >", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_phone >=", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneLessThan(String value) {
            addCriterion("transfer_phone <", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneLessThanOrEqualTo(String value) {
            addCriterion("transfer_phone <=", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneLike(String value) {
            addCriterion("transfer_phone like", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneNotLike(String value) {
            addCriterion("transfer_phone not like", value, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneIn(List<String> values) {
            addCriterion("transfer_phone in", values, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneNotIn(List<String> values) {
            addCriterion("transfer_phone not in", values, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneBetween(String value1, String value2) {
            addCriterion("transfer_phone between", value1, value2, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andTransferPhoneNotBetween(String value1, String value2) {
            addCriterion("transfer_phone not between", value1, value2, "transferPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIsNull() {
            addCriterion("receive_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIsNotNull() {
            addCriterion("receive_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceEqualTo(String value) {
            addCriterion("receive_province =", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotEqualTo(String value) {
            addCriterion("receive_province <>", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceGreaterThan(String value) {
            addCriterion("receive_province >", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("receive_province >=", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLessThan(String value) {
            addCriterion("receive_province <", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLessThanOrEqualTo(String value) {
            addCriterion("receive_province <=", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceLike(String value) {
            addCriterion("receive_province like", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotLike(String value) {
            addCriterion("receive_province not like", value, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceIn(List<String> values) {
            addCriterion("receive_province in", values, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotIn(List<String> values) {
            addCriterion("receive_province not in", values, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceBetween(String value1, String value2) {
            addCriterion("receive_province between", value1, value2, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveProvinceNotBetween(String value1, String value2) {
            addCriterion("receive_province not between", value1, value2, "receiveProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNull() {
            addCriterion("receive_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIsNotNull() {
            addCriterion("receive_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCityEqualTo(String value) {
            addCriterion("receive_city =", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotEqualTo(String value) {
            addCriterion("receive_city <>", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThan(String value) {
            addCriterion("receive_city >", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityGreaterThanOrEqualTo(String value) {
            addCriterion("receive_city >=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThan(String value) {
            addCriterion("receive_city <", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLessThanOrEqualTo(String value) {
            addCriterion("receive_city <=", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityLike(String value) {
            addCriterion("receive_city like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotLike(String value) {
            addCriterion("receive_city not like", value, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityIn(List<String> values) {
            addCriterion("receive_city in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotIn(List<String> values) {
            addCriterion("receive_city not in", values, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityBetween(String value1, String value2) {
            addCriterion("receive_city between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveCityNotBetween(String value1, String value2) {
            addCriterion("receive_city not between", value1, value2, "receiveCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIsNull() {
            addCriterion("receive_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIsNotNull() {
            addCriterion("receive_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaEqualTo(String value) {
            addCriterion("receive_area =", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotEqualTo(String value) {
            addCriterion("receive_area <>", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaGreaterThan(String value) {
            addCriterion("receive_area >", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receive_area >=", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLessThan(String value) {
            addCriterion("receive_area <", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLessThanOrEqualTo(String value) {
            addCriterion("receive_area <=", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaLike(String value) {
            addCriterion("receive_area like", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotLike(String value) {
            addCriterion("receive_area not like", value, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaIn(List<String> values) {
            addCriterion("receive_area in", values, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotIn(List<String> values) {
            addCriterion("receive_area not in", values, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaBetween(String value1, String value2) {
            addCriterion("receive_area between", value1, value2, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAreaNotBetween(String value1, String value2) {
            addCriterion("receive_area not between", value1, value2, "receiveArea");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressIsNull() {
            addCriterion("receive_detail_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressIsNotNull() {
            addCriterion("receive_detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressEqualTo(String value) {
            addCriterion("receive_detail_address =", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotEqualTo(String value) {
            addCriterion("receive_detail_address <>", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressGreaterThan(String value) {
            addCriterion("receive_detail_address >", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_detail_address >=", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressLessThan(String value) {
            addCriterion("receive_detail_address <", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_detail_address <=", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressLike(String value) {
            addCriterion("receive_detail_address like", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotLike(String value) {
            addCriterion("receive_detail_address not like", value, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressIn(List<String> values) {
            addCriterion("receive_detail_address in", values, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotIn(List<String> values) {
            addCriterion("receive_detail_address not in", values, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressBetween(String value1, String value2) {
            addCriterion("receive_detail_address between", value1, value2, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveDetailAddressNotBetween(String value1, String value2) {
            addCriterion("receive_detail_address not between", value1, value2, "receiveDetailAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receivePhone");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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