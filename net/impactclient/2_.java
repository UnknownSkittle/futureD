/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  but
 */
package net.impactclient;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.annotation.Nonnull;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 2_
implements but {
    private /* synthetic */ boolean 0;
    public static final boolean \u200e\u200f\u2008\u2006;

    /*
     * Enabled aggressive block sorting
     */
    2_(boolean bl2) {
        boolean bl3 = \u200e\u200f\u2008\u2006;
        this.0 = bl2;
        if (bl3) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nonnull
    public final BufferedImage a(@Nonnull BufferedImage bufferedImage) {
        boolean bl2;
        block8: {
            bl2 = \u200e\u200f\u2008\u2006;
            if (bl2) return null;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return null;
            if (!this.0) break block8;
            if (bl2 || bl2) return null;
            int n2 = (int)((long)-97940926 ^ (long)-97940990);
            if (bl2) return null;
            if (bl2) return null;
            int n3 = (int)((long)-1541241606 ^ (long)-1541241638);
            if (bl2) return null;
            if (bl2) return null;
            int n4 = bufferedImage.getWidth();
            if (bl2 || bl2) return null;
            int n5 = bufferedImage.getHeight();
            if (bl2) return null;
            while (!bl2) {
                block11: {
                    int n6;
                    int n7;
                    block10: {
                        block9: {
                            if (n2 < n4) break block9;
                            if (bl2) return null;
                            n7 = n3;
                            n6 = n5;
                            if (stringArray == null) break block10;
                            if (n7 >= n6) break block11;
                            if (bl2) return null;
                        }
                        if (bl2) return null;
                        n2 <<= (int)((long)-153115679 ^ (long)-153115680);
                        if (bl2 || bl2) return null;
                        n7 = n3;
                        n6 = (int)((long)583876002 ^ (long)583876003);
                    }
                    n3 = n7 << n6;
                    if (bl2) return null;
                    if (stringArray != null) continue;
                    if (bl2) return null;
                }
                if (bl2) return null;
                BufferedImage bufferedImage2 = new BufferedImage(n2, n3, (int)((long)987975006 ^ (long)987975004));
                Graphics graphics = bufferedImage2.getGraphics();
                graphics.drawImage(bufferedImage, (int)((long)-1617389725 ^ (long)-1617389725), (int)((long)-1918764394 ^ (long)-1918764394), null);
                if (bl2 || bl2) return null;
                graphics.dispose();
                if (bl2 || bl2) return null;
                return bufferedImage2;
            }
            return null;
        }
        if (!bl2) return bufferedImage;
        return null;
    }

    public final void a() {
        boolean bl2 = \u200e\u200f\u2008\u2006;
        if (bl2 || bl2) {
            return;
        }
    }
}

