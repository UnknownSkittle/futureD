/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 */
package pw.knx.feather.structures;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import pw.knx.feather.Feather;

public class VBO {
    private final int id;
    protected final int dimensions;
    private int size = 0;

    public VBO() {
        this(GL15.glGenBuffers());
    }

    public VBO(int id2) {
        this(3, id2);
    }

    public VBO(int dimensions, int id2) {
        this.id = id2;
        this.dimensions = dimensions;
    }

    public VBO compile(float ... points) {
        if (points != null && points.length > 0) {
            FloatBuffer buffer = ByteBuffer.allocateDirect(points.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            buffer.put(points).flip();
            return this.compile(buffer);
        }
        return this;
    }

    public VBO compile(FloatBuffer buffer) {
        this.size = buffer.capacity();
        Feather.FEATHER.bindBuffer(this.id);
        GL15.glBufferData((int)34962, (FloatBuffer)buffer, (int)35044);
        Feather.FEATHER.bindBuffer(0);
        return this;
    }

    public VBO bind() {
        Feather.FEATHER.bindBuffer(this.id);
        GL11.glVertexPointer((int)this.dimensions, (int)5126, (int)0, (long)0L);
        GL11.glEnableClientState((int)32884);
        return this;
    }

    public VBO unbind() {
        Feather.FEATHER.bindBuffer(0);
        GL11.glDisableClientState((int)32884);
        return this;
    }

    public VBO draw(int mode) {
        GL11.glDrawArrays((int)mode, (int)0, (int)this.size);
        return this;
    }

    public VBO draw(int mode, ByteBuffer order) {
        GL11.glDrawElements((int)mode, (ByteBuffer)order);
        return this;
    }
}

