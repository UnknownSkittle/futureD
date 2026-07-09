/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import java.util.Locale;
import org.apache.a.h.a.o;
import org.apache.a.h.a.p;
import org.apache.a.h.a.q;
import org.apache.a.h.a.t;

final class w
extends t {
    private int a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;

    w(String string, String string2, String string3, String object, byte[] byArray, int n2, String string4, byte[] byArray2) {
        this.a = n2;
        string2 = p.c(string2);
        string = p.d(string);
        object = new q(string, string3, (String)object, byArray, string4, byArray2, 0);
        try {
            if ((n2 & 0x800000) != 0 && byArray2 != null && string4 != null) {
                this.f = ((q)object).d();
                this.e = ((q)object).e();
                byArray = (n2 & 0x80) != 0 ? ((q)object).l() : ((q)object).j();
            } else if ((n2 & 0x80000) != 0) {
                this.f = ((q)object).f();
                this.e = ((q)object).g();
                byArray = (n2 & 0x80) != 0 ? ((q)object).l() : ((q)object).k();
            } else {
                this.f = ((q)object).c();
                this.e = ((q)object).b();
                byArray = (n2 & 0x80) != 0 ? ((q)object).l() : ((q)object).i();
            }
        } catch (o o2) {
            this.f = new byte[0];
            this.e = ((q)object).b();
            byArray = (n2 & 0x80) != 0 ? ((q)object).l() : ((q)object).h();
        }
        this.g = (byte[])((n2 & 0x10) != 0 ? ((n2 & 0x40000000) != 0 ? p.b(((q)object).a(), byArray) : byArray) : null);
        if (p.f() == null) {
            throw new o("Unicode not supported");
        }
        this.c = string2 != null ? string2.getBytes(p.f()) : null;
        this.b = string != null ? string.toUpperCase(Locale.ROOT).getBytes(p.f()) : null;
        this.d = string3.getBytes(p.f());
    }

    @Override
    final String b() {
        int n2 = this.f.length;
        int n3 = this.e.length;
        int n4 = this.b != null ? this.b.length : 0;
        int n5 = this.c != null ? this.c.length : 0;
        int n6 = this.d.length;
        int n7 = this.g != null ? this.g.length : 0;
        int n8 = n3 + 72;
        int n9 = n8 + n2;
        int n10 = n9 + n4;
        int n11 = n10 + n6;
        int n12 = n11 + n5;
        int n13 = n12 + n7;
        this.a(n13, 3);
        this.c(n3);
        this.c(n3);
        this.d(72);
        this.c(n2);
        this.c(n2);
        this.d(n8);
        this.c(n4);
        this.c(n4);
        this.d(n9);
        this.c(n6);
        this.c(n6);
        this.d(n10);
        this.c(n5);
        this.c(n5);
        this.d(n11);
        this.c(n7);
        this.c(n7);
        this.d(n12);
        w w2 = this;
        w2.d(w2.a & 0x80 | this.a & 0x200 | this.a & 0x80000 | 0x2000000 | this.a & 0x8000 | this.a & 0x20 | this.a & 0x10 | this.a & 0x20000000 | this.a & Integer.MIN_VALUE | this.a & 0x40000000 | this.a & 0x800000 | this.a & 1 | this.a & 4);
        this.c(261);
        this.d(2600);
        this.c(3840);
        w w3 = this;
        w3.b(w3.e);
        w w4 = this;
        w4.b(w4.f);
        w w5 = this;
        w5.b(w5.b);
        w w6 = this;
        w6.b(w6.d);
        w w7 = this;
        w7.b(w7.c);
        if (this.g != null) {
            w w8 = this;
            w8.b(w8.g);
        }
        return super.b();
    }
}

