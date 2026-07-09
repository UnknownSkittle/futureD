/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import java.security.Principal;
import org.apache.a.a.b;
import org.apache.a.b.e.a;
import org.apache.a.e.l;
import org.apache.a.m.d;
import org.apache.a.m.e;

public final class k
implements org.apache.a.b.k {
    public static final k a = new k();

    @Override
    public final Object a(d object) {
        object = org.apache.a.b.e.a.a((d)object);
        Principal principal = null;
        Object object2 = ((a)object).g();
        if (object2 != null && (principal = k.a((org.apache.a.a.e)object2)) == null) {
            principal = k.a(((a)object).h());
        }
        if (principal == null && (object2 = ((e)object).j()).c() && object2 instanceof l && (object = ((l)object2).i()) != null) {
            principal = object.getLocalPrincipal();
        }
        return principal;
    }

    private static Principal a(org.apache.a.a.e object) {
        b b2 = ((org.apache.a.a.e)object).c();
        if (b2 != null && b2.d() && b2.c() && (object = ((org.apache.a.a.e)object).d()) != null) {
            return object.a();
        }
        return null;
    }
}

