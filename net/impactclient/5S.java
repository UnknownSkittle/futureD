/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
package net.impactclient;

import java.util.Objects;
import net.impactclient.1E;
import net.impactclient.3_;
import net.impactclient.48;
import net.impactclient.7M;
import org.lwjgl.opengl.ARBShaderObjects;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
final class 5S
implements 1E {
    public static final boolean \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int 0(7M m2) {
        block6: {
            block5: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block5;
                Objects.requireNonNull(m2);
                if (bl2 || bl2) break block5;
                switch (3_.0[m2.ordinal()]) {
                    case 1: {
                        if (bl2) break;
                        return ARBShaderObjects.glCreateShaderObjectARB((int)((int)((long)826822360 ^ (long)826852841)));
                    }
                    case 2: {
                        if (bl2) break;
                        return ARBShaderObjects.glCreateShaderObjectARB((int)((int)((long)182486901 ^ (long)182455365)));
                    }
                    case 3: {
                        if (bl2) break;
                        return ARBShaderObjects.glCreateShaderObjectARB((int)((int)((long)524838925 ^ (long)524871124)));
                    }
                    default: {
                        if (!bl2) break block6;
                    }
                }
            }
            return -272903355;
        }
        return (int)((long)1340668459 ^ (long)1340668459);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 6(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glCompileShaderARB((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final int 0() {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2 || bl2) {
            return 1749867388;
        }
        return ARBShaderObjects.glCreateProgramObjectARB();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 5(int n2) {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2 || bl2) return;
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)((int)((long)372211190 ^ (long)372242037))) == 0) {
            if (bl2 || bl2) return;
            throw new 48(5S.0(n2));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2) {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2 || bl2) return;
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)((int)((long)-2079696747 ^ (long)-2079665388))) == 0) {
            if (bl2 || bl2) return;
            throw new 48(5S.0(n2));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 3(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glLinkProgramARB((int)n2);
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
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glUniform1fARB((int)n2, (float)f2);
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
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glUniform2fARB((int)n2, (float)f2, (float)f3);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2, int n3) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glUniform1iARB((int)n2, (int)n3);
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
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glUniform4fARB((int)n2, (float)f2, (float)f3, (float)f4, (float)f5);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2) {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2 || bl2) return;
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)((int)((long)-1186572689 ^ (long)-1186538003))) == 0) {
            if (bl2 || bl2) return;
            throw new 48(5S.0(n2));
        }
        if (!bl2) return;
    }

    private static String 0(int n2) {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2 || bl2) {
            return null;
        }
        int n3 = n2;
        return ARBShaderObjects.glGetInfoLogARB((int)n3, (int)ARBShaderObjects.glGetObjectParameteriARB((int)n3, (int)((int)((long)1397778555 ^ (long)1397810175))));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, CharSequence charSequence) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)charSequence);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 4(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glUseProgramObjectARB((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    5S() {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2) {
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
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glValidateProgramARB((int)n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final int 0(int n2, String string) {
        boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
        if (bl2 || bl2) {
            return 680501195;
        }
        return ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)string);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2009\u2009\u200d\u200a\u2006\u2004\u2003;
                if (bl2 || bl2) break block2;
                ARBShaderObjects.glAttachObjectARB((int)n2, (int)n3);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

