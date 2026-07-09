/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.a.c;
import com.a.a.a.d;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b;
import com.a.a.b.u;
import com.a.a.c.a;
import com.a.a.k;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class t
implements ai,
Cloneable {
    public static final t a = new t();
    private double b = -1.0;
    private int c = 136;
    private boolean d = true;
    private List<b> e = Collections.emptyList();
    private List<b> f = Collections.emptyList();

    private t a() {
        try {
            return (t)super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    @Override
    public final <T> ag<T> a(k k2, a<T> a2) {
        Class<T> clazz = a2.getRawType();
        boolean bl2 = this.a(clazz);
        boolean bl3 = bl2 || this.a(true);
        boolean bl4 = bl2 = bl2 || this.a(false);
        if (!bl3 && !bl2) {
            return null;
        }
        return new u(this, bl2, bl3, k2, a2);
    }

    public final boolean a(Field object, boolean bl2) {
        if ((this.c & ((Field)object).getModifiers()) != 0) {
            return true;
        }
        if (this.b != -1.0 && !this.a(((Field)object).getAnnotation(c.class), ((Field)object).getAnnotation(d.class))) {
            return true;
        }
        if (((Field)object).isSynthetic()) {
            return true;
        }
        if (!this.d && t.c(((Field)object).getType())) {
            return true;
        }
        if (t.b(((Field)object).getType())) {
            return true;
        }
        List<b> list = bl2 ? this.e : this.f;
        if (!list.isEmpty()) {
            new com.a.a.b.ai((Field)object);
            object = list.iterator();
            while (object.hasNext()) {
                if (!((b)object.next()).a()) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(Class<?> clazz) {
        if (this.b != -1.0 && !this.a(clazz.getAnnotation(c.class), clazz.getAnnotation(d.class))) {
            return true;
        }
        if (!this.d && t.c(clazz)) {
            return true;
        }
        return t.b(clazz);
    }

    public final boolean a(Class<?> clazz, boolean bl2) {
        return this.a(clazz) || this.a(bl2);
    }

    private boolean a(boolean bl2) {
        Iterator<b> iterator = (bl2 ? this.e : this.f).iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().b()) continue;
            return true;
        }
        return false;
    }

    private static boolean b(Class<?> clazz) {
        return !Enum.class.isAssignableFrom(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
    }

    private static boolean c(Class<?> clazz) {
        return clazz.isMemberClass() && !t.d(clazz);
    }

    private static boolean d(Class<?> clazz) {
        return (clazz.getModifiers() & 8) != 0;
    }

    private boolean a(c c2, d d2) {
        return this.a(c2) && this.a(d2);
    }

    private boolean a(c c2) {
        return c2 == null || !(c2.a() > this.b);
    }

    private boolean a(d d2) {
        return d2 == null || !(d2.a() <= this.b);
    }

    protected final /* synthetic */ Object clone() {
        return this.a();
    }
}

