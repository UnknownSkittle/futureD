/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import java.io.InterruptedIOException;

public final class g
extends InterruptedIOException {
    public g(String string) {
        super(string);
    }

    public g(String string, Throwable throwable) {
        super(string);
        if (throwable != null) {
            this.initCause(throwable);
        }
    }
}

