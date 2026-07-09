/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.b;

import com.a.a.b.b.a;
import com.a.a.b.b.c;
import com.a.a.b.v;
import java.lang.reflect.AccessibleObject;

public abstract class b {
    private static final b a = v.a() < 9 ? new a() : new c();

    public abstract void a(AccessibleObject var1);

    public static b a() {
        return a;
    }
}

