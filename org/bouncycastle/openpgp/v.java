/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.b.c;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.ad;
import org.bouncycastle.openpgp.ah;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.al;
import org.bouncycastle.openpgp.b.a;
import org.bouncycastle.openpgp.l;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.s;
import org.bouncycastle.openpgp.u;
import org.bouncycastle.openpgp.w;
import org.bouncycastle.openpgp.x;
import org.bouncycastle.openpgp.y;

public class v
implements e {
    private c a;
    private a b;

    public v(InputStream inputStream, a a2) {
        this.a = new c(inputStream);
        this.b = a2;
    }

    public final Object a() {
        switch (this.a.a()) {
            case -1: {
                return null;
            }
            case 2: {
                ArrayList<aj> arrayList = new ArrayList<aj>();
                while (this.a.a() == 2) {
                    try {
                        arrayList.add(new aj(this.a));
                    } catch (m m2) {
                        throw new IOException("can't create signature object: ".concat(String.valueOf(m2)));
                    }
                }
                ArrayList<aj> arrayList2 = arrayList;
                return new al(arrayList2.toArray(new aj[arrayList2.size()]));
            }
            case 5: {
                try {
                    return new ah(this.a, this.b);
                } catch (m m3) {
                    throw new IOException("can't create secret key object: ".concat(String.valueOf(m3)));
                }
            }
            case 6: {
                return new ad(this.a, this.b);
            }
            case 14: {
                try {
                    return ad.a(this.a, this.b);
                } catch (m m4) {
                    throw new IOException("processing error: " + m4.getMessage());
                }
            }
            case 8: {
                return new org.bouncycastle.openpgp.a(this.a);
            }
            case 11: {
                return new s(this.a);
            }
            case 1: 
            case 3: {
                return new l(this.a);
            }
            case 4: {
                ArrayList<x> arrayList = new ArrayList<x>();
                while (this.a.a() == 4) {
                    try {
                        arrayList.add(new x(this.a));
                    } catch (m m5) {
                        throw new IOException("can't create one pass signature object: ".concat(String.valueOf(m5)));
                    }
                }
                ArrayList<x> arrayList3 = arrayList;
                return new y(arrayList3.toArray(new x[arrayList3.size()]));
            }
            case 10: {
                return new u(this.a);
            }
            case 60: 
            case 61: 
            case 62: 
            case 63: {
                return this.a.b();
            }
        }
        throw new IOException("unknown object in stream: " + this.a.a());
    }

    public Iterator iterator() {
        return new w(this);
    }
}

