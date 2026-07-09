/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.a;

public final class c
extends IllegalStateException {
    private Throwable a;

    c(String string, Throwable throwable) {
        super(string);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

