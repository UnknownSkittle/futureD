/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics;

public class GoogleAnalyticsException
extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public GoogleAnalyticsException() {
    }

    public GoogleAnalyticsException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public GoogleAnalyticsException(String string) {
        super(string);
    }

    public GoogleAnalyticsException(Throwable throwable) {
        super(throwable);
    }
}

