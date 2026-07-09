/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.ClaimsMutator;
import java.util.Date;
import java.util.Map;

public interface Claims
extends Map<String, Object>,
ClaimsMutator<Claims> {
    public static final String ISSUER = "iss";
    public static final String SUBJECT = "sub";
    public static final String AUDIENCE = "aud";
    public static final String EXPIRATION = "exp";
    public static final String NOT_BEFORE = "nbf";
    public static final String ISSUED_AT = "iat";
    public static final String ID = "jti";

    public String getIssuer();

    @Override
    public Claims setIssuer(String var1);

    public String getSubject();

    @Override
    public Claims setSubject(String var1);

    public String getAudience();

    @Override
    public Claims setAudience(String var1);

    public Date getExpiration();

    @Override
    public Claims setExpiration(Date var1);

    public Date getNotBefore();

    @Override
    public Claims setNotBefore(Date var1);

    public Date getIssuedAt();

    @Override
    public Claims setIssuedAt(Date var1);

    public String getId();

    @Override
    public Claims setId(String var1);

    public <T> T get(String var1, Class<T> var2);
}

