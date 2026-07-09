/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.mixin.injection.modify;

import org.spongepowered.asm.mixin.throwables.MixinException;

public class InvalidImplicitDiscriminatorException
extends MixinException {
    private static final long serialVersionUID = 1L;

    public InvalidImplicitDiscriminatorException(String message) {
        super(message);
    }

    public InvalidImplicitDiscriminatorException(String message, Throwable cause) {
        super(message, cause);
    }
}

