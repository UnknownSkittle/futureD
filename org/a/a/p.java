/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import java.util.regex.Pattern;
import org.a.a.o;
import org.a.b.s;
import org.a.c.a.c;
import org.a.c.a.d;
import org.a.c.a.e;
import org.a.c.a.f;

public final class p
extends c {
    @Override
    public final d a(f f2, e e2) {
        int n2 = f2.d();
        CharSequence charSequence = f2.b();
        if (f2.f() < 4 && charSequence.charAt(n2) == '<') {
            for (int i2 = 1; i2 <= 7; ++i2) {
                if (i2 == 7 && e2.a().b() instanceof s) continue;
                Pattern pattern = o.d()[i2][0];
                Pattern pattern2 = o.d()[i2][1];
                if (!pattern.matcher(charSequence.subSequence(n2, charSequence.length())).find()) continue;
                return d.a(new o(pattern2, 0)).a(f2.c());
            }
        }
        return null;
    }
}

