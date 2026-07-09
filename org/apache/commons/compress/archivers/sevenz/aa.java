/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import org.apache.commons.compress.archivers.sevenz.k;
import org.apache.commons.compress.archivers.sevenz.z;

public final class aa {
    private final z a;
    private final Object b;

    public aa(z z2, Object object) {
        this.a = z2;
        this.b = object;
        if (object != null && !k.a(z2).a(object)) {
            throw new IllegalArgumentException("The " + (Object)((Object)z2) + " method doesn't support options of type " + object.getClass());
        }
    }

    public final z a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }
}

