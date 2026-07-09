/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Serializable;

public final class x
implements Serializable {
    public static final x a = new x("encryption");
    public static final x b = new x("compression method");
    public static final x c = new x("data descriptor");
    public static final x d = new x("splitting");
    public static final x e = new x("unknown compressed size");
    private final String f;

    private x(String string) {
        this.f = string;
    }

    public final String toString() {
        return this.f;
    }
}

