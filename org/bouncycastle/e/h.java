/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.security.AccessControlException;
import java.security.AccessController;
import org.bouncycastle.e.i;
import org.bouncycastle.e.k;

public final class h {
    private static final ThreadLocal a = new ThreadLocal();

    public static boolean a(String string) {
        try {
            string = (String)AccessController.doPrivileged(new i(string));
            if (string != null) {
                return "true".equals(k.c(string));
            }
            return false;
        } catch (AccessControlException accessControlException) {
            return false;
        }
    }

    static /* synthetic */ ThreadLocal a() {
        return a;
    }
}

