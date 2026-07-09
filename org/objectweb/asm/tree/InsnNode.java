/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class InsnNode
extends AbstractInsnNode {
    public InsnNode(int n2) {
        super(n2);
    }

    public int getType() {
        return 0;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(this.opcode);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new InsnNode(this.opcode).cloneAnnotations(this);
    }
}

