/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b.a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

final class ac
extends OutputStream {
    private Signature a;

    ac(Signature signature) {
        this.a = signature;
    }

    public final void write(byte[] byArray, int n2, int n3) {
        try {
            this.a.update(byArray, n2, n3);
            return;
        } catch (SignatureException signatureException) {
            throw new IOException("signature update caused exception: " + signatureException.getMessage());
        }
    }

    public final void write(byte[] byArray) {
        try {
            this.a.update(byArray);
            return;
        } catch (SignatureException signatureException) {
            throw new IOException("signature update caused exception: " + signatureException.getMessage());
        }
    }

    public final void write(int n2) {
        try {
            this.a.update((byte)n2);
            return;
        } catch (SignatureException signatureException) {
            throw new IOException("signature update caused exception: " + signatureException.getMessage());
        }
    }
}

