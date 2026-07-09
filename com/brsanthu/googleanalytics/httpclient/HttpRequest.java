/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.httpclient;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String contentType;
    private String method;
    private String url;
    private Map<String, String> bodyParams = new HashMap<String, String>();

    public HttpRequest(String string) {
        this.setUrl(string);
    }

    public HttpRequest post() {
        this.setMethod("POST");
        return this;
    }

    public HttpRequest addBodyParam(String string, String string2) {
        this.bodyParams.put(string, string2);
        return this;
    }

    public Map<String, String> getBodyParams() {
        return this.bodyParams;
    }

    public String getContentType() {
        return this.contentType;
    }

    public HttpRequest setContentType(String string) {
        this.contentType = string;
        return this;
    }

    public String getMethod() {
        return this.method;
    }

    public HttpRequest setMethod(String string) {
        this.method = string;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public HttpRequest setUrl(String string) {
        this.url = string;
        return this;
    }
}

