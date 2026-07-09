/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.a.a;
import com.a.a.b.a.f;
import com.a.a.b.v;
import com.a.a.d.c;
import com.a.a.d.d;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class e
extends ag<Date> {
    public static final ai a = new f();
    private final List<DateFormat> b = new ArrayList<DateFormat>();

    public e() {
        this.b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (v.b()) {
            this.b.add(com.a.a.b.ai.a(2, 2));
        }
    }

    private synchronized Date a(String string) {
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

    private synchronized void a(d d2, Date object) {
        if (object == null) {
            d2.f();
            return;
        }
        object = this.b.get(0).format((Date)object);
        d2.b((String)object);
    }

    @Override
    public final /* synthetic */ Object read(com.a.a.d.a object) {
        com.a.a.d.a a2 = object;
        object = this;
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        return super.a(a2.h());
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        this.a(d2, (Date)object);
    }
}

