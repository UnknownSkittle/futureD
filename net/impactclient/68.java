/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.impactclient.3j;
import net.impactclient.4C;
import net.impactclient.73;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 68 {
    public final String 1;
    public final String[] 0;
    public static final boolean \u2009\u200c\u2007\u200c\u2001\u2002;

    /*
     * Enabled aggressive block sorting
     */
    public 68(String string, String[] stringArray) {
        block3: {
            block2: {
                boolean bl2 = \u2009\u200c\u2007\u200c\u2001\u2002;
                if (bl2 || bl2) break block2;
                this.1 = string;
                if (bl2 || bl2) break block2;
                this.0 = stringArray;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @SafeVarargs
    public static <T> boolean 0(T ... TArray) {
        block6: {
            boolean bl2 = \u2009\u200c\u2007\u200c\u2001\u2002;
            if (!bl2 && !bl2) {
                int n2 = TArray.length;
                if (!bl2) {
                    int n3 = (int)((long)324739007 ^ (long)324739007);
                    String[] stringArray = 7b.0();
                    if (!bl2) {
                        while (!bl2) {
                            if (n3 < n2) {
                                if (bl2) break;
                                if (TArray[n3] == null) {
                                    if (bl2 || bl2) break;
                                    return (int)((long)-878269254 ^ (long)-878269253) != 0;
                                }
                                if (bl2) break;
                                ++n3;
                                if (bl2) break;
                                if (stringArray != null) continue;
                                if (bl2) break;
                            }
                            if (!bl2) break block6;
                        }
                    }
                }
            }
            return true;
        }
        return (int)((long)-1519489010 ^ (long)-1519489010) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 0(String[] stringArray, String string) {
        block7: {
            boolean bl2 = \u2009\u200c\u2007\u200c\u2001\u2002;
            if (!bl2) {
                String[] stringArray2 = 7b.0();
                Objects.requireNonNull(stringArray);
                String[] stringArray3 = stringArray2;
                if (!bl2 && !bl2) {
                    int n2 = stringArray.length;
                    if (!bl2) {
                        int n3 = (int)((long)-711648865 ^ (long)-711648865);
                        if (bl2) return true;
                        while (!bl2) {
                            if (n3 < n2) {
                                if (bl2) break;
                                String string2 = stringArray[n3];
                                if (string2 != null) {
                                    if (bl2) break;
                                    if (string2.equalsIgnoreCase(string)) {
                                        if (bl2 || bl2) break;
                                        return (int)((long)-1830092076 ^ (long)-1830092075) != 0;
                                    }
                                }
                                if (bl2) break;
                                ++n3;
                                if (bl2) break;
                                if (stringArray3 != null) continue;
                                if (bl2) break;
                            }
                            if (!bl2) break block7;
                        }
                    }
                }
            }
            return true;
        }
        return (int)((long)-1404570847 ^ (long)-1404570847) != 0;
    }

    public static List<String> 0(3j<73> j2) {
        boolean bl2 = \u2009\u200c\u2007\u200c\u2001\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return j2.stream().map(4C::3).distinct().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
    }
}

