/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwt;

public interface Jws<B>
extends Jwt<JwsHeader, B> {
    public String getSignature();
}

