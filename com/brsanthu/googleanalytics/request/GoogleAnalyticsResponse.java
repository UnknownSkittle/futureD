/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import java.util.Map;

public class GoogleAnalyticsResponse {
    private int statusCode = 200;
    private Map<String, String> requestParams = null;

    public Map<String, String> getRequestParams() {
        return this.requestParams;
    }

    public void setRequestParams(Map<String, String> map) {
        this.requestParams = map;
    }

    public void setStatusCode(int n2) {
        this.statusCode = n2;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response [statusCode=");
        stringBuilder.append(this.statusCode);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

