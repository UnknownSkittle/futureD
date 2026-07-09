/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;

@Deprecated
public final class CompressionCodecs {
    private static final CompressionCodecs I = new CompressionCodecs();
    @Deprecated
    public static final CompressionCodec DEFLATE = io.jsonwebtoken.CompressionCodecs.DEFLATE;
    @Deprecated
    public static final CompressionCodec GZIP = io.jsonwebtoken.CompressionCodecs.GZIP;

    private CompressionCodecs() {
    }
}

