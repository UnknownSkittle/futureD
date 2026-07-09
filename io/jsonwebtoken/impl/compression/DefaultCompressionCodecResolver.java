/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.CompressionException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;

public class DefaultCompressionCodecResolver
implements CompressionCodecResolver {
    @Override
    public CompressionCodec resolveCompressionCodec(Header header) {
        String cmpAlg = this.getAlgorithmFromHeader(header);
        boolean hasCompressionAlgorithm = Strings.hasText(cmpAlg);
        if (!hasCompressionAlgorithm) {
            return null;
        }
        if (CompressionCodecs.DEFLATE.getAlgorithmName().equalsIgnoreCase(cmpAlg)) {
            return CompressionCodecs.DEFLATE;
        }
        if (CompressionCodecs.GZIP.getAlgorithmName().equalsIgnoreCase(cmpAlg)) {
            return CompressionCodecs.GZIP;
        }
        throw new CompressionException("Unsupported compression algorithm '" + cmpAlg + "'");
    }

    private String getAlgorithmFromHeader(Header header) {
        Assert.notNull(header, "header cannot be null.");
        return header.getCompressionAlgorithm();
    }
}

