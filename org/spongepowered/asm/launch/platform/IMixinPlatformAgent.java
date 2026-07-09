/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.launch.platform;

public interface IMixinPlatformAgent {
    public String getPhaseProvider();

    public void prepare();

    public void initPrimaryContainer();

    public void inject();

    public String getLaunchTarget();
}

