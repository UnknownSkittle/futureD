/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.a.h;
import org.apache.a.a.i;
import org.apache.a.a.j;
import org.apache.a.a.m;
import org.apache.a.d;
import org.apache.a.e;
import org.apache.a.m.c;
import org.apache.a.n.b;
import org.apache.a.q;

public abstract class a
implements i {
    private int a;

    @Override
    public void a(e e2) {
        int n2;
        ai.a(e2, "Header");
        CharSequence charSequence = e2.c();
        if (((String)charSequence).equalsIgnoreCase("WWW-Authenticate")) {
            this.a = h.a;
        } else if (((String)charSequence).equalsIgnoreCase("Proxy-Authenticate")) {
            this.a = h.b;
        } else {
            throw new m("Unexpected header name: ".concat(String.valueOf(charSequence)));
        }
        if (e2 instanceof d) {
            charSequence = ((d)e2).a();
            n2 = ((d)e2).b();
        } else {
            String string = e2.d();
            if (string == null) {
                throw new m("Header value is null");
            }
            charSequence = new b(string.length());
            ((b)charSequence).a(string);
            n2 = 0;
        }
        while (n2 < ((b)charSequence).length() && c.a(((b)charSequence).charAt(n2))) {
            ++n2;
        }
        int n3 = n2;
        while (n2 < ((b)charSequence).length() && !c.a(((b)charSequence).charAt(n2))) {
            ++n2;
        }
        int n4 = n2;
        String string = ((b)charSequence).a(n3, n4);
        if (!string.equalsIgnoreCase(this.a())) {
            throw new m("Invalid scheme identifier: ".concat(String.valueOf(string)));
        }
        this.a((b)charSequence, n2, ((b)charSequence).length());
    }

    @Override
    public e a(j j2, q q2, org.apache.a.m.d d2) {
        return this.a(j2, q2);
    }

    protected abstract void a(b var1, int var2, int var3);

    public final boolean e() {
        return this.a != 0 && this.a == h.b;
    }

    public String toString() {
        return this.a().toUpperCase(Locale.ROOT);
    }
}

