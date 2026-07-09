/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

public enum GoogleAnalyticsParameter {
    PROTOCOL_VERSION("v", true),
    TRACKING_ID("tid", true),
    ANONYMIZE_IP("aip", "boolean"),
    QUEUE_TIME("qt", "integer"),
    CACHE_BUSTER("z"),
    DATA_SOURCE("ds"),
    CLIENT_ID("cid", true),
    USER_ID("uid"),
    SESSION_CONTROL("sc"),
    USER_IP("uip"),
    USER_AGENT("ua"),
    GEOID("geoid"),
    DOCUMENT_REFERRER("dr", 2048),
    CAMPAIGN_NAME("cn", 100),
    CAMPAIGN_SOURCE("cs", 100),
    CAMPAIGN_MEDIUM("cm", 50),
    CAMPAIGN_KEYWORD("ck", 500),
    CAMPAIGN_CONTENT("cc", 500),
    CAMPAIGN_ID("ci", 100),
    ADWORDS_ID("gclid"),
    DISPLAY_ADS_ID("dclid"),
    SCREEN_RESOLUTION("sr", 20),
    VIEWPORT_SIZE("vp", 20),
    DOCUMENT_ENCODING("de", 20),
    SCREEN_COLORS("sd", 20),
    USER_LANGUAGE("ul", 20),
    JAVA_ENABLED("je", "boolean"),
    FLASH_VERSION("fl", 20),
    HIT_TYPE("t", true),
    NON_INTERACTION_HIT("ni"),
    DOCUMENT_URL("dl", 2048),
    DOCUMENT_HOST_NAME("dh", 100),
    DOCUMENT_PATH("dp", 2048),
    DOCUMENT_TITLE("dt", 1500),
    CONTENT_DESCRIPTION("cd"),
    LINK_ID("linkid"),
    APPLICATION_NAME("an", 100),
    APPLICATION_ID("aid", 150),
    APPLICATION_VERSION("av", 100),
    APPLICATION_INSTALLER_ID("aiid", 150),
    EVENT_CATEGORY("ec", new String[]{"event"}, 150),
    EVENT_ACTION("ea", new String[]{"event"}, 500),
    EVENT_LABEL("el", new String[]{"event"}, 500),
    EVENT_VALUE("ev", false, "integer", new String[]{"event"}),
    TRANSACTION_ID("ti", new String[]{"transaction", "item"}, 500),
    TRANSACTION_AFFILIATION("ta", new String[]{"transaction"}, 500),
    TRANSACTION_REVENUE("tr", false, "currency", new String[]{"transaction"}),
    TRANSACTION_SHIPPING("ts", false, "currency", new String[]{"transaction"}),
    TRANSACTION_TAX("tt", false, "currency", new String[]{"transaction"}),
    ITEM_NAME("in", new String[]{"item"}, 500),
    ITEM_PRICE("ip", false, "currency", new String[]{"item"}),
    ITEM_QUANTITY("iq", false, "integer", new String[]{"item"}),
    ITEM_CODE("ic", new String[]{"item"}, 500),
    ITEM_CATEGORY("iv", new String[]{"item"}, 500),
    CURRENCY_CODE("cu", new String[]{"transaction", "item"}, 10),
    SOCIAL_NETWORK("sn", new String[]{"social"}, 50),
    SOCIAL_ACTION("sa", new String[]{"social"}, 50),
    SOCIAL_ACTION_TARGET("st", new String[]{"social"}, 2048),
    USER_TIMING_CATEGORY("utc", new String[]{"timing"}, 150),
    USER_TIMING_VARIABLE_NAME("utv", new String[]{"timing"}, 500),
    USER_TIMING_TIME("utt", false, "integer", new String[]{"timing"}),
    USER_TIMING_LABEL("utl", new String[]{"timing"}, 500),
    PAGE_LOAD_TIME("plt", false, "integer", new String[]{"timing"}),
    DNS_TIME("dns", false, "integer", new String[]{"timing"}),
    PAGE_DOWNLOAD_TIME("pdt", false, "integer", new String[]{"timing"}),
    REDIRECT_RESPONSE_TIME("rrt", false, "integer", new String[]{"timing"}),
    TCP_CONNECT_TIME("tcp", false, "integer", new String[]{"timing"}),
    SERVER_RESPONSE_TIME("srt", false, "integer", new String[]{"timing"}),
    EXCEPTION_DESCRIPTION("exd", new String[]{"exception"}, 150),
    EXCEPTION_FATAL("exf", false, "boolean", new String[]{"exception"}),
    EXPERIMENT_ID("xid", 40),
    EXPERIMENT_VARIANT("xvar"),
    SCREEN_NAME("cd", true, "text", new String[]{"screenview"}, 2048);

    private String parameterName = null;
    private boolean required = false;
    private String type = "text";
    private String[] supportedHitTypes = null;
    private int maxLength = 0;

    private GoogleAnalyticsParameter(String string2) {
        this(string2, false);
    }

    private GoogleAnalyticsParameter(String string2, int n3) {
        this(string2, false, null, null, n3);
    }

    private GoogleAnalyticsParameter(String string2, boolean bl2) {
        this(string2, bl2, "text", null, 0);
    }

    private GoogleAnalyticsParameter(String string2, String string3) {
        this(string2, false, string3, null, 0);
    }

    private GoogleAnalyticsParameter(String string2, String[] stringArray) {
        this(string2, false, "text", stringArray, 0);
    }

    private GoogleAnalyticsParameter(String string2, String[] stringArray, int n3) {
        this(string2, false, "text", stringArray, n3);
    }

    private GoogleAnalyticsParameter(String string2, boolean bl2, String string3, String[] stringArray) {
        this(string2, bl2, string3, stringArray, 0);
    }

    private GoogleAnalyticsParameter(String string2, boolean bl2, String string3, String[] stringArray, int n3) {
        this.parameterName = string2;
        this.required = bl2;
        if (string3 == null) {
            string3 = "text";
        }
        this.type = string3;
        this.supportedHitTypes = stringArray;
        this.maxLength = n3;
    }

    public final String getParameterName() {
        return this.parameterName;
    }

    public final String[] getSupportedHitTypes() {
        return this.supportedHitTypes;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isRequired() {
        return this.required;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }
}

