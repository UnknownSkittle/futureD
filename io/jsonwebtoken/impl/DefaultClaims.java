/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.RequiredTypeException;
import io.jsonwebtoken.impl.JwtMap;
import java.util.Date;
import java.util.Map;

public class DefaultClaims
extends JwtMap
implements Claims {
    public DefaultClaims() {
    }

    public DefaultClaims(Map<String, Object> map) {
        super(map);
    }

    @Override
    public String getIssuer() {
        return this.getString("iss");
    }

    @Override
    public Claims setIssuer(String iss) {
        this.setValue("iss", iss);
        return this;
    }

    @Override
    public String getSubject() {
        return this.getString("sub");
    }

    @Override
    public Claims setSubject(String sub) {
        this.setValue("sub", sub);
        return this;
    }

    @Override
    public String getAudience() {
        return this.getString("aud");
    }

    @Override
    public Claims setAudience(String aud2) {
        this.setValue("aud", aud2);
        return this;
    }

    @Override
    public Date getExpiration() {
        return this.get("exp", Date.class);
    }

    @Override
    public Claims setExpiration(Date exp) {
        this.setDateAsSeconds("exp", exp);
        return this;
    }

    @Override
    public Date getNotBefore() {
        return this.get("nbf", Date.class);
    }

    @Override
    public Claims setNotBefore(Date nbf) {
        this.setDateAsSeconds("nbf", nbf);
        return this;
    }

    @Override
    public Date getIssuedAt() {
        return this.get("iat", Date.class);
    }

    @Override
    public Claims setIssuedAt(Date iat) {
        this.setDateAsSeconds("iat", iat);
        return this;
    }

    @Override
    public String getId() {
        return this.getString("jti");
    }

    @Override
    public Claims setId(String jti) {
        this.setValue("jti", jti);
        return this;
    }

    private static boolean isSpecDate(String claimName) {
        return "exp".equals(claimName) || "iat".equals(claimName) || "nbf".equals(claimName);
    }

    @Override
    public Object put(String s2, Object o2) {
        if (o2 instanceof Date && DefaultClaims.isSpecDate(s2)) {
            Date date = (Date)o2;
            return this.setDateAsSeconds(s2, date);
        }
        return super.put(s2, o2);
    }

    @Override
    public <T> T get(String claimName, Class<T> requiredType) {
        Object value = this.get(claimName);
        if (value == null) {
            return null;
        }
        if (Date.class.equals(requiredType)) {
            value = DefaultClaims.isSpecDate(claimName) ? DefaultClaims.toSpecDate(value, claimName) : DefaultClaims.toDate(value, claimName);
        }
        return this.castClaimValue(value, requiredType);
    }

    private <T> T castClaimValue(Object value, Class<T> requiredType) {
        if (value instanceof Integer) {
            int intValue = (Integer)value;
            if (requiredType == Long.class) {
                value = (long)intValue;
            } else if (requiredType == Short.class && Short.MIN_VALUE <= intValue && intValue <= Short.MAX_VALUE) {
                value = (short)intValue;
            } else if (requiredType == Byte.class && -128 <= intValue && intValue <= 127) {
                value = (byte)intValue;
            }
        }
        if (!requiredType.isInstance(value)) {
            throw new RequiredTypeException("Expected value to be of type: " + requiredType + ", but was " + value.getClass());
        }
        return requiredType.cast(value);
    }
}

