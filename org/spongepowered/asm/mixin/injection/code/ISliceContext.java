/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.mixin.injection.code;

import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.code.MethodSlice;

public interface ISliceContext
extends IInjectionPointContext {
    public MethodSlice getSlice(String var1);
}

