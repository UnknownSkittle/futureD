/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class SocialHit
extends GoogleAnalyticsRequest<SocialHit> {
    public SocialHit() {
        this(null, null, null);
    }

    public SocialHit(String string, String string2, String string3) {
        super("social");
        this.socialAction(string2);
        this.socialNetwork(string);
        this.socialActionTarget(string3);
    }

    public SocialHit socialNetwork(String string) {
        this.setString(GoogleAnalyticsParameter.SOCIAL_NETWORK, string);
        return this;
    }

    public String socialNetwork() {
        return this.getString(GoogleAnalyticsParameter.SOCIAL_NETWORK);
    }

    public SocialHit socialAction(String string) {
        this.setString(GoogleAnalyticsParameter.SOCIAL_ACTION, string);
        return this;
    }

    public String socialAction() {
        return this.getString(GoogleAnalyticsParameter.SOCIAL_ACTION);
    }

    public SocialHit socialActionTarget(String string) {
        this.setString(GoogleAnalyticsParameter.SOCIAL_ACTION_TARGET, string);
        return this;
    }

    public String socialActionTarget() {
        return this.getString(GoogleAnalyticsParameter.SOCIAL_ACTION_TARGET);
    }
}

