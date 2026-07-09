/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.TypeAnnotationNode;

public class TryCatchBlockNode {
    public LabelNode start;
    public LabelNode end;
    public LabelNode handler;
    public String type;
    public List visibleTypeAnnotations;
    public List invisibleTypeAnnotations;

    public TryCatchBlockNode(LabelNode labelNode, LabelNode labelNode2, LabelNode labelNode3, String string) {
        this.start = labelNode;
        this.end = labelNode2;
        this.handler = labelNode3;
        this.type = string;
    }

    public void updateIndex(int n2) {
        TypeAnnotationNode typeAnnotationNode;
        Iterator iterator;
        int n3 = 0x42000000 | n2 << 8;
        if (this.visibleTypeAnnotations != null) {
            iterator = this.visibleTypeAnnotations.iterator();
            while (iterator.hasNext()) {
                typeAnnotationNode = (TypeAnnotationNode)iterator.next();
                typeAnnotationNode.typeRef = n3;
            }
        }
        if (this.invisibleTypeAnnotations != null) {
            iterator = this.invisibleTypeAnnotations.iterator();
            while (iterator.hasNext()) {
                typeAnnotationNode = (TypeAnnotationNode)iterator.next();
                typeAnnotationNode.typeRef = n3;
            }
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        TypeAnnotationNode typeAnnotationNode;
        int n2;
        methodVisitor.visitTryCatchBlock(this.start.getLabel(), this.end.getLabel(), this.handler == null ? null : this.handler.getLabel(), this.type);
        int n3 = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (n2 = 0; n2 < n3; ++n2) {
            typeAnnotationNode = (TypeAnnotationNode)this.visibleTypeAnnotations.get(n2);
            typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
        }
        n3 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (n2 = 0; n2 < n3; ++n2) {
            typeAnnotationNode = (TypeAnnotationNode)this.invisibleTypeAnnotations.get(n2);
            typeAnnotationNode.accept(methodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, false));
        }
    }
}

