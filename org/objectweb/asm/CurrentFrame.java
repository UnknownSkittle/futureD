/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Frame;
import org.objectweb.asm.Item;

class CurrentFrame
extends Frame {
    CurrentFrame() {
    }

    void a(int n2, int n3, ClassWriter classWriter, Item item) {
        super.a(n2, n3, classWriter, item);
        Frame frame = new Frame();
        this.a(classWriter, frame, 0);
        this.b(frame);
        this.b.f = 0;
    }
}

