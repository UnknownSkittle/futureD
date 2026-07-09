/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.impactdevelopment.simpletweaker.transform;

import org.objectweb.asm.tree.ClassNode;

public interface ITransformer {
    public void transform(ClassNode var1);

    default public boolean isTarget(String className) {
        return true;
    }
}

