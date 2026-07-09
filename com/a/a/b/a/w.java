/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ac;
import com.a.a.ag;
import com.a.a.ai;
import com.a.a.b.a.x;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class w
extends ag<Time> {
    public static final ai a = new x();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    private synchronized Time a(a object) {
        if (((a)object).f() == c.i) {
            ((a)object).j();
            return null;
        }
        try {
            object = this.b.parse(((a)object).h());
            return new Time(((Date)object).getTime());
        } catch (ParseException parseException) {
            throw new ac(parseException);
        }
    }

    private synchronized void a(d d2, Time time) {
        d2.b(time == null ? null : this.b.format(time));
    }

    @Override
    public final /* synthetic */ Object read(a a2) {
        return this.a(a2);
    }

    @Override
    public final /* synthetic */ void write(d d2, Object object) {
        this.a(d2, (Time)object);
    }
}

