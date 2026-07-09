/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.bouncycastle.openpgp.d;

final class f
extends DeflaterOutputStream {
    private /* synthetic */ d a;

    public f(d d2, OutputStream outputStream, int n2, boolean bl2) {
        this.a = d2;
        super(outputStream, new Deflater(n2, bl2));
    }

    public final void close() {
        this.finish();
        this.def.end();
    }
}

