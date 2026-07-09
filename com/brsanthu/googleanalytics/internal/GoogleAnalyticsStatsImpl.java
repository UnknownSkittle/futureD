/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.internal;

import com.brsanthu.googleanalytics.GoogleAnalyticsStats;
import java.util.concurrent.atomic.AtomicLong;

public class GoogleAnalyticsStatsImpl
implements GoogleAnalyticsStats {
    private AtomicLong pageViewHits = new AtomicLong();
    private AtomicLong eventHits = new AtomicLong();
    private AtomicLong screenViewHits = new AtomicLong();
    private AtomicLong itemHits = new AtomicLong();
    private AtomicLong transactionHits = new AtomicLong();
    private AtomicLong timingHits = new AtomicLong();
    private AtomicLong socialHits = new AtomicLong();
    private AtomicLong exceptionHits = new AtomicLong();

    public void exceptionHit() {
        this.exceptionHits.incrementAndGet();
    }

    public void pageViewHit() {
        this.pageViewHits.incrementAndGet();
    }

    public void eventHit() {
        this.eventHits.incrementAndGet();
    }

    public void screenViewHit() {
        this.screenViewHits.incrementAndGet();
    }

    public void itemHit() {
        this.itemHits.incrementAndGet();
    }

    public void transactionHit() {
        this.transactionHits.incrementAndGet();
    }

    public void socialHit() {
        this.socialHits.incrementAndGet();
    }

    public void timingHit() {
        this.timingHits.incrementAndGet();
    }

    @Override
    public long getPageViewHits() {
        return this.pageViewHits.get();
    }

    @Override
    public long getEventHits() {
        return this.eventHits.get();
    }

    @Override
    public long getScreenViewHits() {
        return this.screenViewHits.get();
    }

    @Override
    public long getItemHits() {
        return this.itemHits.get();
    }

    @Override
    public long getTransactionHits() {
        return this.transactionHits.get();
    }

    @Override
    public long getTimingHits() {
        return this.timingHits.get();
    }

    @Override
    public long getSocialHits() {
        return this.socialHits.get();
    }

    @Override
    public long getExceptionHits() {
        return this.exceptionHits.get();
    }

    public String toString() {
        return "GoogleAnalyticsStatsImpl [pageViewHits=" + this.pageViewHits + ", eventHits=" + this.eventHits + ", screenViewHits=" + this.screenViewHits + ", itemHits=" + this.itemHits + ", transactionHits=" + this.transactionHits + ", timingHits=" + this.timingHits + ", socialHits=" + this.socialHits + ", exceptionHits=" + this.exceptionHits + "]";
    }
}

