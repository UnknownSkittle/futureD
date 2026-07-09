/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import org.bouncycastle.b.e;
import org.bouncycastle.math.ec.ae;
import org.bouncycastle.math.ec.af;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.y;

final class ah
implements y {
    private /* synthetic */ int a;
    private /* synthetic */ boolean b;
    private /* synthetic */ p c;
    private /* synthetic */ d d;

    ah(int n2, p p2, d d2) {
        this.a = n2;
        this.b = true;
        this.c = p2;
        this.d = d2;
    }

    public final e a(e pArray) {
        pArray = pArray instanceof ae ? (ae)pArray : null;
        int n2 = 1 << Math.max(0, this.a - 2);
        int n3 = this.b;
        p[] pArray2 = pArray;
        if (pArray != null && ah.a(pArray2.a(), n2) && (n3 == 0 || ah.a(pArray2.b(), n2))) {
            return pArray;
        }
        p[] pArray3 = null;
        pArray2 = null;
        p p2 = null;
        if (pArray != null) {
            pArray3 = pArray.a();
            pArray2 = pArray.b();
            p2 = pArray.c();
        }
        int n4 = 0;
        if (pArray3 == null) {
            pArray3 = af.a();
        } else {
            n4 = pArray3.length;
        }
        if (n4 < n2) {
            pArray3 = af.a(pArray3, n2);
            if (n2 == 1) {
                pArray3[0] = this.c.m();
            } else {
                n3 = n4;
                if (n3 == 0) {
                    pArray3[0] = this.c;
                    n3 = 1;
                }
                j j2 = null;
                if (n2 == 2) {
                    pArray3[1] = this.c.t();
                } else {
                    p p3 = p2;
                    p p4 = pArray3[n3 - 1];
                    if (p3 == null) {
                        p2 = p3 = pArray3[0].s();
                        if (!p3.n() && org.bouncycastle.math.ec.b.b(this.d.f()) && this.d.a() >= 64) {
                            switch (this.d.k()) {
                                case 2: 
                                case 3: 
                                case 4: {
                                    j2 = p2.a(0);
                                    p3 = this.d.a(p2.g().a(), p2.h().a(), false);
                                    j j3 = j2.e();
                                    j j4 = j3.c(j2);
                                    p4 = p4.b(j3).c(j4);
                                    if (n4 != 0) break;
                                    pArray3[0] = p4;
                                }
                            }
                        }
                    }
                    while (n3 < n2) {
                        pArray3[n3++] = p4 = p4.b(p3);
                    }
                }
                this.d.a(pArray3, n4, n2 - n4, j2);
            }
        }
        if (this.b) {
            if (pArray2 == null) {
                n3 = 0;
                pArray2 = new p[n2];
            } else {
                n3 = pArray2.length;
                if (n3 < n2) {
                    pArray2 = af.a(pArray2, n2);
                }
            }
            while (n3 < n2) {
                pArray2[n3] = pArray3[n3].r();
                ++n3;
            }
        }
        ae ae2 = new ae();
        ae2.a(pArray3);
        ae2.b(pArray2);
        ae2.a(p2);
        return ae2;
    }

    private static boolean a(p[] pArray, int n2) {
        return pArray != null && pArray.length >= n2;
    }
}

