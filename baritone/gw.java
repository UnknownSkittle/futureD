/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  awt
 *  axj
 *  nf
 */
package baritone;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class gw {
    private static final Pattern a = Pattern.compile("(?<location>(\\w+:)?\\w+)(\\[(?<properties>(\\w+=\\w+,?)+)])?");
    private final nf a;
    private final Map<String, String> a;
    private awt a;

    private gw(nf nf2, Map<String, String> map) {
        this.a = nf2;
        this.a = map;
    }

    private static gw b(String stringArray) {
        if (!(stringArray = a.matcher((CharSequence)stringArray)).matches()) {
            return null;
        }
        try {
            String string = stringArray.group("location");
            stringArray = stringArray.group("properties");
            string = new nf(string);
            HashMap<String, String> hashMap = new HashMap<String, String>();
            if (stringArray != null) {
                stringArray = stringArray.split(",");
                int n2 = stringArray.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    String[] stringArray2 = stringArray[i2].split("=");
                    hashMap.put(stringArray2[0], stringArray2[1]);
                }
            }
            return new gw((nf)string, hashMap);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    static /* synthetic */ gw a(String string) {
        return gw.b(string);
    }

    static /* synthetic */ awt a(gw gw2) {
        if (gw2.a == null) {
            aow aow2 = (aow)aow.h.c((Object)gw2.a);
            gw2.a = aow2.t();
            gw2.a.keySet().stream().sorted(String::compareTo).forEachOrdered(string -> {
                if ((aow2 = aow2.s().a(string)) != null) {
                    Object object = (String)this.a.get(string);
                    string = aow2;
                    aow2 = this.a;
                    if (!((Optional)(object = string.b((String)object).toJavaUtil())).isPresent()) {
                        throw new IllegalArgumentException("Invalid value for property ".concat(String.valueOf(string)));
                    }
                    this.a = aow2.a((axj)string, (Comparable)((Optional)object).get());
                }
            });
        }
        return gw2.a;
    }
}

