/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class VarInsnNode
extends AbstractInsnNode {
    public int var;

    public VarInsnNode(int n2, int n3) {
        super(n2);
        this.var = n3;
    }

    public void setOpcode(int n2) {
        this.opcode = n2;
    }

    public int getType() {
        return 2;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(this.opcode, this.var);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new VarInsnNode(this.opcode, this.var).cloneAnnotations(this);
    }
}

