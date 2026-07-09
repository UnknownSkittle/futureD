/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.internal;

import java.text.MessageFormat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleAnalyticsThreadFactory
implements ThreadFactory {
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private String threadNameFormat = null;

    public GoogleAnalyticsThreadFactory(String string) {
        this.threadNameFormat = string;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        runnable = new Thread(Thread.currentThread().getThreadGroup(), runnable, MessageFormat.format(this.threadNameFormat, this.threadNumber.getAndIncrement()), 0L);
        ((Thread)runnable).setDaemon(true);
        ((Thread)runnable).setPriority(1);
        return runnable;
    }
}

