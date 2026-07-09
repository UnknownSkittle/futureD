/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.v;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class u
extends ag<Date> {
    public static final ai a = new v();
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    private synchronized Date a(a a2) {
        if (a2.f() == c.i) {
            a2.j();
            return null;
        }
        try {
            long l2 = this.b.parse(a2.h()).getTime();
            return new Date(l2);
        } catch (ParseException parseException) {
            throw new ac(parseException);
        }
    }

    private synchronized void a(d d2, Date date) {
        d2.b(date == null ? null : this.b.format(date));
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return this.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        this.a(d2, (Date)object);
    }
}

