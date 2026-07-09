/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

public final class t
extends IllegalStateException {
    private Throwable a;

    public t(String string) {
        super(string);
    }

    public t(String string, Throwable throwable) {
        super(string);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

