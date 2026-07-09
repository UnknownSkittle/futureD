/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import net.impactclient.0av;
import net.impactclient.45;
import org.lwjgl.input.Keyboard;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 75 {
    public int 1;
    public int 0;
    private static final List<75> 3;
    public static final boolean \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
    public final Consumer<45> 2;

    /*
     * Enabled aggressive block sorting
     */
    public 75(int n2, int n3, Consumer<45> consumer) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
                if (bl2 || bl2) break block2;
                this.1 = n2;
                if (bl2 || bl2) break block2;
                this.0 = n3;
                if (bl2 || bl2) break block2;
                this.2 = consumer;
                if (bl2 || bl2) break block2;
                3.add(this);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 2() {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
                if (bl2 || bl2) break block2;
                this.2.accept(45.a);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1() {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
                    if (bl2 || bl2) break block2;
                    this.2.accept(45.c);
                    if (bl2 || bl2) break block2;
                    if (this.1 != 0av.b) break block3;
                    if (bl2 || bl2) break block2;
                    this.2();
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    public final String toString() {
        boolean bl2 = \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return Keyboard.getKeyName((int)this.0);
    }

    static {
        boolean bl2 = \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
        if (bl2 || bl2) {
        } else {
            3 = new ArrayList<75>();
            if (!bl2) {
                // empty if block
            }
        }
    }

    public static List<75> 0() {
        boolean bl2 = \u2008\u2003\u2004\u200e\u2004\u2009\u2000\u2009\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return 3;
    }
}

