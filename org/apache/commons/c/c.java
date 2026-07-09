/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.c;

import org.apache.commons.c.a;

public abstract class c {
    private static c a = new org.apache.commons.c.a.c();

    protected c() {
    }

    public abstract a a(Class var1);

    public abstract a a(String var1);

    public static a b(Class clazz) {
        return a.a(clazz);
    }

    public static a b(String string) {
        return a.a(string);
    }
}

