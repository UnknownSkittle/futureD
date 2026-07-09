/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rY;
import net.impactclient.44;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 0rp<T extends Number>
extends 0rY<T>
implements 44<T> {
    protected final T 1;
    protected final T 0;
    public static final boolean \u200a\u200b\u200e;

    public 0rp(String string, String string2, String string3, T t2, T t3) {
        boolean bl2 = \u200a\u200b\u200e;
        super(string, string2, string3);
        this.0 = t2;
        this.1 = t3;
    }

    @Override
    public final T 0() {
        boolean bl2 = \u200a\u200b\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return this.0;
    }

    @Override
    public final T 1() {
        boolean bl2 = \u200a\u200b\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return this.1;
    }
}

