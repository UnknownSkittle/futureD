/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.en;
import baritone.es;
import baritone.eu;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class er
implements es {
    private final es a;
    private final es b;
    private /* synthetic */ en a;

    private er(en en2, es es2, es es3) {
        this.a = en2;
        this.a = es2;
        this.b = es3;
    }

    @Override
    public final int a(int n2, int n3) {
        if (this.a.a(n2, n3) == eu.a) {
            return eu.a;
        }
        return this.b.a(n2, n3);
    }

    @Override
    public final int a() {
        return Math.min(this.a.a(), this.b.a());
    }

    /* synthetic */ er(en en2, es es2, es es3, byte by2) {
        this(en2, es2, es3);
    }
}

