/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.mixin.injection.throwables;

public class InjectionError
extends Error {
    private static final long serialVersionUID = 1L;

    public InjectionError() {
    }

    public InjectionError(String message) {
        super(message);
    }

    public InjectionError(Throwable cause) {
        super(cause);
    }

    public InjectionError(String message, Throwable cause) {
        super(message, cause);
    }
}

