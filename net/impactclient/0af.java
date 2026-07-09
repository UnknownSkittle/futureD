/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import java.util.List;
import java.util.Optional;
import net.impactclient.4R;
import net.impactclient.4c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 0af
extends 4R {
    public static final boolean \u200c;

    /*
     * Enabled aggressive block sorting
     */
    default public boolean 0() {
        boolean bl2 = \u200c;
        if (bl2 || bl2) return true;
        if (this.2().size() > 0) {
            if (bl2) return true;
            return (int)((long)-1908102323 ^ (long)-1908102324) != 0;
        }
        if (!bl2) return (int)((long)682027597 ^ (long)682027597) != 0;
        return true;
    }

    public int 1();

    public List<4c> 2();

    /*
     * Enabled aggressive block sorting
     */
    default public Optional<4c> 3() {
        boolean bl2 = \u200c;
        if (bl2 || bl2) return null;
        if (this.0()) {
            if (bl2) return null;
            return Optional.of(this.2().get(this.1()));
        }
        if (!bl2) return Optional.empty();
        return null;
    }

    public void 0(bip var1, float var2);
}

