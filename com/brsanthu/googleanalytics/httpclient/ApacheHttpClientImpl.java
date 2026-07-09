/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.httpclient;

import com.a.a.b.ai;
import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.httpclient.BatchUrlEncodedFormEntity;
import com.brsanthu.googleanalytics.httpclient.HttpBatchRequest;
import com.brsanthu.googleanalytics.httpclient.HttpBatchResponse;
import com.brsanthu.googleanalytics.httpclient.HttpClient;
import com.brsanthu.googleanalytics.httpclient.HttpRequest;
import com.brsanthu.googleanalytics.httpclient.HttpResponse;
import com.brsanthu.googleanalytics.internal.GaUtils;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.a.b.b.f;
import org.apache.a.b.c.b;
import org.apache.a.b.c.d;
import org.apache.a.b.c.h;
import org.apache.a.h.b.e;
import org.apache.a.h.b.l;
import org.apache.a.h.c.p;
import org.apache.a.j.m;
import org.apache.a.k;
import org.apache.a.n;
import org.apache.a.s;
import org.apache.a.y;
import org.b.c;

public class ApacheHttpClientImpl
implements HttpClient {
    private static final org.b.b logger = c.a(ApacheHttpClientImpl.class);
    private e apacheHttpClient;

    public ApacheHttpClientImpl(GoogleAnalyticsConfig googleAnalyticsConfig) {
        this.apacheHttpClient = this.createHttpClient(googleAnalyticsConfig);
    }

    @Override
    public void close() {
        try {
            this.apacheHttpClient.close();
            return;
        } catch (IOException iOException) {
            return;
        }
    }

    protected e createHttpClient(GoogleAnalyticsConfig googleAnalyticsConfig) {
        Object object = new p();
        ((p)object).a(Math.max(googleAnalyticsConfig.getMaxHttpConnectionsPerRoute(), 1));
        object = l.a().a((org.apache.a.e.h)object);
        if (GaUtils.isNotEmpty(googleAnalyticsConfig.getUserAgent())) {
            ((l)object).a(googleAnalyticsConfig.getUserAgent());
        }
        if (GaUtils.isNotEmpty(googleAnalyticsConfig.getProxyHost())) {
            ((l)object).a(new n(googleAnalyticsConfig.getProxyHost(), googleAnalyticsConfig.getProxyPort()));
            if (GaUtils.isNotEmpty(googleAnalyticsConfig.getProxyUserName())) {
                org.apache.a.h.b.d d2 = new org.apache.a.h.b.d();
                d2.a(new org.apache.a.a.d(googleAnalyticsConfig.getProxyHost(), googleAnalyticsConfig.getProxyPort()), new org.apache.a.a.p(googleAnalyticsConfig.getProxyUserName(), googleAnalyticsConfig.getProxyPassword()));
                ((l)object).a(d2);
            }
        }
        return ((l)object).b();
    }

    @Override
    public boolean isBatchSupported() {
        return true;
    }

    protected b execute(String object, k k2) {
        object = new h((String)object);
        ((d)object).a(k2);
        return this.apacheHttpClient.a((org.apache.a.b.c.l)object);
    }

    protected List<y> createNameValuePairs(HttpRequest httpRequest) {
        ArrayList<y> arrayList = new ArrayList<y>();
        httpRequest.getBodyParams().forEach((string, string2) -> arrayList.add(new m((String)string, (String)string2)));
        return arrayList;
    }

    /*
     * Loose catch block
     */
    @Override
    public HttpResponse post(HttpRequest httpRequest) {
        HttpResponse httpResponse;
        block18: {
            httpResponse = new HttpResponse();
            s s2 = null;
            s2 = this.execute(httpRequest.getUrl(), new f(this.createNameValuePairs(httpRequest), StandardCharsets.UTF_8));
            httpResponse.setStatusCode(s2.a().b());
            k k2 = s2.b();
            try {
                ai.a(k2);
            } catch (IOException iOException) {}
            try {
                s2.close();
            } catch (Exception exception) {}
            break block18;
            catch (Exception exception) {
                Object object;
                block17: {
                    try {
                        object = exception;
                        if (exception instanceof UnknownHostException) {
                            logger.c("Couldn't connect to Google Analytics. Internet may not be available. " + ((Throwable)object).toString());
                            break block17;
                        }
                        logger.b("Exception while sending the Google Analytics tracker request ".concat(String.valueOf(httpRequest)), (Throwable)object);
                    } catch (Throwable throwable) {
                        k k3 = s2.b();
                        try {
                            ai.a(k3);
                        } catch (IOException iOException) {}
                        try {
                            s2.close();
                        } catch (Exception exception2) {}
                        throw throwable;
                    }
                }
                object = s2.b();
                try {
                    ai.a((k)object);
                } catch (IOException iOException) {}
                try {
                    s2.close();
                } catch (Exception exception3) {}
            }
        }
        return httpResponse;
    }

    /*
     * Loose catch block
     */
    @Override
    public HttpBatchResponse postBatch(HttpBatchRequest httpBatchRequest) {
        HttpBatchResponse httpBatchResponse;
        block18: {
            httpBatchResponse = new HttpBatchResponse();
            s s2 = null;
            Object object = httpBatchRequest.getRequests().stream().map(this::createNameValuePairs).collect(Collectors.toList());
            s2 = this.execute(httpBatchRequest.getUrl(), new BatchUrlEncodedFormEntity((List<List<y>>)object));
            httpBatchResponse.setStatusCode(s2.a().b());
            object = s2.b();
            try {
                ai.a((k)object);
            } catch (IOException iOException) {}
            try {
                s2.close();
            } catch (Exception exception) {}
            break block18;
            catch (Exception exception) {
                Object object2;
                block17: {
                    try {
                        object2 = exception;
                        if (exception instanceof UnknownHostException) {
                            logger.c("Couldn't connect to Google Analytics. Internet may not be available. " + ((Throwable)object2).toString());
                            break block17;
                        }
                        logger.b("Exception while sending the Google Analytics tracker request ".concat(String.valueOf(httpBatchRequest)), (Throwable)object2);
                    } catch (Throwable throwable) {
                        k k2 = s2.b();
                        try {
                            ai.a(k2);
                        } catch (IOException iOException) {}
                        try {
                            s2.close();
                        } catch (Exception exception2) {}
                        throw throwable;
                    }
                }
                object2 = s2.b();
                try {
                    ai.a((k)object2);
                } catch (IOException iOException) {}
                try {
                    s2.close();
                } catch (Exception exception3) {}
            }
        }
        return httpBatchResponse;
    }
}

