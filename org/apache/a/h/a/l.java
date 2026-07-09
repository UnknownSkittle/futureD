/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import org.apache.a.a.j;
import org.apache.a.e;
import org.apache.a.h.a.f;
import org.apache.a.m.d;
import org.apache.a.q;
import org.ietf.jgss.Oid;

public final class l
extends f {
    @Override
    public final String a() {
        return "Kerberos";
    }

    @Override
    public final e a(j j2, q q2, d d2) {
        return super.a(j2, q2, d2);
    }

    @Override
    protected final byte[] a(byte[] byArray, String string) {
        return super.a(byArray, string);
    }

    @Override
    protected final byte[] a(byte[] byArray, String string, j j2) {
        return l.a(byArray, new Oid("1.2.840.113554.1.2.2"), string, j2);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final boolean c() {
        return true;
    }
}

