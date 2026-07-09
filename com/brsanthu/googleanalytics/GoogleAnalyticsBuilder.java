/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics;

import com.brsanthu.googleanalytics.GoogleAnalytics;
import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.discovery.DefaultRequestParameterDiscoverer;
import com.brsanthu.googleanalytics.httpclient.ApacheHttpClientImpl;
import com.brsanthu.googleanalytics.httpclient.HttpClient;
import com.brsanthu.googleanalytics.internal.GaUtils;
import com.brsanthu.googleanalytics.internal.GoogleAnalyticsImpl;
import com.brsanthu.googleanalytics.internal.GoogleAnalyticsThreadFactory;
import com.brsanthu.googleanalytics.request.DefaultRequest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GoogleAnalyticsBuilder {
    private GoogleAnalyticsConfig config = new GoogleAnalyticsConfig();
    private DefaultRequest defaultRequest = new DefaultRequest();
    private HttpClient httpClient;
    private ExecutorService executor;

    public GoogleAnalyticsBuilder withConfig(GoogleAnalyticsConfig googleAnalyticsConfig) {
        this.config = GaUtils.firstNotNull(googleAnalyticsConfig, new GoogleAnalyticsConfig());
        return this;
    }

    public GoogleAnalyticsBuilder withTrackingId(String string) {
        this.defaultRequest.trackingId(string);
        return this;
    }

    public GoogleAnalyticsBuilder withAppName(String string) {
        this.defaultRequest.applicationName(string);
        return this;
    }

    public GoogleAnalyticsBuilder withAppVersion(String string) {
        this.defaultRequest.applicationVersion(string);
        return this;
    }

    public GoogleAnalyticsBuilder withDefaultRequest(DefaultRequest defaultRequest) {
        this.defaultRequest = GaUtils.firstNotNull(defaultRequest, new DefaultRequest());
        return this;
    }

    public GoogleAnalyticsBuilder withExecutor(ExecutorService executorService) {
        this.executor = executorService;
        return this;
    }

    public GoogleAnalyticsBuilder withHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public GoogleAnalytics build() {
        if (this.config.isDiscoverRequestParameters()) {
            GaUtils.firstNotNull(this.config.getRequestParameterDiscoverer(), DefaultRequestParameterDiscoverer.INSTANCE).discoverParameters(this.config, this.defaultRequest);
        }
        return new GoogleAnalyticsImpl(this.config, this.defaultRequest, this.createHttpClient(), this.createExecutor());
    }

    protected HttpClient createHttpClient() {
        if (this.httpClient != null) {
            return this.httpClient;
        }
        return new ApacheHttpClientImpl(this.config);
    }

    protected ExecutorService createExecutor() {
        if (this.executor != null) {
            return this.executor;
        }
        return new ThreadPoolExecutor(this.config.getMinThreads(), this.config.getMaxThreads(), this.config.getThreadTimeoutSecs(), TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(this.config.getThreadQueueSize()), this.createThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    protected ThreadFactory createThreadFactory() {
        return new GoogleAnalyticsThreadFactory(this.config.getThreadNameFormat());
    }
}

