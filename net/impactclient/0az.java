/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.Optional;
import net.impactclient.0r7;
import net.impactclient.5Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 0az {
    public static final boolean \u2002\u2003\u2002\u200b\u200b\u2008\u2008\u200a\u2002;

    public void 0(0r7 var1);

    default public Optional<0r7> 0(5Q q2) {
        boolean bl2 = \u2002\u2003\u2002\u200b\u200b\u2008\u2008\u200a\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return this.0(q2.1());
    }

    public Optional<0r7> 0(String var1);
}

