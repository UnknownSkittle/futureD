/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import java.net.InetAddress;
import org.apache.a.e.e;

public final class t
implements e {
    public static final t a = new t();

    @Override
    public final InetAddress[] a(String string) {
        return InetAddress.getAllByName(string);
    }
}

