/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  awt
 */
package baritone;

import baritone.api.schematic.ISchematic;
import baritone.ea;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class eb
implements ISchematic {
    private /* synthetic */ ISchematic a;
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ ea a;

    eb(ea ea2, ISchematic iSchematic, int n2, int n3) {
        this.a = ea2;
        this.a = iSchematic;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final awt desiredState(int n2, int n3, int n4, awt awt2, List<awt> list) {
        return this.a.desiredState(n2, n3, n4, awt2, ea.a(this.a));
    }

    @Override
    public final boolean inSchematic(int n2, int n3, int n4, awt awt2) {
        return ISchematic.super.inSchematic(n2, n3, n4, awt2) && n3 >= this.a && n3 <= this.b && this.a.inSchematic(n2, n3, n4, awt2);
    }

    @Override
    public final int widthX() {
        return this.a.widthX();
    }

    @Override
    public final int heightY() {
        return this.a.heightY();
    }

    @Override
    public final int lengthZ() {
        return this.a.lengthZ();
    }
}

