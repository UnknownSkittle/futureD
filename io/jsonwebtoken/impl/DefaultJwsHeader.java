/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.impl.DefaultHeader;
import java.util.Map;

public class DefaultJwsHeader
extends DefaultHeader
implements JwsHeader {
    public DefaultJwsHeader() {
    }

    public DefaultJwsHeader(Map<String, Object> map) {
        super(map);
    }

    @Override
    public String getAlgorithm() {
        return this.getString("alg");
    }

    public JwsHeader setAlgorithm(String alg) {
        this.setValue("alg", alg);
        return this;
    }

    @Override
    public String getKeyId() {
        return this.getString("kid");
    }

    public JwsHeader setKeyId(String kid) {
        this.setValue("kid", kid);
        return this;
    }
}

