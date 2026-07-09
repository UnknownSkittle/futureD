/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bit
 */
package net.impactclient;

import net.impactclient.1s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 0a5 {
    public static final boolean \u200c\u2005\u200e\u200d\u2008\u2008\u2005\u2003;

    public 1s 1();

    public float 2();

    public 1s 0();

    /*
     * Enabled aggressive block sorting
     */
    default public 1s 0(bit bit2) {
        float f2;
        float f3;
        block3: {
            block2: {
                boolean bl2 = \u200c\u2005\u200e\u200d\u2008\u2008\u2005\u2003;
                if (bl2 || bl2) break block2;
                f3 = this.0().1 * (float)bit2.a();
                if (bl2 || bl2) break block2;
                f2 = this.0().0 * (float)bit2.b();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new 1s(f3, f2);
    }
}

