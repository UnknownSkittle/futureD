/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.impl.AbstractTextCodec;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;

@Deprecated
public class Base64Codec
extends AbstractTextCodec {
    @Override
    public String encode(byte[] data) {
        return Encoders.BASE64.encode(data);
    }

    @Override
    public byte[] decode(String encoded) {
        return Decoders.BASE64.decode(encoded);
    }
}

