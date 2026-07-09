/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.FilterInputStream;
import java.io.IOException;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.r;

public abstract class u
extends m {
    u() {
    }

    public static u b(byte[] object) {
        object = new j((byte[])object);
        try {
            u u2 = ((j)object).b();
            if (((FilterInputStream)object).available() != 0) {
                throw new IOException("Extra data detected in stream");
            }
            return u2;
        } catch (ClassCastException classCastException) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof f && this.a(((f)object).h());
    }

    public final u h() {
        return this;
    }

    u f() {
        return this;
    }

    u g() {
        return this;
    }

    public abstract int hashCode();

    abstract boolean a();

    abstract int e();

    abstract void a(r var1);

    abstract boolean a(u var1);
}

