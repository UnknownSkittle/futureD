/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import java.util.Map;

public interface Header<T extends Header<T>>
extends Map<String, Object> {
    public static final String JWT_TYPE = "JWT";
    public static final String TYPE = "typ";
    public static final String CONTENT_TYPE = "cty";
    public static final String COMPRESSION_ALGORITHM = "zip";
    @Deprecated
    public static final String DEPRECATED_COMPRESSION_ALGORITHM = "calg";

    public String getType();

    public T setType(String var1);

    public String getContentType();

    public T setContentType(String var1);

    public String getCompressionAlgorithm();

    public T setCompressionAlgorithm(String var1);
}

