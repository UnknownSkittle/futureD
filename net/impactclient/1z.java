/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.JFrame;
import net.impactclient.0T;
import net.impactclient.1s;
import net.impactclient.2k;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1z
extends JFrame
implements 0T {
    public final List<2k> 0;
    public static final boolean \u200b\u2008\u200d\u200c\u2008\u2001\u2008;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void paint(Graphics graphics) {
        boolean bl2 = \u200b\u2008\u200d\u200c\u2008\u2001\u2008;
        if (bl2 || bl2) return;
        super.paint(graphics);
        if (bl2 || bl2) return;
        long l2 = System.currentTimeMillis();
        if (bl2 || bl2) return;
        this.0.forEach(k2 -> {
            boolean bl2 = \u200b\u2008\u200d\u200c\u2008\u2001\u2008;
            if (bl2) return;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return;
            if (k2 == null) {
                if (bl2) return;
                return;
            }
            if (bl2) return;
            graphics.setColor(new Color(k2.1));
            if (bl2 || bl2) return;
            1s[] sArray = k2.0;
            if (bl2 || bl2) return;
            int n2 = (int)((long)-1364437013 ^ (long)-1364437013);
            if (bl2) return;
            while (!bl2) {
                if (n2 < sArray.length) {
                    if (bl2 || bl2) return;
                    if (n2 < sArray.length - (int)((long)-1912486861 ^ (long)-1912486862)) {
                        if (bl2 || bl2) return;
                        graphics.drawLine((int)sArray[n2].1, (int)sArray[n2].0, (int)sArray[n2 + (int)((long)1315806696 ^ (long)1315806697)].1, (int)sArray[n2 + (int)((long)617691667 ^ (long)617691666)].0);
                        if (bl2) return;
                        if (stringArray == null) {
                            if (bl2) return;
                        }
                    } else {
                        if (bl2) return;
                        if (k2.2) {
                            if (bl2 || bl2) return;
                            graphics.drawLine((int)sArray[n2].1, (int)sArray[n2].0, (int)sArray[(int)((long)-1178400358 ^ (long)-1178400358)].1, (int)sArray[(int)((long)-2051388140 ^ (long)-2051388140)].0);
                            if (bl2) return;
                        }
                    }
                    if (bl2) return;
                    ++n2;
                    if (bl2) return;
                    if (stringArray != null) continue;
                    if (bl2) return;
                }
                if (!bl2) return;
            }
        });
        if (bl2 || bl2) return;
        long l3 = System.currentTimeMillis() - l2;
        if (bl2 || bl2) return;
        this.repaint();
        if (bl2) return;
        try {
            if (bl2) return;
            Thread.sleep(Math.max(0x42CBA6D956CEC057L ^ 0x42CBA6D956CEC057L, (0x55C1DE0888F00DL ^ 0x55C1DE0888F005L) - l3));
            if (bl2 || bl2) return;
            return;
        } catch (InterruptedException interruptedException) {
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 1z() {
        block3: {
            block2: {
                boolean bl2 = \u200b\u2008\u200d\u200c\u2008\u2001\u2008;
                if (bl2 || bl2) break block2;
                this.0 = new CopyOnWriteArrayList<2k>();
                if (bl2 || bl2) break block2;
                this.setUndecorated((boolean)((long)-1609754360 ^ (long)-1609754359));
                if (bl2 || bl2) break block2;
                this.setBackground(new Color((int)((long)-470834257 ^ (long)-470834257), (int)((long)-1437705681 ^ (long)-1437705681), (int)((long)1449520559 ^ (long)1449520559), (int)((long)-1119093598 ^ (long)-1119093598)));
                if (bl2 || bl2) break block2;
                this.setAlwaysOnTop((boolean)((long)-1038034500 ^ (long)-1038034499));
                if (bl2 || bl2) break block2;
                this.getContentPane().setLayout(new FlowLayout());
                if (bl2 || bl2) break block2;
                1z z2 = this;
                z2.setBounds(z2.getGraphicsConfiguration().getBounds());
                if (bl2 || bl2) break block2;
                this.setBounds((int)((long)2070229050 ^ (long)2070229050), (int)((long)33610585 ^ (long)33610585), this.getWidth(), this.getHeight());
                if (bl2 || bl2) break block2;
                this.setVisible((boolean)((long)606776243 ^ (long)606776243));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

