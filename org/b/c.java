/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.slf4j.impl.StaticLoggerBinder
 */
package org.b;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.b.a;
import org.b.a.d;
import org.b.b;
import org.b.b.e;
import org.b.b.f;
import org.b.b.g;
import org.slf4j.impl.StaticLoggerBinder;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class c {
    private static volatile int a = 0;
    private static f b = new f();
    private static org.b.b.c c = new org.b.b.c();
    private static boolean d = g.b("slf4j.detectLoggerNameMismatch");
    private static final String[] e = new String[]{"1.6", "1.7"};
    private static String f = "org/slf4j/impl/StaticLoggerBinder.class";

    private c() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a() {
        f f2 = b;
        synchronized (f2) {
            b.c();
            for (e e2 : b.a()) {
                b b2 = org.b.c.a(e2.a());
                e2.a(b2);
            }
            return;
        }
    }

    private static void a(Throwable throwable) {
        a = 2;
        g.a("Failed to instantiate SLF4J LoggerFactory", throwable);
    }

    private static void b() {
        LinkedBlockingQueue<d> linkedBlockingQueue = b.b();
        int n2 = linkedBlockingQueue.size();
        int n3 = 0;
        ArrayList arrayList = new ArrayList(128);
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                d d2;
                d d3 = d2 = (d)iterator.next();
                if (d2 != null) {
                    e e2 = d3.a();
                    String string = e2.a();
                    if (e2.g()) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!e2.h()) {
                        if (e2.f()) {
                            e2.a(d3);
                        } else {
                            g.c(string);
                        }
                    }
                }
                if (n3++ != 0) continue;
                d3 = d2;
                if (d3.a().f()) {
                    g.c("A number (" + n2 + ") of logging calls during the initialization phase have been intercepted and are");
                    g.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                    g.c("See also http://www.slf4j.org/codes.html#replay");
                    continue;
                }
                if (d3.a().h()) continue;
                g.c("The following set of substitute loggers may have been accessed");
                g.c("during the initialization phase. Logging calls during this");
                g.c("phase were not honored. However, subsequent logging calls to these");
                g.c("loggers will work as normally expected.");
                g.c("See also http://www.slf4j.org/codes.html#substituteLogger");
            }
            arrayList.clear();
        }
    }

    private static final void c() {
        try {
            String string = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean bl2 = false;
            String[] stringArray = e;
            for (int i2 = 0; i2 < 2; ++i2) {
                String string2 = stringArray[i2];
                if (!string.startsWith(string2)) continue;
                bl2 = true;
            }
            if (!bl2) {
                g.c("The requested version " + string + " by your slf4j binding is not compatible with " + Arrays.asList(e).toString());
                g.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
            return;
        } catch (NoSuchFieldError noSuchFieldError) {
            return;
        } catch (Throwable throwable) {
            g.a("Unexpected problem occured during version sanity check", throwable);
            return;
        }
    }

    private static Set<URL> d() {
        LinkedHashSet<URL> linkedHashSet = new LinkedHashSet<URL>();
        try {
            Enumeration<URL> enumeration = c.class.getClassLoader();
            enumeration = enumeration == null ? ClassLoader.getSystemResources(f) : ((ClassLoader)((Object)enumeration)).getResources(f);
            while (enumeration.hasMoreElements()) {
                URL uRL = enumeration.nextElement();
                linkedHashSet.add(uRL);
            }
        } catch (IOException iOException) {
            g.a("Error getting resources from path", iOException);
        }
        return linkedHashSet;
    }

    private static boolean a(Set<URL> set) {
        return set.size() > 1;
    }

    public static b a(String string) {
        return org.b.c.e().a(string);
    }

    public static b a(Class<?> clazz) {
        Class<?> clazz2;
        Class<?> clazz3;
        b b2 = org.b.c.a(clazz.getName());
        if (d && (clazz3 = g.a()) != null && !(clazz2 = clazz3).isAssignableFrom(clazz)) {
            g.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", b2.a(), clazz3.getName()));
            g.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private static a e() {
        if (org.b.c.a != 0) ** GOTO lbl71
        var0 = c.class;
        synchronized (c.class) {
            block24: {
                if (org.b.c.a != 0) break block24;
                org.b.c.a = 1;
                try {
                    var1_1 = null;
                    var2_6 = g.a("java.vendor.url");
                    if (!(var2_6 == null ? false : var2_6.toLowerCase().contains("android"))) {
                        var1_1 = org.b.c.d();
                        var2_6 = var1_1;
                        if (org.b.c.a(var1_1)) {
                            g.c("Class path contains multiple SLF4J bindings.");
                            var2_6 = var2_6.iterator();
                            while (var2_6.hasNext()) {
                                var3_9 = (URL)var2_6.next();
                                g.c("Found binding in [" + var3_9 + "]");
                            }
                            g.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                        }
                    }
                    StaticLoggerBinder.getSingleton();
                    org.b.c.a = 3;
                    var2_6 = var1_1;
                    if (var2_6 != null && org.b.c.a(var2_6)) {
                        g.c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
                    }
                    org.b.c.a();
                    org.b.c.b();
                    org.b.c.b.d();
                } catch (NoClassDefFoundError v0) {
                    var1_2 = v0;
                    var2_7 = v0.getMessage();
                    if (var2_7 == null) ** GOTO lbl-1000
                    if (var2_7.contains("org/slf4j/impl/StaticLoggerBinder")) {
                        v1 = true;
                    } else if (var2_7.contains("org.slf4j.impl.StaticLoggerBinder")) {
                        v1 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v1 = false;
                    }
                    if (v1) {
                        org.b.c.a = 4;
                        g.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                        g.c("Defaulting to no-operation (NOP) logger implementation");
                        g.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    }
                    org.b.c.a(var1_2);
                    throw var1_2;
                } catch (NoSuchMethodError v2) {
                    var1_3 = v2;
                    var2_8 = v2.getMessage();
                    if (var2_8 != null && var2_8.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                        org.b.c.a = 2;
                        g.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                        g.c("Your binding is version 1.5.5 or earlier.");
                        g.c("Upgrade your binding to version 1.6.x.");
                    }
                    throw var1_3;
                } catch (Exception v3) {
                    var1_4 = v3;
                    org.b.c.a(v3);
                    throw new IllegalStateException("Unexpected initialization failure", var1_4);
                }
                if (org.b.c.a == 3) {
                    org.b.c.c();
                }
            }
            // ** MonitorExit[var0] (shouldn't be in output)
lbl71:
            // 2 sources

            switch (org.b.c.a) {
                case 3: {
                    return StaticLoggerBinder.getSingleton().getLoggerFactory();
                }
                case 4: {
                    return org.b.c.c;
                }
                case 2: {
                    throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
                }
                case 1: {
                    return org.b.c.b;
                }
            }
            throw new IllegalStateException("Unreachable code");
        }
    }
}

