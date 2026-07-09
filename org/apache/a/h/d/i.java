/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.m;

public class i
implements b {
    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        m2.e(!ai.b(string) ? string : "/");
    }

    @Override
    public void a(c c2, f f2) {
    }

    @Override
    public final boolean b(c object, f object2) {
        ai.a(object, "Cookie");
        ai.a(object2, "Cookie origin");
        String string = ((f)object2).b();
        object2 = object.e();
        object = string;
        if (object2 == null) {
            object2 = "/";
        }
        if (((String)object2).length() > 1 && ((String)object2).endsWith("/")) {
            object2 = ((String)object2).substring(0, ((String)object2).length() - 1);
        }
        if (((String)object).startsWith((String)object2)) {
            if (((String)object2).equals("/")) {
                return true;
            }
            if (((String)object).length() == ((String)object2).length()) {
                return true;
            }
            if (((String)object).charAt(((String)object2).length()) == '/') {
                return true;
            }
        }
        return false;
    }

    @Override
    public final String a() {
        return "path";
    }
}

