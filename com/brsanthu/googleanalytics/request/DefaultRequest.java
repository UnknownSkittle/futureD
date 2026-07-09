/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.internal.GaUtils;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;
import java.util.UUID;

public class DefaultRequest
extends GoogleAnalyticsRequest<DefaultRequest> {
    private static final String DEFAULT_CLIENT_ID = UUID.randomUUID().toString();

    public DefaultRequest() {
        this(null, null, null, null);
    }

    public DefaultRequest(String string) {
        this(string, null, null, null);
    }

    public DefaultRequest(String string, String string2, String string3, String string4) {
        this.hitType(GaUtils.isBlank(string) ? "pageview" : string);
        this.trackingId(string2);
        this.applicationName(string3);
        this.applicationVersion(string4);
        this.clientId(DEFAULT_CLIENT_ID);
    }

    public DefaultRequest eventCategory(String string) {
        this.setString(GoogleAnalyticsParameter.EVENT_CATEGORY, string);
        return this;
    }

    public String eventCategory() {
        return this.getString(GoogleAnalyticsParameter.EVENT_CATEGORY);
    }

    public DefaultRequest eventAction(String string) {
        this.setString(GoogleAnalyticsParameter.EVENT_ACTION, string);
        return this;
    }

    public String eventAction() {
        return this.getString(GoogleAnalyticsParameter.EVENT_ACTION);
    }

    public DefaultRequest eventLabel(String string) {
        this.setString(GoogleAnalyticsParameter.EVENT_LABEL, string);
        return this;
    }

    public String eventLabel() {
        return this.getString(GoogleAnalyticsParameter.EVENT_LABEL);
    }

    public DefaultRequest eventValue(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.EVENT_VALUE, n2);
        return this;
    }

    public Integer eventValue() {
        return this.getInteger(GoogleAnalyticsParameter.EVENT_VALUE);
    }

    public DefaultRequest exceptionDescription(String string) {
        this.setString(GoogleAnalyticsParameter.EXCEPTION_DESCRIPTION, string);
        return this;
    }

    public String exceptionDescription() {
        return this.getString(GoogleAnalyticsParameter.EXCEPTION_DESCRIPTION);
    }

    public DefaultRequest exceptionFatal(Boolean bl2) {
        this.setBoolean(GoogleAnalyticsParameter.EXCEPTION_FATAL, bl2);
        return this;
    }

    public Boolean exceptionFatal() {
        return this.getBoolean(GoogleAnalyticsParameter.EXCEPTION_FATAL);
    }

    public DefaultRequest itemName(String string) {
        this.setString(GoogleAnalyticsParameter.ITEM_NAME, string);
        return this;
    }

    public String itemName() {
        return this.getString(GoogleAnalyticsParameter.ITEM_NAME);
    }

    public DefaultRequest itemPrice(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.ITEM_PRICE, d2);
        return this;
    }

    public Double itemPrice() {
        return this.getDouble(GoogleAnalyticsParameter.ITEM_PRICE);
    }

    public DefaultRequest itemQuantity(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.ITEM_QUANTITY, n2);
        return this;
    }

    public Integer itemQuantity() {
        return this.getInteger(GoogleAnalyticsParameter.ITEM_QUANTITY);
    }

    public DefaultRequest itemCode(String string) {
        this.setString(GoogleAnalyticsParameter.ITEM_CODE, string);
        return this;
    }

    public String itemCode() {
        return this.getString(GoogleAnalyticsParameter.ITEM_CODE);
    }

    public DefaultRequest itemCategory(String string) {
        this.setString(GoogleAnalyticsParameter.ITEM_CATEGORY, string);
        return this;
    }

    public String itemCategory() {
        return this.getString(GoogleAnalyticsParameter.ITEM_CATEGORY);
    }

    public DefaultRequest currencyCode(String string) {
        this.setString(GoogleAnalyticsParameter.CURRENCY_CODE, string);
        return this;
    }

    public String currencyCode() {
        return this.getString(GoogleAnalyticsParameter.CURRENCY_CODE);
    }

    public DefaultRequest socialNetwork(String string) {
        this.setString(GoogleAnalyticsParameter.SOCIAL_NETWORK, string);
        return this;
    }

    public String socialNetwork() {
        return this.getString(GoogleAnalyticsParameter.SOCIAL_NETWORK);
    }

    public DefaultRequest socialAction(String string) {
        this.setString(GoogleAnalyticsParameter.SOCIAL_ACTION, string);
        return this;
    }

    public String socialAction() {
        return this.getString(GoogleAnalyticsParameter.SOCIAL_ACTION);
    }

    public DefaultRequest socialActionTarget(String string) {
        this.setString(GoogleAnalyticsParameter.SOCIAL_ACTION_TARGET, string);
        return this;
    }

    public String socialActionTarget() {
        return this.getString(GoogleAnalyticsParameter.SOCIAL_ACTION_TARGET);
    }

    public DefaultRequest userTimingCategory(String string) {
        this.setString(GoogleAnalyticsParameter.USER_TIMING_CATEGORY, string);
        return this;
    }

    public String userTimingCategory() {
        return this.getString(GoogleAnalyticsParameter.USER_TIMING_CATEGORY);
    }

    public DefaultRequest userTimingVariableName(String string) {
        this.setString(GoogleAnalyticsParameter.USER_TIMING_VARIABLE_NAME, string);
        return this;
    }

    public String userTimingVariableName() {
        return this.getString(GoogleAnalyticsParameter.USER_TIMING_VARIABLE_NAME);
    }

    public DefaultRequest userTimingTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.USER_TIMING_TIME, n2);
        return this;
    }

    public Integer userTimingTime() {
        return this.getInteger(GoogleAnalyticsParameter.USER_TIMING_TIME);
    }

    public DefaultRequest userTimingLabel(String string) {
        this.setString(GoogleAnalyticsParameter.USER_TIMING_LABEL, string);
        return this;
    }

    public String userTimingLabel() {
        return this.getString(GoogleAnalyticsParameter.USER_TIMING_LABEL);
    }

    public DefaultRequest pageLoadTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.PAGE_LOAD_TIME, n2);
        return this;
    }

    public Integer pageLoadTime() {
        return this.getInteger(GoogleAnalyticsParameter.PAGE_LOAD_TIME);
    }

    public DefaultRequest dnsTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.DNS_TIME, n2);
        return this;
    }

    public Integer dnsTime() {
        return this.getInteger(GoogleAnalyticsParameter.DNS_TIME);
    }

    public DefaultRequest pageDownloadTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.PAGE_DOWNLOAD_TIME, n2);
        return this;
    }

    public Integer pageDownloadTime() {
        return this.getInteger(GoogleAnalyticsParameter.PAGE_DOWNLOAD_TIME);
    }

    public DefaultRequest redirectResponseTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.REDIRECT_RESPONSE_TIME, n2);
        return this;
    }

    public Integer redirectResponseTime() {
        return this.getInteger(GoogleAnalyticsParameter.REDIRECT_RESPONSE_TIME);
    }

    public DefaultRequest tcpConnectTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.TCP_CONNECT_TIME, n2);
        return this;
    }

    public Integer tcpConnectTime() {
        return this.getInteger(GoogleAnalyticsParameter.TCP_CONNECT_TIME);
    }

    public DefaultRequest serverResponseTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.SERVER_RESPONSE_TIME, n2);
        return this;
    }

    public Integer serverResponseTime() {
        return this.getInteger(GoogleAnalyticsParameter.SERVER_RESPONSE_TIME);
    }

    public DefaultRequest txId(String string) {
        this.setString(GoogleAnalyticsParameter.TRANSACTION_ID, string);
        return this;
    }

    public String txId() {
        return this.getString(GoogleAnalyticsParameter.TRANSACTION_ID);
    }

    public DefaultRequest txAffiliation(String string) {
        this.setString(GoogleAnalyticsParameter.TRANSACTION_AFFILIATION, string);
        return this;
    }

    public String txAffiliation() {
        return this.getString(GoogleAnalyticsParameter.TRANSACTION_AFFILIATION);
    }

    public DefaultRequest txRevenue(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.TRANSACTION_REVENUE, d2);
        return this;
    }

    public Double txRevenue() {
        return this.getDouble(GoogleAnalyticsParameter.TRANSACTION_REVENUE);
    }

    public DefaultRequest txShipping(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.TRANSACTION_SHIPPING, d2);
        return this;
    }

    public Double txShipping() {
        return this.getDouble(GoogleAnalyticsParameter.TRANSACTION_SHIPPING);
    }

    public DefaultRequest txTax(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.TRANSACTION_TAX, d2);
        return this;
    }

    public Double txTax() {
        return this.getDouble(GoogleAnalyticsParameter.TRANSACTION_TAX);
    }
}

