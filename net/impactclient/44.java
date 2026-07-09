/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.3W;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 44<T extends Number>
extends 3W<T> {
    public static final boolean \u2006;

    public T 0();

    /*
     * Enabled aggressive block sorting
     */
    default public void 3() {
        block3: {
            block2: {
                boolean bl2 = \u2006;
                if (bl2 || bl2) break block2;
                this.0(-0.5f);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    @Override
    public T 1();

    /*
     * Enabled aggressive block sorting
     */
    @Override
    default public void 0(float f2) {
        block3: {
            block2: {
                boolean bl2 = \u2006;
                if (bl2 || bl2) break block2;
                double d2 = ((Number)this.1()).doubleValue() - ((Number)this.0()).doubleValue();
                if (bl2 || bl2) break block2;
                44 v0 = this;
                v0.0(((Number)v0.1()).doubleValue() + d2 / 10.0 * (double)f2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

