/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import org.bouncycastle.jcajce.b.b;
import org.bouncycastle.jcajce.b.d;
import org.bouncycastle.openpgp.b.a.h;
import org.bouncycastle.openpgp.b.a.i;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.b.p;
import org.bouncycastle.openpgp.m;

public final class g
implements p {
    private y a = new y(new b());

    public final g a(String string) {
        this.a = new y(new d(string));
        return this;
    }

    public final o a(int n2) {
        i i2;
        MessageDigest messageDigest;
        try {
            messageDigest = this.a.a(n2);
            i2 = new i(this, messageDigest);
        } catch (GeneralSecurityException generalSecurityException) {
            throw new m("exception on setup: ".concat(String.valueOf(generalSecurityException)), generalSecurityException);
        }
        return new h(this, n2, i2, messageDigest);
    }
}

