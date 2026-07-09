/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  gi
 */
package baritone;

import baritone.api.schematic.IStaticSchematic;
import baritone.gr;
import baritone.gu;
import java.io.InputStream;

final class gs
extends gr {
    @Override
    public final IStaticSchematic parse(InputStream inputStream) {
        return new gu(gi.a((InputStream)inputStream));
    }
}

