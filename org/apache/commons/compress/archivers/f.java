/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

import java.security.PrivilegedAction;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.compress.archivers.e;
import org.apache.commons.compress.archivers.g;

final class f
implements PrivilegedAction<SortedMap<String, g>> {
    f() {
    }

    @Override
    public final /* synthetic */ Object run() {
        TreeMap<String, g> treeMap = new TreeMap<String, g>();
        e.a(e.b().a(), e.b(), treeMap);
        for (g g2 : e.c()) {
            e.a(g2.a(), g2, treeMap);
        }
        return treeMap;
    }
}

