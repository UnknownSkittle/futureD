/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.a;
import com.a.a.ad;
import com.a.a.ai;
import com.a.a.b;
import com.a.a.b.a.ab;
import com.a.a.b.t;
import com.a.a.c;
import com.a.a.j;
import com.a.a.k;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r {
    private t a = t.a;
    private ad b = ad.a;
    private j c = com.a.a.c.a;
    private final Map<Type, b<?>> d = new HashMap();
    private final List<ai> e = new ArrayList<ai>();
    private final List<ai> f = new ArrayList<ai>();
    private boolean g = false;
    private int h = 2;
    private int i = 2;
    private boolean j = false;
    private boolean k = false;
    private boolean l = true;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public final r a() {
        this.m = true;
        return this;
    }

    public final k b() {
        ArrayList<ai> arrayList = new ArrayList<ai>(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList<ai> arrayList2 = new ArrayList<ai>(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        ArrayList<ai> arrayList3 = arrayList;
        int n2 = this.i;
        int n3 = this.h;
        if (n3 != 2 && n2 != 2) {
            a a2 = new a(Date.class, n3, n2);
            a a3 = new a(Timestamp.class, n3, n2);
            a a4 = new a(java.sql.Date.class, n3, n2);
            arrayList3.add(ab.a(Date.class, a2));
            arrayList3.add(ab.a(Timestamp.class, a3));
            arrayList3.add(ab.a(java.sql.Date.class, a4));
        }
        return new k(this.a, this.c, this.d, this.l, this.m, this.b, this.h, this.i, this.e, this.f, arrayList);
    }

    public static void a(boolean bl2, String string) {
        if (!bl2) {
            throw new IllegalStateException(string);
        }
    }

    public static void a(Object object, String string) {
        if (object == null) {
            throw new IllegalStateException(string + " is null");
        }
    }
}

