/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LabelNode;

public class LookupSwitchInsnNode
extends AbstractInsnNode {
    public LabelNode dflt;
    public List keys;
    public List labels;

    public LookupSwitchInsnNode(LabelNode labelNode, int[] nArray, LabelNode[] labelNodeArray) {
        super(171);
        this.dflt = labelNode;
        this.keys = new ArrayList(nArray == null ? 0 : nArray.length);
        this.labels = new ArrayList(labelNodeArray == null ? 0 : labelNodeArray.length);
        if (nArray != null) {
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                this.keys.add(new Integer(nArray[i2]));
            }
        }
        if (labelNodeArray != null) {
            this.labels.addAll(Arrays.asList(labelNodeArray));
        }
    }

    public int getType() {
        return 12;
    }

    public void accept(MethodVisitor methodVisitor) {
        int[] nArray = new int[this.keys.size()];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = (Integer)this.keys.get(i2);
        }
        Label[] labelArray = new Label[this.labels.size()];
        for (int i3 = 0; i3 < labelArray.length; ++i3) {
            labelArray[i3] = ((LabelNode)this.labels.get(i3)).getLabel();
        }
        methodVisitor.visitLookupSwitchInsn(this.dflt.getLabel(), nArray, labelArray);
        this.acceptAnnotations(methodVisitor);
    }

    public AbstractInsnNode clone(Map map) {
        LookupSwitchInsnNode lookupSwitchInsnNode = new LookupSwitchInsnNode(LookupSwitchInsnNode.clone(this.dflt, map), null, LookupSwitchInsnNode.clone(this.labels, map));
        lookupSwitchInsnNode.keys.addAll(this.keys);
        return lookupSwitchInsnNode.cloneAnnotations(this);
    }
}

