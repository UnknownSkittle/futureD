/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5q {
    public static final boolean \u200c\u2007\u2002;
    public final String 0;
    public final List<String> 1;

    /*
     * Enabled aggressive block sorting
     */
    public 5q(List<String> list) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2007\u2002;
                if (bl2 || bl2) break block2;
                Objects.requireNonNull(list);
                if (bl2 || bl2) break block2;
                StringJoiner stringJoiner = new StringJoiner(0rB$1f.XNZw("\ub156", -235891116));
                if (bl2 || bl2) break block2;
                list.forEach(stringJoiner::add);
                if (bl2 || bl2) break block2;
                this.0 = stringJoiner.toString();
                if (bl2 || bl2) break block2;
                this.1 = list;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

