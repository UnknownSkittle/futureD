/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class IincInsnNode
extends AbstractInsnNode {
    public int var;
    public int incr;

    public IincInsnNode(int n2, int n3) {
        super(132);
        this.var = n2;
        this.incr = n3;
    }

    public int getType() {
        return 10;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitIincInsn(this.var, this.incr);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new IincInsnNode(this.var, this.incr).cloneAnnotations(this);
    }
}

