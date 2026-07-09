/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.a.a.b.y$com.a.a.b.aa
 *  com.a.a.b.y$com.a.a.b.ac
 */
package com.a.a.b;

import com.a.a.b.af;
import com.a.a.b.y;
import com.a.a.b.z;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public final class y<K, V>
extends AbstractMap<K, V>
implements Serializable {
    private static final Comparator<Comparable> d = new z();
    private Comparator<? super K> e;
    private af<K, V> f;
    int a = 0;
    int b = 0;
    final af<K, V> c = new af();
    private aa g;
    private ac h;

    public y() {
        this(d);
    }

    private y(Comparator<? super K> comparator) {
        this.e = comparator != null ? comparator : d;
    }

    @Override
    public final int size() {
        return this.a;
    }

    @Override
    public final V get(Object af2) {
        if ((af2 = this.b((Object)af2)) != null) {
            return af2.g;
        }
        return null;
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.b(object) != null;
    }

    @Override
    public final V put(K object, V v2) {
        if (object == null) {
            throw new NullPointerException("key == null");
        }
        object = this.a(object, true);
        Object v3 = ((af)object).g;
        ((af)object).g = v2;
        return v3;
    }

    @Override
    public final void clear() {
        this.f = null;
        this.a = 0;
        ++this.b;
        this.c.e = this.c.e;
        this.c.e.d = this.c.e;
    }

    @Override
    public final V remove(Object af2) {
        if ((af2 = this.a((Object)af2)) != null) {
            return af2.g;
        }
        return null;
    }

    private af<K, V> a(K k2, boolean bl2) {
        af<K, V> af2;
        Object object;
        Comparator<K> comparator = this.e;
        af<K, V> af3 = this.f;
        int n2 = 0;
        if (af3 != null) {
            object = comparator == d ? (Comparable)k2 : null;
            while (true) {
                if ((n2 = object != null ? object.compareTo(af3.f) : comparator.compare(k2, af3.f)) == 0) {
                    return af3;
                }
                af2 = n2 < 0 ? af3.b : af3.c;
                if (af2 == null) break;
                af3 = af2;
            }
        }
        if (!bl2) {
            return null;
        }
        object = this.c;
        if (af3 == null) {
            if (comparator == d && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            Object object2 = object;
            af2 = new af<K, V>(af3, k2, object2, ((af)object2).e);
            this.f = af2;
        } else {
            Object object3 = object;
            af2 = new af<K, V>(af3, k2, object3, ((af)object3).e);
            if (n2 < 0) {
                af3.b = af2;
            } else {
                af3.c = af2;
            }
            this.b(af3, true);
        }
        ++this.a;
        ++this.b;
        return af2;
    }

    private af<K, V> b(Object object) {
        try {
            if (object != null) {
                return this.a(object, false);
            }
            return null;
        } catch (ClassCastException classCastException) {
            return null;
        }
    }

    final af<K, V> a(Map.Entry<?, ?> entry) {
        Object obj;
        af<K, V> af2 = this.b(entry.getKey());
        if (af2 != null && ((entry = af2.g) == (obj = entry.getValue()) || entry != null && ((Object)entry).equals(obj))) {
            return af2;
        }
        return null;
    }

    final void a(af<K, V> af2, boolean bl2) {
        if (bl2) {
            af2.e.d = af2.d;
            af2.d.e = af2.e;
        }
        af af3 = af2.b;
        af af4 = af2.c;
        af af5 = af2.a;
        if (af3 != null && af4 != null) {
            af af6;
            if (af3.h > af4.h) {
                af4 = af3.c;
                while (af4 != null) {
                    af3 = af4;
                    af4 = af3.c;
                }
                af6 = af3;
            } else {
                do {
                    af3 = af4;
                } while ((af4 = af3.b) != null);
                af6 = af3;
            }
            af5 = af6;
            this.a(af5, false);
            int n2 = 0;
            af3 = af2.b;
            if (af3 != null) {
                n2 = af3.h;
                af5.b = af3;
                af3.a = af5;
                af2.b = null;
            }
            int n3 = 0;
            af4 = af2.c;
            if (af4 != null) {
                n3 = af4.h;
                af5.c = af4;
                af4.a = af5;
                af2.c = null;
            }
            af5.h = Math.max(n2, n3) + 1;
            this.a(af2, af5);
            return;
        }
        if (af3 != null) {
            this.a(af2, af3);
            af2.b = null;
        } else if (af4 != null) {
            this.a(af2, af4);
            af2.c = null;
        } else {
            this.a(af2, null);
        }
        this.b(af5, false);
        --this.a;
        ++this.b;
    }

    final af<K, V> a(Object af2) {
        if ((af2 = this.b((Object)af2)) != null) {
            this.a(af2, true);
        }
        return af2;
    }

    private void a(af<K, V> af2, af<K, V> af3) {
        af af4 = af2.a;
        af2.a = null;
        if (af3 != null) {
            af3.a = af4;
        }
        if (af4 != null) {
            if (af4.b == af2) {
                af4.b = af3;
                return;
            }
            assert (af4.c == af2);
            af4.c = af3;
            return;
        }
        this.f = af3;
    }

    private void b(af<K, V> af2, boolean bl2) {
        while (af2 != null) {
            af af3;
            int n2;
            af af4 = af2.b;
            int n3 = af4 != null ? af4.h : 0;
            int n4 = n3 - (n2 = (af3 = af2.c) != null ? af3.h : 0);
            if (n4 == -2) {
                af af5;
                af af6 = af3.b;
                n3 = (af6 != null ? af6.h : 0) - (n2 = (af5 = af3.c) != null ? af5.h : 0);
                if (n3 == -1 || n3 == 0 && !bl2) {
                    this.a(af2);
                } else {
                    assert (n3 == 1);
                    this.b(af3);
                    this.a(af2);
                }
                if (bl2) break;
            } else if (n4 == 2) {
                af af7;
                af af8 = af4.b;
                n3 = (af8 != null ? af8.h : 0) - (n2 = (af7 = af4.c) != null ? af7.h : 0);
                if (n3 == 1 || n3 == 0 && !bl2) {
                    this.b(af2);
                } else {
                    assert (n3 == -1);
                    this.a(af4);
                    this.b(af2);
                }
                if (bl2) break;
            } else if (n4 == 0) {
                af2.h = n3 + 1;
                if (bl2) {
                    return;
                }
            } else {
                assert (n4 == -1 || n4 == 1);
                af2.h = Math.max(n3, n2) + 1;
                if (!bl2) break;
            }
            af2 = af2.a;
        }
    }

    private void a(af<K, V> af2) {
        af af3 = af2.b;
        af af4 = af2.c;
        af af5 = af4.b;
        af af6 = af4.c;
        af2.c = af5;
        if (af5 != null) {
            af5.a = af2;
        }
        this.a(af2, af4);
        af4.b = af2;
        af2.a = af4;
        af2.h = Math.max(af3 != null ? af3.h : 0, af5 != null ? af5.h : 0) + 1;
        af4.h = Math.max(af2.h, af6 != null ? af6.h : 0) + 1;
    }

    private void b(af<K, V> af2) {
        af af3 = af2.b;
        af af4 = af2.c;
        af af5 = af3.b;
        af af6 = af3.c;
        af2.b = af6;
        if (af6 != null) {
            af6.a = af2;
        }
        this.a(af2, af3);
        af3.c = af2;
        af2.a = af3;
        af2.h = Math.max(af4 != null ? af4.h : 0, af6 != null ? af6.h : 0) + 1;
        af3.h = Math.max(af2.h, af5 != null ? af5.h : 0) + 1;
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        aa aa2 = this.g;
        if (aa2 != null) {
            return aa2;
        }
        this.g = new com.a.a.b.aa(this);
        return this.g;
    }

    @Override
    public final Set<K> keySet() {
        ac ac2 = this.h;
        if (ac2 != null) {
            return ac2;
        }
        this.h = new com.a.a.b.ac(this);
        return this.h;
    }
}

