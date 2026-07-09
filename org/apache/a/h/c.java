/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h;

import com.a.a.b.ai;
import java.util.Iterator;
import org.apache.a.aa;
import org.apache.a.ac;
import org.apache.a.b;
import org.apache.a.e;
import org.apache.a.h;
import org.apache.a.j.p;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.s;
import org.apache.a.v;

public class c
implements b {
    @Override
    public boolean a(s object, d object2) {
        Iterator<Object> iterator;
        Object object3;
        block19: {
            Object object4;
            ai.a(object, "HTTP response");
            ai.a(object2, "HTTP context");
            object2 = (q)object2.a("http.request");
            if (object2 != null) {
                try {
                    object3 = new p(object2.e("Connection"));
                    while (object3.hasNext()) {
                        object4 = object3.a();
                        if (!"Close".equalsIgnoreCase((String)object4)) continue;
                        return false;
                    }
                } catch (aa aa2) {
                    return false;
                }
            }
            object3 = object.a().a();
            object4 = object.c("Transfer-Encoding");
            if (object4 != null) {
                if (!"chunked".equalsIgnoreCase(object4.d())) {
                    return false;
                }
            } else {
                int n2;
                object4 = object;
                if ((object2 == null || !object2.g().a().equalsIgnoreCase("HEAD")) && (n2 = object4.a().b()) >= 200 && n2 != 204 && n2 != 304 && n2 != 205) {
                    Object object5 = object.b("Content-Length");
                    if (((e[])object5).length == 1) {
                        object5 = object5[0];
                        try {
                            if (Integer.parseInt(object5.d()) < 0) {
                                return false;
                            }
                            break block19;
                        } catch (NumberFormatException numberFormatException) {
                            return false;
                        }
                    }
                    return false;
                }
            }
        }
        if (!(iterator = object.e("Connection")).hasNext()) {
            iterator = object.e("Proxy-Connection");
        }
        if (iterator.hasNext()) {
            try {
                iterator = new p((h)iterator);
                boolean bl2 = false;
                while (iterator.hasNext()) {
                    object = iterator.a();
                    if ("Close".equalsIgnoreCase((String)object)) {
                        return false;
                    }
                    if (!"Keep-Alive".equalsIgnoreCase((String)object)) continue;
                    bl2 = true;
                }
                if (bl2) {
                    return true;
                }
            } catch (aa aa3) {
                return false;
            }
        }
        return !((ac)object3).a(v.a);
    }

    static {
        new c();
    }
}

