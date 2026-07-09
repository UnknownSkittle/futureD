/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.ac;
import org.apache.a.ad;
import org.apache.a.af;
import org.apache.a.j.a;
import org.apache.a.j.o;
import org.apache.a.k;
import org.apache.a.s;
import org.apache.a.v;

public final class i
extends a
implements s {
    private af c;
    private ac d;
    private int e;
    private String f;
    private k g;
    private final ad h;
    private Locale i;

    public i(af af2, ad ad2, Locale locale) {
        super((byte)0);
        this.c = ai.a(af2, "Status line");
        this.d = af2.a();
        this.e = af2.b();
        this.f = af2.c();
        this.h = ad2;
        this.i = locale;
    }

    @Override
    public final ac c() {
        return this.d;
    }

    @Override
    public final af a() {
        if (this.c == null) {
            String string;
            ac ac2 = this.d != null ? this.d : v.b;
            if (this.f != null) {
                string = this.f;
            } else {
                i i2 = this;
                int n2 = i2.e;
                i i3 = i2;
                if (i2.h != null) {
                    ad ad2 = i3.h;
                    if (i3.i == null) {
                        Locale.getDefault();
                    }
                    string = ad2.a(n2);
                } else {
                    string = null;
                }
            }
            this.c = new o(ac2, this.e, string);
        }
        return this.c;
    }

    @Override
    public final k b() {
        return this.g;
    }

    @Override
    public final void a(k k2) {
        this.g = k2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append(' ');
        stringBuilder.append(this.a);
        if (this.g != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.g);
        }
        return stringBuilder.toString();
    }
}

