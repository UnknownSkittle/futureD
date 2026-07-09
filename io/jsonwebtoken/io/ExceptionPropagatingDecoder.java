/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.DecodingException;
import io.jsonwebtoken.lang.Assert;

class ExceptionPropagatingDecoder<T, R>
implements Decoder<T, R> {
    private final Decoder<T, R> decoder;

    ExceptionPropagatingDecoder(Decoder<T, R> decoder) {
        Assert.notNull(decoder, "Decoder cannot be null.");
        this.decoder = decoder;
    }

    @Override
    public R decode(T t2) throws DecodingException {
        Assert.notNull(t2, "Decode argument cannot be null.");
        try {
            return this.decoder.decode(t2);
        } catch (DecodingException e2) {
            throw e2;
        } catch (Exception e3) {
            String msg = "Unable to decode input: " + e3.getMessage();
            throw new DecodingException(msg, e3);
        }
    }
}

