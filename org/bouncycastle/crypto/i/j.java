/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import java.security.SecureRandom;
import org.bouncycastle.b.e;

public final class j
implements e {
    private SecureRandom a;
    private e b;

    public j(e e2, SecureRandom secureRandom) {
        this.a = secureRandom;
        this.b = e2;
    }

    public final SecureRandom a() {
        return this.a;
    }

    public final e b() {
        return this.b;
    }
}

