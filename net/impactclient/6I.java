/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  blk
 *  blr
 */
package net.impactclient;

import java.util.Optional;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.56;
import net.impactclient.7c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 6I
extends Enum<6I>
implements Listenable,
0T {
    @EventHandler
    private final Listener<7c> 3;
    public static final /* enum */ 6I a;
    public static final boolean \u2006\u200e\u2004;
    private static final /* synthetic */ 6I[] 1;
    private boolean 0;

    public static 6I valueOf(String string) {
        boolean bl2 = \u2006\u200e\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(6I.class, string);
    }

    private 6I() {
        n2 = \u2006\u200e\u2004 ? 1 : 0;
        this.3 = new Listener<7c>(optional -> {
            boolean bl2 = \u2006\u200e\u2004;
            if (bl2 || bl2) return;
            if (((7c)((Object)optional)).0 != EventState.PRE) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            if (!this.0) {
                if (bl2) return;
                if (6I.2.m instanceof blr) {
                    if (bl2 || bl2) return;
                    this.0 = (int)((long)-355641102 ^ (long)-355641101);
                    if (bl2 || bl2) return;
                    optional = Optional.ofNullable(0ay.3().0j);
                    if (optional.isPresent()) {
                        if (bl2 || bl2) return;
                        if (optional.get().0.3) {
                            if (bl2 || bl2) return;
                            2.a((blk)new 56((blk)new blr(), optional.get()));
                            if (bl2) return;
                        }
                    }
                    if (bl2) return;
                    bib bib2 = 2;
                    bib2.a(bib2.m);
                    if (bl2) return;
                }
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)163849264 ^ (long)163849264)]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 6I.\u2006\u200e\u2004;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)-2144753060 ^ (long)2144753059);
                if (6I.\u2006\u200e\u2004) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (6I.\u2006\u200e\u2004) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u2d5d\u056d\uc6f6\u3b38\u2d5b\u0519\uc6e8\u3b7d", 134876150).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)-1026522328 ^ (long)-1026522328);
                v4 = (int)((long)1328068322 ^ (long)1328068261);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-539671926 ^ (long)-539671925)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)1475356283 ^ (long)1475356284)) {
                                case 0: {
                                    v11 = (int)((long)-964567085 ^ (long)-964567159);
                                    if (!6I.\u2006\u200e\u2004) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)1815720520 ^ (long)1815720563);
                                    if (!6I.\u2006\u200e\u2004) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-1562124711 ^ (long)-1562124760);
                                    if (!6I.\u2006\u200e\u2004) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)-324330728 ^ (long)-324330730);
                                    if (!6I.\u2006\u200e\u2004) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)1352367632 ^ (long)1352367684);
                                    if (!6I.\u2006\u200e\u2004) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-550606315 ^ (long)-550606246);
                                    if (!6I.\u2006\u200e\u2004) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-1243115325 ^ (long)-1243115332);
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var1_2;
                            v4 = v7;
                            if (v7 != 0) break block14;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        } while (!6I.\u2006\u200e\u2004);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!6I.\u2006\u200e\u2004)
lbl76:
                // 1 sources

                throw null;
            }
            6I.a = new 6I(var0_1);
            v12 = new 6I[(int)((long)-88235912 ^ (long)-88235911)];
            v12[(int)((long)1684136793 ^ (long)1684136793)] = 6I.a;
            6I.1 = v12;
        }
    }

    public static 6I[] values() {
        boolean bl2 = \u2006\u200e\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return (6I[])1.clone();
    }
}

