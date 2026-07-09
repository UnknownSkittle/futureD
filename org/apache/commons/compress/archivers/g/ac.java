/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.m;
import org.apache.commons.compress.archivers.g.n;
import org.apache.commons.compress.archivers.g.o;

public class ac
extends m {
    private int a;
    private n b;
    private int c;
    private int d;
    private long e;
    private o f;
    private int g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;

    public ac() {
        super(new ax(23));
    }

    @Override
    public final void a(byte[] object, int n2, int n3) {
        super.a((byte[])object, n2, n3);
        n3 = n2;
        byte[] byArray = object;
        object = this;
        int n4 = ax.a(byArray, n3);
        object.h = new byte[n4];
        System.arraycopy(byArray, n3 + 4, object.h, 0, n4);
        object.a = ax.a(byArray, n3 + n4 + 6);
        object.b = n.a(ax.a(byArray, n3 + n4 + 8));
        object.c = ax.a(byArray, n3 + n4 + 10);
        object.d = ax.a(byArray, n3 + n4 + 12);
        int n5 = ax.a(byArray, n3 + n4 + 14);
        object.i = new byte[n5];
        System.arraycopy(byArray, n3 + n4 + 16, object.i, 0, n5);
        object.e = av.b(byArray, n3 + n4 + 16 + n5);
        System.out.println("rcount: " + object.e);
        if (object.e == 0L) {
            int n6 = ax.a(byArray, n3 + n4 + 20 + n5);
            object.l = new byte[n6 - 4];
            object.m = new byte[4];
            System.arraycopy(byArray, n3 + n4 + 22 + n5, object.l, 0, n6 - 4);
            System.arraycopy(byArray, n3 + n4 + 22 + n5 + n6 - 4, object.m, 0, 4);
            return;
        }
        object.f = o.a(ax.a(byArray, n3 + n4 + 20 + n5));
        object.g = ax.a(byArray, n3 + n4 + 22 + n5);
        int n7 = ax.a(byArray, n3 + n4 + 24 + n5);
        object.j = new byte[object.g];
        object.k = new byte[n7 - object.g];
        System.arraycopy(byArray, n3 + n4 + 24 + n5, object.j, 0, object.g);
        System.arraycopy(byArray, n3 + n4 + 24 + n5 + object.g, object.k, 0, n7 - object.g);
        int n8 = ax.a(byArray, n3 + n4 + 26 + n5 + n7);
        object.l = new byte[n8 - 4];
        object.m = new byte[4];
        System.arraycopy(byArray, n3 + n4 + 22 + n5 + n7, object.l, 0, n8 - 4);
        System.arraycopy(byArray, n3 + n4 + 22 + n5 + n7 + n8 - 4, object.m, 0, 4);
    }
}

