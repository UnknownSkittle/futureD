/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bo;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.c;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;

public final class aq
extends c {
    public static aq a(Object object) {
        if (object == null || object instanceof aq) {
            return (aq)object;
        }
        if (object instanceof bo) {
            return new aq(((bo)object).a, ((bo)object).b);
        }
        if (object instanceof byte[]) {
            try {
                return (aq)aq.b((byte[])object);
            } catch (Exception exception) {
                throw new IllegalArgumentException("encoding error in getInstance: " + exception.toString());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + object.getClass().getName());
    }

    public aq(byte[] byArray, int n2) {
        super(byArray, n2);
    }

    public aq(byte[] byArray) {
        this(byArray, 0);
    }

    public aq(f f2) {
        super(f2.h().a("DER"), 0);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length + 1) + this.a.length + 1;
    }

    final void a(r r2) {
        byte[] byArray = aq.a(this.a, this.b);
        byte[] byArray2 = new byte[byArray.length + 1];
        byte[] byArray3 = byArray2;
        byArray2[0] = (byte)this.d();
        System.arraycopy(byArray, 0, byArray3, 1, byArray3.length - 1);
        r2.a(3, byArray3);
    }
}

