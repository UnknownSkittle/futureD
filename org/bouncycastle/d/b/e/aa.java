/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.d.b.e.a;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.y;
import org.bouncycastle.d.b.e.z;

public final class aa {
    private final y a;
    private int b = 0;
    private byte[] c = null;
    private byte[] d = null;
    private byte[] e = null;
    private byte[] f = null;
    private a g = null;
    private byte[] h = null;
    private y i = null;

    public aa(y y2) {
        this.a = y2;
    }

    public final aa a(int n2) {
        this.b = n2;
        return this;
    }

    public final aa a(byte[] byArray) {
        this.c = ad.a(byArray);
        return this;
    }

    public final aa b(byte[] byArray) {
        this.d = ad.a(byArray);
        return this;
    }

    public final aa c(byte[] byArray) {
        this.e = ad.a(byArray);
        return this;
    }

    public final aa d(byte[] byArray) {
        this.f = ad.a(byArray);
        return this;
    }

    public final aa a(a a2) {
        this.g = a2;
        return this;
    }

    public final z a() {
        return new z(this, 0);
    }

    static /* synthetic */ y a(aa aa2) {
        return aa2.a;
    }

    static /* synthetic */ byte[] b(aa aa2) {
        return aa2.c;
    }

    static /* synthetic */ byte[] c(aa aa2) {
        return aa2.d;
    }

    static /* synthetic */ byte[] d(aa aa2) {
        return aa2.e;
    }

    static /* synthetic */ byte[] e(aa aa2) {
        return aa2.f;
    }

    static /* synthetic */ a f(aa aa2) {
        return aa2.g;
    }

    static /* synthetic */ int g(aa aa2) {
        return aa2.b;
    }
}

