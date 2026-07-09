/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class ExceptionHit
extends GoogleAnalyticsRequest<ExceptionHit> {
    public ExceptionHit() {
        this(null);
    }

    public ExceptionHit(String string) {
        this(string, Boolean.FALSE);
    }

    public ExceptionHit(String string, Boolean bl2) {
        super("exception");
        this.exceptionDescription(string);
        this.exceptionFatal(bl2);
    }

    public ExceptionHit exceptionDescription(String string) {
        this.setString(GoogleAnalyticsParameter.EXCEPTION_DESCRIPTION, string);
        return this;
    }

    public String exceptionDescription() {
        return this.getString(GoogleAnalyticsParameter.EXCEPTION_DESCRIPTION);
    }

    public ExceptionHit exceptionFatal(Boolean bl2) {
        this.setBoolean(GoogleAnalyticsParameter.EXCEPTION_FATAL, bl2);
        return this;
    }

    public Boolean exceptionFatal() {
        return this.getBoolean(GoogleAnalyticsParameter.EXCEPTION_FATAL);
    }
}

