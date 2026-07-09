/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.f;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

final class b {
    private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> a = new ThreadLocal();

    public static SimpleDateFormat a(String string) {
        SimpleDateFormat simpleDateFormat;
        Object object = a.get();
        object = object == null ? null : ((SoftReference)object).get();
        if (object == null) {
            object = new HashMap<String, SimpleDateFormat>();
            a.set(new SoftReference(object));
        }
        if ((simpleDateFormat = (SimpleDateFormat)object.get(string)) == null) {
            simpleDateFormat = new SimpleDateFormat(string, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            object.put(string, simpleDateFormat);
        }
        return simpleDateFormat;
    }
}

