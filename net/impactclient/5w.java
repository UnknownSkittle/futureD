/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package net.impactclient;

import java.util.Objects;
import net.impactclient.1E;
import net.impactclient.48;
import net.impactclient.6a;
import net.impactclient.7M;
import org.lwjgl.opengl.GL20;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
final class 5w
implements 1E {
    public static final boolean \u200c\u200d\u2008;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2, int n3) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glUniform1i((int)n2, (int)n3);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    private static String 0(int n2) {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2 || bl2) {
            return null;
        }
        int n3 = n2;
        return GL20.glGetProgramInfoLog((int)n3, (int)GL20.glGetProgrami((int)n3, (int)((int)((long)-588024471 ^ (long)-587989267))));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 3(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glLinkProgram((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int 0(7M m2) {
        block6: {
            block5: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block5;
                Objects.requireNonNull(m2);
                if (bl2 || bl2) break block5;
                switch (6a.0[m2.ordinal()]) {
                    case 1: {
                        if (bl2) break;
                        return GL20.glCreateShader((int)((int)((long)1715210606 ^ (long)1715241567)));
                    }
                    case 2: {
                        if (bl2) break;
                        return GL20.glCreateShader((int)((int)((long)-2020373901 ^ (long)-2020409021)));
                    }
                    case 3: {
                        if (bl2) break;
                        return GL20.glCreateShader((int)((int)((long)168848858 ^ (long)168878083)));
                    }
                    default: {
                        if (!bl2) break block6;
                    }
                }
            }
            return -937931261;
        }
        return (int)((long)-2078357509 ^ (long)-2078357509);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2) {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2 || bl2) return;
        if (GL20.glGetProgrami((int)n2, (int)((int)((long)-1929496685 ^ (long)-1929462767))) == 0) {
            if (bl2 || bl2) return;
            throw new 48(5w.0(n2));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, CharSequence charSequence) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glShaderSource((int)n2, (CharSequence)charSequence);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, float f2, float f3, float f4, float f5) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glUniform4f((int)n2, (float)f2, (float)f3, (float)f4, (float)f5);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, float f2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glUniform1f((int)n2, (float)f2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final int 0() {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2 || bl2) {
            return 1202210616;
        }
        return GL20.glCreateProgram();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 4(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glUseProgram((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, float f2, float f3) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glUniform2f((int)n2, (float)f2, (float)f3);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final int 0(int n2, String string) {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2 || bl2) {
            return 848135455;
        }
        return GL20.glGetUniformLocation((int)n2, (CharSequence)string);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 5(int n2) {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2 || bl2) return;
        if (GL20.glGetProgrami((int)n2, (int)((int)((long)-1063126383 ^ (long)-1063161582))) == 0) {
            if (bl2 || bl2) return;
            throw new 48(5w.0(n2));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 6(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glCompileShader((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 2(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glValidateProgram((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    5w() {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2) {
        boolean bl2 = \u200c\u200d\u2008;
        if (bl2 || bl2) return;
        if (GL20.glGetShaderi((int)n2, (int)((int)((long)-514001433 ^ (long)-514032026))) == 0) {
            if (bl2 || bl2) return;
            int n3 = n2;
            throw new 48(GL20.glGetShaderInfoLog((int)n3, (int)GL20.glGetShaderi((int)n3, (int)((int)((long)-903818431 ^ (long)-903849787)))));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200d\u2008;
                if (bl2 || bl2) break block2;
                GL20.glAttachShader((int)n2, (int)n3);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

