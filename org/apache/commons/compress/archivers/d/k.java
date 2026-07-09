/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.d;

import java.util.Comparator;
import org.apache.commons.compress.archivers.d.e;
import org.apache.commons.compress.archivers.d.j;

final class k
implements Comparator<e> {
    private /* synthetic */ j a;

    k(j j2) {
        this.a = j2;
    }

    @Override
    public final /* synthetic */ int compare(Object object, Object object2) {
        object2 = (e)object2;
        if (((e)(object = (e)object)).e() == null || ((e)object2).e() == null) {
            return Integer.MAX_VALUE;
        }
        return ((e)object).e().compareTo(((e)object2).e());
    }
}

