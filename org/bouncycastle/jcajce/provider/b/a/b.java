/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce.provider.b.a;

import java.security.PrivilegedAction;

final class b
implements PrivilegedAction {
    private /* synthetic */ String a;

    b(String string) {
        this.a = string;
    }

    public final Object run() {
        try {
            return Class.forName(this.a);
        } catch (Exception exception) {
            return null;
        }
    }
}

