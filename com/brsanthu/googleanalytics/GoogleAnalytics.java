/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics;

import com.brsanthu.googleanalytics.GoogleAnalyticsBuilder;
import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.GoogleAnalyticsStats;
import com.brsanthu.googleanalytics.request.EventHit;
import com.brsanthu.googleanalytics.request.ExceptionHit;
import com.brsanthu.googleanalytics.request.ItemHit;
import com.brsanthu.googleanalytics.request.PageViewHit;
import com.brsanthu.googleanalytics.request.ScreenViewHit;
import com.brsanthu.googleanalytics.request.SocialHit;
import com.brsanthu.googleanalytics.request.TimingHit;
import com.brsanthu.googleanalytics.request.TransactionHit;

public interface GoogleAnalytics
extends AutoCloseable {
    public EventHit event();

    public ExceptionHit exception();

    public ItemHit item();

    public PageViewHit pageView();

    public PageViewHit pageView(String var1, String var2);

    public PageViewHit pageView(String var1, String var2, String var3);

    public ScreenViewHit screenView();

    public ScreenViewHit screenView(String var1, String var2);

    public SocialHit social();

    public SocialHit social(String var1, String var2, String var3);

    public TimingHit timing();

    public TransactionHit transaction();

    public GoogleAnalyticsStats getStats();

    public GoogleAnalyticsConfig getConfig();

    public void ifEnabled(Runnable var1);

    public void resetStats();

    public static GoogleAnalyticsBuilder builder() {
        return new GoogleAnalyticsBuilder();
    }

    public void flush();
}

