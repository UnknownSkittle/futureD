/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.httpclient;

import com.brsanthu.googleanalytics.httpclient.HttpRequest;
import java.util.ArrayList;
import java.util.List;

public class HttpBatchRequest {
    private String url;
    private List<HttpRequest> requests = new ArrayList<HttpRequest>();

    public HttpBatchRequest addRequest(HttpRequest httpRequest) {
        this.requests.add(httpRequest);
        return this;
    }

    public List<HttpRequest> getRequests() {
        return this.requests;
    }

    public HttpBatchRequest setRequests(List<HttpRequest> list) {
        this.requests = list;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public HttpBatchRequest setUrl(String string) {
        this.url = string;
        return this;
    }
}

