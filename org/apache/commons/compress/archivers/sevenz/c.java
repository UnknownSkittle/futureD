/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.util.BitSet;
import org.apache.commons.compress.archivers.sevenz.ac;
import org.apache.commons.compress.archivers.sevenz.ad;
import org.apache.commons.compress.archivers.sevenz.t;
import org.apache.commons.compress.archivers.sevenz.w;

final class c {
    long a;
    long[] b;
    BitSet c;
    long[] d;
    t[] e;
    ad f;
    w[] g;
    ac h;

    c() {
    }

    public final String toString() {
        return "Archive with packed streams starting at offset " + this.a + ", " + org.apache.commons.compress.archivers.sevenz.c.a(this.b) + " pack sizes, " + org.apache.commons.compress.archivers.sevenz.c.a(this.d) + " CRCs, " + org.apache.commons.compress.archivers.sevenz.c.a(this.e) + " folders, " + org.apache.commons.compress.archivers.sevenz.c.a(this.g) + " files and " + this.h;
    }

    private static String a(long[] lArray) {
        if (lArray == null) {
            return "(null)";
        }
        return String.valueOf(lArray.length);
    }

    private static String a(Object[] objectArray) {
        if (objectArray == null) {
            return "(null)";
        }
        return String.valueOf(objectArray.length);
    }
}

