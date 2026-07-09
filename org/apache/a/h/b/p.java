/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class p
extends AbstractList<Object> {
    private final Set<URI> a = new HashSet<URI>();
    private final List<URI> b = new ArrayList<URI>();

    public final boolean a(URI uRI) {
        return this.a.contains(uRI);
    }

    public final void b(URI uRI) {
        this.a.add(uRI);
        this.b.add(uRI);
    }

    @Override
    public final int size() {
        return this.b.size();
    }

    @Override
    public final Object set(int n2, Object object) {
        URI uRI = this.b.set(n2, (URI)object);
        this.a.remove(uRI);
        this.a.add((URI)object);
        if (this.b.size() != this.a.size()) {
            this.a.addAll(this.b);
        }
        return uRI;
    }

    @Override
    public final void add(int n2, Object object) {
        this.b.add(n2, (URI)object);
        this.a.add((URI)object);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public final /* synthetic */ Object remove(int n2) {
        int n3 = n2;
        p p2 = this;
        URI uRI = p2.b.remove(n3);
        p2.a.remove(uRI);
        if (p2.b.size() != p2.a.size()) {
            p2.a.addAll(p2.b);
        }
        return uRI;
    }
}

