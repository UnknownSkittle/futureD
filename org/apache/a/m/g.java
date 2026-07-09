/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import com.a.a.b.ai;
import java.io.IOException;
import org.apache.a.ab;
import org.apache.a.ac;
import org.apache.a.i;
import org.apache.a.l;
import org.apache.a.m;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.s;
import org.apache.a.v;

public final class g {
    private final int a = ai.a(3000, "Wait for continue time");

    private g() {
    }

    public g(byte by2) {
        this();
    }

    private static boolean a(q q2, s s2) {
        if ("HEAD".equalsIgnoreCase(q2.g().a())) {
            return false;
        }
        int n2 = s2.a().b();
        return n2 >= 200 && n2 != 204 && n2 != 304 && n2 != 205;
    }

    public final s a(q q2, i i2, d d2) {
        ai.a(q2, "HTTP request");
        ai.a(i2, "Client connection");
        ai.a(d2, "HTTP context");
        try {
            d d3 = d2;
            i i3 = i2;
            q q3 = q2;
            Object object = this;
            ai.a(q3, "HTTP request");
            ai.a(i3, "Client connection");
            ai.a(d3, "HTTP context");
            s s2 = null;
            d3.a("http.connection", i3);
            d3.a("http.request_sent", Boolean.FALSE);
            i3.a(q3);
            if (q3 instanceof l) {
                boolean bl2 = true;
                ac ac2 = q3.g().b();
                if (((l)q3).a() && !ac2.a(v.a)) {
                    i3.b();
                    if (i3.a(((g)object).a)) {
                        int n2;
                        s2 = i3.a();
                        if (g.a(q3, s2)) {
                            i3.a(s2);
                        }
                        if ((n2 = s2.a().b()) < 200) {
                            if (n2 != 100) {
                                throw new ab("Unexpected response: " + s2.a());
                            }
                            s2 = null;
                        } else {
                            bl2 = false;
                        }
                    }
                }
                if (bl2) {
                    i3.a((l)q3);
                }
            }
            i3.b();
            d3.a("http.request_sent", Boolean.TRUE);
            object = s2;
            if (object == null) {
                object = g.b(q2, i2, d2);
            }
            return object;
        } catch (IOException iOException) {
            g.a(i2);
            throw iOException;
        } catch (m m2) {
            g.a(i2);
            throw m2;
        } catch (RuntimeException runtimeException) {
            g.a(i2);
            throw runtimeException;
        }
    }

    private static void a(i i2) {
        try {
            i2.close();
            return;
        } catch (IOException iOException) {
            return;
        }
    }

    private static s b(q q2, i i2, d object) {
        ai.a(q2, "HTTP request");
        ai.a(i2, "Client connection");
        ai.a(object, "HTTP context");
        object = null;
        int n2 = 0;
        while (object == null || n2 < 200) {
            object = i2.a();
            if (g.a(q2, (s)object)) {
                i2.a((s)object);
            }
            n2 = object.a().b();
        }
        return object;
    }
}

