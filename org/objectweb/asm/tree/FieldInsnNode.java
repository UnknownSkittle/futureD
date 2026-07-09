/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class FieldInsnNode
extends AbstractInsnNode {
    public String owner;
    public String name;
    public String desc;

    public FieldInsnNode(int n2, String string, String string2, String string3) {
        super(n2);
        this.owner = string;
        this.name = string2;
        this.desc = string3;
    }

    public void setOpcode(int n2) {
        this.opcode = n2;
    }

    public int getType() {
        return 4;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new FieldInsnNode(this.opcode, this.owner, this.name, this.desc).cloneAnnotations(this);
    }
}

