/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

import java.io.OutputStream;

public abstract class d
extends OutputStream {
    private final byte[] a;

    @Override
    public void write(int n2) {
        this.a[0] = (byte)n2;
        d d2 = this;
        d2.write(d2.a, 0, 1);
    }
}

