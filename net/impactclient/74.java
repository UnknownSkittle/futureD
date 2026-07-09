/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 */
package net.impactclient;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import net.impactclient.0T;
import net.impactclient.5A;
import net.impactclient.72;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 74
implements 0T {
    5A 0;
    private final 72[] 3;
    public static final boolean \u200c\u2007\u200b;
    private int 2;
    private final 72 1;

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 0(char c2) {
        boolean bl2 = \u200c\u2007\u200b;
        if (bl2 || bl2) return true;
        if (c2 < (int)((long)1052282040 ^ (long)1052282296)) {
            if (bl2) return true;
            return (int)((long)187669334 ^ (long)187669335) != 0;
        }
        if (!bl2) return (int)((long)-160526170 ^ (long)-160526170) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 74 0(Font object) {
        block14: {
            boolean bl2 = \u200c\u2007\u200b;
            if (!bl2 && !bl2) {
                Object object2 = object;
                object = this;
                if (!bl2 && !bl2) {
                    FontMetrics fontMetrics = new Canvas().getFontMetrics((Font)object2);
                    if (!bl2 && !bl2) {
                        int n2 = (int)((long)-84793292 ^ (long)-84793292);
                        if (bl2) return null;
                        int n3 = (int)((long)910749906 ^ (long)910749906);
                        if (bl2) return null;
                        int n4 = (int)((long)-389057798 ^ (long)-389057798);
                        int n5 = (int)((long)1815151474 ^ (long)1815151474);
                        int n6 = (int)((long)-1275434579 ^ (long)-1275434579);
                        String[] stringArray = 7b.0();
                        if (!bl2 && !bl2) {
                            int n7 = (int)((long)-1011525420 ^ (long)-1011525420);
                            if (bl2) return null;
                            block0: while (!bl2) {
                                int n8;
                                if (n7 < (int)((long)-1972064167 ^ (long)-1972063911)) {
                                    if (bl2 || bl2) break;
                                    int n9 = n7;
                                    if (bl2 || bl2) break;
                                    n8 = fontMetrics.getHeight();
                                    if (bl2 || bl2) break;
                                    n9 = fontMetrics.charWidth((char)n9);
                                    if (bl2 || bl2) break;
                                    if (n7 != 0) {
                                        if (bl2) break;
                                        if (n7 % (int)((long)-1443784867 ^ (long)-1443784883) == 0) {
                                            if (bl2 || bl2) break;
                                            n3 = (int)((long)1461936557 ^ (long)1461936552);
                                            if (bl2) return null;
                                            if (bl2) break;
                                            n4 += n2 + (int)((long)1924358896 ^ (long)1924358901);
                                            if (bl2 || bl2) break;
                                            n2 = (int)((long)1993515806 ^ (long)1993515806);
                                            if (bl2) return null;
                                        }
                                    }
                                    if (bl2) break;
                                    if (n8 > n2) {
                                        if (bl2 || bl2) break;
                                        n2 = n8;
                                        if (n2 > ((74)object).2) {
                                            if (bl2 || bl2) break;
                                            ((74)object).2 = n2;
                                            if (bl2) break;
                                        }
                                    }
                                    if (bl2) break;
                                    ((74)object).3[n7] = new 72((74)object, n3, n4, n9, n8);
                                    if (bl2 || bl2) break;
                                    if ((n3 += n9 + (int)((long)-2055668556 ^ (long)-2055668559)) + n9 + (int)((long)-864937281 ^ (long)-864937286) > n5) {
                                        if (bl2 || bl2) break;
                                        n5 = n3 + n9 + (int)((long)-1810173886 ^ (long)-1810173881);
                                        if (bl2) break;
                                    }
                                    if (bl2) break;
                                    if (n4 + n8 + (int)((long)-2113097914 ^ (long)-2113097917) > n6) {
                                        if (bl2 || bl2) break;
                                        n6 = n4 + n8 + (int)((long)-1851908276 ^ (long)-1851908279);
                                        if (bl2) break;
                                    }
                                    if (bl2) break;
                                    ++n7;
                                    if (bl2) break;
                                    if (stringArray != null) continue;
                                    if (bl2) break;
                                }
                                if (bl2) break;
                                BufferedImage bufferedImage = new BufferedImage(n5, n6, (int)((long)1131091142 ^ (long)1131091140));
                                Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
                                graphics2D.setFont((Font)object2);
                                if (bl2 || bl2) break;
                                fontMetrics = graphics2D.getFontMetrics((Font)object2);
                                if (bl2 || bl2) break;
                                graphics2D.setColor(new Color((int)((long)637824699 ^ (long)637824580), (int)((long)-2094554520 ^ (long)-2094554473), (int)((long)-1263396678 ^ (long)-1263396795), (int)((long)1077196468 ^ (long)1077196468)));
                                if (bl2 || bl2) break;
                                graphics2D.fillRect((int)((long)-216466109 ^ (long)-216466109), (int)((long)490681597 ^ (long)490681597), n5, n6);
                                if (bl2 || bl2) break;
                                graphics2D.setColor(Color.WHITE);
                                if (bl2 || bl2) break;
                                graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
                                if (bl2 || bl2) break;
                                graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
                                if (bl2 || bl2) break;
                                graphics2D.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
                                if (bl2 || bl2) break;
                                n8 = (int)((long)801803540 ^ (long)801803540);
                                if (bl2) return null;
                                while (!bl2) {
                                    if (n8 < (int)((long)1962123127 ^ (long)1962122871)) {
                                        if (bl2 || bl2) break block0;
                                        graphics2D.drawString(String.valueOf((char)n8), ((74)object).3[n8].3, ((74)object).3[n8].2 + fontMetrics.getAscent());
                                        if (bl2 || bl2) break block0;
                                        ++n8;
                                        if (bl2) break block0;
                                        if (stringArray != null) continue;
                                        if (bl2) break block0;
                                    }
                                    if (bl2) break block0;
                                    int[] nArray = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
                                    if (bl2 || bl2) break block0;
                                    ((74)object).0 = new 5A(bufferedImage.getRGB((int)((long)-515349254 ^ (long)-515349254), (int)((long)-865202506 ^ (long)-865202506), bufferedImage.getWidth(), bufferedImage.getHeight(), nArray, (int)((long)591445843 ^ (long)591445843), bufferedImage.getWidth()), bufferedImage.getWidth(), bufferedImage.getHeight());
                                    if (!bl2 && !bl2) break block14;
                                }
                                break block0;
                            }
                        }
                    }
                }
            }
            return null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 74() {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2007\u200b;
                if (bl2 || bl2) break block2;
                this.3 = new 72[(int)((long)-1605861999 ^ (long)-1605862255)];
                if (bl2 || bl2) break block2;
                this.1 = new 72(this, (int)((long)1316740693 ^ (long)1316740693), (int)((long)-1543742863 ^ (long)-1543742863), (int)((long)442457243 ^ (long)442457243), (int)((long)-969087131 ^ (long)-969087131));
                if (bl2 || bl2) break block2;
                this.2 = (int)((long)-1530950830 ^ (long)-1530950830);
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1() {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2007\u200b;
                if (bl2 || bl2) break block2;
                bus.i((int)this.0.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final int 0() {
        boolean bl2 = \u200c\u2007\u200b;
        if (bl2 || bl2) {
            return 1910632551;
        }
        return (int)((float)this.2 / 4.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 72 1(char c2) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200c\u2007\u200b;
                if (bl2 || bl2) return null;
                if (!this.2()) break block7;
                if (bl2) return null;
                if (74.0(c2)) break block8;
                if (bl2) return null;
            }
            if (bl2) return null;
            return this.1;
        }
        if (!bl2) return this.3[c2];
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 2() {
        boolean bl2 = \u200c\u2007\u200b;
        if (bl2 || bl2) return true;
        if (this.0 != null) {
            if (bl2) return true;
            return (int)((long)-2039307678 ^ (long)-2039307677) != 0;
        }
        if (!bl2) return (int)((long)1378113361 ^ (long)1378113361) != 0;
        return true;
    }
}

