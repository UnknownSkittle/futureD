/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class ScreenViewHit
extends GoogleAnalyticsRequest<ScreenViewHit> {
    public ScreenViewHit() {
        this(null, null);
    }

    public ScreenViewHit(String string, String string2) {
        super("screenview");
        this.screenName(string2);
        this.applicationName(string);
    }

    public ScreenViewHit screenName(String string) {
        this.setString(GoogleAnalyticsParameter.SCREEN_NAME, string);
        return this;
    }

    public String screenName() {
        return this.getString(GoogleAnalyticsParameter.SCREEN_NAME);
    }
}

