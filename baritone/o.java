/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  axw
 */
package baritone;

import baritone.l;
import baritone.n;
import baritone.p;
import java.util.concurrent.LinkedBlockingQueue;

final class o
implements Runnable {
    private /* synthetic */ n a;

    private o(n n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        Object object;
        while ((object = n.a(this.a)) != null) {
            try {
                object = p.a((axw)((LinkedBlockingQueue)object).take());
                n.a(this.a, (l)object);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                return;
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    /* synthetic */ o(n n2, byte by2) {
        this(n2);
    }
}

