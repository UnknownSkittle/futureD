/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;

public class MethodInsnNode
extends AbstractInsnNode {
    public String owner;
    public String name;
    public String desc;
    public boolean itf;

    public MethodInsnNode(int n2, String string, String string2, String string3) {
        this(n2, string, string2, string3, n2 == 185);
    }

    public MethodInsnNode(int n2, String string, String string2, String string3, boolean bl2) {
        super(n2);
        this.owner = string;
        this.name = string2;
        this.desc = string3;
        this.itf = bl2;
    }

    public void setOpcode(int n2) {
        this.opcode = n2;
    }

    public int getType() {
        return 5;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMethodInsn(this.opcode, this.owner, this.name, this.desc, this.itf);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        return new MethodInsnNode(this.opcode, this.owner, this.name, this.desc, this.itf);
    }
}

