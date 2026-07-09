/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.Encoder;
import io.jsonwebtoken.io.EncodingException;
import io.jsonwebtoken.lang.Assert;

class ExceptionPropagatingEncoder<T, R>
implements Encoder<T, R> {
    private final Encoder<T, R> encoder;

    ExceptionPropagatingEncoder(Encoder<T, R> encoder) {
        Assert.notNull(encoder, "Encoder cannot be null.");
        this.encoder = encoder;
    }

    @Override
    public R encode(T t2) throws EncodingException {
        Assert.notNull(t2, "Encode argument cannot be null.");
        try {
            return this.encoder.encode(t2);
        } catch (EncodingException e2) {
            throw e2;
        } catch (Exception e3) {
            String msg = "Unable to encode input: " + e3.getMessage();
            throw new EncodingException(msg, e3);
        }
    }
}

