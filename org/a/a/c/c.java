/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.c;

import org.a.a.c.e;
import org.a.a.c.f;

final class c
implements e {
    c() {
    }

    @Override
    public final void a(String string, StringBuilder stringBuilder) {
        if (string.charAt(0) == '\\') {
            stringBuilder.append(string, 1, string.length());
            return;
        }
        stringBuilder.append(f.a(string));
    }
}

