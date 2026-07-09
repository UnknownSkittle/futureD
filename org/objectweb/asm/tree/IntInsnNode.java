/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class IntInsnNode
extends AbstractInsnNode {
    public int operand;

    public IntInsnNode(int n2, int n3) {
        super(n2);
        this.operand = n3;
    }

    public void setOpcode(int n2) {
        this.opcode = n2;
    }

    public int getType() {
        return 1;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitIntInsn(this.opcode, this.operand);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new IntInsnNode(this.opcode, this.operand).cloneAnnotations(this);
    }
}

