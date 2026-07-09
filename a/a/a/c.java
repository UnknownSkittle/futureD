/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package a.a.a;

import a.a.a.b;
import com.a.a.d.a;
import java.util.HashMap;
import java.util.Map;

public final class c
implements b {
    private static final Map<String, Integer> a;

    @Override
    public final int a(a object) {
        object = ((a)object).g();
        if ((object = a.get(object)) == null) {
            return -1;
        }
        return (Integer)object;
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("sha1", 0);
        hashMap.put("date", 1);
        hashMap.put("size", 2);
        hashMap.put("mainClass", 3);
        hashMap.put("mcVersion", 4);
        hashMap.put("name", 5);
        hashMap.put("libraries", 6);
        hashMap.put("tweakers", 7);
        hashMap.put("version", 8);
        a = hashMap;
    }
}

