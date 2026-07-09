/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.j;
import org.apache.commons.compress.archivers.sevenz.r;

final class q
extends j {
    private static final byte[] a = new byte[1];

    q() {
        super(Number.class);
    }

    @Override
    final InputStream a(String object, InputStream inputStream, long l2, i i2) {
        object = new Inflater(true);
        inputStream = new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(a)), (Inflater)object);
        return new r((InflaterInputStream)inputStream, (Inflater)object);
    }
}

