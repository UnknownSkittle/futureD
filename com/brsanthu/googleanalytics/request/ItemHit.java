/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.request;

import com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter;
import com.brsanthu.googleanalytics.request.GoogleAnalyticsRequest;

public class ItemHit
extends GoogleAnalyticsRequest<ItemHit> {
    public ItemHit() {
        super("item");
    }

    public ItemHit txId(String string) {
        this.setString(GoogleAnalyticsParameter.TRANSACTION_ID, string);
        return this;
    }

    public String txId() {
        return this.getString(GoogleAnalyticsParameter.TRANSACTION_ID);
    }

    public ItemHit itemName(String string) {
        this.setString(GoogleAnalyticsParameter.ITEM_NAME, string);
        return this;
    }

    public String itemName() {
        return this.getString(GoogleAnalyticsParameter.ITEM_NAME);
    }

    public ItemHit itemPrice(Double d2) {
        this.setDouble(GoogleAnalyticsParameter.ITEM_PRICE, d2);
        return this;
    }

    public Double itemPrice() {
        return this.getDouble(GoogleAnalyticsParameter.ITEM_PRICE);
    }

    public ItemHit itemQuantity(Integer n2) {
        this.setInteger(GoogleAnalyticsParameter.ITEM_QUANTITY, n2);
        return this;
    }

    public Integer itemQuantity() {
        return this.getInteger(GoogleAnalyticsParameter.ITEM_QUANTITY);
    }

    public ItemHit itemCode(String string) {
        this.setString(GoogleAnalyticsParameter.ITEM_CODE, string);
        return this;
    }

    public String itemCode() {
        return this.getString(GoogleAnalyticsParameter.ITEM_CODE);
    }

    public ItemHit itemCategory(String string) {
        this.setString(GoogleAnalyticsParameter.ITEM_CATEGORY, string);
        return this;
    }

    public String itemCategory() {
        return this.getString(GoogleAnalyticsParameter.ITEM_CATEGORY);
    }

    public ItemHit currencyCode(String string) {
        this.setString(GoogleAnalyticsParameter.CURRENCY_CODE, string);
        return this;
    }

    public String currencyCode() {
        return this.getString(GoogleAnalyticsParameter.CURRENCY_CODE);
    }
}

