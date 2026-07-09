/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.httpclient;

import com.brsanthu.googleanalytics.httpclient.HttpBatchRequest;
import com.brsanthu.googleanalytics.httpclient.HttpBatchResponse;
import com.brsanthu.googleanalytics.httpclient.HttpRequest;
import com.brsanthu.googleanalytics.httpclient.HttpResponse;

public interface HttpClient
extends AutoCloseable {
    public HttpResponse post(HttpRequest var1);

    public boolean isBatchSupported();

    public HttpBatchResponse postBatch(HttpBatchRequest var1);
}

