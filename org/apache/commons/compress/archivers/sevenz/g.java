/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import org.apache.commons.compress.archivers.sevenz.aa;
import org.apache.commons.compress.archivers.sevenz.f;
import org.apache.commons.compress.archivers.sevenz.w;
import org.apache.commons.compress.archivers.sevenz.x;

final class g
extends f {
    @Override
    public final void a(x x2, w w2) {
        System.out.print(w2.getName());
        if (w2.b()) {
            System.out.print(" dir");
        } else {
            System.out.print(" 0/" + w2.j());
        }
        if (w2.d()) {
            System.out.print(" " + w2.e());
        } else {
            System.out.print(" no last modified date");
        }
        if (!w2.b()) {
            System.out.println(" " + g.a(w2));
            return;
        }
        System.out.println("");
    }

    private static String a(w object) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = true;
        for (aa aa2 : ((w)((Object)object)).k()) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            bl2 = false;
            stringBuilder.append((Object)aa2.a());
            if (aa2.b() == null) continue;
            stringBuilder.append("(").append(aa2.b()).append(")");
        }
        return stringBuilder.toString();
    }
}

