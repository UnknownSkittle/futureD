/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.AnnotationNode;

public class TypeAnnotationNode
extends AnnotationNode {
    public int typeRef;
    public TypePath typePath;
    static /* synthetic */ Class class$org$objectweb$asm$tree$TypeAnnotationNode;

    public TypeAnnotationNode(int n2, TypePath typePath, String string) {
        this(327680, n2, typePath, string);
        if (this.getClass() != class$org$objectweb$asm$tree$TypeAnnotationNode) {
            throw new IllegalStateException();
        }
    }

    public TypeAnnotationNode(int n2, int n3, TypePath typePath, String string) {
        super(n2, string);
        this.typeRef = n3;
        this.typePath = typePath;
    }

    static /* synthetic */ Class class$(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classNotFoundException) {
            String string2 = classNotFoundException.getMessage();
            throw new NoClassDefFoundError(string2);
        }
    }

    static {
        class$org$objectweb$asm$tree$TypeAnnotationNode = TypeAnnotationNode.class$("org.objectweb.asm.tree.TypeAnnotationNode");
    }
}

