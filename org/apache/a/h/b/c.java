/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.apache.a.b.e;

public final class c
implements Serializable,
e {
    private final TreeSet<org.apache.a.f.c> a = new TreeSet<org.apache.a.f.c>(new org.apache.a.f.e());

    @Override
    public final synchronized void a(org.apache.a.f.c c2) {
        if (c2 != null) {
            this.a.remove(c2);
            if (!c2.a(new Date())) {
                this.a.add(c2);
            }
        }
    }

    @Override
    public final synchronized List<org.apache.a.f.c> a() {
        return new ArrayList<org.apache.a.f.c>(this.a);
    }

    @Override
    public final synchronized boolean a(Date date) {
        boolean bl2 = false;
        Iterator<org.apache.a.f.c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().a(date)) continue;
            iterator.remove();
            bl2 = true;
        }
        return bl2;
    }

    public final synchronized String toString() {
        return this.a.toString();
    }
}

