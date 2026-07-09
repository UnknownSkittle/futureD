/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import java.util.Date;

public interface ClaimsMutator<T extends ClaimsMutator> {
    public T setIssuer(String var1);

    public T setSubject(String var1);

    public T setAudience(String var1);

    public T setExpiration(Date var1);

    public T setNotBefore(Date var1);

    public T setIssuedAt(Date var1);

    public T setId(String var1);
}

