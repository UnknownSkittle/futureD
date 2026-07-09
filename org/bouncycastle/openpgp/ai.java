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
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.ah;
import org.bouncycastle.openpgp.b.a;
import org.bouncycastle.openpgp.m;
import org.bouncycastle.openpgp.v;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class ai
implements e<ah> {
    private Map a = new HashMap();
    private List b = new ArrayList();

    public ai(InputStream object, a object2) {
        object = new v((InputStream)object, (a)object2);
        while ((object2 = ((v)object).a()) != null) {
            if (!(object2 instanceof ah)) {
                throw new m(object2.getClass().getName() + " found where PGPSecretKeyRing expected");
            }
            object2 = (ah)object2;
            Long l2 = new Long(((ag)((ah)object2).a.get((int)0)).a.a());
            this.a.put(l2, object2);
            this.b.add(l2);
        }
    }

    public final Iterator<ah> a() {
        return this.a.values().iterator();
    }

    public final ag a(long l2) {
        Iterator<ah> iterator = this.a();
        while (iterator.hasNext()) {
            Object object;
            ah ah2;
            block2: {
                long l3 = l2;
                ah2 = iterator.next();
                for (int i2 = 0; i2 != ah2.a.size(); ++i2) {
                    ag ag2 = (ag)ah2.a.get(i2);
                    if (l3 != ag2.a.a()) continue;
                    object = ag2;
                    break block2;
                }
                object = ah2 = null;
            }
            if (object == null) continue;
            return ah2;
        }
        return null;
    }

    public final Iterator<ah> iterator() {
        return this.a.values().iterator();
    }
}

