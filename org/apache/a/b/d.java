/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b;

import java.io.IOException;

public final class d
extends IOException {
    public d() {
    }

    public d(String string) {
        super(string);
    }

    public d(Throwable throwable) {
        this.initCause(throwable);
    }
}

