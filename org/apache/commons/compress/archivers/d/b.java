/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.compress.archivers.a;

public final class b
implements a {
    private final String a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;

    public b(String string, long l2) {
        this(string, l2, 0, 0, 33188, System.currentTimeMillis() / 1000L);
    }

    public b(String string, long l2, int n2, int n3, int n4, long l3) {
        this.a = string;
        this.f = l2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = l3;
    }

    @Override
    public final String getName() {
        return this.a;
    }

    public final long a() {
        return this.f;
    }

    public final int hashCode() {
        return 31 + (this.a == null ? 0 : this.a.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        object = (b)object;
        if (this.a == null) {
            return ((b)object).a == null;
        }
        return this.a.equals(((b)object).a);
    }

    public static long a(byte[] byArray, int n2, int n3) {
        if (n3 > 8) {
            throw new IllegalArgumentException("can't read more than eight bytes into a long value");
        }
        long l2 = 0L;
        for (int i2 = 0; i2 < n3; ++i2) {
            l2 |= ((long)byArray[n2 + i2] & 0xFFL) << (i2 << 3);
        }
        return l2;
    }

    public static void a(byte[] byArray, long l2, int n2, int n3) {
        long l3 = l2;
        for (int i2 = 0; i2 < n3; ++i2) {
            byArray[n2 + i2] = (byte)(l3 & 0xFFL);
            l3 >>= 8;
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> iterator) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(iterator);
        boolean bl2 = false;
        while (iterator.hasNext()) {
            bl2 |= collection.add(iterator.next());
        }
        return bl2;
    }
}

