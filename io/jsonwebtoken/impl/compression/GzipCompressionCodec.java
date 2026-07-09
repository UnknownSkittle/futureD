/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.impl.compression.AbstractCompressionCodec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompressionCodec
extends AbstractCompressionCodec
implements CompressionCodec {
    private static final String GZIP = "GZIP";
    private static final AbstractCompressionCodec.StreamWrapper WRAPPER = new AbstractCompressionCodec.StreamWrapper(){

        @Override
        public OutputStream wrap(OutputStream out) throws IOException {
            return new GZIPOutputStream(out);
        }
    };

    @Override
    public String getAlgorithmName() {
        return GZIP;
    }

    @Override
    protected byte[] doCompress(byte[] payload) throws IOException {
        return this.writeAndClose(payload, WRAPPER);
    }

    @Override
    protected byte[] doDecompress(byte[] compressed) throws IOException {
        return this.readAndClose(new GZIPInputStream(new ByteArrayInputStream(compressed)));
    }
}

