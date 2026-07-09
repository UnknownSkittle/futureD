/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rN;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 13
extends Thread {
    public static final boolean \u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f;
    private /* synthetic */ 0rN 0;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        var8_1 = 13.\u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f;
        if (var8_1 != false) return;
        var1_2 = 7b.0();
        if (var8_1 != false) return;
        try {
            do {
                block13: {
                    if (var8_1 != false) return;
                    var2_3 = this.0.1.take();
                    if (var8_1 != false) return;
                    block9: while (true) {
                        if (var8_1 != false) return;
                        var3_5 = null;
                        if (var8_1 != false) return;
                        if (var8_1 != false) return;
                        var4_6 /* !! */  = this.0.4;
                        var5_7 = this.0.4.length;
                        if (var8_1 != false) return;
                        var6_8 = (int)((long)-151322188 ^ (long)-151322188);
                        if (var8_1 != false) return;
                        do {
                            if (var8_1 != false) return;
                            if (var6_8 >= var5_7) break block13;
                            if (var8_1 != false) return;
                            var7_9 = var4_6 /* !! */ [var6_8];
                            if (var8_1 != false) return;
                            try {
                                if (var8_1 != false) return;
                                var3_5 = var7_9.apply(var2_3);
                                if (var8_1 != false) return;
                                if (var8_1 != false) return;
                                if (var1_2 == null) continue block9;
                                if (var8_1 != false) return;
                                ** if (!13.\u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f) goto lbl-1000
                            } catch (Exception v0) {
                                v0.printStackTrace();
                                if (var8_1 != false) return;
                            }
lbl-1000:
                            // 1 sources

                            {
                                throw null;
                            }
lbl-1000:
                            // 1 sources

                            {
                            }
                            if (var8_1 != false) return;
                            if (var3_5 != null) break block13;
                            if (var8_1 != false) return;
                            if (var8_1 != false) return;
                            ++var6_8;
                            if (var8_1 != false) return;
                        } while (var1_2 != null);
                        break;
                    }
                    if (var8_1 != false) return;
                }
                if (var8_1 != false) return;
                var4_6 /* !! */  = this.0;
                // MONITORENTER : var4_6 /* !! */ 
                if (var8_1 != false) return;
                try {
                    if (var8_1 != false) return;
                    this.0.0.remove(var2_3);
                    if (var8_1 != false) return;
                    if (var8_1 != false) return;
                    this.0.3.put(var2_3, var3_5);
                    if (var8_1 != false) return;
                    if (var8_1 != false) return;
                    // MONITOREXIT : var4_6 /* !! */ 
                    if (var8_1 != false) return;
                    if (var8_1 != false) return;
                    ** if (!13.\u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f) goto lbl-1000
                } catch (Throwable var2_4) {
                    if (var8_1 != false) return;
                    // MONITOREXIT : var4_6 /* !! */ 
                    if (var8_1 != false) return;
                    if (var8_1 != false) return;
                    throw var2_4;
                }
lbl-1000:
                // 1 sources

                {
                    throw null;
                }
lbl-1000:
                // 1 sources

                {
                }
                if (var8_1 != false) return;
                Thread.sleep(-570541830375695389L ^ -570541830375696373L);
                if (var8_1 != false) return;
                if (var8_1 != false) return;
            } while (!13.\u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f);
            throw null;
        } catch (InterruptedException v1) {
            v1.printStackTrace();
            if (var8_1 != false) return;
            if (var8_1 != false) return;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private 13(0rN rN) {
        boolean bl2 = \u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f;
        this.0 = rN;
        if (bl2) {
            return;
        }
    }

    /* synthetic */ 13(0rN rN, byte by2) {
        boolean bl2 = \u200e\u2005\u200a\u200e\u2000\u200d\u200f\u200f;
        this(rN);
    }
}

