/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
import net.impactclient.13;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rN<K, V> {
    public static final boolean \u2005\u200b\u2009\u200f\u200a;
    final HashMap<K, V> 3;
    private long 2;
    final HashSet<K> 0;
    final Function<K, V>[] 4;
    final LinkedBlockingQueue<K> 1;

    /*
     * Enabled aggressive block sorting
     */
    public final synchronized Optional<V> 0(K k2) {
        boolean bl2 = \u2005\u200b\u2009\u200f\u200a;
        if (bl2 || bl2) return null;
        if (this.3.containsKey(k2)) {
            if (bl2 || bl2) return null;
            return Optional.ofNullable(this.3.get(k2));
        }
        if (bl2) return null;
        if (this.0.contains(k2)) {
            if (bl2 || bl2) return null;
            return Optional.empty();
        }
        if (bl2) return null;
        this.1.add(k2);
        if (bl2 || bl2) return null;
        this.0.add(k2);
        if (!bl2 && !bl2) return Optional.empty();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @SafeVarargs
    public 0rN(Function<K, V> ... functionArray) {
        block3: {
            block2: {
                boolean bl2 = \u2005\u200b\u2009\u200f\u200a;
                if (bl2 || bl2) break block2;
                this.1 = new LinkedBlockingQueue();
                if (bl2 || bl2) break block2;
                this.0 = new HashSet();
                if (bl2 || bl2) break block2;
                this.3 = new HashMap();
                if (bl2 || bl2) break block2;
                this.4 = functionArray;
                if (bl2 || bl2) break block2;
                this.2 = 0x8273D2E9CEB2066L ^ 0x8273D2E9CEB238EL;
                if (bl2 || bl2) break block2;
                new 13(this, (byte)((long)-1251677709 ^ (long)-1251677709)).start();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

