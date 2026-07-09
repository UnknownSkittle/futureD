/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a;

import java.io.InputStream;

public abstract class a
extends InputStream {
    private long a = 0L;

    protected final void a(int n2) {
        long l2 = n2;
        a a2 = this;
        if (l2 != -1L) {
            a2.a += l2;
        }
    }
}

