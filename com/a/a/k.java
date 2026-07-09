/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ac;
import com.a.a.ad;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b;
import com.a.a.b.a.ab;
import com.a.a.b.a.g;
import com.a.a.b.a.u;
import com.a.a.b.ah;
import com.a.a.b.t;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.d.e;
import com.a.a.j;
import com.a.a.l;
import com.a.a.m;
import com.a.a.n;
import com.a.a.o;
import com.a.a.p;
import com.a.a.q;
import com.a.a.v;
import com.a.a.w;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class k {
    private static com.a.a.c.a<?> a = com.a.a.c.a.get(Object.class);
    private ThreadLocal<Map<com.a.a.c.a<?>, q<?>>> b;
    private Map<com.a.a.c.a<?>, ag<?>> c;
    private com.a.a.b.e d;
    private g e;
    private List<ai> f;
    private t g;
    private j h;
    private Map<Type, b<?>> i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;
    private int r;
    private int s;
    private ad t;
    private List<ai> u;
    private List<ai> v;

    public k() {
        this(com.a.a.b.t.a, com.a.a.c.a, Collections.emptyMap(), true, false, ad.a, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    k(t t2, j j2, Map<Type, b<?>> object, boolean bl2, boolean bl3, ad ad2, int n2, int n3, List<ai> list, List<ai> list2, List<ai> list3) {
        list3 = new ArrayList<ai>(list3);
        list3.add(new a.a.a.g());
        this.b = new ThreadLocal();
        this.c = new ConcurrentHashMap();
        this.g = t2;
        this.h = j2;
        this.i = object;
        this.d = new com.a.a.b.e((Map<Type, b<?>>)object);
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = bl2;
        this.n = bl3;
        this.o = false;
        this.p = false;
        this.t = ad2;
        this.q = null;
        this.r = n2;
        this.s = n3;
        this.u = list;
        this.v = list2;
        object = new ArrayList<ai>();
        object.add(ab.B);
        object.add(com.a.a.b.a.n.a);
        object.add(t2);
        object.addAll(list3);
        object.add(ab.p);
        object.add(ab.g);
        object.add(ab.d);
        object.add(ab.e);
        object.add(ab.f);
        n n4 = ad2 == ad.a ? ab.k : new n();
        object.add(ab.a(Long.TYPE, Long.class, n4));
        Object object2 = this;
        object.add(ab.a(Double.TYPE, Double.class, new l((k)object2)));
        object2 = this;
        object.add(ab.a(Float.TYPE, Float.class, new m((k)object2)));
        object.add(ab.l);
        object.add(ab.h);
        object.add(ab.i);
        object2 = n4;
        object.add(ab.a(AtomicLong.class, new o((ag)object2).nullSafe()));
        object2 = n4;
        object.add(ab.a(AtomicLongArray.class, new p((ag)object2).nullSafe()));
        object.add(ab.j);
        object.add(ab.m);
        object.add(ab.q);
        object.add(ab.r);
        object.add(ab.a(BigDecimal.class, ab.n));
        object.add(ab.a(BigInteger.class, ab.o));
        object.add(ab.s);
        object.add(ab.t);
        object.add(ab.v);
        object.add(ab.w);
        object.add(ab.z);
        object.add(ab.u);
        object.add(ab.b);
        object.add(com.a.a.b.a.e.a);
        object.add(ab.y);
        object.add(com.a.a.b.a.w.a);
        object.add(com.a.a.b.a.u.a);
        object.add(ab.x);
        object.add(com.a.a.b.a.a.a);
        object.add(ab.a);
        object.add(new com.a.a.b.a.c(this.d));
        object.add(new com.a.a.b.a.l(this.d));
        this.e = new g(this.d);
        object.add(this.e);
        object.add(ab.C);
        object.add(new com.a.a.b.a.q(this.d, j2, t2, this.e));
        this.f = Collections.unmodifiableList(object);
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> ag<T> a(com.a.a.c.a<T> a2) {
        ag ag2;
        Object object = this.c.get(a2 == null ? a : a2);
        if (object != null) {
            return object;
        }
        object = this.b.get();
        boolean bl2 = false;
        if (object == null) {
            object = new HashMap();
            this.b.set((Map<com.a.a.c.a<?>, q<?>>)object);
            bl2 = true;
        }
        if ((ag2 = (q<T>)object.get(a2)) != null) {
            return ag2;
        }
        try {
            ag2 = new q<T>();
            object.put(a2, ag2);
            Iterator<ai> iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ag<T> ag3 = iterator.next().a(this, a2);
                if (ag3 == null) continue;
                ag2.a(ag3);
                this.c.put(a2, ag3);
                ag2 = ag3;
                return ag2;
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle ".concat(String.valueOf(a2)));
        } finally {
            object.remove(a2);
            if (bl2) {
                this.b.remove();
            }
        }
    }

    public final <T> ag<T> a(ai ai2, com.a.a.c.a<T> a2) {
        if (!this.f.contains(ai2)) {
            ai2 = this.e;
        }
        boolean bl2 = false;
        for (ai ai3 : this.f) {
            if (!bl2) {
                if (ai3 != ai2) continue;
                bl2 = true;
                continue;
            }
            ag<T> ag2 = ai3.a(this, a2);
            if (ag2 == null) continue;
            return ag2;
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(a2)));
    }

    public final <T> ag<T> a(Class<T> clazz) {
        return this.a(com.a.a.c.a.get(clazz));
    }

    public final String a(v object) {
        StringWriter stringWriter = new StringWriter();
        Object object2 = stringWriter;
        Object object3 = object;
        object = this;
        try {
            Closeable closeable = (Writer)object2;
            object2 = object;
            closeable = new d((Writer)closeable);
            if (((k)object2).n) {
                ((d)closeable).c("  ");
            }
            ((d)closeable).d(false);
            object2 = closeable;
            Object object4 = object;
            v v2 = object3;
            object3 = object2;
            object = v2;
            object2 = object4;
            boolean bl2 = ((d)object3).g();
            ((d)object3).b(true);
            boolean bl3 = ((d)object3).h();
            ((d)object3).c(((k)object2).m);
            boolean bl4 = ((d)object3).i();
            ((d)object3).d(false);
            try {
                com.a.a.b.ai.a((v)object, (d)object3);
            } catch (IOException iOException) {
                throw new w(iOException);
            } catch (AssertionError assertionError) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + ((Throwable)((Object)assertionError)).getMessage(), (Throwable)((Object)assertionError));
            } finally {
                ((d)object3).b(bl2);
                ((d)object3).c(bl3);
                ((d)object3).d(bl4);
            }
        } catch (IOException iOException) {
            throw new w(iOException);
        }
        return stringWriter.toString();
    }

    private static a a(Reader closeable) {
        closeable = new a((Reader)closeable);
        ((a)closeable).a(false);
        return closeable;
    }

    public final <T> T a(String string, Class<T> clazz) {
        string = this.a(string, (Type)clazz);
        return ah.a(clazz).cast(string);
    }

    public final <T> T a(String object, Type type) {
        if (object == null) {
            return null;
        }
        object = new StringReader((String)object);
        return this.a((Reader)object, type);
    }

    private <T> T a(Reader closeable, Type type) {
        closeable = com.a.a.k.a(closeable);
        type = this.a((a)closeable, type);
        com.a.a.k.a(type, (a)closeable);
        return (T)type;
    }

    private static void a(Object object, a a2) {
        try {
            if (object != null && a2.f() != com.a.a.d.c.j) {
                throw new w("JSON document was not fully consumed.");
            }
            return;
        } catch (e e2) {
            throw new ac(e2);
        } catch (IOException iOException) {
            throw new w(iOException);
        }
    }

    private <T> T a(a a2, Type object) {
        boolean bl2 = true;
        boolean bl3 = a2.q();
        a2.a(true);
        try {
            a2.f();
            bl2 = false;
            object = com.a.a.c.a.get((Type)object);
            object = this.a((com.a.a.c.a<T>)object).read(a2);
            return (T)object;
        } catch (EOFException eOFException) {
            if (bl2) {
                return null;
            }
            throw new ac(eOFException);
        } catch (IllegalStateException illegalStateException) {
            throw new ac(illegalStateException);
        } catch (IOException iOException) {
            throw new ac(iOException);
        } catch (AssertionError assertionError) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + ((Throwable)((Object)assertionError)).getMessage(), (Throwable)((Object)assertionError));
        } finally {
            a2.a(bl3);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f + ",instanceCreators:" + this.d + "}";
    }
}

