/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LabelNode;

public class FrameNode
extends AbstractInsnNode {
    public int type;
    public List local;
    public List stack;

    private FrameNode() {
        super(-1);
    }

    public FrameNode(int n2, int n3, Object[] objectArray, int n4, Object[] objectArray2) {
        super(-1);
        this.type = n2;
        switch (n2) {
            case -1: 
            case 0: {
                this.local = FrameNode.asList(n3, objectArray);
                this.stack = FrameNode.asList(n4, objectArray2);
                break;
            }
            case 1: {
                this.local = FrameNode.asList(n3, objectArray);
                break;
            }
            case 2: {
                this.local = Arrays.asList(new Object[n3]);
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                this.stack = FrameNode.asList(1, objectArray2);
            }
        }
    }

    public int getType() {
        return 14;
    }

    public void accept(MethodVisitor methodVisitor) {
        switch (this.type) {
            case -1: 
            case 0: {
                methodVisitor.visitFrame(this.type, this.local.size(), FrameNode.asArray(this.local), this.stack.size(), FrameNode.asArray(this.stack));
                break;
            }
            case 1: {
                methodVisitor.visitFrame(this.type, this.local.size(), FrameNode.asArray(this.local), 0, null);
                break;
            }
            case 2: {
                methodVisitor.visitFrame(this.type, this.local.size(), null, 0, null);
                break;
            }
            case 3: {
                methodVisitor.visitFrame(this.type, 0, null, 0, null);
                break;
            }
            case 4: {
                methodVisitor.visitFrame(this.type, 0, null, 1, FrameNode.asArray(this.stack));
            }
        }
    }

    public AbstractInsnNode clone(Map map) {
        Object object;
        int n2;
        FrameNode frameNode = new FrameNode();
        frameNode.type = this.type;
        if (this.local != null) {
            frameNode.local = new ArrayList();
            for (n2 = 0; n2 < this.local.size(); ++n2) {
                object = this.local.get(n2);
                if (object instanceof LabelNode) {
                    object = map.get(object);
                }
                frameNode.local.add(object);
            }
        }
        if (this.stack != null) {
            frameNode.stack = new ArrayList();
            for (n2 = 0; n2 < this.stack.size(); ++n2) {
                object = this.stack.get(n2);
                if (object instanceof LabelNode) {
                    object = map.get(object);
                }
                frameNode.stack.add(object);
            }
        }
        return frameNode;
    }

    private static List asList(int n2, Object[] objectArray) {
        return Arrays.asList(objectArray).subList(0, n2);
    }

    private static Object[] asArray(List list) {
        Object[] objectArray = new Object[list.size()];
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object = list.get(i2);
            if (object instanceof LabelNode) {
                object = ((LabelNode)object).getLabel();
            }
            objectArray[i2] = object;
        }
        return objectArray;
    }
}

