/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.b.aa;
import org.bouncycastle.b.an;
import org.bouncycastle.b.c;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.b.a;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.p;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class ad
extends p
implements e<ab> {
    private List a;

    public ad(List list) {
        ArrayList<ab> arrayList = new ArrayList<ab>(list.size());
        for (int i2 = 0; i2 != list.size(); ++i2) {
            ab ab2 = (ab)list.get(i2);
            if (i2 == 0) {
                if (!ab2.d()) {
                    throw new IllegalArgumentException("key 0 must be a master key");
                }
            } else if (ab2.d()) {
                throw new IllegalArgumentException("key 0 can be only master key");
            }
            arrayList.add(ab2);
        }
        this.a = arrayList;
    }

    public ad(InputStream inputStream, a a2) {
        this.a = new ArrayList();
        inputStream = ad.a(inputStream);
        int n2 = ((c)inputStream).a();
        if (n2 != 6 && n2 != 14) {
            throw new IOException("public key ring doesn't start with public key tag: tag 0x" + Integer.toHexString(n2));
        }
        aa aa2 = (aa)((c)inputStream).b();
        an an2 = ad.a((c)inputStream);
        List list = ad.b((c)inputStream);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ad.a((c)inputStream, arrayList, arrayList2, arrayList3);
        try {
            this.a.add(new ab(aa2, an2, list, arrayList, arrayList2, arrayList3, a2));
            while (((c)inputStream).a() == 14) {
                this.a.add(ad.a((c)inputStream, a2));
            }
            return;
        } catch (m m2) {
            throw new IOException("processing exception: " + m2.toString());
        }
    }

    public final ab a() {
        return (ab)this.a.get(0);
    }

    public final ab a(long l2) {
        for (int i2 = 0; i2 != this.a.size(); ++i2) {
            ab ab2 = (ab)this.a.get(i2);
            if (l2 != ab2.a()) continue;
            return ab2;
        }
        return null;
    }

    public final Iterator<ab> b() {
        return Collections.unmodifiableList(this.a).iterator();
    }

    public final Iterator<ab> iterator() {
        return this.b();
    }

    public final void a(OutputStream object) {
        OutputStream outputStream = object;
        object = this;
        for (int i2 = 0; i2 != ((ad)object).a.size(); ++i2) {
            ((ab)((ad)object).a.get(i2)).b(outputStream);
        }
    }

    static ab a(c object, a a2) {
        aa aa2 = (aa)((c)object).b();
        an an2 = ad.a((c)object);
        object = ad.b((c)object);
        return new ab(aa2, an2, (List)object, a2);
    }
}

