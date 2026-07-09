/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Header;

public interface Jwt<H extends Header, B> {
    public H getHeader();

    public B getBody();
}

