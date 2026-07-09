/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import java.io.InputStream;
import org.apache.a.i.a;
import org.apache.a.i.f;

public final class m
extends InputStream {
    private final f a;
    private boolean b = false;

    public m(f f2) {
        this.a = ai.a(f2, "Session input buffer");
    }

    @Override
    public final int available() {
        if (this.a instanceof a) {
            return ((a)((Object)this.a)).b();
        }
        return 0;
    }

    @Override
    public final void close() {
        this.b = true;
    }

    @Override
    public final int read() {
        if (this.b) {
            return -1;
        }
        return this.a.f();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.b) {
            return -1;
        }
        return this.a.a(byArray, n2, n3);
    }
}

