/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

public class b
extends Exception {
    public b(String string) {
        super(string);
    }

    public b(String string, Exception exception) {
        super(string);
        this.initCause(exception);
    }
}

