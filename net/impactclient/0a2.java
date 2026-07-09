/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.regex.Pattern;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0a2 {
    final Pattern 2;
    public String 1;
    public static final boolean \u200c\u2006\u2009\u200b\u200b\u200a\u2000\u2003\u2003;
    public final String 0;

    /*
     * Enabled aggressive block sorting
     */
    public 0a2(String string, String string2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2006\u2009\u200b\u200b\u200a\u2000\u2003\u2003;
                if (bl2 || bl2) break block2;
                this.2 = Pattern.compile(string);
                if (bl2 || bl2) break block2;
                this.0 = string;
                if (bl2 || bl2) break block2;
                this.1 = string2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final String toString() {
        boolean bl2 = \u200c\u2006\u2009\u200b\u200b\u200a\u2000\u2003\u2003;
        if (bl2 || bl2) {
            return null;
        }
        return this.0 + 0rB$1f.XNZw("\ubd41", -1534519282) + this.1;
    }
}

