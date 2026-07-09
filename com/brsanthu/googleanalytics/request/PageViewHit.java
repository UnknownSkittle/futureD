/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class PageViewHit
extends GoogleAnalyticsRequest<PageViewHit> {
    public PageViewHit() {
        this(null, null, null);
    }

    public PageViewHit(String string, String string2) {
        this(string, string2, null);
    }

    public PageViewHit(String string, String string2, String string3) {
        super("pageview");
        this.documentUrl(string);
        this.documentTitle(string2);
        this.contentDescription(string3);
    }
}

