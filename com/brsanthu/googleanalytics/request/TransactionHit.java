/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class TransactionHit
extends GoogleAnalyticsRequest<TransactionHit> {
    public TransactionHit() {
        this(null);
    }

    public TransactionHit(String string) {
        this(string, null);
    }

    public TransactionHit(String string, Double d2) {
        this(string, null, d2);
    }

    public TransactionHit(String string, String string2, Double d2) {
        this(string, string2, d2, null, null, "USD");
    }

    public TransactionHit(String string, String string2, Double d2, String string3) {
        this(string, string2, d2, null, null, string3);
    }

    public TransactionHit(String string, String string2, Double d2, Double d3, Double d4, String string3) {
        super("transaction");
        this.txId(string);
        this.txAffiliation(string2);
        this.txRevenue(d2);
        this.txShipping(d3);
        this.txTax(d4);
        this.currencyCode(string3);
    }

    public TransactionHit txId(String string) {
        this.setString(GoogleAnalyticsParameter.TRANSACTION_ID, string);
        return this;
    }

    public String txId() {
        return this.getString(GoogleAnalyticsParameter.TRANSACTION_ID);
    }

    public TransactionHit txAffiliation(String string) {
        this.setString(GoogleAnalyticsParameter.TRANSACTION_AFFILIATION, string);
        return this;
    }

    public String txAffiliation() {
        return this.getString(GoogleAnalyticsParameter.TRANSACTION_AFFILIATION);
    }

    public TransactionHit txRevenue(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.TRANSACTION_REVENUE, d2);
        return this;
    }

    public Double txRevenue() {
        return this.getDouble(GoogleAnalyticsParameter.TRANSACTION_REVENUE);
    }

    public TransactionHit txShipping(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.TRANSACTION_SHIPPING, d2);
        return this;
    }

    public Double txShipping() {
        return this.getDouble(GoogleAnalyticsParameter.TRANSACTION_SHIPPING);
    }

    public TransactionHit txTax(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.TRANSACTION_TAX, d2);
        return this;
    }

    public Double txTax() {
        return this.getDouble(GoogleAnalyticsParameter.TRANSACTION_TAX);
    }

    public TransactionHit currencyCode(String string) {
        this.setString(GoogleAnalyticsParameter.CURRENCY_CODE, string);
        return this;
    }

    public String currencyCode() {
        return this.getString(GoogleAnalyticsParameter.CURRENCY_CODE);
    }
}

