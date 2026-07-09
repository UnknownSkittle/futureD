/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import org.apache.commons.compress.archivers.sevenz.i;

abstract class j {
    private final Class<?>[] a;

    protected j(Class<?> ... classArray) {
        this.a = classArray;
    }

    final boolean a(Object object) {
        Class<?>[] classArray = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!classArray[i2].isInstance(object)) continue;
            return true;
        }
        return false;
    }

    Object a(i i2) {
        return null;
    }

    abstract InputStream a(String var1, InputStream var2, long var3, i var5);
}

