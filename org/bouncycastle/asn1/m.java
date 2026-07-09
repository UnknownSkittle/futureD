/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.bc;
import org.bouncycastle.asn1.bp;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;

public abstract class m
implements f {
    public final byte[] j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new r(byteArrayOutputStream).a(this);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] a(String object) {
        if (((String)object).equals("DER")) {
            object = new ByteArrayOutputStream();
            new bc((OutputStream)object).a(this);
            return ((ByteArrayOutputStream)object).toByteArray();
        }
        if (((String)object).equals("DL")) {
            object = new ByteArrayOutputStream();
            new bp((OutputStream)object).a(this);
            return ((ByteArrayOutputStream)object).toByteArray();
        }
        return this.j();
    }

    public int hashCode() {
        return this.h().hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        return this.h().equals(object.h());
    }

    public abstract u h();
}

