/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.b.a.aa;
import com.a.a.b.a.q;
import com.a.a.b.a.t;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.k;
import java.lang.reflect.Field;

final class r
extends t {
    private /* synthetic */ Field d;
    private /* synthetic */ boolean e;
    private /* synthetic */ ag f;
    private /* synthetic */ k g;
    private /* synthetic */ com.a.a.c.a h;
    private /* synthetic */ boolean i;
    private /* synthetic */ q j;

    r(q q2, String string, boolean bl2, boolean bl3, Field field, boolean bl4, ag ag2, k k2, com.a.a.c.a a2, boolean bl5) {
        this.j = q2;
        this.d = field;
        this.e = bl4;
        this.f = ag2;
        this.g = k2;
        this.h = a2;
        this.i = bl5;
        super(string, bl2, bl3);
    }

    @Override
    final void a(d d2, Object object) {
        object = this.d.get(object);
        (this.e ? this.f : new aa(this.g, this.f, this.h.getType())).write(d2, object);
    }

    @Override
    final void a(a a2, Object object) {
        if ((a2 = this.f.read(a2)) != null || !this.i) {
            this.d.set(object, a2);
        }
    }

    @Override
    public final boolean a(Object object) {
        if (!this.b) {
            return false;
        }
        return this.d.get(object) != object;
    }
}

