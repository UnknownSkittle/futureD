/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class aw
extends ag<Calendar> {
    aw() {
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        a2.c();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (a2.f() != c.d) {
            String string = a2.g();
            int n8 = a2.m();
            if ("year".equals(string)) {
                n2 = n8;
                continue;
            }
            if ("month".equals(string)) {
                n3 = n8;
                continue;
            }
            if ("dayOfMonth".equals(string)) {
                n4 = n8;
                continue;
            }
            if ("hourOfDay".equals(string)) {
                n5 = n8;
                continue;
            }
            if ("minute".equals(string)) {
                n6 = n8;
                continue;
            }
            if (!"second".equals(string)) continue;
            n7 = n8;
        }
        a2.d();
        return new GregorianCalendar(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        if ((object = (Calendar)object) == null) {
            d2.f();
            return;
        }
        d2.d();
        d2.a("year");
        d2.a((long)((Calendar)object).get(1));
        d2.a("month");
        d2.a((long)((Calendar)object).get(2));
        d2.a("dayOfMonth");
        d2.a((long)((Calendar)object).get(5));
        d2.a("hourOfDay");
        d2.a((long)((Calendar)object).get(11));
        d2.a("minute");
        d2.a((long)((Calendar)object).get(12));
        d2.a("second");
        d2.a((long)((Calendar)object).get(13));
        d2.e();
    }
}

