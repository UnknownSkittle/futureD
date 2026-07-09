/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.b.ai;
import com.a.a.b.v;
import com.a.a.d.c;
import com.a.a.d.d;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class a
extends ag<java.util.Date> {
    private final Class<? extends java.util.Date> a;
    private final List<DateFormat> b = new ArrayList<DateFormat>();

    public a(Class<? extends java.util.Date> clazz, int n2, int n3) {
        if (clazz != java.util.Date.class && clazz != Date.class && clazz != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + java.util.Date.class + ", " + Timestamp.class + ", or " + Date.class + " but was " + clazz);
        }
        this.a = clazz;
        this.b.add(DateFormat.getDateTimeInstance(n2, n3, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(n2, n3));
        }
        if (v.b()) {
            this.b.add(ai.a(n2, n3));
        }
    }

    private java.util.Date a(String string) {
        List<DateFormat> list = this.b;
        synchronized (list) {
            for (DateFormat dateFormat : this.b) {
                try {
                    return dateFormat.parse(string);
                } catch (ParseException parseException) {
                }
            }
            try {
                return com.a.a.b.a.a.a.a(string, new ParsePosition(0));
            } catch (ParseException parseException) {
                throw new ac(string, parseException);
            }
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat)dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final /* synthetic */ Object read(com.a.a.d.a object) {
        Object object2 = object;
        object = this;
        if (((com.a.a.d.a)object2).f() == c.i) {
            ((com.a.a.d.a)object2).j();
            return null;
        }
        object2 = super.a(((com.a.a.d.a)object2).h());
        if (((a)object).a == java.util.Date.class) {
            return object2;
        }
        if (((a)object).a == Timestamp.class) {
            return new Timestamp(((java.util.Date)object2).getTime());
        }
        if (((a)object).a == Date.class) {
            return new Date(((java.util.Date)object2).getTime());
        }
        throw new AssertionError();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final /* synthetic */ void write(d object, Object object2) {
        java.util.Date date = (java.util.Date)object2;
        object2 = object;
        object = this;
        if (date == null) {
            ((d)object2).f();
            return;
        }
        List<DateFormat> list = ((a)object).b;
        synchronized (list) {
            object = ((a)object).b.get(0).format(date);
            ((d)object2).b((String)object);
            return;
        }
    }
}

