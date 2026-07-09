/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.c.g;
import org.a.a.m;
import org.a.c.a.b;
import org.a.c.a.c;
import org.a.c.a.d;
import org.a.c.a.e;
import org.a.c.a.f;

public final class n
extends c {
    @Override
    public final d a(f f2, e object) {
        Object object2;
        int n2;
        int n3;
        if (f2.f() >= g.a) {
            return null;
        }
        CharSequence charSequence = f2.b();
        CharSequence charSequence2 = charSequence;
        int n4 = g.a('#', charSequence2, n3 = (n2 = f2.d()), charSequence2.length()) - n3;
        if (n4 == 0 || n4 > 6) {
            object2 = null;
        } else if ((n3 += n4) >= charSequence2.length()) {
            object2 = new m(n4, "");
        } else {
            int n5 = charSequence2.charAt(n3);
            if (n5 != 32 && n5 != 9) {
                object2 = null;
            } else {
                CharSequence charSequence3 = charSequence2;
                n5 = g.c(charSequence3, charSequence3.length() - 1, n3);
                int n6 = g.a(charSequence2, n5, n3);
                int n7 = g.c(charSequence2, n6, n3);
                object2 = charSequence2 = n7 != n6 ? new m(n4, charSequence2.subSequence(n3, n7 + 1).toString()) : new m(n4, charSequence2.subSequence(n3, n5 + 1).toString());
            }
        }
        if (object2 != null) {
            return d.a(new b[]{charSequence2}).a(charSequence.length());
        }
        if ((n2 = m.a(charSequence, n2)) > 0 && (object = object.b()) != null) {
            object = object.toString();
            return d.a(new m(n2, (String)object)).a(charSequence.length()).e();
        }
        return null;
    }
}

