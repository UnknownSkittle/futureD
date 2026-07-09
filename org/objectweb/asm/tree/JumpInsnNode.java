/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LabelNode;

public class JumpInsnNode
extends AbstractInsnNode {
    public LabelNode label;

    public JumpInsnNode(int n2, LabelNode labelNode) {
        super(n2);
        this.label = labelNode;
    }

    public void setOpcode(int n2) {
        this.opcode = n2;
    }

    public int getType() {
        return 7;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitJumpInsn(this.opcode, this.label.getLabel());
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new JumpInsnNode(this.opcode, JumpInsnNode.clone(this.label, map)).cloneAnnotations(this);
    }
}

