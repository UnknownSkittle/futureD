/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.a.e;
import org.apache.a.h;
import org.apache.a.j.l;

public final class r
implements Serializable,
Cloneable {
    private final e[] a = new e[0];
    private final List<e> b = new ArrayList<e>(16);

    public final void a() {
        this.b.clear();
    }

    public final void a(e e2) {
        if (e2 == null) {
            return;
        }
        this.b.add(e2);
    }

    public final void b(e e2) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (!this.b.get(i2).c().equalsIgnoreCase(e2.c())) continue;
            this.b.set(i2, e2);
            return;
        }
        this.b.add(e2);
    }

    public final void a(e[] eArray) {
        this.a();
        if (eArray == null) {
            return;
        }
        Collections.addAll(this.b, eArray);
    }

    public final e[] a(String string) {
        ArrayList<e> arrayList = null;
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            e e2 = this.b.get(i2);
            if (!e2.c().equalsIgnoreCase(string)) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<e>();
            }
            arrayList.add(e2);
        }
        if (arrayList != null) {
            ArrayList<e> arrayList2 = arrayList;
            return arrayList2.toArray(new e[arrayList2.size()]);
        }
        return this.a;
    }

    public final e b(String string) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            e e2 = this.b.get(i2);
            if (!e2.c().equalsIgnoreCase(string)) continue;
            return e2;
        }
        return null;
    }

    public final e[] b() {
        return this.b.toArray(new e[this.b.size()]);
    }

    public final boolean c(String string) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (!this.b.get(i2).c().equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public final h c() {
        return new l(this.b, null);
    }

    public final h d(String string) {
        return new l(this.b, string);
    }

    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        return this.b.toString();
    }
}

