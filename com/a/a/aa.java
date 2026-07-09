/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.b.ai;
import com.a.a.b.x;
import com.a.a.v;
import java.math.BigInteger;

public final class aa
extends v {
    private static final Class<?>[] a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object b;

    public aa(Boolean bl2) {
        this.a(bl2);
    }

    public aa(Number number) {
        this.a(number);
    }

    public aa(String string) {
        this.a(string);
    }

    aa(Object object) {
        this.a(object);
    }

    private void a(Object object) {
        if (object instanceof Character) {
            char c2 = ((Character)object).charValue();
            this.b = String.valueOf(c2);
            return;
        }
        ai.a(object instanceof Number || aa.b(object));
        this.b = object;
    }

    public final boolean h() {
        return this.b instanceof Boolean;
    }

    @Override
    public final boolean f() {
        if (this.b instanceof Boolean) {
            return (Boolean)this.b;
        }
        return Boolean.parseBoolean(this.b());
    }

    public final boolean i() {
        return this.b instanceof Number;
    }

    @Override
    public final Number a() {
        if (this.b instanceof String) {
            return new x((String)this.b);
        }
        return (Number)this.b;
    }

    public final boolean j() {
        return this.b instanceof String;
    }

    @Override
    public final String b() {
        if (this.b instanceof Number) {
            return this.a().toString();
        }
        if (this.b instanceof Boolean) {
            return ((Boolean)this.b).toString();
        }
        return (String)this.b;
    }

    @Override
    public final double c() {
        if (this.b instanceof Number) {
            return this.a().doubleValue();
        }
        return Double.parseDouble(this.b());
    }

    @Override
    public final long d() {
        if (this.b instanceof Number) {
            return this.a().longValue();
        }
        return Long.parseLong(this.b());
    }

    @Override
    public final int e() {
        if (this.b instanceof Number) {
            return this.a().intValue();
        }
        return Integer.parseInt(this.b());
    }

    private static boolean b(Object clazz) {
        if (clazz instanceof String) {
            return true;
        }
        clazz = clazz.getClass();
        Class<?>[] classArray = a;
        for (int i2 = 0; i2 < 16; ++i2) {
            if (!classArray[i2].isAssignableFrom(clazz)) continue;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == null) {
            return 31;
        }
        if (aa.a(this)) {
            long l2 = this.a().longValue();
            return (int)(l2 ^ l2 >>> 32);
        }
        if (this.b instanceof Number) {
            long l3 = Double.doubleToLongBits(this.a().doubleValue());
            return (int)(l3 ^ l3 >>> 32);
        }
        return this.b.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        object = (aa)object;
        if (this.b == null) {
            return ((aa)object).b == null;
        }
        if (aa.a(this) && aa.a((aa)object)) {
            return this.a().longValue() == ((aa)object).a().longValue();
        }
        if (this.b instanceof Number && ((aa)object).b instanceof Number) {
            double d2;
            double d3 = this.a().doubleValue();
            return d3 == (d2 = ((aa)object).a().doubleValue()) || Double.isNaN(d3) && Double.isNaN(d2);
        }
        return this.b.equals(((aa)object).b);
    }

    private static boolean a(aa object) {
        if (((aa)object).b instanceof Number) {
            object = (Number)((aa)object).b;
            return object instanceof BigInteger || object instanceof Long || object instanceof Integer || object instanceof Short || object instanceof Byte;
        }
        return false;
    }
}

