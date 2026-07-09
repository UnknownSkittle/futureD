/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.d.a;
import com.a.a.d.d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

final class ad
extends ag<AtomicIntegerArray> {
    ad() {
    }

    private static AtomicIntegerArray a(a object) {
        int n2;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ((a)object).a();
        while (((a)object).e()) {
            try {
                n2 = ((a)object).m();
                arrayList.add(n2);
            } catch (NumberFormatException numberFormatException) {
                throw new ac(numberFormatException);
            }
        }
        ((a)object).b();
        n2 = arrayList.size();
        object = new AtomicIntegerArray(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            ((AtomicIntegerArray)object).set(i2, (Integer)arrayList.get(i2));
        }
        return object;
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return ad.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        object = (AtomicIntegerArray)object;
        d2.b();
        int n2 = ((AtomicIntegerArray)object).length();
        for (int i2 = 0; i2 < n2; ++i2) {
            d2.a((long)((AtomicIntegerArray)object).get(i2));
        }
        d2.c();
    }
}

