/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import net.impactclient.1b;
import net.impactclient.3W;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 7Z
implements 1b {
    private final Collection<3W> 2;
    public static final boolean \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
    private static 7Z[] 1;
    private final Map<String, 3W> 0;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(3W w2) {
        boolean bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
        if (bl2 || bl2) return true;
        if (this.0.putIfAbsent((String)w2.1(), w2) == null) {
            if (bl2) return true;
            return (int)((long)154572601 ^ (long)154572600) != 0;
        }
        if (!bl2) return (int)((long)132617961 ^ (long)132617961) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(7Z[] zArray) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
                if (bl2) break block2;
                1 = zArray;
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 7Z() {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
                if (bl2 || bl2) break block2;
                this.0 = new LinkedHashMap<String, 3W>();
                if (bl2 || bl2) break block2;
                this.2 = Collections.unmodifiableCollection(this.0.values());
                if (!bl2) break block3;
            }
            return;
        }
    }

    @Override
    public final 3W 0(String string) {
        boolean bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return this.0.get(string);
    }

    static {
        block5: {
            boolean bl2;
            block6: {
                block4: {
                    bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
                    if (!bl2) break block4;
                    break block5;
                }
                if (7Z.0() == null) break block6;
                if (bl2) break block5;
                7Z.0(new 7Z[(int)((long)-1920397849 ^ (long)-1920397854)]);
                if (bl2) break block5;
            }
            if (!bl2) {
                // empty if block
            }
        }
    }

    @Override
    public final Collection<3W> 0() {
        boolean bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return this.2;
    }

    public static 7Z[] 0() {
        boolean bl2 = \u200c\u2004\u2007\u2002\u2009\u2003\u200e\u2002;
        if (bl2) {
            return null;
        }
        return 1;
    }
}

