/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  ape
 *  awt
 *  et
 */
package baritone;

import baritone.a;
import baritone.ew;

final class ey
extends ew {
    @Override
    public final boolean a(amu amu2, et et2, awt awt2) {
        if (((Boolean)baritone.a.a().replantCrops.value).booleanValue()) {
            return amu2.o(et2.b()).u() instanceof ape;
        }
        return true;
    }
}

