/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.n;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class c {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    private c(String string, String string2, String string3, String string4, String string5) {
        ai.a(string, "Package identifier");
        this.a = string;
        this.b = string2 != null ? string2 : "UNAVAILABLE";
        this.c = string3 != null ? string3 : "UNAVAILABLE";
        this.d = string4 != null ? string4 : "UNAVAILABLE";
        this.e = string5 != null ? string5 : "UNAVAILABLE";
    }

    public final String a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(20 + this.a.length() + this.b.length() + this.c.length() + this.d.length() + this.e.length());
        stringBuilder.append("VersionInfo(").append(this.a).append(':').append(this.b);
        if (!"UNAVAILABLE".equals(this.c)) {
            stringBuilder.append(':').append(this.c);
        }
        if (!"UNAVAILABLE".equals(this.d)) {
            stringBuilder.append(':').append(this.d);
        }
        stringBuilder.append(')');
        if (!"UNAVAILABLE".equals(this.e)) {
            stringBuilder.append('@').append(this.e);
        }
        return stringBuilder.toString();
    }

    public static c a(String string, ClassLoader object) {
        Object object2;
        Object object3;
        Object object4;
        block11: {
            ai.a(string, "Package identifier");
            object = object != null ? object : Thread.currentThread().getContextClassLoader();
            object4 = null;
            try {
                object3 = ((ClassLoader)object).getResourceAsStream(string.replace('.', '/') + "/version.properties");
                if (object3 == null) break block11;
                try {
                    object2 = new Properties();
                    ((Properties)object2).load((InputStream)object3);
                    object4 = object2;
                } finally {
                    ((InputStream)object3).close();
                }
            } catch (IOException iOException) {}
        }
        object3 = null;
        if (object4 != null) {
            ClassLoader classLoader = object4;
            object4 = object;
            object = classLoader;
            ai.a(string, "Package identifier");
            object3 = null;
            object2 = null;
            String string2 = null;
            if (object != null) {
                object3 = (String)object.get("info.module");
                if (object3 != null && ((String)object3).length() <= 0) {
                    object3 = null;
                }
                if ((object2 = (String)object.get("info.release")) != null && (((String)object2).length() <= 0 || ((String)object2).equals("${pom.version}"))) {
                    object2 = null;
                }
                if ((string2 = (String)object.get("info.timestamp")) != null && (string2.length() <= 0 || string2.equals("${mvn.timestamp}"))) {
                    string2 = null;
                }
            }
            object = null;
            if (object4 != null) {
                object = object4.toString();
            }
            object3 = new c(string, (String)object3, (String)object2, string2, (String)object);
        }
        return object3;
    }
}

