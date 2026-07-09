/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.Header;
import io.jsonwebtoken.impl.JwtMap;
import io.jsonwebtoken.lang.Strings;
import java.util.Map;

public class DefaultHeader<T extends Header<T>>
extends JwtMap
implements Header<T> {
    public DefaultHeader() {
    }

    public DefaultHeader(Map<String, Object> map) {
        super(map);
    }

    @Override
    public String getType() {
        return this.getString("typ");
    }

    @Override
    public T setType(String typ) {
        this.setValue("typ", typ);
        return (T)this;
    }

    @Override
    public String getContentType() {
        return this.getString("cty");
    }

    @Override
    public T setContentType(String cty) {
        this.setValue("cty", cty);
        return (T)this;
    }

    @Override
    public String getCompressionAlgorithm() {
        String alg = this.getString("zip");
        if (!Strings.hasText(alg)) {
            alg = this.getString("calg");
        }
        return alg;
    }

    @Override
    public T setCompressionAlgorithm(String compressionAlgorithm) {
        this.setValue("zip", compressionAlgorithm);
        return (T)this;
    }
}

