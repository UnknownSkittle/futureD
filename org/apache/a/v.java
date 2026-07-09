/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a;

import java.io.Serializable;
import org.apache.a.ac;

public final class v
extends ac
implements Serializable {
    private static v e = new v(0, 9);
    public static final v a = new v(1, 0);
    public static final v b = new v(1, 1);

    private v(int n2, int n3) {
        super("HTTP", n2, n3);
    }

    @Override
    public final ac a(int n2, int n3) {
        if (n2 == this.c && n3 == this.d) {
            return this;
        }
        if (n2 == 1) {
            if (n3 == 0) {
                return a;
            }
            if (n3 == 1) {
                return b;
            }
        }
        if (n2 == 0 && n3 == 9) {
            return e;
        }
        return new v(n2, n3);
    }
}

