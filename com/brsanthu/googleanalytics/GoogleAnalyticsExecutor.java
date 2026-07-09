/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsResponse;
import java.util.concurrent.Future;

public interface GoogleAnalyticsExecutor {
    public GoogleAnalyticsResponse post(GoogleAnalyticsRequest<?> var1);

    public Future<GoogleAnalyticsResponse> postAsync(GoogleAnalyticsRequest<?> var1);
}

