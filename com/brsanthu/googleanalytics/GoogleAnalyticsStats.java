/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics;

public interface GoogleAnalyticsStats {
    public long getPageViewHits();

    public long getEventHits();

    public long getScreenViewHits();

    public long getItemHits();

    public long getTransactionHits();

    public long getTimingHits();

    public long getSocialHits();

    public long getExceptionHits();
}

