/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class TypeInsnNode
extends AbstractInsnNode {
    public String desc;

    public TypeInsnNode(int n2, String string) {
        super(n2);
        this.desc = string;
    }

    public void setOpcode(int n2) {
        this.opcode = n2;
    }

    public int getType() {
        return 3;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(this.opcode, this.desc);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new TypeInsnNode(this.opcode, this.desc).cloneAnnotations(this);
    }
}

