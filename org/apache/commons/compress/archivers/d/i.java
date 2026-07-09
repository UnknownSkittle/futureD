/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.io.IOException;

public class i
extends IOException {
    public i() {
    }

    public i(String string) {
        super(string);
    }

    public i(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

