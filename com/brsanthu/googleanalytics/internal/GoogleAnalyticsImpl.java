/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.internal;

import com.brsanthu.googleanalytics.GoogleAnalytics;
import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.GoogleAnalyticsExecutor;
import com.brsanthu.googleanalytics.GoogleAnalyticsStats;
import com.brsanthu.googleanalytics.httpclient.HttpBatchRequest;
import com.brsanthu.googleanalytics.httpclient.HttpClient;
import com.brsanthu.googleanalytics.httpclient.HttpRequest;
import com.brsanthu.googleanalytics.httpclient.HttpResponse;
import com.brsanthu.googleanalytics.internal.GaUtils;
import com.brsanthu.googleanalytics.internal.GoogleAnalyticsStatsImpl;
import com.brsanthu.googleanalytics.request.DefaultRequest;
import com.brsanthu.googleanalytics.request.EventHit;
import com.brsanthu.googleanalytics.request.ExceptionHit;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsResponse;
import com.brsanthu.googleanalytics.request.ItemHit;
import com.brsanthu.googleanalytics.request.PageViewHit;
import com.brsanthu.googleanalytics.request.ScreenViewHit;
import com.brsanthu.googleanalytics.request.SocialHit;
import com.brsanthu.googleanalytics.request.TimingHit;
import com.brsanthu.googleanalytics.request.TransactionHit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.b.b;
import org.b.c;

public class GoogleAnalyticsImpl
implements GoogleAnalytics,
GoogleAnalyticsExecutor {
    protected static final b logger = c.a(GoogleAnalyticsImpl.class);
    protected final GoogleAnalyticsConfig config;
    protected final DefaultRequest defaultRequest;
    protected final HttpClient httpClient;
    protected final ExecutorService executor;
    protected GoogleAnalyticsStatsImpl stats = new GoogleAnalyticsStatsImpl();
    protected List<HttpRequest> currentBatch = new ArrayList<HttpRequest>();

    public GoogleAnalyticsImpl(GoogleAnalyticsConfig googleAnalyticsConfig, DefaultRequest defaultRequest, HttpClient httpClient, ExecutorService executorService) {
        this.config = googleAnalyticsConfig;
        this.defaultRequest = defaultRequest;
        this.httpClient = httpClient;
        this.executor = executorService;
    }

    @Override
    public GoogleAnalyticsConfig getConfig() {
        return this.config;
    }

    public DefaultRequest getDefaultRequest() {
        return this.defaultRequest;
    }

    @Override
    public Future<GoogleAnalyticsResponse> postAsync(GoogleAnalyticsRequest<?> googleAnalyticsRequest) {
        if (!this.config.isEnabled()) {
            return null;
        }
        return this.executor.submit(() -> this.post(googleAnalyticsRequest));
    }

    @Override
    public GoogleAnalyticsResponse post(GoogleAnalyticsRequest<?> googleAnalyticsRequest) {
        GoogleAnalyticsResponse googleAnalyticsResponse = new GoogleAnalyticsResponse();
        if (!this.config.isEnabled()) {
            return googleAnalyticsResponse;
        }
        try {
            googleAnalyticsResponse = this.config.isBatchingEnabled() ? this.postBatch(googleAnalyticsRequest) : this.postSingle(googleAnalyticsRequest);
        } catch (Exception exception) {
            logger.b("Exception while sending the Google Analytics tracker request ".concat(String.valueOf(googleAnalyticsRequest)), exception);
        }
        return googleAnalyticsResponse;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected GoogleAnalyticsResponse postBatch(GoogleAnalyticsRequest<?> object) {
        GoogleAnalyticsResponse googleAnalyticsResponse = new GoogleAnalyticsResponse();
        HttpRequest httpRequest = this.createHttpRequest((GoogleAnalyticsRequest<?>)object);
        googleAnalyticsResponse.setRequestParams(httpRequest.getBodyParams());
        if (this.config.isGatherStats()) {
            this.gatherStats((GoogleAnalyticsRequest<?>)object);
        }
        object = this.currentBatch;
        synchronized (object) {
            this.currentBatch.add(httpRequest);
        }
        this.submitBatch(false);
        return googleAnalyticsResponse;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void submitBatch(boolean bl2) {
        if (this.currentBatch.isEmpty()) {
            return;
        }
        if (this.isSubmitBatch(bl2)) {
            List<HttpRequest> list = this.currentBatch;
            synchronized (list) {
                if (this.isSubmitBatch(bl2)) {
                    logger.a("Submitting a batch of " + this.currentBatch.size() + " requests to GA");
                    this.httpClient.postBatch(new HttpBatchRequest().setUrl(this.config.getBatchUrl()).setRequests(this.currentBatch));
                    this.currentBatch.clear();
                }
                return;
            }
        }
    }

    private boolean isSubmitBatch(boolean bl2) {
        return bl2 || this.currentBatch.size() >= this.config.getBatchSize();
    }

    protected GoogleAnalyticsResponse postSingle(GoogleAnalyticsRequest<?> googleAnalyticsRequest) {
        HttpRequest httpRequest = this.createHttpRequest(googleAnalyticsRequest);
        HttpResponse httpResponse = this.httpClient.post(httpRequest);
        GoogleAnalyticsResponse googleAnalyticsResponse = new GoogleAnalyticsResponse();
        googleAnalyticsResponse.setStatusCode(httpResponse.getStatusCode());
        googleAnalyticsResponse.setRequestParams(httpRequest.getBodyParams());
        if (this.config.isGatherStats()) {
            this.gatherStats(googleAnalyticsRequest);
        }
        return googleAnalyticsResponse;
    }

    private HttpRequest createHttpRequest(GoogleAnalyticsRequest<?> googleAnalyticsRequest) {
        HttpRequest httpRequest = new HttpRequest(this.config.getUrl());
        this.processParameters(googleAnalyticsRequest, httpRequest);
        this.processCustomDimensionParameters(googleAnalyticsRequest, httpRequest);
        this.processCustomMetricParameters(googleAnalyticsRequest, httpRequest);
        return httpRequest;
    }

    protected void processParameters(GoogleAnalyticsRequest<?> object, HttpRequest httpRequest) {
        object = ((GoogleAnalyticsRequest)object).getParameters();
        Map<GoogleAnalyticsParameter, String> map = this.defaultRequest.getParameters();
        for (GoogleAnalyticsParameter googleAnalyticsParameter : map.keySet()) {
            String string = (String)object.get((Object)googleAnalyticsParameter);
            String string2 = map.get((Object)googleAnalyticsParameter);
            if (!GaUtils.isEmpty(string) || GaUtils.isEmpty(string2)) continue;
            object.put(googleAnalyticsParameter, string2);
        }
        for (GoogleAnalyticsParameter googleAnalyticsParameter : object.keySet()) {
            httpRequest.addBodyParam(googleAnalyticsParameter.getParameterName(), (String)object.get((Object)googleAnalyticsParameter));
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void processCustomDimensionParameters(GoogleAnalyticsRequest<?> object2, HttpRequest httpRequest) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : this.defaultRequest.customDimensions().keySet()) {
            hashMap.put(string, this.defaultRequest.customDimensions().get(string));
        }
        Map<String, String> map = ((GoogleAnalyticsRequest)object2).customDimensions();
        for (String string : map.keySet()) {
            hashMap.put(string, (String)map.get(string));
        }
        for (String string : hashMap.keySet()) {
            void var2_6;
            var2_6.addBodyParam(string, (String)hashMap.get(string));
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void processCustomMetricParameters(GoogleAnalyticsRequest<?> object2, HttpRequest httpRequest) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string : this.defaultRequest.custommMetrics().keySet()) {
            hashMap.put(string, this.defaultRequest.custommMetrics().get(string));
        }
        Map<String, String> map = ((GoogleAnalyticsRequest)object2).custommMetrics();
        for (String string : map.keySet()) {
            hashMap.put(string, (String)map.get(string));
        }
        for (String string : hashMap.keySet()) {
            void var2_6;
            var2_6.addBodyParam(string, (String)hashMap.get(string));
        }
    }

    protected void gatherStats(GoogleAnalyticsRequest<?> object) {
        if ("pageview".equalsIgnoreCase((String)(object = ((GoogleAnalyticsRequest)object).hitType()))) {
            this.stats.pageViewHit();
            return;
        }
        if ("screenview".equals(object)) {
            this.stats.screenViewHit();
            return;
        }
        if ("event".equals(object)) {
            this.stats.eventHit();
            return;
        }
        if ("item".equals(object)) {
            this.stats.itemHit();
            return;
        }
        if ("transaction".equals(object)) {
            this.stats.transactionHit();
            return;
        }
        if ("social".equals(object)) {
            this.stats.socialHit();
            return;
        }
        if ("timing".equals(object)) {
            this.stats.timingHit();
            return;
        }
        if ("exception".equals(object)) {
            this.stats.exceptionHit();
        }
    }

    @Override
    public void close() {
        this.flush();
        try {
            this.executor.shutdown();
        } catch (Exception exception) {}
        try {
            this.httpClient.close();
            return;
        } catch (Exception exception) {
            return;
        }
    }

    @Override
    public GoogleAnalyticsStats getStats() {
        return this.stats;
    }

    @Override
    public void resetStats() {
        this.stats = new GoogleAnalyticsStatsImpl();
    }

    @Override
    public EventHit event() {
        return (EventHit)new EventHit().setExecutor(this);
    }

    @Override
    public ExceptionHit exception() {
        return (ExceptionHit)new ExceptionHit().setExecutor(this);
    }

    @Override
    public ItemHit item() {
        return (ItemHit)new ItemHit().setExecutor(this);
    }

    @Override
    public PageViewHit pageView() {
        return (PageViewHit)new PageViewHit().setExecutor(this);
    }

    @Override
    public PageViewHit pageView(String string, String string2) {
        return (PageViewHit)((PageViewHit)this.pageView().documentUrl(string)).documentTitle(string2);
    }

    @Override
    public PageViewHit pageView(String string, String string2, String string3) {
        return (PageViewHit)this.pageView(string, string2).contentDescription(string3);
    }

    @Override
    public ScreenViewHit screenView() {
        return (ScreenViewHit)new ScreenViewHit().setExecutor(this);
    }

    @Override
    public ScreenViewHit screenView(String string, String string2) {
        return ((ScreenViewHit)this.screenView().applicationName(string)).screenName(string2);
    }

    @Override
    public SocialHit social() {
        return (SocialHit)new SocialHit().setExecutor(this);
    }

    @Override
    public SocialHit social(String string, String string2, String string3) {
        return this.social().socialNetwork(string).socialAction(string2).socialActionTarget(string3);
    }

    @Override
    public TimingHit timing() {
        return (TimingHit)new TimingHit().setExecutor(this);
    }

    @Override
    public TransactionHit transaction() {
        return (TransactionHit)new TransactionHit().setExecutor(this);
    }

    @Override
    public void ifEnabled(Runnable runnable) {
        if (!this.config.isEnabled()) {
            return;
        }
        runnable.run();
    }

    @Override
    public void flush() {
        this.submitBatch(true);
    }
}

