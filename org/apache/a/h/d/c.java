/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.f.a;
import org.apache.a.f.m;

public class c
implements Serializable,
Cloneable,
a,
m {
    private final String a;
    private Map<String, String> b;
    private String c;
    private String d;
    private String e;
    private Date f;
    private String g;
    private boolean h;
    private int i;
    private Date j;

    public c(String string, String string2) {
        ai.a(string, "Name");
        this.a = string;
        this.b = new HashMap<String, String>();
        this.c = string2;
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final String b() {
        return this.c;
    }

    @Override
    public final void c(String string) {
        this.d = string;
    }

    @Override
    public final Date c() {
        return this.f;
    }

    @Override
    public final void b(Date date) {
        this.f = date;
    }

    @Override
    public final String d() {
        return this.e;
    }

    @Override
    public final void d(String string) {
        if (string != null) {
            this.e = string.toLowerCase(Locale.ROOT);
            return;
        }
        this.e = null;
    }

    @Override
    public final String e() {
        return this.g;
    }

    @Override
    public final void e(String string) {
        this.g = string;
    }

    @Override
    public final boolean g() {
        return this.h;
    }

    @Override
    public final void i() {
        this.h = true;
    }

    @Override
    public int[] f() {
        return null;
    }

    @Override
    public final int h() {
        return this.i;
    }

    @Override
    public final void a(int n2) {
        this.i = n2;
    }

    @Override
    public boolean a(Date date) {
        ai.a(date, "Date");
        return this.f != null && this.f.getTime() <= date.getTime();
    }

    public final Date k() {
        return this.j;
    }

    public final void c(Date date) {
        this.j = date;
    }

    public final void a(String string, String string2) {
        this.b.put(string, string2);
    }

    @Override
    public final String a(String string) {
        return this.b.get(string);
    }

    @Override
    public final boolean b(String string) {
        return this.b.containsKey(string);
    }

    public Object clone() {
        c c2 = (c)super.clone();
        ((c)super.clone()).b = new HashMap<String, String>(this.b);
        return c2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[version: ");
        stringBuilder.append(Integer.toString(this.i));
        stringBuilder.append("]");
        stringBuilder.append("[name: ");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        stringBuilder.append("[value: ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        stringBuilder.append("[domain: ");
        stringBuilder.append(this.e);
        stringBuilder.append("]");
        stringBuilder.append("[path: ");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        stringBuilder.append("[expiry: ");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

