/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.d;

import java.security.PrivilegedAction;
import org.bouncycastle.crypto.d.a;

final class b
implements PrivilegedAction {
    private /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    public final Object run() {
        return System.getProperty("org.bouncycastle.pkcs1.strict");
    }
}

