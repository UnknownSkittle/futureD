/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.b.ai;
import com.a.a.d.d;
import com.a.a.y;
import java.io.IOException;
import java.io.StringWriter;

public abstract class v {
    public final y g() {
        if (this instanceof y) {
            return (y)this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(this)));
    }

    public boolean f() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public Number a() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public long d() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(this.getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            d d2 = new d(stringWriter);
            d2.b(true);
            ai.a(this, d2);
            return stringWriter.toString();
        } catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

