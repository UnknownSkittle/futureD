/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.a.b.e.a;
import org.apache.a.b.g;
import org.apache.a.h.b.q;
import org.apache.a.l;
import org.apache.a.m.d;
import org.apache.a.m.e;

public final class i
implements g {
    public static final i a = new i(0);
    private final int b;
    private final boolean c;
    private final Set<Class<? extends IOException>> d = new HashSet<Class<? extends IOException>>();

    private i(Collection<Class<? extends IOException>> object) {
        this.b = 3;
        this.c = false;
        object = object.iterator();
        while (object.hasNext()) {
            Class clazz = (Class)object.next();
            this.d.add(clazz);
        }
    }

    private i() {
        this(Arrays.asList(InterruptedIOException.class, UnknownHostException.class, ConnectException.class, SSLException.class));
    }

    private i(byte by2) {
        this();
    }

    @Override
    public final boolean a(IOException object, int n2, d object2) {
        ai.a(object, "Exception parameter");
        ai.a(object2, "HTTP context");
        if (n2 > 3) {
            return false;
        }
        if (this.d.contains(object.getClass())) {
            return false;
        }
        Object object3 = this.d.iterator();
        while (object3.hasNext()) {
            if (!object3.next().isInstance(object)) continue;
            return false;
        }
        object3 = org.apache.a.b.e.a.a((d)object2);
        org.apache.a.q q2 = ((e)object3).a("http.request", org.apache.a.q.class);
        object = q2;
        object2 = q2;
        if (object instanceof q) {
            object2 = ((q)object).a();
        }
        if (object2 instanceof org.apache.a.b.c.l && ((org.apache.a.b.c.l)object2).h()) {
            return false;
        }
        if (!(q2 instanceof l)) {
            return true;
        }
        object = ((e)object3).a("http.request_sent", Boolean.class);
        return !(object != null && ((Boolean)object).booleanValue());
    }
}

