/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import com.a.a.r;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.a.e;
import org.apache.a.h;

public final class l
implements h {
    private List<e> a;
    private int b;
    private int c;
    private String d;

    public l(List<e> list, String string) {
        this.a = ai.a(list, "Header list");
        this.d = string;
        this.b = this.a(-1);
        this.c = -1;
    }

    private int a(int n2) {
        if (n2 < -1) {
            return -1;
        }
        int n3 = this.a.size() - 1;
        boolean bl2 = false;
        while (!bl2 && n2 < n3) {
            boolean bl3;
            int n4 = ++n2;
            l l2 = this;
            if (l2.d == null) {
                bl3 = true;
            } else {
                String string = l2.a.get(n4).c();
                bl3 = l2.d.equalsIgnoreCase(string);
            }
            bl2 = bl3;
        }
        if (bl2) {
            return n2;
        }
        return -1;
    }

    @Override
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override
    public final e a() {
        int n2 = this.b;
        if (n2 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.c = n2;
        this.b = this.a(n2);
        return this.a.get(n2);
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        r.a(this.c >= 0, "No header to remove");
        this.a.remove(this.c);
        this.c = -1;
        --this.b;
    }
}

