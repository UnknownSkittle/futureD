/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package pw.knx.feather.tessellate;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import pw.knx.feather.tessellate.Tessellator;

public class BasicTess
implements Tessellator {
    int index;
    int[] raw = new int[capacity *= 6];
    ByteBuffer buffer;
    FloatBuffer fBuffer;
    IntBuffer iBuffer;
    private int colors;
    private float texU;
    private float texV;
    private boolean color;
    private boolean texture;

    BasicTess(int capacity) {
        this.buffer = ByteBuffer.allocateDirect(capacity * 4).order(ByteOrder.nativeOrder());
        this.fBuffer = this.buffer.asFloatBuffer();
        this.iBuffer = this.buffer.asIntBuffer();
    }

    @Override
    public Tessellator setColor(int color) {
        this.color = true;
        this.colors = color;
        return this;
    }

    @Override
    public Tessellator setTexture(float u2, float v2) {
        this.texture = true;
        this.texU = u2;
        this.texV = v2;
        return this;
    }

    @Override
    public Tessellator addVertex(float x2, float y2, float z2) {
        int dex = this.index * 6;
        this.raw[dex] = Float.floatToRawIntBits(x2);
        this.raw[dex + 1] = Float.floatToRawIntBits(y2);
        this.raw[dex + 2] = Float.floatToRawIntBits(z2);
        this.raw[dex + 3] = this.colors;
        this.raw[dex + 4] = Float.floatToRawIntBits(this.texU);
        this.raw[dex + 5] = Float.floatToRawIntBits(this.texV);
        ++this.index;
        return this;
    }

    @Override
    public Tessellator bind() {
        int dex = this.index * 6;
        this.iBuffer.put(this.raw, 0, dex);
        this.buffer.position(0);
        this.buffer.limit(dex * 4);
        if (this.color) {
            this.buffer.position(12);
            GL11.glColorPointer((int)4, (boolean)true, (int)24, (ByteBuffer)this.buffer);
        }
        if (this.texture) {
            this.fBuffer.position(4);
            GL11.glTexCoordPointer((int)2, (int)24, (FloatBuffer)this.fBuffer);
        }
        this.fBuffer.position(0);
        GL11.glVertexPointer((int)3, (int)24, (FloatBuffer)this.fBuffer);
        return this;
    }

    @Override
    public Tessellator pass(int mode) {
        GL11.glDrawArrays((int)mode, (int)0, (int)this.index);
        return this;
    }

    @Override
    public Tessellator unbind() {
        this.iBuffer.position(0);
        return this;
    }

    @Override
    public Tessellator reset() {
        this.iBuffer.clear();
        this.index = 0;
        this.color = false;
        this.texture = false;
        return this;
    }
}

