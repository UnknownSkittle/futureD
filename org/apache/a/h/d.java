/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.ad;
import org.apache.a.af;
import org.apache.a.h.e;
import org.apache.a.j.i;
import org.apache.a.s;
import org.apache.a.t;

public final class d
implements t {
    public static final d a = new d();
    private ad b;

    private d(ad ad2) {
        this.b = ai.a(ad2, "Reason phrase catalog");
    }

    public d() {
        this(e.a);
    }

    @Override
    public final s a(af af2) {
        ai.a(af2, "Status line");
        return new i(af2, this.b, Locale.getDefault());
    }
}

