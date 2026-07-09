/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress;

import java.io.IOException;

public final class a
extends IOException {
    public a(String string) {
        super("Cannot read encrypted content from " + string + " without a password.");
    }
}

