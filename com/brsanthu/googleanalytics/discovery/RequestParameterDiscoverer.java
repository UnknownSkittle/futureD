/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.discovery;

import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.request.DefaultRequest;

public interface RequestParameterDiscoverer {
    public DefaultRequest discoverParameters(GoogleAnalyticsConfig var1, DefaultRequest var2);
}

