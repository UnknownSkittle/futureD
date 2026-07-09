/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;

public class p
implements au {
    private static ax a = new ax(41246);
    private short b;
    private boolean c;
    private int d = 0;

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return new ax(2 + this.d);
    }

    @Override
    public final ax d() {
        return new ax(2);
    }

    @Override
    public final byte[] e() {
        byte[] byArray = new byte[2 + this.d];
        ax.a(this.b | (this.c ? 32768 : 0), byArray, 0);
        return byArray;
    }

    @Override
    public final byte[] c() {
        return ax.a(this.b | (this.c ? 32768 : 0));
    }

    @Override
    public final void a(byte[] object, int n2, int n3) {
        int n4 = n3;
        int n5 = n2;
        byte[] byArray = object;
        object = this;
        if (n4 < 2) {
            throw new ZipException("Too short content for ResourceAlignmentExtraField (0xa11e): ".concat(String.valueOf(n4)));
        }
        int n6 = ax.a(byArray, n5);
        object.b = (short)(n6 & Short.MAX_VALUE);
        object.c = (n6 & 0x8000) != 0;
        this.d = n3 - 2;
    }
}

