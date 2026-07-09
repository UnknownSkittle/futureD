/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.e.e;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ad;
import org.bouncycastle.openpgp.b.a;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.v;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public class ae
implements e<ad> {
    private Map a = new HashMap();
    private List b = new ArrayList();

    public ae(InputStream object, a object2) {
        object = new v((InputStream)object, (a)object2);
        while ((object2 = ((v)object).a()) != null) {
            if (!(object2 instanceof ad)) {
                throw new m(object2.getClass().getName() + " found where PGPPublicKeyRing expected");
            }
            object2 = (ad)object2;
            Long l2 = new Long(((ad)object2).a().a());
            this.a.put(l2, object2);
            this.b.add(l2);
        }
    }

    public final Iterator<ad> a() {
        return this.a.values().iterator();
    }

    public final ab a(long l2) {
        Iterator<ad> iterator = this.a();
        while (iterator.hasNext()) {
            ab ab2 = iterator.next().a(l2);
            if (ab2 == null) continue;
            return ab2;
        }
        return null;
    }

    public Iterator<ad> iterator() {
        return this.a.values().iterator();
    }
}

