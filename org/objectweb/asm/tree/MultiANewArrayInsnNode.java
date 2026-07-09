/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class MultiANewArrayInsnNode
extends AbstractInsnNode {
    public String desc;
    public int dims;

    public MultiANewArrayInsnNode(String string, int n2) {
        super(197);
        this.desc = string;
        this.dims = n2;
    }

    public int getType() {
        return 13;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMultiANewArrayInsn(this.desc, this.dims);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new MultiANewArrayInsnNode(this.desc, this.dims).cloneAnnotations(this);
    }
}

