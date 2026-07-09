/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import java.security.PrivilegedAction;
import java.util.Map;
import org.bouncycastle.e.h;

final class i
implements PrivilegedAction {
    private /* synthetic */ String a;

    i(String string) {
        this.a = string;
    }

    public final Object run() {
        Map map = (Map)h.a().get();
        if (map != null) {
            return map.get(this.a);
        }
        return System.getProperty(this.a);
    }
}

