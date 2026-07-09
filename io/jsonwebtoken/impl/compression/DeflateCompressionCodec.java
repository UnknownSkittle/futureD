/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.impl.compression.AbstractCompressionCodec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class DeflateCompressionCodec
extends AbstractCompressionCodec {
    private static final String DEFLATE = "DEF";
    private static final AbstractCompressionCodec.StreamWrapper WRAPPER = new AbstractCompressionCodec.StreamWrapper(){

        @Override
        public OutputStream wrap(OutputStream out) {
            return new DeflaterOutputStream(out);
        }
    };

    @Override
    public String getAlgorithmName() {
        return DEFLATE;
    }

    @Override
    protected byte[] doCompress(byte[] payload) throws IOException {
        return this.writeAndClose(payload, WRAPPER);
    }

    @Override
    protected byte[] doDecompress(byte[] compressed) throws IOException {
        return this.readAndClose(new InflaterInputStream(new ByteArrayInputStream(compressed)));
    }
}

