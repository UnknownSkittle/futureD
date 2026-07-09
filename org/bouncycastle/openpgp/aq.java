/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.BufferedInputStream;
import java.io.InputStream;

final class aq
extends BufferedInputStream {
    aq(InputStream inputStream) {
        super(inputStream);
    }

    public final synchronized int available() {
        int n2 = super.available();
        if (n2 < 0) {
            n2 = Integer.MAX_VALUE;
        }
        return n2;
    }
}

