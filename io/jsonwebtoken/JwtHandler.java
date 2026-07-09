/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwt;

public interface JwtHandler<T> {
    public T onPlaintextJwt(Jwt<Header, String> var1);

    public T onClaimsJwt(Jwt<Header, Claims> var1);

    public T onPlaintextJws(Jws<String> var1);

    public T onClaimsJws(Jws<Claims> var1);
}

