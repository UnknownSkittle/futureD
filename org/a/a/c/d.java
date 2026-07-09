/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.c;

import java.nio.charset.Charset;
import org.a.a.c.a;
import org.a.a.c.e;

final class d
implements e {
    d() {
    }

    @Override
    public final void a(String object, StringBuilder stringBuilder) {
        if (((String)object).startsWith("%")) {
            if (((String)object).length() == 3) {
                stringBuilder.append((String)object);
                return;
            }
            stringBuilder.append("%25");
            stringBuilder.append((CharSequence)object, 1, ((String)object).length());
            return;
        }
        byte[] byArray = ((String)object).getBytes(Charset.forName("UTF-8"));
        object = byArray;
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = object[i2];
            stringBuilder.append('%');
            stringBuilder.append(a.a()[object2 >> 4 & 0xF]);
            stringBuilder.append(a.a()[object2 & 0xF]);
        }
    }
}

