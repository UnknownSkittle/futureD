/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import java.util.LinkedList;
import java.util.ListIterator;
import org.a.b.v;
import org.a.c.b.a;
import org.a.c.b.b;

final class ab
implements a {
    private final char a;
    private int b = 0;
    private LinkedList<a> c = new LinkedList();

    ab(char c2) {
        this.a = c2;
    }

    @Override
    public final char a() {
        return this.a;
    }

    @Override
    public final char b() {
        return this.a;
    }

    @Override
    public final int c() {
        return this.b;
    }

    final void a(a a2) {
        int n2 = a2.c();
        ListIterator<a> listIterator = this.c.listIterator();
        boolean bl2 = false;
        while (listIterator.hasNext()) {
            int n3 = ((a)listIterator.next()).c();
            if (n2 > n3) {
                listIterator.previous();
                listIterator.add(a2);
                bl2 = true;
                break;
            }
            if (n2 != n3) continue;
            throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + n2);
        }
        if (!bl2) {
            this.c.add(a2);
            this.b = n2;
        }
    }

    private a a(int n2) {
        for (a a2 : this.c) {
            if (a2.c() > n2) continue;
            return a2;
        }
        return this.c.getFirst();
    }

    @Override
    public final int a(b b2, b b3) {
        return this.a(b2.c()).a(b2, b3);
    }

    @Override
    public final void a(v v2, v v3, int n2) {
        this.a(n2).a(v2, v3, n2);
    }
}

