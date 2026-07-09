/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
package net.impactclient;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.function.Predicate;
import me.zero.alpine.listener.Listener;
import net.impactclient.0x;
import net.impactclient.2w;
import net.impactclient.3Z;
import net.impactclient.4t;
import net.impactclient.5Y;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1t {
    private static final 0x 0;
    public static final boolean \u200e\u2003\u200c\u2007\u2006\u2000;

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, double d2, double d3, double d4) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
                if (bl2 || bl2) break block2;
                bus.b((double)d2, (double)d3, (double)d4);
                if (bl2 || bl2) break block2;
                bus.b((float)f2, (float)0.0f, (float)1.0f, (float)0.0f);
                if (bl2 || bl2) break block2;
                bus.b((double)(-d2), (double)(-d3), (double)(-d4));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static 3Z 0(3Z object) {
        boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
        if (bl2 || bl2) return null;
        double d2 = ((3Z)object).1;
        double d3 = ((3Z)object).0;
        double d4 = ((3Z)object).2;
        object = 0;
        if (bl2 || bl2) return null;
        if (GLU.gluProject((float)((float)d4), (float)((float)d3), (float)((float)d2), (FloatBuffer)((0x)object).3, (FloatBuffer)((0x)object).1, (IntBuffer)((0x)object).0, (FloatBuffer)((FloatBuffer)((0x)object).2.clear()))) {
            if (bl2) return null;
            return new 3Z(((0x)object).2.get((int)((long)335532230 ^ (long)335532230)), (float)Display.getHeight() - ((0x)object).2.get((int)((long)748703789 ^ (long)748703788)), ((0x)object).2.get((int)((long)-628709186 ^ (long)-628709188)));
        }
        if (!bl2) return null;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 1() {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
                if (bl2 || bl2) break block2;
                4t.1.subscribe(new Listener<5Y>(object -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
                            if (bl2 || bl2) break block2;
                            object = 0;
                            if (bl2 || bl2) break block2;
                            GL11.glGetFloat((int)((int)((long)-1748559197 ^ (long)-1748561659)), (FloatBuffer)((FloatBuffer)((0x)object).3.clear()));
                            if (bl2 || bl2) break block2;
                            GL11.glGetFloat((int)((int)((long)1211332684 ^ (long)1211331563)), (FloatBuffer)((FloatBuffer)((0x)object).1.clear()));
                            if (bl2 || bl2) break block2;
                            GL11.glGetInteger((int)((int)((long)-1802419279 ^ (long)-1802418157)), (IntBuffer)((IntBuffer)((0x)object).0.clear()));
                            if (!bl2 && !bl2) break block3;
                        }
                        return;
                    }
                }, new Predicate[(int)((long)-824050694 ^ (long)-824050694)]));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, double d2, double d3) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
                if (bl2 || bl2) break block2;
                bus.b((double)d2, (double)d3, (double)0.0);
                if (bl2 || bl2) break block2;
                bus.b((float)f2, (float)0.0f, (float)0.0f, (float)1.0f);
                if (bl2 || bl2) break block2;
                bus.b((double)(-d2), (double)(-d3), (double)-0.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    static {
        boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
        if (bl2 || bl2) {
        } else {
            0 = new 0x();
            if (!bl2) {
                // empty if block
            }
        }
    }

    public static 0x 0() {
        boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
        if (bl2 || bl2) {
            return null;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u200c\u2007\u2006\u2000;
                if (bl2 || bl2) break block2;
                float[] fArray = 2w.1(n2);
                bus.c((float)fArray[(int)((long)780135866 ^ (long)780135866)], (float)fArray[(int)((long)1308849323 ^ (long)1308849322)], (float)fArray[(int)((long)-2096346662 ^ (long)-2096346664)], (float)fArray[(int)((long)1832410477 ^ (long)1832410478)]);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

