/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.a;

import com.a.a.b.ai;
import java.util.Queue;
import org.apache.a.a.a;
import org.apache.a.a.b;
import org.apache.a.a.d;
import org.apache.a.a.j;
import org.apache.a.h.b.f;

public class e {
    private a a = org.apache.a.a.a.a;
    private b b;
    private d c;
    private j d;
    private Queue<f> e;

    public final void a() {
        this.a = org.apache.a.a.a.a;
        this.e = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final a b() {
        return this.a;
    }

    public final void a(a a2) {
        this.a = a2 != null ? a2 : org.apache.a.a.a.a;
    }

    public final b c() {
        return this.b;
    }

    public final j d() {
        return this.d;
    }

    public final void a(b b2, j j2) {
        ai.a(b2, "Auth scheme");
        ai.a(j2, "Credentials");
        this.b = b2;
        this.d = j2;
        this.e = null;
    }

    public final Queue<f> e() {
        return this.e;
    }

    public final void a(Queue<f> queue) {
        ai.a(queue, "Queue of auth options");
        this.e = queue;
        this.b = null;
        this.d = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state:").append((Object)this.a).append(";");
        if (this.b != null) {
            stringBuilder.append("auth scheme:").append(this.b.a()).append(";");
        }
        if (this.d != null) {
            stringBuilder.append("credentials present");
        }
        return stringBuilder.toString();
    }
}

