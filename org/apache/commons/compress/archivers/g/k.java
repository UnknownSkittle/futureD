/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;

public final class k
implements au {
    private static final ax a = new ax(51966);
    private static final ax b = new ax(0);
    private static final byte[] c = new byte[0];

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return b;
    }

    @Override
    public final ax d() {
        return b;
    }

    @Override
    public final byte[] e() {
        return c;
    }

    @Override
    public final byte[] c() {
        return c;
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        if (n3 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }

    static {
        new k();
    }
}

