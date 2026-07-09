/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.InputStream;
import java.util.zip.CRC32;
import org.apache.commons.compress.b.e;

public final class d
extends e {
    public d(InputStream inputStream, long l2, long l3) {
        super(new CRC32(), inputStream, l2, l3);
    }
}

