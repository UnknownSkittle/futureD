/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.datatypes.EntityClassById;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.NearbyPlayer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class bd
extends Enum<bd> {
    private static /* enum */ bd a = new bd(EntityClassById.INSTANCE);
    private static /* enum */ bd b = new bd(NearbyPlayer.INSTANCE);
    final IDatatypeFor a;
    private static final /* synthetic */ bd[] a;

    public static bd[] values() {
        return (bd[])a.clone();
    }

    public static bd valueOf(String string) {
        return Enum.valueOf(bd.class, string);
    }

    private bd(IDatatypeFor iDatatypeFor) {
        this.a = iDatatypeFor;
    }

    static {
        a = new bd[]{a, b};
    }
}

