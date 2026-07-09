/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.httpclient;

public class HttpResponse {
    private int statusCode;

    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpResponse setStatusCode(int n2) {
        this.statusCode = n2;
        return this;
    }
}

