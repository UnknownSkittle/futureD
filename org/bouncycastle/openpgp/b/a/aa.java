/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.openpgp.b.a.ab;
import org.bouncycastle.openpgp.b.o;

final class aa
implements o {
    private MessageDigest a;

    aa() {
        try {
            this.a = MessageDigest.getInstance("SHA1");
            return;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException("cannot find SHA-1: " + noSuchAlgorithmException.getMessage());
        }
    }

    public final int a() {
        return 2;
    }

    public final OutputStream b() {
        aa aa2 = this;
        return new ab(aa2, aa2.a);
    }

    public final byte[] c() {
        return this.a.digest();
    }
}

