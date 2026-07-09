/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.b.a;

import java.security.AccessController;
import org.bouncycastle.jcajce.provider.b.a.b;

public final class a {
    private String a;
    private int b;

    public static Class a(Class object, String string) {
        try {
            object = ((Class)object).getClassLoader();
            if (object != null) {
                return ((ClassLoader)object).loadClass(string);
            }
            return (Class)AccessController.doPrivileged(new b(string));
        } catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public a(String string) {
        this.a = string;
        this.b = 0;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final String b() {
        if (this.b == -1) {
            return null;
        }
        int n2 = this.a.indexOf(46, this.b);
        if (n2 == -1) {
            String string = this.a.substring(this.b);
            this.b = -1;
            return string;
        }
        String string = this.a.substring(this.b, n2);
        this.b = n2 + 1;
        return string;
    }
}

