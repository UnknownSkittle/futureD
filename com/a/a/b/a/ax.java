/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.util.Locale;
import java.util.StringTokenizer;

final class ax
extends ag<Locale> {
    ax() {
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        if (((a)object).f() == c.i) {
            ((a)object).j();
            return null;
        }
        object = ((a)object).h();
        object = new StringTokenizer((String)object, "_");
        String string = null;
        String string2 = null;
        String string3 = null;
        if (((StringTokenizer)object).hasMoreElements()) {
            string = ((StringTokenizer)object).nextToken();
        }
        if (((StringTokenizer)object).hasMoreElements()) {
            string2 = ((StringTokenizer)object).nextToken();
        }
        if (((StringTokenizer)object).hasMoreElements()) {
            string3 = ((StringTokenizer)object).nextToken();
        }
        if (string2 == null && string3 == null) {
            return new Locale(string);
        }
        if (string3 == null) {
            return new Locale(string, string2);
        }
        return new Locale(string, string2, string3);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        d2.b((object = (Locale)object) == null ? null : ((Locale)object).toString());
    }
}

