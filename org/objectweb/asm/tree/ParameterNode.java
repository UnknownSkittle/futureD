/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;

public class ParameterNode {
    public String name;
    public int access;

    public ParameterNode(String string, int n2) {
        this.name = string;
        this.access = n2;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}

