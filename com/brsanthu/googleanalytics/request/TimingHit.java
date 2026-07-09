/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class TimingHit
extends GoogleAnalyticsRequest<TimingHit> {
    public TimingHit() {
        super("timing");
    }

    public TimingHit userTimingCategory(String string) {
        this.setString(GoogleAnalyticsParameter.USER_TIMING_CATEGORY, string);
        return this;
    }

    public String userTimingCategory() {
        return this.getString(GoogleAnalyticsParameter.USER_TIMING_CATEGORY);
    }

    public TimingHit userTimingVariableName(String string) {
        this.setString(GoogleAnalyticsParameter.USER_TIMING_VARIABLE_NAME, string);
        return this;
    }

    public String userTimingVariableName() {
        return this.getString(GoogleAnalyticsParameter.USER_TIMING_VARIABLE_NAME);
    }

    public TimingHit userTimingTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.USER_TIMING_TIME, n2);
        return this;
    }

    public Integer userTimingTime() {
        return this.getInteger(GoogleAnalyticsParameter.USER_TIMING_TIME);
    }

    public TimingHit userTimingLabel(String string) {
        this.setString(GoogleAnalyticsParameter.USER_TIMING_LABEL, string);
        return this;
    }

    public String userTimingLabel() {
        return this.getString(GoogleAnalyticsParameter.USER_TIMING_LABEL);
    }

    public TimingHit pageLoadTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.PAGE_LOAD_TIME, n2);
        return this;
    }

    public Integer pageLoadTime() {
        return this.getInteger(GoogleAnalyticsParameter.PAGE_LOAD_TIME);
    }

    public TimingHit dnsTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.DNS_TIME, n2);
        return this;
    }

    public Integer dnsTime() {
        return this.getInteger(GoogleAnalyticsParameter.DNS_TIME);
    }

    public TimingHit pageDownloadTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.PAGE_DOWNLOAD_TIME, n2);
        return this;
    }

    public Integer pageDownloadTime() {
        return this.getInteger(GoogleAnalyticsParameter.PAGE_DOWNLOAD_TIME);
    }

    public TimingHit redirectResponseTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.REDIRECT_RESPONSE_TIME, n2);
        return this;
    }

    public Integer redirectResponseTime() {
        return this.getInteger(GoogleAnalyticsParameter.REDIRECT_RESPONSE_TIME);
    }

    public TimingHit tcpConnectTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.TCP_CONNECT_TIME, n2);
        return this;
    }

    public Integer tcpConnectTime() {
        return this.getInteger(GoogleAnalyticsParameter.TCP_CONNECT_TIME);
    }

    public TimingHit serverResponseTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.SERVER_RESPONSE_TIME, n2);
        return this;
    }

    public Integer serverResponseTime() {
        return this.getInteger(GoogleAnalyticsParameter.SERVER_RESPONSE_TIME);
    }
}

