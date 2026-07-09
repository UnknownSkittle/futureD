/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.OutputStream;
import java.security.MessageDigest;
import org.bouncycastle.openpgp.b.a.aa;

final class ab
extends OutputStream {
    private MessageDigest a;
    private /* synthetic */ aa b;

    ab(aa aa2, MessageDigest messageDigest) {
        this.b = aa2;
        this.a = messageDigest;
    }

    public final void write(byte[] byArray, int n2, int n3) {
        this.a.update(byArray, n2, n3);
    }

    public final void write(byte[] byArray) {
        this.a.update(byArray);
    }

    public final void write(int n2) {
        this.a.update((byte)n2);
    }
}

