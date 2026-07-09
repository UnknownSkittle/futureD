/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import java.util.Date;
import org.apache.a.f.n;
import org.apache.a.h.d.c;

public final class d
extends c
implements n {
    private String a;
    private int[] b;
    private boolean c;

    public d(String string, String string2) {
        super(string, string2);
    }

    @Override
    public final int[] f() {
        return this.b;
    }

    @Override
    public final void a(int[] nArray) {
        this.b = nArray;
    }

    @Override
    public final void a_(String string) {
        this.a = string;
    }

    @Override
    public final void j() {
        this.c = true;
    }

    @Override
    public final boolean a(Date date) {
        return this.c || super.a(date);
    }

    @Override
    public final Object clone() {
        d d2 = (d)super.clone();
        if (this.b != null) {
            d2.b = (int[])this.b.clone();
        }
        return d2;
    }
}

