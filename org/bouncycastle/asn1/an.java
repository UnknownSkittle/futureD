/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.InputStream;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.y;

final class an
extends InputStream {
    private final y a;
    private boolean b = true;
    private InputStream c;

    an(y y2) {
        this.a = y2;
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if (this.c == null) {
            if (!this.b) {
                return -1;
            }
            q q2 = (q)this.a.a();
            if (q2 == null) {
                return -1;
            }
            this.b = false;
            this.c = q2.b();
        }
        int n4 = 0;
        while (true) {
            int n5;
            if ((n5 = this.c.read(byArray, n2 + n4, n3 - n4)) >= 0) {
                if ((n4 += n5) != n3) continue;
                return n4;
            }
            q q3 = (q)this.a.a();
            if (q3 == null) {
                this.c = null;
                if (n4 <= 0) {
                    return -1;
                }
                return n4;
            }
            this.c = q3.b();
        }
    }

    public final int read() {
        q q2;
        if (this.c == null) {
            if (!this.b) {
                return -1;
            }
            q2 = (q)this.a.a();
            if (q2 == null) {
                return -1;
            }
            this.b = false;
            this.c = q2.b();
        }
        int n2;
        while ((n2 = this.c.read()) < 0) {
            q2 = (q)this.a.a();
            if (q2 == null) {
                this.c = null;
                return -1;
            }
            this.c = q2.b();
        }
        return n2;
    }
}

