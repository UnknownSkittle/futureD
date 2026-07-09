/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a;

import com.a.a.ah;
import com.a.a.b.a.j;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.v;
import com.a.a.w;
import java.io.IOException;

public abstract class ag<T> {
    public abstract void write(d var1, T var2);

    public final ag<T> nullSafe() {
        return new ah(this);
    }

    public final v toJsonTree(T t2) {
        try {
            j j2 = new j();
            this.write(j2, t2);
            return j2.a();
        } catch (IOException iOException) {
            throw new w(iOException);
        }
    }

    public abstract T read(a var1);
}

