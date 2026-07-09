/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;

public final class bc
extends r {
    public bc(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a(f f2) {
        if (f2 != null) {
            f2.h().f().a(this);
            return;
        }
        throw new IOException("null object detected");
    }

    final r a() {
        return this;
    }

    final r b() {
        return this;
    }
}

