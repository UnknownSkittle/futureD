/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.d;
import com.a.a.e;
import com.a.a.f;
import com.a.a.g;
import com.a.a.h;
import com.a.a.i;
import com.a.a.j;

public abstract class c
extends Enum<c>
implements j {
    public static final /* enum */ c a = new d();
    private static /* enum */ c b = new e();
    private static /* enum */ c c = new f();
    private static /* enum */ c d = new g();
    private static /* enum */ c e = new h();
    private static /* enum */ c f = new i();
    private static final /* synthetic */ c[] g;

    public static c[] values() {
        return (c[])g.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c() {
    }

    static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (Character.isUpperCase(c2) && stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        int n3 = string.charAt(0);
        int n4 = string.length();
        while (n2 < n4 - 1 && !Character.isLetter((char)n3)) {
            stringBuilder.append((char)n3);
            n3 = string.charAt(++n2);
        }
        if (!Character.isUpperCase((char)n3)) {
            char c2 = Character.toUpperCase((char)n3);
            n3 = ++n2;
            String string2 = string;
            char c3 = c2;
            String string3 = n3 < string2.length() ? c3 + string2.substring(n3) : String.valueOf(c3);
            return stringBuilder.append(string3).toString();
        }
        return string;
    }

    /* synthetic */ c(String string, int n2, byte by2) {
        this();
    }

    static {
        g = new c[]{a, b, c, d, e, f};
    }
}

