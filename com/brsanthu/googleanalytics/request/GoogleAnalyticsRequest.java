/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.GoogleAnalyticsExecutor;
import com.brsanthu.googleanalytics.internal.GaUtils;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class GoogleAnalyticsRequest<T> {
    protected Map<GoogleAnalyticsParameter, String> parms = new HashMap<GoogleAnalyticsParameter, String>();
    protected Map<String, String> customDimensions = new HashMap<String, String>();
    protected Map<String, String> customMetrics = new HashMap<String, String>();
    protected GoogleAnalyticsExecutor delegateExecutor = null;

    public GoogleAnalyticsRequest() {
        this(null, null, null, null);
    }

    public GoogleAnalyticsRequest(String string) {
        this(string, null, null, null);
    }

    public GoogleAnalyticsRequest(String string, String string2, String string3, String string4) {
        this.hitType(GaUtils.isBlank(string) ? "pageview" : string);
        this.trackingId(string2);
        this.applicationName(string3);
        this.applicationVersion(string4);
        this.protocolVersion("1");
    }

    protected T setString(GoogleAnalyticsParameter googleAnalyticsParameter, String string) {
        if (string == null) {
            this.parms.remove((Object)googleAnalyticsParameter);
        } else {
            this.parms.put(googleAnalyticsParameter, string);
        }
        return (T)this;
    }

    protected String getString(GoogleAnalyticsParameter googleAnalyticsParameter) {
        return this.parms.get((Object)googleAnalyticsParameter);
    }

    protected T setInteger(GoogleAnalyticsParameter googleAnalyticsParameter, Integer object) {
        if (object == null) {
            this.parms.remove((Object)googleAnalyticsParameter);
        } else {
            object = this.fromInteger((Integer)object);
            this.parms.put(googleAnalyticsParameter, (String)object);
        }
        return (T)this;
    }

    protected Double getDouble(GoogleAnalyticsParameter googleAnalyticsParameter) {
        GoogleAnalyticsRequest googleAnalyticsRequest = this;
        return googleAnalyticsRequest.toDouble(googleAnalyticsRequest.parms.get((Object)googleAnalyticsParameter));
    }

    protected T setDouble(GoogleAnalyticsParameter googleAnalyticsParameter, Double object) {
        if (object == null) {
            this.parms.remove((Object)googleAnalyticsParameter);
        } else {
            object = this.fromDouble((Double)object);
            this.parms.put(googleAnalyticsParameter, (String)object);
        }
        return (T)this;
    }

    protected Boolean getBoolean(GoogleAnalyticsParameter googleAnalyticsParameter) {
        GoogleAnalyticsRequest googleAnalyticsRequest = this;
        return googleAnalyticsRequest.toBoolean(googleAnalyticsRequest.parms.get((Object)googleAnalyticsParameter));
    }

    protected T setBoolean(GoogleAnalyticsParameter googleAnalyticsParameter, Boolean object) {
        if (object == null) {
            this.parms.remove((Object)googleAnalyticsParameter);
        } else {
            object = this.fromBoolean((Boolean)object);
            this.parms.put(googleAnalyticsParameter, (String)object);
        }
        return (T)this;
    }

    protected Integer getInteger(GoogleAnalyticsParameter googleAnalyticsParameter) {
        GoogleAnalyticsRequest googleAnalyticsRequest = this;
        return googleAnalyticsRequest.toInteger(googleAnalyticsRequest.parms.get((Object)googleAnalyticsParameter));
    }

    protected String fromBoolean(Boolean bl2) {
        if (bl2 == null) {
            return null;
        }
        return String.valueOf(bl2);
    }

    protected Boolean toBoolean(String string) {
        if (GaUtils.isBlank(string)) {
            return null;
        }
        return (boolean)new Boolean(string);
    }

    protected String fromInteger(Integer n2) {
        if (n2 == null) {
            return null;
        }
        return String.valueOf(n2);
    }

    protected Integer toInteger(String string) {
        if (GaUtils.isBlank(string)) {
            return null;
        }
        return Integer.parseInt(string);
    }

    protected String fromDouble(Double d2) {
        if (d2 == null) {
            return null;
        }
        return String.valueOf(d2);
    }

    protected Double toDouble(String string) {
        if (GaUtils.isBlank(string)) {
            return null;
        }
        return Double.parseDouble(string);
    }

    protected T parameter(GoogleAnalyticsParameter googleAnalyticsParameter, String string) {
        if (string == null) {
            this.parms.remove((Object)googleAnalyticsParameter);
        } else {
            this.parms.put(googleAnalyticsParameter, string);
        }
        return (T)this;
    }

    protected String parameter(GoogleAnalyticsParameter googleAnalyticsParameter) {
        return this.parms.get((Object)googleAnalyticsParameter);
    }

    public Map<GoogleAnalyticsParameter, String> getParameters() {
        return this.parms;
    }

    public String customDimension(int n2) {
        return this.customDimensions.get("cd".concat(String.valueOf(n2)));
    }

    public T customDimension(int n2, String string) {
        this.customDimensions.put("cd".concat(String.valueOf(n2)), string);
        return (T)this;
    }

    public T customMetric(int n2, String string) {
        this.customMetrics.put("cm".concat(String.valueOf(n2)), string);
        return (T)this;
    }

    public String customMetric(int n2) {
        return this.customMetrics.get("cm".concat(String.valueOf(n2)));
    }

    public Map<String, String> customDimensions() {
        return this.customDimensions;
    }

    public Map<String, String> custommMetrics() {
        return this.customMetrics;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request [");
        if (this.parms != null) {
            stringBuilder.append("parms=");
            stringBuilder.append(this.parms);
            stringBuilder.append(", ");
        }
        if (this.customDimensions != null) {
            stringBuilder.append("customDimensions=");
            stringBuilder.append(this.customDimensions);
            stringBuilder.append(", ");
        }
        if (this.customMetrics != null) {
            stringBuilder.append("customMetrics=");
            stringBuilder.append(this.customMetrics);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public T protocolVersion(String string) {
        this.setString(GoogleAnalyticsParameter.PROTOCOL_VERSION, string);
        return (T)this;
    }

    public String protocolVersion() {
        return this.getString(GoogleAnalyticsParameter.PROTOCOL_VERSION);
    }

    public T trackingId(String string) {
        this.setString(GoogleAnalyticsParameter.TRACKING_ID, string);
        return (T)this;
    }

    public String trackingId() {
        return this.getString(GoogleAnalyticsParameter.TRACKING_ID);
    }

    public T anonymizeIp(Boolean bl2) {
        this.setBoolean(GoogleAnalyticsParameter.ANONYMIZE_IP, bl2);
        return (T)this;
    }

    public Boolean anonymizeIp() {
        return this.getBoolean(GoogleAnalyticsParameter.ANONYMIZE_IP);
    }

    public T dataSource(String string) {
        this.setString(GoogleAnalyticsParameter.DATA_SOURCE, string);
        return (T)this;
    }

    public String dataSource() {
        return this.getString(GoogleAnalyticsParameter.DATA_SOURCE);
    }

    public T queueTime(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.QUEUE_TIME, n2);
        return (T)this;
    }

    public Integer queueTime() {
        return this.getInteger(GoogleAnalyticsParameter.QUEUE_TIME);
    }

    public T cacheBuster(String string) {
        this.setString(GoogleAnalyticsParameter.CACHE_BUSTER, string);
        return (T)this;
    }

    public String cacheBuster() {
        return this.getString(GoogleAnalyticsParameter.CACHE_BUSTER);
    }

    public T clientId(String string) {
        this.setString(GoogleAnalyticsParameter.CLIENT_ID, string);
        return (T)this;
    }

    public String clientId() {
        return this.getString(GoogleAnalyticsParameter.CLIENT_ID);
    }

    public T userId(String string) {
        this.setString(GoogleAnalyticsParameter.USER_ID, string);
        return (T)this;
    }

    public String userId() {
        return this.getString(GoogleAnalyticsParameter.USER_ID);
    }

    public T sessionControl(String string) {
        this.setString(GoogleAnalyticsParameter.SESSION_CONTROL, string);
        return (T)this;
    }

    public String sessionControl() {
        return this.getString(GoogleAnalyticsParameter.SESSION_CONTROL);
    }

    public T documentReferrer(String string) {
        this.setString(GoogleAnalyticsParameter.DOCUMENT_REFERRER, string);
        return (T)this;
    }

    public String documentReferrer() {
        return this.getString(GoogleAnalyticsParameter.DOCUMENT_REFERRER);
    }

    public T campaignName(String string) {
        this.setString(GoogleAnalyticsParameter.CAMPAIGN_NAME, string);
        return (T)this;
    }

    public String campaignName() {
        return this.getString(GoogleAnalyticsParameter.CAMPAIGN_NAME);
    }

    public T campaignSource(String string) {
        this.setString(GoogleAnalyticsParameter.CAMPAIGN_SOURCE, string);
        return (T)this;
    }

    public String campaignSource() {
        return this.getString(GoogleAnalyticsParameter.CAMPAIGN_SOURCE);
    }

    public T campaignMedium(String string) {
        this.setString(GoogleAnalyticsParameter.CAMPAIGN_MEDIUM, string);
        return (T)this;
    }

    public String campaignMedium() {
        return this.getString(GoogleAnalyticsParameter.CAMPAIGN_MEDIUM);
    }

    public T campaignKeyword(String string) {
        this.setString(GoogleAnalyticsParameter.CAMPAIGN_KEYWORD, string);
        return (T)this;
    }

    public String campaignKeyword() {
        return this.getString(GoogleAnalyticsParameter.CAMPAIGN_KEYWORD);
    }

    public T campaignContent(String string) {
        this.setString(GoogleAnalyticsParameter.CAMPAIGN_CONTENT, string);
        return (T)this;
    }

    public String campaignContent() {
        return this.getString(GoogleAnalyticsParameter.CAMPAIGN_CONTENT);
    }

    public T campaignId(String string) {
        this.setString(GoogleAnalyticsParameter.CAMPAIGN_ID, string);
        return (T)this;
    }

    public String campaignId() {
        return this.getString(GoogleAnalyticsParameter.CAMPAIGN_ID);
    }

    public T adwordsId(String string) {
        this.setString(GoogleAnalyticsParameter.ADWORDS_ID, string);
        return (T)this;
    }

    public String adwordsId() {
        return this.getString(GoogleAnalyticsParameter.ADWORDS_ID);
    }

    public T displayadId(String string) {
        this.setString(GoogleAnalyticsParameter.DISPLAY_ADS_ID, string);
        return (T)this;
    }

    public String displayadId() {
        return this.getString(GoogleAnalyticsParameter.DISPLAY_ADS_ID);
    }

    public T screenResolution(String string) {
        this.setString(GoogleAnalyticsParameter.SCREEN_RESOLUTION, string);
        return (T)this;
    }

    public String screenResolution() {
        return this.getString(GoogleAnalyticsParameter.SCREEN_RESOLUTION);
    }

    public T viewportSize(String string) {
        this.setString(GoogleAnalyticsParameter.VIEWPORT_SIZE, string);
        return (T)this;
    }

    public String viewportSize() {
        return this.getString(GoogleAnalyticsParameter.VIEWPORT_SIZE);
    }

    public T documentEncoding(String string) {
        this.setString(GoogleAnalyticsParameter.DOCUMENT_ENCODING, string);
        return (T)this;
    }

    public String documentEncoding() {
        return this.getString(GoogleAnalyticsParameter.DOCUMENT_ENCODING);
    }

    public T screenColors(String string) {
        this.setString(GoogleAnalyticsParameter.SCREEN_COLORS, string);
        return (T)this;
    }

    public String screenColors() {
        return this.getString(GoogleAnalyticsParameter.SCREEN_COLORS);
    }

    public T userLanguage(String string) {
        this.setString(GoogleAnalyticsParameter.USER_LANGUAGE, string);
        return (T)this;
    }

    public String userLanguage() {
        return this.getString(GoogleAnalyticsParameter.USER_LANGUAGE);
    }

    public T javaEnabled(Boolean bl2) {
        this.setBoolean(GoogleAnalyticsParameter.JAVA_ENABLED, bl2);
        return (T)this;
    }

    public Boolean javaEnabled() {
        return this.getBoolean(GoogleAnalyticsParameter.JAVA_ENABLED);
    }

    public T flashVersion(String string) {
        this.setString(GoogleAnalyticsParameter.FLASH_VERSION, string);
        return (T)this;
    }

    public String flashVersion() {
        return this.getString(GoogleAnalyticsParameter.FLASH_VERSION);
    }

    public T hitType(String string) {
        this.setString(GoogleAnalyticsParameter.HIT_TYPE, string);
        return (T)this;
    }

    public String hitType() {
        return this.getString(GoogleAnalyticsParameter.HIT_TYPE);
    }

    public T nonInteractionHit(String string) {
        this.setString(GoogleAnalyticsParameter.NON_INTERACTION_HIT, string);
        return (T)this;
    }

    public String nonInteractionHit() {
        return this.getString(GoogleAnalyticsParameter.NON_INTERACTION_HIT);
    }

    public T documentUrl(String string) {
        this.setString(GoogleAnalyticsParameter.DOCUMENT_URL, string);
        return (T)this;
    }

    public String documentUrl() {
        return this.getString(GoogleAnalyticsParameter.DOCUMENT_URL);
    }

    public T documentHostName(String string) {
        this.setString(GoogleAnalyticsParameter.DOCUMENT_HOST_NAME, string);
        return (T)this;
    }

    public String documentHostName() {
        return this.getString(GoogleAnalyticsParameter.DOCUMENT_HOST_NAME);
    }

    public T documentPath(String string) {
        this.setString(GoogleAnalyticsParameter.DOCUMENT_PATH, string);
        return (T)this;
    }

    public String documentPath() {
        return this.getString(GoogleAnalyticsParameter.DOCUMENT_PATH);
    }

    public T documentTitle(String string) {
        this.setString(GoogleAnalyticsParameter.DOCUMENT_TITLE, string);
        return (T)this;
    }

    public String documentTitle() {
        return this.getString(GoogleAnalyticsParameter.DOCUMENT_TITLE);
    }

    public T contentDescription(String string) {
        this.setString(GoogleAnalyticsParameter.CONTENT_DESCRIPTION, string);
        return (T)this;
    }

    public String contentDescription() {
        return this.getString(GoogleAnalyticsParameter.CONTENT_DESCRIPTION);
    }

    public T applicationName(String string) {
        this.setString(GoogleAnalyticsParameter.APPLICATION_NAME, string);
        return (T)this;
    }

    public String applicationName() {
        return this.getString(GoogleAnalyticsParameter.APPLICATION_NAME);
    }

    public T applicationInstallerId(String string) {
        this.setString(GoogleAnalyticsParameter.APPLICATION_INSTALLER_ID, string);
        return (T)this;
    }

    public String applicationInstallerId() {
        return this.getString(GoogleAnalyticsParameter.APPLICATION_INSTALLER_ID);
    }

    public T applicationVersion(String string) {
        this.setString(GoogleAnalyticsParameter.APPLICATION_VERSION, string);
        return (T)this;
    }

    public String applicationVersion() {
        return this.getString(GoogleAnalyticsParameter.APPLICATION_VERSION);
    }

    public T applicationId(String string) {
        this.setString(GoogleAnalyticsParameter.APPLICATION_ID, string);
        return (T)this;
    }

    public String applicationId() {
        return this.getString(GoogleAnalyticsParameter.APPLICATION_ID);
    }

    public T experimentId(String string) {
        this.setString(GoogleAnalyticsParameter.EXPERIMENT_ID, string);
        return (T)this;
    }

    public String experimentId() {
        return this.getString(GoogleAnalyticsParameter.EXPERIMENT_ID);
    }

    public T experimentVariant(String string) {
        this.setString(GoogleAnalyticsParameter.EXPERIMENT_VARIANT, string);
        return (T)this;
    }

    public String experimentVariant() {
        return this.getString(GoogleAnalyticsParameter.EXPERIMENT_VARIANT);
    }

    public T userIp(String string) {
        this.setString(GoogleAnalyticsParameter.USER_IP, string);
        return (T)this;
    }

    public String userIp() {
        return this.getString(GoogleAnalyticsParameter.USER_IP);
    }

    public T userAgent(String string) {
        this.setString(GoogleAnalyticsParameter.USER_AGENT, string);
        return (T)this;
    }

    public String userAgent() {
        return this.getString(GoogleAnalyticsParameter.USER_AGENT);
    }

    public T geoid(String string) {
        this.setString(GoogleAnalyticsParameter.GEOID, string);
        return (T)this;
    }

    public String geoid() {
        return this.getString(GoogleAnalyticsParameter.GEOID);
    }

    public GoogleAnalyticsResponse send() {
        GoogleAnalyticsRequest googleAnalyticsRequest = this;
        return googleAnalyticsRequest.execute(() -> this.delegateExecutor.post(this));
    }

    public Future<GoogleAnalyticsResponse> sendAsync() {
        GoogleAnalyticsRequest googleAnalyticsRequest = this;
        return googleAnalyticsRequest.execute(() -> this.delegateExecutor.postAsync(this));
    }

    private <E> E execute(Supplier<E> supplier) {
        if (this.delegateExecutor == null) {
            throw new RuntimeException("GoogleAnalyticsExecutor is null");
        }
        return supplier.get();
    }

    public GoogleAnalyticsRequest<T> setExecutor(GoogleAnalyticsExecutor googleAnalyticsExecutor) {
        this.delegateExecutor = googleAnalyticsExecutor;
        return this;
    }
}

