/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  fy
 *  gi
 */
package baritone;

import baritone.api.schematic.IStaticSchematic;
import baritone.gr;
import baritone.gv;
import java.io.InputStream;

final class gt
extends gr {
    @Override
    public final IStaticSchematic parse(InputStream inputStream) {
        inputStream = gi.a((InputStream)inputStream);
        switch (inputStream.h("Version")) {
            case 1: 
            case 2: {
                return new gv((fy)inputStream);
            }
        }
        throw new UnsupportedOperationException("Unsupported Version of a Sponge Schematic");
    }
}

