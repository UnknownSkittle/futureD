/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl.compression;

import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionException;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractCompressionCodec
implements CompressionCodec {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    byte[] readAndClose(InputStream input) throws IOException {
        byte[] buffer = new byte[512];
        ByteArrayOutputStream out = new ByteArrayOutputStream(buffer.length);
        try {
            int read = input.read(buffer);
            while (read != -1) {
                out.write(buffer, 0, read);
                read = input.read(buffer);
            }
        } catch (Throwable throwable) {
            Objects.nullSafeClose(input);
            throw throwable;
        }
        Objects.nullSafeClose(input);
        return out.toByteArray();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    byte[] writeAndClose(byte[] payload, StreamWrapper wrapper) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(512);
        OutputStream compressionStream = wrapper.wrap(outputStream);
        try {
            compressionStream.write(payload);
            compressionStream.flush();
        } catch (Throwable throwable) {
            Objects.nullSafeClose(compressionStream);
            throw throwable;
        }
        Objects.nullSafeClose(compressionStream);
        return outputStream.toByteArray();
    }

    protected abstract byte[] doCompress(byte[] var1) throws IOException;

    @Override
    public final byte[] compress(byte[] payload) {
        Assert.notNull(payload, "payload cannot be null.");
        try {
            return this.doCompress(payload);
        } catch (IOException e2) {
            throw new CompressionException("Unable to compress payload.", e2);
        }
    }

    @Override
    public final byte[] decompress(byte[] compressed) {
        Assert.notNull(compressed, "compressed bytes cannot be null.");
        try {
            return this.doDecompress(compressed);
        } catch (IOException e2) {
            throw new CompressionException("Unable to decompress bytes.", e2);
        }
    }

    protected abstract byte[] doDecompress(byte[] var1) throws IOException;

    static interface StreamWrapper {
        public OutputStream wrap(OutputStream var1) throws IOException;
    }
}

