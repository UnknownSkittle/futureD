/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.discovery;

import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.discovery.RequestParameterDiscoverer;
import com.brsanthu.googleanalytics.internal.GaUtils;
import com.brsanthu.googleanalytics.request.DefaultRequest;
import org.b.b;
import org.b.c;

public class DefaultRequestParameterDiscoverer
implements RequestParameterDiscoverer {
    private static final b logger = c.a(DefaultRequestParameterDiscoverer.class);
    public static final DefaultRequestParameterDiscoverer INSTANCE = new DefaultRequestParameterDiscoverer();

    @Override
    public DefaultRequest discoverParameters(GoogleAnalyticsConfig object, DefaultRequest defaultRequest) {
        try {
            if (GaUtils.isEmpty(((GoogleAnalyticsConfig)object).getUserAgent())) {
                ((GoogleAnalyticsConfig)object).setUserAgent(this.getUserAgentString());
            }
            if (GaUtils.isEmpty(defaultRequest.userLanguage())) {
                object = System.getProperty("user.region");
                if (GaUtils.isEmpty((String)object)) {
                    object = System.getProperty("user.country");
                }
                defaultRequest.userLanguage(System.getProperty("user.language") + "-" + (String)object);
            }
            if (GaUtils.isEmpty(defaultRequest.documentEncoding())) {
                defaultRequest.documentEncoding(System.getProperty("file.encoding"));
            }
        } catch (Exception exception) {
            logger.b("Exception while deriving the System properties for request ".concat(String.valueOf(defaultRequest)), exception);
        }
        return defaultRequest;
    }

    protected String getUserAgentString() {
        StringBuilder stringBuilder = new StringBuilder("java");
        GaUtils.appendSystemProperty(stringBuilder, "java.runtime.version");
        GaUtils.appendSystemProperty(stringBuilder, "java.specification.vendor");
        GaUtils.appendSystemProperty(stringBuilder, "java.vm.name");
        GaUtils.appendSystemProperty(stringBuilder, "os.name");
        GaUtils.appendSystemProperty(stringBuilder, "os.version");
        GaUtils.appendSystemProperty(stringBuilder, "os.arch");
        return stringBuilder.toString();
    }
}

