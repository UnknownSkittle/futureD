/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.TypeAnnotationNode;

public class LocalVariableAnnotationNode
extends TypeAnnotationNode {
    public List start;
    public List end;
    public List index;

    public LocalVariableAnnotationNode(int n2, TypePath typePath, LabelNode[] labelNodeArray, LabelNode[] labelNodeArray2, int[] nArray, String string) {
        this(327680, n2, typePath, labelNodeArray, labelNodeArray2, nArray, string);
    }

    public LocalVariableAnnotationNode(int n2, int n3, TypePath typePath, LabelNode[] labelNodeArray, LabelNode[] labelNodeArray2, int[] nArray, String string) {
        super(n2, n3, typePath, string);
        this.start = new ArrayList(labelNodeArray.length);
        this.start.addAll(Arrays.asList(labelNodeArray));
        this.end = new ArrayList(labelNodeArray2.length);
        this.end.addAll(Arrays.asList(labelNodeArray2));
        this.index = new ArrayList(nArray.length);
        int[] nArray2 = nArray;
        int n4 = nArray2.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = nArray2[i2];
            this.index.add(new Integer(n5));
        }
    }

    public void accept(MethodVisitor methodVisitor, boolean bl2) {
        Label[] labelArray = new Label[this.start.size()];
        Label[] labelArray2 = new Label[this.end.size()];
        int[] nArray = new int[this.index.size()];
        for (int i2 = 0; i2 < labelArray.length; ++i2) {
            labelArray[i2] = ((LabelNode)this.start.get(i2)).getLabel();
            labelArray2[i2] = ((LabelNode)this.end.get(i2)).getLabel();
            nArray[i2] = (Integer)this.index.get(i2);
        }
        this.accept(methodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, labelArray, labelArray2, nArray, this.desc, true));
    }
}

