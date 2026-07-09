/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package pw.knx.feather.tessellate;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import pw.knx.feather.tessellate.BasicTess;
import pw.knx.feather.tessellate.Tessellator;

public class ExpandingTess
extends BasicTess {
    private final float ratio;
    private final float factor;

    ExpandingTess(int initial, float ratio, float factor) {
        super(initial);
        this.ratio = ratio;
        this.factor = factor;
    }

    @Override
    public Tessellator addVertex(float x2, float y2, float z2) {
        int capacity = this.raw.length;
        if ((float)(this.index * 6) >= (float)capacity * this.ratio) {
            capacity = (int)((float)capacity * this.factor);
            int[] newBuffer = new int[capacity];
            System.arraycopy(this.raw, 0, newBuffer, 0, this.raw.length);
            this.raw = newBuffer;
            this.buffer = ByteBuffer.allocateDirect(capacity * 4).order(ByteOrder.nativeOrder());
            this.iBuffer = this.buffer.asIntBuffer();
            this.fBuffer = this.buffer.asFloatBuffer();
        }
        return super.addVertex(x2, y2, z2);
    }
}

