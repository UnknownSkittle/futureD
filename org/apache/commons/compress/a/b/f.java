/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

import org.apache.commons.compress.a.b.b;
import org.apache.commons.compress.a.b.c;
import org.apache.commons.compress.a.b.d;
import org.apache.commons.compress.a.b.i;

final class f
extends d {
    private boolean a;
    private final int b;
    private final c c;
    private final c d;
    private int e;
    private byte[] f;
    private int g;
    private /* synthetic */ b h;

    f(b b2, int n2, int[] nArray, int[] nArray2) {
        this.h = b2;
        super((byte)0);
        this.a = false;
        this.e = 0;
        this.f = new byte[0];
        this.g = 0;
        this.b = n2;
        this.c = org.apache.commons.compress.a.b.b.a(nArray);
        this.d = org.apache.commons.compress.a.b.b.a(nArray2);
    }

    @Override
    final int a() {
        if (this.a) {
            return i.a;
        }
        return this.b;
    }

    @Override
    final int a(byte[] object, int n2, int n3) {
        f f2 = this;
        int n4 = n3;
        n3 = n2;
        byte[] byArray = object;
        object = f2;
        if (f2.a) {
            return -1;
        }
        int n5 = super.b(byArray, n3, n4);
        while (n5 < n4) {
            int n6 = org.apache.commons.compress.a.b.b.a(org.apache.commons.compress.a.b.b.a(((f)object).h), ((f)object).c);
            if (n6 < 256) {
                byArray[n3 + n5++] = org.apache.commons.compress.a.b.b.b(((f)object).h).a((byte)n6);
                continue;
            }
            if (n6 > 256) {
                n6 = org.apache.commons.compress.a.b.b.c()[n6 - 257];
                int n7 = n6 >>> 5;
                n7 = (int)((long)n7 + org.apache.commons.compress.a.b.b.a(((f)object).h, n6 &= 0x1F));
                n6 = org.apache.commons.compress.a.b.b.a(org.apache.commons.compress.a.b.b.a(((f)object).h), ((f)object).d);
                n6 = org.apache.commons.compress.a.b.b.d()[n6];
                int n8 = n6 >>> 4;
                n8 = (int)((long)n8 + org.apache.commons.compress.a.b.b.a(((f)object).h, n6 &= 0xF));
                if (((f)object).f.length < n7) {
                    ((f)object).f = new byte[n7];
                }
                ((f)object).g = n7;
                ((f)object).e = 0;
                org.apache.commons.compress.a.b.b.b(((f)object).h).a(n8, n7, ((f)object).f);
                n5 += super.b(byArray, n3 + n5, n4 - n5);
                continue;
            }
            ((f)object).a = true;
            break;
        }
        return n5;
    }

    private int b(byte[] byArray, int n2, int n3) {
        int n4 = this.g - this.e;
        int n5 = 0;
        if (n4 > 0) {
            n5 = Math.min(n3, n4);
            System.arraycopy(this.f, this.e, byArray, n2, n5);
            this.e += n5;
        }
        return n5;
    }

    @Override
    final boolean b() {
        return !this.a;
    }

    @Override
    final int c() {
        return this.g - this.e;
    }
}

