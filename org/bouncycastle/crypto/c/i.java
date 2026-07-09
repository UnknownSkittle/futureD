/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.c;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.asn1.k.ac;
import org.bouncycastle.crypto.c.a;
import org.bouncycastle.e.a.f;
import org.bouncycastle.math.ec.a.c.bc;
import org.bouncycastle.math.ec.d;

final class i
extends ab {
    i() {
    }

    protected final aa a() {
        byte[] byArray = f.a("4D696E676875615175985BD3ADBADA21B43A97E2");
        d d2 = a.a(new bc());
        ac ac2 = new ac(d2, f.a("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150"));
        return new aa(d2, ac2, d2.i(), d2.j(), byArray);
    }
}

