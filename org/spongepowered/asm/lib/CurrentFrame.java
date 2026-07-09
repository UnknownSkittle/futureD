/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.lib;

import org.spongepowered.asm.lib.ClassWriter;
import org.spongepowered.asm.lib.Frame;
import org.spongepowered.asm.lib.Item;

class CurrentFrame
extends Frame {
    CurrentFrame() {
    }

    void execute(int opcode, int arg, ClassWriter cw2, Item item) {
        super.execute(opcode, arg, cw2, item);
        Frame successor = new Frame();
        this.merge(cw2, successor, 0);
        this.set(successor);
        this.owner.inputStackTop = 0;
    }
}

