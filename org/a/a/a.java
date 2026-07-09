/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

final class a {
    private final StringBuilder a;
    private int b = 0;

    public a() {
        this.a = new StringBuilder();
    }

    public a(String string) {
        this.a = new StringBuilder(string);
    }

    public final void a(CharSequence charSequence) {
        if (this.b != 0) {
            this.a.append('\n');
        }
        this.a.append(charSequence);
        ++this.b;
    }

    public final String a() {
        return this.a.toString();
    }
}

