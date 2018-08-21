package com.flight.inter.otaadapter.config.model;

import java.util.ArrayList;
import java.util.List;

public class DomainConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DomainConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("domain_name is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("domain_name =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("domain_name <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("domain_name >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("domain_name >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("domain_name <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("domain_name <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("domain_name like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("domain_name not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("domain_name in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("domain_name not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("domain_name between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("domain_name not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainGroupIsNull() {
            addCriterion("domain_group is null");
            return (Criteria) this;
        }

        public Criteria andDomainGroupIsNotNull() {
            addCriterion("domain_group is not null");
            return (Criteria) this;
        }

        public Criteria andDomainGroupEqualTo(String value) {
            addCriterion("domain_group =", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupNotEqualTo(String value) {
            addCriterion("domain_group <>", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupGreaterThan(String value) {
            addCriterion("domain_group >", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupGreaterThanOrEqualTo(String value) {
            addCriterion("domain_group >=", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupLessThan(String value) {
            addCriterion("domain_group <", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupLessThanOrEqualTo(String value) {
            addCriterion("domain_group <=", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupLike(String value) {
            addCriterion("domain_group like", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupNotLike(String value) {
            addCriterion("domain_group not like", value, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupIn(List<String> values) {
            addCriterion("domain_group in", values, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupNotIn(List<String> values) {
            addCriterion("domain_group not in", values, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupBetween(String value1, String value2) {
            addCriterion("domain_group between", value1, value2, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andDomainGroupNotBetween(String value1, String value2) {
            addCriterion("domain_group not between", value1, value2, "domainGroup");
            return (Criteria) this;
        }

        public Criteria andZhNameIsNull() {
            addCriterion("zh_name is null");
            return (Criteria) this;
        }

        public Criteria andZhNameIsNotNull() {
            addCriterion("zh_name is not null");
            return (Criteria) this;
        }

        public Criteria andZhNameEqualTo(String value) {
            addCriterion("zh_name =", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotEqualTo(String value) {
            addCriterion("zh_name <>", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameGreaterThan(String value) {
            addCriterion("zh_name >", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameGreaterThanOrEqualTo(String value) {
            addCriterion("zh_name >=", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLessThan(String value) {
            addCriterion("zh_name <", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLessThanOrEqualTo(String value) {
            addCriterion("zh_name <=", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameLike(String value) {
            addCriterion("zh_name like", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotLike(String value) {
            addCriterion("zh_name not like", value, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameIn(List<String> values) {
            addCriterion("zh_name in", values, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotIn(List<String> values) {
            addCriterion("zh_name not in", values, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameBetween(String value1, String value2) {
            addCriterion("zh_name between", value1, value2, "zhName");
            return (Criteria) this;
        }

        public Criteria andZhNameNotBetween(String value1, String value2) {
            addCriterion("zh_name not between", value1, value2, "zhName");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameIsNull() {
            addCriterion("sabre_session_reuseName is null");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameIsNotNull() {
            addCriterion("sabre_session_reuseName is not null");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameEqualTo(String value) {
            addCriterion("sabre_session_reuseName =", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameNotEqualTo(String value) {
            addCriterion("sabre_session_reuseName <>", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameGreaterThan(String value) {
            addCriterion("sabre_session_reuseName >", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameGreaterThanOrEqualTo(String value) {
            addCriterion("sabre_session_reuseName >=", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameLessThan(String value) {
            addCriterion("sabre_session_reuseName <", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameLessThanOrEqualTo(String value) {
            addCriterion("sabre_session_reuseName <=", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameLike(String value) {
            addCriterion("sabre_session_reuseName like", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameNotLike(String value) {
            addCriterion("sabre_session_reuseName not like", value, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameIn(List<String> values) {
            addCriterion("sabre_session_reuseName in", values, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameNotIn(List<String> values) {
            addCriterion("sabre_session_reuseName not in", values, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameBetween(String value1, String value2) {
            addCriterion("sabre_session_reuseName between", value1, value2, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andSabreSessionReusenameNotBetween(String value1, String value2) {
            addCriterion("sabre_session_reuseName not between", value1, value2, "sabreSessionReusename");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagIsNull() {
            addCriterion("common_show_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagIsNotNull() {
            addCriterion("common_show_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagEqualTo(Byte value) {
            addCriterion("common_show_flag =", value, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagNotEqualTo(Byte value) {
            addCriterion("common_show_flag <>", value, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagGreaterThan(Byte value) {
            addCriterion("common_show_flag >", value, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("common_show_flag >=", value, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagLessThan(Byte value) {
            addCriterion("common_show_flag <", value, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagLessThanOrEqualTo(Byte value) {
            addCriterion("common_show_flag <=", value, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagIn(List<Byte> values) {
            addCriterion("common_show_flag in", values, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagNotIn(List<Byte> values) {
            addCriterion("common_show_flag not in", values, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagBetween(Byte value1, Byte value2) {
            addCriterion("common_show_flag between", value1, value2, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andCommonShowFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("common_show_flag not between", value1, value2, "commonShowFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagIsNull() {
            addCriterion("white_black_flag is null");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagIsNotNull() {
            addCriterion("white_black_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagEqualTo(Byte value) {
            addCriterion("white_black_flag =", value, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagNotEqualTo(Byte value) {
            addCriterion("white_black_flag <>", value, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagGreaterThan(Byte value) {
            addCriterion("white_black_flag >", value, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("white_black_flag >=", value, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagLessThan(Byte value) {
            addCriterion("white_black_flag <", value, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagLessThanOrEqualTo(Byte value) {
            addCriterion("white_black_flag <=", value, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagIn(List<Byte> values) {
            addCriterion("white_black_flag in", values, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagNotIn(List<Byte> values) {
            addCriterion("white_black_flag not in", values, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagBetween(Byte value1, Byte value2) {
            addCriterion("white_black_flag between", value1, value2, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andWhiteBlackFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("white_black_flag not between", value1, value2, "whiteBlackFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagIsNull() {
            addCriterion("sale_info_flag is null");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagIsNotNull() {
            addCriterion("sale_info_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagEqualTo(Byte value) {
            addCriterion("sale_info_flag =", value, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagNotEqualTo(Byte value) {
            addCriterion("sale_info_flag <>", value, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagGreaterThan(Byte value) {
            addCriterion("sale_info_flag >", value, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("sale_info_flag >=", value, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagLessThan(Byte value) {
            addCriterion("sale_info_flag <", value, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagLessThanOrEqualTo(Byte value) {
            addCriterion("sale_info_flag <=", value, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagIn(List<Byte> values) {
            addCriterion("sale_info_flag in", values, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagNotIn(List<Byte> values) {
            addCriterion("sale_info_flag not in", values, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagBetween(Byte value1, Byte value2) {
            addCriterion("sale_info_flag between", value1, value2, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andSaleInfoFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("sale_info_flag not between", value1, value2, "saleInfoFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagIsNull() {
            addCriterion("on_line_flag is null");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagIsNotNull() {
            addCriterion("on_line_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagEqualTo(Byte value) {
            addCriterion("on_line_flag =", value, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagNotEqualTo(Byte value) {
            addCriterion("on_line_flag <>", value, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagGreaterThan(Byte value) {
            addCriterion("on_line_flag >", value, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("on_line_flag >=", value, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagLessThan(Byte value) {
            addCriterion("on_line_flag <", value, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagLessThanOrEqualTo(Byte value) {
            addCriterion("on_line_flag <=", value, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagIn(List<Byte> values) {
            addCriterion("on_line_flag in", values, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagNotIn(List<Byte> values) {
            addCriterion("on_line_flag not in", values, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagBetween(Byte value1, Byte value2) {
            addCriterion("on_line_flag between", value1, value2, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andOnLineFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("on_line_flag not between", value1, value2, "onLineFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagIsNull() {
            addCriterion("search_fare_flag is null");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagIsNotNull() {
            addCriterion("search_fare_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagEqualTo(Byte value) {
            addCriterion("search_fare_flag =", value, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagNotEqualTo(Byte value) {
            addCriterion("search_fare_flag <>", value, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagGreaterThan(Byte value) {
            addCriterion("search_fare_flag >", value, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("search_fare_flag >=", value, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagLessThan(Byte value) {
            addCriterion("search_fare_flag <", value, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagLessThanOrEqualTo(Byte value) {
            addCriterion("search_fare_flag <=", value, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagIn(List<Byte> values) {
            addCriterion("search_fare_flag in", values, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagNotIn(List<Byte> values) {
            addCriterion("search_fare_flag not in", values, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagBetween(Byte value1, Byte value2) {
            addCriterion("search_fare_flag between", value1, value2, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andSearchFareFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("search_fare_flag not between", value1, value2, "searchFareFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagIsNull() {
            addCriterion("fare_compare_gds_flag is null");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagIsNotNull() {
            addCriterion("fare_compare_gds_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagEqualTo(Byte value) {
            addCriterion("fare_compare_gds_flag =", value, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagNotEqualTo(Byte value) {
            addCriterion("fare_compare_gds_flag <>", value, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagGreaterThan(Byte value) {
            addCriterion("fare_compare_gds_flag >", value, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("fare_compare_gds_flag >=", value, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagLessThan(Byte value) {
            addCriterion("fare_compare_gds_flag <", value, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagLessThanOrEqualTo(Byte value) {
            addCriterion("fare_compare_gds_flag <=", value, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagIn(List<Byte> values) {
            addCriterion("fare_compare_gds_flag in", values, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagNotIn(List<Byte> values) {
            addCriterion("fare_compare_gds_flag not in", values, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagBetween(Byte value1, Byte value2) {
            addCriterion("fare_compare_gds_flag between", value1, value2, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareGdsFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("fare_compare_gds_flag not between", value1, value2, "fareCompareGdsFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagIsNull() {
            addCriterion("fare_compare_api_flag is null");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagIsNotNull() {
            addCriterion("fare_compare_api_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagEqualTo(Byte value) {
            addCriterion("fare_compare_api_flag =", value, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagNotEqualTo(Byte value) {
            addCriterion("fare_compare_api_flag <>", value, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagGreaterThan(Byte value) {
            addCriterion("fare_compare_api_flag >", value, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("fare_compare_api_flag >=", value, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagLessThan(Byte value) {
            addCriterion("fare_compare_api_flag <", value, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagLessThanOrEqualTo(Byte value) {
            addCriterion("fare_compare_api_flag <=", value, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagIn(List<Byte> values) {
            addCriterion("fare_compare_api_flag in", values, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagNotIn(List<Byte> values) {
            addCriterion("fare_compare_api_flag not in", values, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagBetween(Byte value1, Byte value2) {
            addCriterion("fare_compare_api_flag between", value1, value2, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andFareCompareApiFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("fare_compare_api_flag not between", value1, value2, "fareCompareApiFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagIsNull() {
            addCriterion("policy_group_flag is null");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagIsNotNull() {
            addCriterion("policy_group_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagEqualTo(Byte value) {
            addCriterion("policy_group_flag =", value, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagNotEqualTo(Byte value) {
            addCriterion("policy_group_flag <>", value, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagGreaterThan(Byte value) {
            addCriterion("policy_group_flag >", value, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("policy_group_flag >=", value, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagLessThan(Byte value) {
            addCriterion("policy_group_flag <", value, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagLessThanOrEqualTo(Byte value) {
            addCriterion("policy_group_flag <=", value, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagIn(List<Byte> values) {
            addCriterion("policy_group_flag in", values, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagNotIn(List<Byte> values) {
            addCriterion("policy_group_flag not in", values, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagBetween(Byte value1, Byte value2) {
            addCriterion("policy_group_flag between", value1, value2, "policyGroupFlag");
            return (Criteria) this;
        }

        public Criteria andPolicyGroupFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("policy_group_flag not between", value1, value2, "policyGroupFlag");
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