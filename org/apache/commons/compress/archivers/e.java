/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.compress.archivers.a.a;
import org.apache.commons.compress.archivers.b;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.d.j;
import org.apache.commons.compress.archivers.f;
import org.apache.commons.compress.archivers.g;
import org.apache.commons.compress.archivers.g.al;
import org.apache.commons.compress.archivers.h;
import org.apache.commons.compress.archivers.sevenz.x;
import org.apache.commons.compress.b.i;

public final class e
implements g {
    private static final e a = new e();
    private final String b;
    private volatile String c = null;
    private SortedMap<String, g> d;

    static void a(Set<String> object, g g2, TreeMap<String, g> treeMap) {
        object = object.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            treeMap.put(string.toUpperCase(Locale.ROOT), g2);
        }
    }

    private static SortedMap<String, g> d() {
        return AccessController.doPrivileged(new f());
    }

    public e() {
        this(0);
    }

    private e(byte by2) {
        this.b = null;
    }

    public final c a(String string, InputStream inputStream) {
        return this.a(string, inputStream, this.c);
    }

    @Override
    public final c a(String string, InputStream inputStream, String string2) {
        if (string == null) {
            throw new IllegalArgumentException("Archivername must not be null.");
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream must not be null.");
        }
        if ("ar".equalsIgnoreCase(string)) {
            return new a(inputStream);
        }
        if ("arj".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new org.apache.commons.compress.archivers.b.b(inputStream, string2);
            }
            return new org.apache.commons.compress.archivers.b.b(inputStream);
        }
        if ("zip".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new al(inputStream, string2);
            }
            return new al(inputStream);
        }
        if ("tar".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new org.apache.commons.compress.archivers.f.b(inputStream, string2);
            }
            return new org.apache.commons.compress.archivers.f.b(inputStream);
        }
        if ("jar".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new org.apache.commons.compress.archivers.e.b(inputStream, string2);
            }
            return new org.apache.commons.compress.archivers.e.b(inputStream);
        }
        if ("cpio".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new org.apache.commons.compress.archivers.c.b(inputStream, string2);
            }
            return new org.apache.commons.compress.archivers.c.b(inputStream);
        }
        if ("dump".equalsIgnoreCase(string)) {
            if (string2 != null) {
                return new j(inputStream, string2);
            }
            return new j(inputStream);
        }
        if ("7z".equalsIgnoreCase(string)) {
            throw new h("7z");
        }
        g g2 = (g)this.e().get(string.toUpperCase(Locale.ROOT));
        if (g2 != null) {
            return g2.a(string, inputStream, string2);
        }
        throw new b("Archiver: " + string + " not found.");
    }

    public final c a(InputStream inputStream) {
        return this.a(e.b(inputStream), inputStream);
    }

    public static String b(InputStream inputStream) {
        int n2;
        if (inputStream == null) {
            throw new IllegalArgumentException("Stream must not be null.");
        }
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Mark is not supported.");
        }
        Object object = new byte[12];
        inputStream.mark(12);
        try {
            n2 = org.apache.commons.compress.b.h.a(inputStream, object);
            inputStream.reset();
        } catch (IOException iOException) {
            throw new b("IOException while reading signature.", iOException);
        }
        if (al.b(object, n2)) {
            return "zip";
        }
        if (org.apache.commons.compress.archivers.e.b.a(object, n2)) {
            return "jar";
        }
        if (org.apache.commons.compress.archivers.a.a.a(object, n2)) {
            return "ar";
        }
        if (org.apache.commons.compress.archivers.c.b.a(object, n2)) {
            return "cpio";
        }
        if (org.apache.commons.compress.archivers.b.b.a(object, n2)) {
            return "arj";
        }
        if (x.b(object, n2)) {
            return "7z";
        }
        object = new byte[32];
        inputStream.mark(32);
        try {
            n2 = org.apache.commons.compress.b.h.a(inputStream, object);
            inputStream.reset();
        } catch (IOException iOException) {
            throw new b("IOException while reading dump signature", iOException);
        }
        if (j.a(object, n2)) {
            return "dump";
        }
        object = new byte[512];
        inputStream.mark(512);
        try {
            n2 = org.apache.commons.compress.b.h.a(inputStream, object);
            inputStream.reset();
        } catch (IOException iOException) {
            throw new b("IOException while reading tar signature", iOException);
        }
        if (org.apache.commons.compress.archivers.f.b.a(object, n2)) {
            return "tar";
        }
        if (n2 >= 512) {
            inputStream = null;
            try {
                inputStream = new org.apache.commons.compress.archivers.f.b(new ByteArrayInputStream((byte[])object));
                if (((org.apache.commons.compress.archivers.f.b)inputStream).c().a()) {
                    object = "tar";
                    return object;
                }
            } catch (Exception exception) {
            } finally {
                org.apache.commons.compress.b.h.a(inputStream);
            }
        }
        throw new b("No Archiver found for the stream signature");
    }

    private SortedMap<String, g> e() {
        if (this.d == null) {
            this.d = Collections.unmodifiableSortedMap(e.d());
        }
        return this.d;
    }

    @Override
    public final Set<String> a() {
        String[] stringArray = new String[]{"ar", "arj", "zip", "tar", "jar", "cpio", "dump", "7z"};
        HashSet<String> hashSet = new HashSet<String>(8);
        Collections.addAll(hashSet, stringArray);
        return hashSet;
    }

    static /* synthetic */ e b() {
        return a;
    }

    static /* synthetic */ ArrayList c() {
        i<g> i2 = new i<g>(g.class);
        ArrayList arrayList = new ArrayList();
        org.apache.commons.compress.archivers.d.b.a(arrayList, i2);
        return arrayList;
    }
}

