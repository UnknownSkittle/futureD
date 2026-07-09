/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.c;

import org.a.a.c.e;

final class b
implements e {
    b() {
    }

    @Override
    public final void a(String string, StringBuilder stringBuilder) {
        switch (string) {
            case "&": {
                stringBuilder.append("&amp;");
                return;
            }
            case "<": {
                stringBuilder.append("&lt;");
                return;
            }
            case ">": {
                stringBuilder.append("&gt;");
                return;
            }
            case "\"": {
                stringBuilder.append("&quot;");
                return;
            }
        }
        stringBuilder.append(string);
    }
}

