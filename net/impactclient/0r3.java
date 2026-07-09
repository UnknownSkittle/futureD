/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import baritone.api.Settings$Setting;
import java.awt.Color;
import net.impactclient.0rZ;
import net.impactclient.3F;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 0r3
extends 0rZ<pw.knx.feather.structures.Color, Color>
implements 3F {
    public static final boolean \u2009\u2004\u2001\u200e\u2009\u2007;

    @Override
    public final /* synthetic */ Object 1() {
        boolean bl2 = \u2009\u2004\u2001\u200e\u2009\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return pw.knx.feather.structures.Color.fromHex(((Color)this.0.value).getRGB());
    }

    0r3(Settings$Setting<Color> settings$Setting, String string, String string2) {
        boolean bl2 = \u2009\u2004\u2001\u200e\u2009\u2007;
        super(settings$Setting, string, string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ void 1(Object object) {
        block3: {
            block2: {
                boolean bl2 = \u2009\u2004\u2001\u200e\u2009\u2007;
                if (bl2 || bl2) break block2;
                object = (pw.knx.feather.structures.Color)object;
                this.0.value = new Color(((pw.knx.feather.structures.Color)object).getHex());
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

