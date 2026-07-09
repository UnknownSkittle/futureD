/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;

public final class h
extends IOException {
    private Throwable a;

    h(String string) {
        super(string);
    }

    h(String string, Throwable throwable) {
        super(string);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

