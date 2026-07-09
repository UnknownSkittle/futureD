/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a;

public class m
extends Exception {
    public m() {
    }

    public m(String string) {
        super(string);
    }

    public m(String string, Throwable throwable) {
        super(string);
        this.initCause(throwable);
    }
}

