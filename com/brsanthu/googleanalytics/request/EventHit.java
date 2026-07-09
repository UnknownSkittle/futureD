/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class EventHit
extends GoogleAnalyticsRequest<EventHit> {
    public EventHit() {
        this((String)null, (String)null, (String)null, (Integer)null);
    }

    public EventHit(String string, String string2) {
        this(string, string2, (String)null, (Integer)null);
    }

    public EventHit(String string, String string2, String string3, Integer n2) {
        super("event");
        this.eventCategory(string);
        this.eventAction(string2);
        this.eventLabel(string3);
        this.eventValue(n2);
    }

    public EventHit eventCategory(String string) {
        this.setString(GoogleAnalyticsParameter.EVENT_CATEGORY, string);
        return this;
    }

    public String eventCategory() {
        return this.getString(GoogleAnalyticsParameter.EVENT_CATEGORY);
    }

    public EventHit eventAction(String string) {
        this.setString(GoogleAnalyticsParameter.EVENT_ACTION, string);
        return this;
    }

    public String eventAction() {
        return this.getString(GoogleAnalyticsParameter.EVENT_ACTION);
    }

    public EventHit eventLabel(String string) {
        this.setString(GoogleAnalyticsParameter.EVENT_LABEL, string);
        return this;
    }

    public String eventLabel() {
        return this.getString(GoogleAnalyticsParameter.EVENT_LABEL);
    }

    public EventHit eventValue(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.EVENT_VALUE, n2);
        return this;
    }

    public Integer eventValue() {
        return this.getInteger(GoogleAnalyticsParameter.EVENT_VALUE);
    }
}

