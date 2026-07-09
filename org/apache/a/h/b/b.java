/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.b.a;
import org.apache.a.e.m;
import org.apache.a.h.c.k;
import org.apache.a.n;
import org.apache.commons.c.c;

public final class b
implements a {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final Map<n, byte[]> b = new ConcurrentHashMap<n, byte[]>();
    private final m c = k.a;

    private b() {
    }

    public b(byte by2) {
        this();
    }

    private n c(n n2) {
        if (n2.b() <= 0) {
            int n3;
            try {
                n3 = this.c.a(n2);
            } catch (org.apache.a.e.n n4) {
                return n2;
            }
            return new n(n2.a(), n3, n2.c());
        }
        return n2;
    }

    @Override
    public final void a(n n2, org.apache.a.a.b b2) {
        ai.a(n2, "HTTP host");
        if (b2 == null) {
            return;
        }
        if (b2 instanceof Serializable) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(b2);
                objectOutputStream.close();
                this.b.put(this.c(n2), byteArrayOutputStream.toByteArray());
                return;
            } catch (IOException iOException) {
                if (this.a.d()) {
                    this.a.b("Unexpected I/O error while serializing auth scheme", iOException);
                }
                return;
            }
        }
        if (this.a.a()) {
            this.a.a("Auth scheme " + b2.getClass() + " is not serializable");
        }
    }

    @Override
    public final org.apache.a.a.b a(n object) {
        ai.a(object, "HTTP host");
        byte[] byArray = this.b.get(this.c((n)object));
        object = byArray;
        if (byArray != null) {
            try {
                object = new ByteArrayInputStream((byte[])object);
                object = new ObjectInputStream((InputStream)object);
                org.apache.a.a.b b2 = (org.apache.a.a.b)((ObjectInputStream)object).readObject();
                ((ObjectInputStream)object).close();
                return b2;
            } catch (IOException iOException) {
                if (this.a.d()) {
                    this.a.b("Unexpected I/O error while de-serializing auth scheme", iOException);
                }
                return null;
            } catch (ClassNotFoundException classNotFoundException) {
                if (this.a.d()) {
                    this.a.b("Unexpected error while de-serializing auth scheme", classNotFoundException);
                }
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b(n n2) {
        ai.a(n2, "HTTP host");
        this.b.remove(this.c(n2));
    }

    public final String toString() {
        return this.b.toString();
    }
}

