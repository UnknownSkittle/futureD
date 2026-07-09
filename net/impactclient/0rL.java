/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rp;
import net.impactclient.7Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rL
extends 0rp<Float> {
    public static final boolean \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
    public float 2;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(float f2) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
                if (bl2 || bl2) break block2;
                float f3 = ((Float)this.1()).floatValue() - ((Float)this.0()).floatValue();
                if (bl2 || bl2) break block2;
                0rL rL = this;
                rL.0(Float.valueOf(rL.2 + f3 / 10.0f * f2));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ void 1(Object object) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
                if (bl2 || bl2) break block2;
                this.0((Float)object);
                if (!bl2) break block3;
            }
            return;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
        if (bl2 || bl2) {
            return true;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    private void 0(Float f2) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
                if (bl2 || bl2) break block2;
                this.2 = ((Float)7Q.0(f2, this.0, this.1)).floatValue();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final int hashCode() {
        boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
        if (bl2 || bl2) {
            return 1675109660;
        }
        throw new UnsupportedOperationException();
    }

    0rL(String string, String string2, String string3, Float f2, Float f3) {
        boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
        super(string, string2, string3, f2, f3);
        this.0(Float.valueOf(0.0f));
    }

    @Override
    public final /* synthetic */ Object 1() {
        boolean bl2 = \u200a\u2000\u2006\u2009\u2008\u200a\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return Float.valueOf(this.2);
    }
}

