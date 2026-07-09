/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import java.util.Map;

final class af<K, V>
implements Map.Entry<K, V> {
    af<K, V> a;
    af<K, V> b;
    af<K, V> c;
    af<K, V> d;
    af<K, V> e;
    final K f;
    V g;
    int h;

    af() {
        af af2;
        this.f = null;
        af2 = af2.d = (af2.e = this);
    }

    af(af<K, V> af2, K k2, af<K, V> af3, af<K, V> af4) {
        this.a = af2;
        this.f = k2;
        this.h = 1;
        this.d = af3;
        this.e = af4;
        af4.d = this;
        af3.e = this;
    }

    @Override
    public final K getKey() {
        return this.f;
    }

    @Override
    public final V getValue() {
        return this.g;
    }

    @Override
    public final V setValue(V v2) {
        V v3 = this.g;
        this.g = v2;
        return v3;
    }

    @Override
    public final boolean equals(Object object) {
        if (object instanceof Map.Entry) {
            object = (Map.Entry)object;
            return (this.f == null ? object.getKey() == null : this.f.equals(object.getKey())) && (this.g == null ? object.getValue() == null : this.g.equals(object.getValue()));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.f == null ? 0 : this.f.hashCode()) ^ (this.g == null ? 0 : this.g.hashCode());
    }

    public final String toString() {
        return this.f + "=" + this.g;
    }
}

