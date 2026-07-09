/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.d;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import org.apache.a.e.d.c;
import org.apache.a.e.d.d;
import org.apache.a.e.d.e;
import org.apache.commons.c.a;

public final class f {
    private static volatile e a;

    private static e a(URL list) {
        ai.a(list, "URL");
        list = ((URL)((Object)list)).openStream();
        try {
            Object object = list;
            new d();
            object = d.a(new InputStreamReader((InputStream)object, org.apache.a.c.a));
            object = new e((Collection<c>)object, 0);
            return object;
        } finally {
            ((InputStream)((Object)list)).close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static e a() {
        if (a != null) return a;
        Class<f> clazz = f.class;
        synchronized (f.class) {
            if (a != null) return a;
            URL uRL = f.class.getResource("/mozilla/public-suffix-list.txt");
            if (uRL != null) {
                try {
                    a = f.a(uRL);
                } catch (IOException iOException) {
                    a a2 = org.apache.commons.c.c.b(f.class);
                    if (!a2.d()) return a;
                    a2.b("Failure loading public suffix list from default resource", iOException);
                }
            } else {
                a = new e(Arrays.asList("com"));
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return a;
        }
    }
}

