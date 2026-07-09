/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import org.bouncycastle.openpgp.b.a.aa;
import org.bouncycastle.openpgp.b.a.y;
import org.bouncycastle.openpgp.b.k;
import org.bouncycastle.openpgp.b.o;

final class z
implements k {
    private /* synthetic */ Cipher a;
    private /* synthetic */ y b;

    z(y y2, Cipher cipher) {
        this.b = y2;
        this.a = cipher;
    }

    public final InputStream a(InputStream inputStream) {
        return new CipherInputStream(inputStream, this.a);
    }

    public final int a() {
        return this.a.getBlockSize();
    }

    public final o b() {
        return new aa();
    }
}

