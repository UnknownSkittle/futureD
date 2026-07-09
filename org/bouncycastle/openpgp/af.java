/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

public final class af
extends RuntimeException {
    private final Throwable a;

    public af(String string, Throwable throwable) {
        super(string);
        this.a = throwable;
    }

    public final Throwable getCause() {
        return this.a;
    }
}

