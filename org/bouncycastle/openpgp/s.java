/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.InputStream;
import java.util.Date;
import org.bouncycastle.b.c;
import org.bouncycastle.b.u;

public final class s {
    public static final Date a = new Date(0L);
    private u b;

    public s(c c2) {
        this.b = (u)c2.b();
    }

    public final String a() {
        return this.b.a();
    }

    public final InputStream b() {
        return this.b.b();
    }
}

