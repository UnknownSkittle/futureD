/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

import org.apache.commons.compress.archivers.b;

public final class h
extends b {
    private final String a;

    public h(String string) {
        super("The " + string + " doesn't support streaming.");
        this.a = string;
    }
}

