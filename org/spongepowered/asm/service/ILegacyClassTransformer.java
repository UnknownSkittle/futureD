/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.service;

import org.spongepowered.asm.service.ITransformer;

public interface ILegacyClassTransformer
extends ITransformer {
    public String getName();

    public boolean isDelegationExcluded();

    public byte[] transformClassBytes(String var1, String var2, byte[] var3);
}

