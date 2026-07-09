/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import org.objectweb.asm.tree.MethodNode;

class MethodNode$1
extends ArrayList {
    final /* synthetic */ MethodNode this$0;

    MethodNode$1(MethodNode methodNode, int n2) {
        this.this$0 = methodNode;
        super(n2);
    }

    public boolean add(Object object) {
        this.this$0.annotationDefault = object;
        return super.add(object);
    }
}

