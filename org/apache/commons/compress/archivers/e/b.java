/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.e;

import java.io.InputStream;
import org.apache.commons.compress.archivers.e.a;
import org.apache.commons.compress.archivers.g.ai;
import org.apache.commons.compress.archivers.g.al;

public final class b
extends al {
    public b(InputStream inputStream) {
        super(inputStream);
    }

    public b(InputStream inputStream, String string) {
        super(inputStream, string);
    }

    @Override
    public final org.apache.commons.compress.archivers.a a() {
        ai ai2 = this.c();
        if (ai2 == null) {
            return null;
        }
        return new a(ai2);
    }

    public static boolean a(byte[] byArray, int n2) {
        return al.b(byArray, n2);
    }
}

