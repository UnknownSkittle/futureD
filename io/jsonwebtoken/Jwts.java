/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.lang.Classes;
import java.util.Map;

public final class Jwts {
    private static final Class[] MAP_ARG = new Class[]{Map.class};

    private Jwts() {
    }

    public static Header header() {
        return (Header)Classes.newInstance("io.jsonwebtoken.impl.DefaultHeader");
    }

    public static Header header(Map<String, Object> header) {
        return (Header)Classes.newInstance("io.jsonwebtoken.impl.DefaultHeader", MAP_ARG, new Object[]{header});
    }

    public static JwsHeader jwsHeader() {
        return (JwsHeader)Classes.newInstance("io.jsonwebtoken.impl.DefaultJwsHeader");
    }

    public static JwsHeader jwsHeader(Map<String, Object> header) {
        return (JwsHeader)Classes.newInstance("io.jsonwebtoken.impl.DefaultJwsHeader", MAP_ARG, new Object[]{header});
    }

    public static Claims claims() {
        return (Claims)Classes.newInstance("io.jsonwebtoken.impl.DefaultClaims");
    }

    public static Claims claims(Map<String, Object> claims) {
        return (Claims)Classes.newInstance("io.jsonwebtoken.impl.DefaultClaims", MAP_ARG, new Object[]{claims});
    }

    public static JwtParser parser() {
        return (JwtParser)Classes.newInstance("io.jsonwebtoken.impl.DefaultJwtParser");
    }

    public static JwtBuilder builder() {
        return (JwtBuilder)Classes.newInstance("io.jsonwebtoken.impl.DefaultJwtBuilder");
    }
}

