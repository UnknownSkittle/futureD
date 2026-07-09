/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.mixin.transformer.ext;

import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

public interface ITargetClassContext {
    public ClassInfo getClassInfo();

    public ClassNode getClassNode();
}

