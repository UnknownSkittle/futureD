/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a;

import java.nio.charset.CharacterCodingException;

public final class x
extends CharacterCodingException {
    private final String a;

    public x(String string) {
        this.a = string;
    }

    @Override
    public final String getMessage() {
        return this.a;
    }
}

