/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;

public class DefaultJws<B>
implements Jws<B> {
    private final JwsHeader header;
    private final B body;
    private final String signature;

    public DefaultJws(JwsHeader header, B body, String signature) {
        this.header = header;
        this.body = body;
        this.signature = signature;
    }

    @Override
    public JwsHeader getHeader() {
        return this.header;
    }

    @Override
    public B getBody() {
        return this.body;
    }

    @Override
    public String getSignature() {
        return this.signature;
    }

    public String toString() {
        return "header=" + this.header + ",body=" + this.body + ",signature=" + this.signature;
    }
}

