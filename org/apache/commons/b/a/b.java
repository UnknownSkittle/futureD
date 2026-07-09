/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.b.a;

import java.io.Serializable;
import java.io.Writer;

public final class b
extends Writer
implements Serializable {
    private final StringBuilder a;

    public b() {
        this.a = new StringBuilder();
    }

    public b(byte by2) {
        this.a = new StringBuilder(4);
    }

    @Override
    public final Writer append(char c2) {
        this.a.append(c2);
        return this;
    }

    @Override
    public final Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override
    public final Writer append(CharSequence charSequence, int n2, int n3) {
        this.a.append(charSequence, n2, n3);
        return this;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void write(String string) {
        if (string != null) {
            this.a.append(string);
        }
    }

    @Override
    public final void write(char[] cArray, int n2, int n3) {
        if (cArray != null) {
            this.a.append(cArray, n2, n3);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

