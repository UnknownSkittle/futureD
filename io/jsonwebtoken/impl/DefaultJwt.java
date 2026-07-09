/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwt;

public class DefaultJwt<B>
implements Jwt<Header, B> {
    private final Header header;
    private final B body;

    public DefaultJwt(Header header, B body) {
        this.header = header;
        this.body = body;
    }

    @Override
    public Header getHeader() {
        return this.header;
    }

    @Override
    public B getBody() {
        return this.body;
    }

    public String toString() {
        return "header=" + this.header + ",body=" + this.body;
    }
}

