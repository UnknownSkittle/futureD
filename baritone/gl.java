/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gl
extends Enum<gl> {
    public static final /* enum */ gl a = new gl(0);
    public static final /* enum */ gl b = new gl(1);
    public static final /* enum */ gl c = new gl(2);
    public static final /* enum */ gl d = new gl(3);
    public final boolean[] a;
    private static final /* synthetic */ gl[] a;

    public static gl[] values() {
        return (gl[])a.clone();
    }

    public static gl valueOf(String string) {
        return Enum.valueOf(gl.class, string);
    }

    private gl(int n3) {
        this.a = new boolean[]{(n3 & 2) != 0, (n3 & 1) != 0};
    }

    public static gl a(boolean bl2, boolean bl3) {
        if (bl2) {
            if (bl3) {
                return d;
            }
            return c;
        }
        if (bl3) {
            return b;
        }
        return a;
    }

    static {
        a = new gl[]{a, b, c, d};
    }
}

