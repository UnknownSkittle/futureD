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
import org.bouncycastle.b.af;
import org.bouncycastle.b.an;
import org.bouncycastle.b.c;
import org.bouncycastle.b.i;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.b.a;
import org.bouncycastle.openpgp.p;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class ah
extends p
implements e<ag> {
    List a;
    private List b;

    private static List a(List list) {
        ArrayList<ag> arrayList = new ArrayList<ag>(list.size());
        for (int i2 = 0; i2 != list.size(); ++i2) {
            ag ag2 = (ag)list.get(i2);
            if (i2 == 0) {
                if (!ag2.a.d()) {
                    throw new IllegalArgumentException("key 0 must be a master key");
                }
            } else if (ag2.a.d()) {
                throw new IllegalArgumentException("key 0 can be only master key");
            }
            arrayList.add(ag2);
        }
        return arrayList;
    }

    public ah(List list) {
        this(ah.a(list), new ArrayList());
    }

    private ah(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public ah(InputStream inputStream, a a2) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        inputStream = ah.a(inputStream);
        int n2 = ((c)inputStream).a();
        if (n2 != 5 && n2 != 7) {
            throw new IOException("secret key ring doesn't start with secret key tag: tag 0x" + Integer.toHexString(n2));
        }
        i i2 = (af)((c)inputStream).b();
        while (((c)inputStream).a() == 61) {
            ((c)inputStream).b();
        }
        an an2 = ah.a((c)inputStream);
        List list = ah.b((c)inputStream);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ah.a((c)inputStream, arrayList, arrayList2, arrayList3);
        this.a.add(new ag((af)i2, new ab(((af)i2).e(), an2, list, arrayList, arrayList2, arrayList3, a2)));
        while (((c)inputStream).a() == 7 || ((c)inputStream).a() == 14) {
            if (((c)inputStream).a() == 7) {
                i2 = (org.bouncycastle.b.ag)((c)inputStream).b();
                while (((c)inputStream).a() == 61) {
                    ((c)inputStream).b();
                }
                an2 = ah.a((c)inputStream);
                list = ah.b((c)inputStream);
                this.a.add(new ag((af)i2, new ab(((af)i2).e(), an2, list, a2)));
                continue;
            }
            i2 = (org.bouncycastle.b.ab)((c)inputStream).b();
            an2 = ah.a((c)inputStream);
            list = ah.b((c)inputStream);
            this.b.add(new ab((aa)i2, an2, list, a2));
        }
    }

    public final ag a() {
        return (ag)this.a.get(0);
    }

    public final Iterator<ag> b() {
        return Collections.unmodifiableList(this.a).iterator();
    }

    public final void a(OutputStream outputStream) {
        int n2;
        for (n2 = 0; n2 != this.a.size(); ++n2) {
            ((ag)this.a.get(n2)).a(outputStream);
        }
        for (n2 = 0; n2 != this.b.size(); ++n2) {
            ((ab)this.b.get(n2)).b(outputStream);
        }
    }

    public final Iterator<ag> iterator() {
        return this.b();
    }
}

