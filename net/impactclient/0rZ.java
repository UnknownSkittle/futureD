/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import baritone.api.Settings$Setting;
import net.impactclient.0rY;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 0rZ<T, U>
extends 0rY<T> {
    public static final boolean \u2007\u200c;
    final Settings$Setting<U> 0;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void 1(T t2) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u200c;
                if (bl2 || bl2) break block2;
                this.0.value = t2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    0rZ(Settings$Setting<U> settings$Setting, String string, String string2) {
        boolean bl2 = \u2007\u200c;
        super(string, settings$Setting.getName(), string2);
        this.0 = settings$Setting;
    }

    @Override
    public T 1() {
        boolean bl2 = \u2007\u200c;
        if (bl2 || bl2) {
            return null;
        }
        return this.0.value;
    }
}

