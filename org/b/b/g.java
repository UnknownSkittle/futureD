/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.b.b;

import org.b.b.h;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class g {
    private static h a;
    private static boolean b;

    private g() {
    }

    public static String a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("null input");
        }
        String string2 = null;
        try {
            string2 = System.getProperty(string);
        } catch (SecurityException securityException) {}
        return string2;
    }

    public static boolean b(String string) {
        if ((string = g.a(string)) == null) {
            return false;
        }
        return string.equalsIgnoreCase("true");
    }

    private static h b() {
        try {
            return new h(0);
        } catch (SecurityException securityException) {
            return null;
        }
    }

    public static Class<?> a() {
        int n2;
        Class<?>[] classArray;
        Class<?>[] classArray2;
        if (a != null) {
            classArray2 = a;
        } else if (b) {
            classArray2 = null;
        } else {
            a = g.b();
            b = true;
            classArray2 = classArray = a;
        }
        if (classArray2 == null) {
            return null;
        }
        classArray = classArray.getClassContext();
        String string = g.class.getName();
        for (n2 = 0; n2 < classArray.length && !string.equals(classArray[n2].getName()); ++n2) {
        }
        if (n2 >= classArray.length || n2 + 2 >= classArray.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classArray[n2 + 2];
    }

    public static final void a(String string, Throwable throwable) {
        System.err.println(string);
        System.err.println("Reported exception:");
        throwable.printStackTrace();
    }

    public static final void c(String string) {
        System.err.println("SLF4J: ".concat(String.valueOf(string)));
    }

    static {
        b = false;
    }
}

