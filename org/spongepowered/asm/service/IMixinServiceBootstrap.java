/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.service;

public interface IMixinServiceBootstrap {
    public String getName();

    public String getServiceClassName();

    public void bootstrap();
}

