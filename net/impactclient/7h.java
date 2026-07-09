/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 7h {
    public static final boolean \u2005\u2000\u200d\u2000\u2005\u200f\u200d;

    public String getErrorMessage();

    /*
     * Enabled aggressive block sorting
     */
    default public boolean 0() {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2005\u2000\u200d\u2000\u2005\u200f\u200d;
                if (bl2 || bl2) return true;
                if (this.getError() != null) break block7;
                if (bl2) return true;
                if (this.getErrorMessage() == null) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            return (int)((long)1456001902 ^ (long)1456001903) != 0;
        }
        if (!bl2) return (int)((long)1129037400 ^ (long)1129037400) != 0;
        return true;
    }

    public String getError();
}

