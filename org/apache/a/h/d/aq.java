/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.f.b;
import org.apache.a.h.d.ak;
import org.apache.a.h.d.f;
import org.apache.a.h.d.g;
import org.apache.a.h.d.h;
import org.apache.a.h.d.i;
import org.apache.a.h.d.j;

public final class aq
extends ak {
    static final String[] a = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    public aq() {
        super(new i(), new f(), new h(), new j(), new g(a));
    }

    aq(b ... bArray) {
        super(bArray);
    }

    public final String toString() {
        return "rfc6265-strict";
    }
}

