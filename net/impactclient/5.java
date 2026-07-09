/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.impactclient.0az;
import net.impactclient.0r7;
import net.impactclient.5Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 5
implements 0az {
    public static final boolean \u2008\u200c\u200a\u200d\u2000\u2006;
    private final List<0r7> 0;

    public final boolean 0(String string) {
        boolean bl2 = \u2008\u200c\u200a\u200d\u2000\u2006;
        if (bl2 || bl2) {
            return true;
        }
        return this.0(string).isPresent();
    }

    /*
     * Enabled aggressive block sorting
     */
    public 5() {
        block3: {
            block2: {
                boolean bl2 = \u2008\u200c\u200a\u200d\u2000\u2006;
                if (bl2 || bl2) break block2;
                this.0 = new ArrayList<0r7>();
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(0r7 r7) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2008\u200c\u200a\u200d\u2000\u2006;
                    if (bl2 || bl2) break block2;
                    if (this.0((5Q)r7).isPresent()) break block3;
                    if (bl2 || bl2) break block2;
                    this.0.add(r7);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    @Override
    public final Optional<0r7> 0(String string) {
        boolean bl2 = \u2008\u200c\u200a\u200d\u2000\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return this.0.stream().filter(r7 -> {
            boolean bl2 = \u2008\u200c\u200a\u200d\u2000\u2006;
            if (bl2 || bl2) {
                return true;
            }
            return r7.0.equals(string);
        }).findFirst();
    }
}

