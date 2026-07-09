/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import net.impactclient.0rB$1f;
import net.impactclient.0rY;
import net.impactclient.6g;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 0rv<T>
extends 0rY<T>
implements 6g<T> {
    private static final String a;
    private final ImmutableSet 2;
    private final T[] 0;
    private T 1;
    public static final boolean \u2007\u200e\u2007\u2007\u200f\u2006;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(T t2) {
        boolean bl2 = \u2007\u200e\u2007\u2007\u200f\u2006;
        if (bl2 || bl2) return;
        if (!this.2.contains(t2)) {
            if (bl2 || bl2) return;
            throw new IllegalStateException(t2 + a + Arrays.toString(this.0));
        }
        if (bl2) return;
        this.1 = t2;
        if (!bl2 && !bl2) return;
    }

    @Override
    public final T 1() {
        boolean bl2 = \u2007\u200e\u2007\u2007\u200f\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return this.1;
    }

    @Override
    public final T[] 0() {
        boolean bl2 = \u2007\u200e\u2007\u2007\u200f\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return this.0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0rv.\u2007\u200e\u2007\u2007\u200f\u2006;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1794833660 ^ (long)1794833659);
            if (0rv.\u2007\u200e\u2007\u2007\u200f\u2006) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0rv.a = new String(v1).intern();
                    if (0rv.\u2007\u200e\u2007\u2007\u200f\u2006) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u0387\uaaf2\u690e\u94c2\u03b4\uaaa3\u6953\u949c\u0393\uaadf\u6974", -755260397).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-619645907 ^ (long)-619645907);
            v4 = (int)((long)594944456 ^ (long)594944452);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)366514719 ^ (long)366514718)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)1456713065 ^ (long)1456713070)) {
                            case 0: {
                                v11 = (int)((long)1825219396 ^ (long)1825219380);
                                if (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1182864558 ^ (long)-1182864513);
                                if (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-1851330403 ^ (long)-1851330406);
                                if (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-110888919 ^ (long)-110888953);
                                if (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1805083067 ^ (long)-1805083064);
                                if (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)1921201700 ^ (long)1921201758);
                                if (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1505611088 ^ (long)1505611021);
                            }
                        }
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                        ++var0_1;
                        v4 = v7;
                        if (v7 != 0) break block14;
                        v7 = v4;
                        v5 = v5;
                        v10 = v4;
                        v8 = v5;
                        v9 = v4;
                    } while (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0rv.\u2007\u200e\u2007\u2007\u200f\u2006)
lbl76:
            // 1 sources

            throw null;
        }
    }

    0rv(String string, String string2, String string3, T[] TArray) {
        boolean bl2 = \u2007\u200e\u2007\u2007\u200f\u2006;
        super(string, string2, string3);
        this.0 = TArray;
        this.2 = ImmutableSet.copyOf(TArray);
        this.0(TArray[(int)((long)-1019273828 ^ (long)-1019273828)]);
    }
}

