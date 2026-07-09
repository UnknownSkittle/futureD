/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import org.apache.commons.compress.archivers.d.i;

public final class r
extends i {
    public r() {
        super("this file uses an unsupported compression algorithm.");
    }

    public r(String string) {
        super("this file uses an unsupported compression algorithm: " + string + ".");
    }
}

