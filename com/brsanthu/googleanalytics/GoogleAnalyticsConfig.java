/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics;

import com.brsanthu.googleanalytics.discovery.DefaultRequestParameterDiscoverer;
import com.brsanthu.googleanalytics.discovery.RequestParameterDiscoverer;

public class GoogleAnalyticsConfig {
    private String threadNameFormat = "googleanalyticsjava-thread-{0}";
    private boolean enabled = true;
    private int minThreads = 0;
    private int maxThreads = 5;
    private int threadTimeoutSecs = 300;
    private int threadQueueSize = 1000;
    private int maxHttpConnectionsPerRoute = 10;
    private boolean useHttps = true;
    private boolean validate = true;
    private boolean batchingEnabled = false;
    private int batchSize = 20;
    private String httpUrl = "http://www.google-analytics.com/collect";
    private String httpsUrl = "https://www.google-analytics.com/collect";
    private String batchUrl = "https://www.google-analytics.com/batch";
    private String userAgent = null;
    private String proxyHost = null;
    private int proxyPort = 80;
    private String proxyUserName = null;
    private String proxyPassword = null;
    private boolean discoverRequestParameters = true;
    private boolean gatherStats = false;
    private RequestParameterDiscoverer requestParameterDiscoverer = new DefaultRequestParameterDiscoverer();

    public RequestParameterDiscoverer getRequestParameterDiscoverer() {
        return this.requestParameterDiscoverer;
    }

    public GoogleAnalyticsConfig setRequestParameterDiscoverer(RequestParameterDiscoverer requestParameterDiscoverer) {
        this.requestParameterDiscoverer = requestParameterDiscoverer;
        return this;
    }

    public boolean isGatherStats() {
        return this.gatherStats;
    }

    public GoogleAnalyticsConfig setGatherStats(boolean bl2) {
        this.gatherStats = bl2;
        return this;
    }

    public GoogleAnalyticsConfig setThreadNameFormat(String string) {
        this.threadNameFormat = string;
        return this;
    }

    public String getThreadNameFormat() {
        return this.threadNameFormat;
    }

    @Deprecated
    public GoogleAnalyticsConfig setDeriveSystemParameters(boolean bl2) {
        return this.setDiscoverRequestParameters(bl2);
    }

    public GoogleAnalyticsConfig setDiscoverRequestParameters(boolean bl2) {
        this.discoverRequestParameters = bl2;
        return this;
    }

    public boolean isDiscoverRequestParameters() {
        return this.discoverRequestParameters;
    }

    public GoogleAnalyticsConfig setProxyUserName(String string) {
        this.proxyUserName = string;
        return this;
    }

    public String getProxyUserName() {
        return this.proxyUserName;
    }

    public String getProxyPassword() {
        return this.proxyPassword;
    }

    public GoogleAnalyticsConfig setProxyPassword(String string) {
        this.proxyPassword = string;
        return this;
    }

    public String getProxyHost() {
        return this.proxyHost;
    }

    public GoogleAnalyticsConfig setProxyHost(String string) {
        this.proxyHost = string;
        return this;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public GoogleAnalyticsConfig setProxyPort(int n2) {
        this.proxyPort = n2;
        return this;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public GoogleAnalyticsConfig setUserAgent(String string) {
        this.userAgent = string;
        return this;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public GoogleAnalyticsConfig setEnabled(boolean bl2) {
        this.enabled = bl2;
        return this;
    }

    public int getMaxThreads() {
        return this.maxThreads;
    }

    public GoogleAnalyticsConfig setMaxThreads(int n2) {
        this.maxThreads = n2;
        return this;
    }

    public int getMinThreads() {
        return this.minThreads;
    }

    public GoogleAnalyticsConfig setMinThreads(int n2) {
        this.minThreads = n2;
        return this;
    }

    public boolean isUseHttps() {
        return this.useHttps;
    }

    public GoogleAnalyticsConfig setUseHttps(boolean bl2) {
        this.useHttps = bl2;
        return this;
    }

    public boolean isValidate() {
        return this.validate;
    }

    public GoogleAnalyticsConfig setValidate(boolean bl2) {
        this.validate = bl2;
        return this;
    }

    public String getHttpUrl() {
        return this.httpUrl;
    }

    public GoogleAnalyticsConfig setHttpUrl(String string) {
        this.httpUrl = string;
        return this;
    }

    public String getHttpsUrl() {
        return this.httpsUrl;
    }

    public GoogleAnalyticsConfig setHttpsUrl(String string) {
        this.httpsUrl = string;
        return this;
    }

    public String getUrl() {
        if (this.useHttps) {
            return this.httpsUrl;
        }
        return this.httpUrl;
    }

    public int getMaxHttpConnectionsPerRoute() {
        return this.maxHttpConnectionsPerRoute;
    }

    public GoogleAnalyticsConfig setMaxHttpConnectionsPerRoute(int n2) {
        this.maxHttpConnectionsPerRoute = n2;
        return this;
    }

    public String toString() {
        return "GoogleAnalyticsConfig [threadNameFormat=" + this.threadNameFormat + ", enabled=" + this.enabled + ", minThreads=" + this.minThreads + ", maxThreads=" + this.maxThreads + ", threadTimeoutSecs=" + this.threadTimeoutSecs + ", threadQueueSize=" + this.threadQueueSize + ", maxHttpConnectionsPerRoute=" + this.maxHttpConnectionsPerRoute + ", useHttps=" + this.useHttps + ", validate=" + this.validate + ", httpUrl=" + this.httpUrl + ", httpsUrl=" + this.httpsUrl + ", userAgent=" + this.userAgent + ", proxyHost=" + this.proxyHost + ", proxyPort=" + this.proxyPort + ", proxyUserName=" + this.proxyUserName + ", proxyPassword=" + GoogleAnalyticsConfig.mask(this.proxyPassword) + ", discoverRequestParameters=" + this.discoverRequestParameters + ", gatherStats=" + this.gatherStats + ", requestParameterDiscoverer=" + this.requestParameterDiscoverer + "]";
    }

    public static String mask(String string) {
        if (string == null) {
            return null;
        }
        return "********";
    }

    public int getThreadQueueSize() {
        return this.threadQueueSize;
    }

    public GoogleAnalyticsConfig setThreadQueueSize(int n2) {
        this.threadQueueSize = n2;
        return this;
    }

    public int getThreadTimeoutSecs() {
        return this.threadTimeoutSecs;
    }

    public GoogleAnalyticsConfig setThreadTimeoutSecs(int n2) {
        this.threadTimeoutSecs = n2;
        return this;
    }

    public String getBatchUrl() {
        return this.batchUrl;
    }

    public GoogleAnalyticsConfig setBatchUrl(String string) {
        this.batchUrl = string;
        return this;
    }

    public boolean isBatchingEnabled() {
        return this.batchingEnabled;
    }

    public GoogleAnalyticsConfig setBatchingEnabled(boolean bl2) {
        this.batchingEnabled = bl2;
        return this;
    }

    public int getBatchSize() {
        return this.batchSize;
    }

    public GoogleAnalyticsConfig setBatchSize(int n2) {
        this.batchSize = n2;
        return this;
    }
}

