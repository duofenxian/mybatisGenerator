package com.flight.inter.otaadapter.config.model;

public class DomainConfig {
    private Long id;

    private String domainName;

    private String domainGroup;

    private String zhName;

    private String sabreSessionReusename;

    private Byte commonShowFlag;

    private Byte whiteBlackFlag;

    private Byte saleInfoFlag;

    private Byte onLineFlag;

    private Byte searchFareFlag;

    private Byte fareCompareGdsFlag;

    private Byte fareCompareApiFlag;

    private Byte policyGroupFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName == null ? null : domainName.trim();
    }

    public String getDomainGroup() {
        return domainGroup;
    }

    public void setDomainGroup(String domainGroup) {
        this.domainGroup = domainGroup == null ? null : domainGroup.trim();
    }

    public String getZhName() {
        return zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName == null ? null : zhName.trim();
    }

    public String getSabreSessionReusename() {
        return sabreSessionReusename;
    }

    public void setSabreSessionReusename(String sabreSessionReusename) {
        this.sabreSessionReusename = sabreSessionReusename == null ? null : sabreSessionReusename.trim();
    }

    public Byte getCommonShowFlag() {
        return commonShowFlag;
    }

    public void setCommonShowFlag(Byte commonShowFlag) {
        this.commonShowFlag = commonShowFlag;
    }

    public Byte getWhiteBlackFlag() {
        return whiteBlackFlag;
    }

    public void setWhiteBlackFlag(Byte whiteBlackFlag) {
        this.whiteBlackFlag = whiteBlackFlag;
    }

    public Byte getSaleInfoFlag() {
        return saleInfoFlag;
    }

    public void setSaleInfoFlag(Byte saleInfoFlag) {
        this.saleInfoFlag = saleInfoFlag;
    }

    public Byte getOnLineFlag() {
        return onLineFlag;
    }

    public void setOnLineFlag(Byte onLineFlag) {
        this.onLineFlag = onLineFlag;
    }

    public Byte getSearchFareFlag() {
        return searchFareFlag;
    }

    public void setSearchFareFlag(Byte searchFareFlag) {
        this.searchFareFlag = searchFareFlag;
    }

    public Byte getFareCompareGdsFlag() {
        return fareCompareGdsFlag;
    }

    public void setFareCompareGdsFlag(Byte fareCompareGdsFlag) {
        this.fareCompareGdsFlag = fareCompareGdsFlag;
    }

    public Byte getFareCompareApiFlag() {
        return fareCompareApiFlag;
    }

    public void setFareCompareApiFlag(Byte fareCompareApiFlag) {
        this.fareCompareApiFlag = fareCompareApiFlag;
    }

    public Byte getPolicyGroupFlag() {
        return policyGroupFlag;
    }

    public void setPolicyGroupFlag(Byte policyGroupFlag) {
        this.policyGroupFlag = policyGroupFlag;
    }
}