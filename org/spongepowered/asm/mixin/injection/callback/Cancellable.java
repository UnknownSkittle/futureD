/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.mixin.injection.callback;

import org.spongepowered.asm.mixin.injection.callback.CancellationException;

public interface Cancellable {
    public boolean isCancellable();

    public boolean isCancelled();

    public void cancel() throws CancellationException;
}

