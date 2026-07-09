/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import org.apache.a.e;
import org.apache.a.h.c;
import org.apache.a.j.p;
import org.apache.a.m.d;
import org.apache.a.s;

public final class g
extends c {
    public static final g a = new g();

    @Override
    public final boolean a(s s2, d d2) {
        Object object = (e[])d2.a("http.request");
        if (object != null && ((e[])(object = object.b("Connection"))).length != 0) {
            object = new p(new org.apache.a.j.e((e[])object));
            while (object.hasNext()) {
                String string = object.a();
                if (!"Close".equalsIgnoreCase(string)) continue;
                return false;
            }
        }
        return super.a(s2, d2);
    }
}

