/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.OutputStream;
import org.bouncycastle.b.g;
import org.bouncycastle.openpgp.ar;
import org.bouncycastle.openpgp.as;
import org.bouncycastle.openpgp.e;
import org.bouncycastle.openpgp.f;

public final class d
implements ar {
    private int a;
    private int b;
    private OutputStream c;
    private g d;

    public d(int n2) {
        this(n2, 0);
    }

    private d(int n2, byte by2) {
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                break;
            }
            default: {
                throw new IllegalArgumentException("unknown compression algorithm");
            }
        }
        this.a = n2;
        this.b = -1;
    }

    public final OutputStream a(OutputStream object) {
        if (this.c != null) {
            throw new IllegalStateException("generator already in open state");
        }
        this.d = new g((OutputStream)object, 0);
        object = this;
        ((d)object).d.write(((d)object).a);
        switch (((d)object).a) {
            case 0: {
                ((d)object).c = ((d)object).d;
                break;
            }
            case 1: {
                Object object2 = object;
                ((d)object).c = new f((d)object2, ((d)object2).d, ((d)object).b, true);
                break;
            }
            case 2: {
                Object object3 = object;
                ((d)object).c = new f((d)object3, ((d)object3).d, ((d)object).b, false);
                break;
            }
            case 3: {
                ((d)object).c = new e(((d)object).d);
                break;
            }
            default: {
                throw new IllegalStateException();
            }
        }
        return new as(this.c, this);
    }

    public final void a() {
        if (this.c != null) {
            if (this.c != this.d) {
                this.c.close();
            }
            this.c = null;
            this.d.a();
            this.d.flush();
            this.d = null;
        }
    }
}

