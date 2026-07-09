/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.LabelNode;

public class LocalVariableNode {
    public String name;
    public String desc;
    public String signature;
    public LabelNode start;
    public LabelNode end;
    public int index;

    public LocalVariableNode(String string, String string2, String string3, LabelNode labelNode, LabelNode labelNode2, int n2) {
        this.name = string;
        this.desc = string2;
        this.signature = string3;
        this.start = labelNode;
        this.end = labelNode2;
        this.index = n2;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLocalVariable(this.name, this.desc, this.signature, this.start.getLabel(), this.end.getLabel(), this.index);
    }
}

