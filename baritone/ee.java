/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aox
 *  awt
 */
package baritone;

import baritone.a;
import baritone.api.schematic.ISchematic;
import baritone.cj;
import baritone.ea;
import baritone.fn;
import baritone.fs;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ee
extends cj {
    private final List<awt> a;
    private final ISchematic a;
    private final int c;
    private final int d;
    private final int e;
    private /* synthetic */ ea a;

    public ee(ea ea2) {
        this.a = ea2;
        super(ea.a(ea2), true);
        this.a = ea.b(ea2);
        this.a = ea.a(ea2);
        this.c = ea.a(ea2).p();
        this.d = ea.a(ea2).q();
        this.e = ea.a(ea2).r();
        this.e += 10.0;
        this.d = (int)1.0;
    }

    private awt a(int n2, int n3, int n4, awt awt2) {
        if (this.a.inSchematic(n2 - this.c, n3 - this.d, n4 - this.e, awt2)) {
            return this.a.desiredState(n2 - this.c, n3 - this.d, n4 - this.e, awt2, ea.a(this.a));
        }
        return null;
    }

    @Override
    public final double a(int n2, int n3, int n4, awt awt2) {
        if (!((fs)((Object)this.a)).b(n2, n4)) {
            return 1000000.0;
        }
        awt awt3 = this.a(n2, n3, n4, awt2);
        if (awt3 != null) {
            if (awt3.u() == aox.a) {
                return (double)(this.a * 2.0);
            }
            if (this.a.contains(awt3)) {
                return 0.0;
            }
            if (this.c == 0) {
                return 1000000.0;
            }
            return (double)(this.a * 3.0);
        }
        if (this.c != 0) {
            return (double)this.a;
        }
        return 1000000.0;
    }

    @Override
    public final double b(int n2, int n3, int n4, awt awt2) {
        if (this.e == 0) {
            return 1000000.0;
        }
        if ((awt2 = this.a(n2, n3, n4, awt2)) != null) {
            if (awt2.u() == aox.a) {
                return 1.0;
            }
            if (ea.a(((fn)((Object)this.a)).a(n2, n3, n4), awt2)) {
                return (Double)baritone.a.a().breakCorrectBlockPenaltyMultiplier.value;
            }
            return 1.0;
        }
        return 1.0;
    }

    static /* synthetic */ awt a(ee ee2, int n2, int n3, int n4, awt awt2) {
        return ee2.a(n2, n3, n4, awt2);
    }
}

