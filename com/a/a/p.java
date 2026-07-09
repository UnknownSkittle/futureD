/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

final class p
extends ag<AtomicLongArray> {
    private /* synthetic */ ag a;

    p(ag ag2) {
        this.a = ag2;
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        a a2 = object;
        object = this;
        ArrayList<Long> arrayList = new ArrayList<Long>();
        a2.a();
        while (a2.e()) {
            long l2 = ((Number)((p)object).a.read(a2)).longValue();
            arrayList.add(l2);
        }
        a2.b();
        int n2 = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            atomicLongArray.set(i2, (Long)arrayList.get(i2));
        }
        return atomicLongArray;
    }

    @Override
    public final /* synthetic */ void write(d object, Object object2) {
        AtomicLongArray atomicLongArray = (AtomicLongArray)object2;
        object2 = object;
        object = this;
        ((d)object2).b();
        int n2 = atomicLongArray.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((p)object).a.write((d)object2, atomicLongArray.get(i2));
        }
        ((d)object2).c();
    }
}

