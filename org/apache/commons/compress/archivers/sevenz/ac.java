/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

final class ac {
    int[] a;
    long[] b;
    int[] c;
    int[] d;

    ac() {
    }

    public final String toString() {
        return "StreamMap with indices of " + this.a.length + " folders, offsets of " + this.b.length + " packed streams, first files of " + this.c.length + " folders and folder indices for " + this.d.length + " files";
    }
}

