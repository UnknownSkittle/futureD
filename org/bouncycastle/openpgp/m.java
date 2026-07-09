/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

public class m
extends Exception {
    Exception a;

    public m(String string) {
        super(string);
    }

    public m(String string, Exception exception) {
        super(string);
        this.a = exception;
    }

    public final Exception a() {
        return this.a;
    }

    public Throwable getCause() {
        return this.a;
    }
}

