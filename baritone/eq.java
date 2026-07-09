/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.cache.ICachedWorld;
import baritone.en;
import baritone.es;
import baritone.eu;
import baritone.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class eq
implements es {
    private final ICachedWorld a;
    private /* synthetic */ en a;

    private eq(en en2) {
        this.a = en2;
        this.a = en.a((en)this.a).a.a.getCachedWorld();
    }

    @Override
    public final int a(int n2, int n3) {
        if (this.a.isCached(n2 <<= 4, n3 <<= 4)) {
            return eu.a;
        }
        int n4 = n3;
        if (!(((n)this.a).a(n2 >> 9, n4 >> 9) != null)) {
            baritone.a.a().execute(() -> ((n)this.a).b(n2 >> 9, n3 >> 9));
            return eu.c;
        }
        return eu.b;
    }

    @Override
    public final int a() {
        return Integer.MAX_VALUE;
    }

    /* synthetic */ eq(en en2, byte by2) {
        this(en2);
    }
}

