/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

import com.a.a.b.ai;
import java.util.NoSuchElementException;
import org.apache.a.aa;
import org.apache.a.ag;
import org.apache.a.h;

public final class p
implements ag {
    private h a;
    private String b;
    private String c;
    private int d;

    public p(h h2) {
        this.a = ai.a(h2, "Header iterator");
        this.d = this.a(-1);
    }

    @Override
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override
    public final String a() {
        if (this.c == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        String string = this.c;
        this.d = this.a(this.d);
        return string;
    }

    @Override
    public final Object next() {
        return this.a();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }

    private int a(int n2) {
        if (n2 < 0) {
            if (!this.a.hasNext()) {
                return -1;
            }
            this.b = this.a.a().d();
            n2 = 0;
        } else {
            n2 = this.c(n2);
        }
        n2 = this.b(n2);
        if (n2 < 0) {
            this.c = null;
            return -1;
        }
        int n3 = this.d(n2);
        this.c = this.b.substring(n2, n3);
        return n3;
    }

    private int b(int n2) {
        n2 = ai.b(n2, "Search position");
        boolean bl2 = false;
        while (!bl2 && this.b != null) {
            int n3 = this.b.length();
            while (!bl2 && n2 < n3) {
                char c2 = this.b.charAt(n2);
                if (p.a(c2) || p.b(c2)) {
                    ++n2;
                    continue;
                }
                if (p.c(this.b.charAt(n2))) {
                    bl2 = true;
                    continue;
                }
                throw new aa("Invalid character before token (pos " + n2 + "): " + this.b);
            }
            if (bl2) continue;
            if (this.a.hasNext()) {
                this.b = this.a.a().d();
                n2 = 0;
                continue;
            }
            this.b = null;
        }
        if (bl2) {
            return n2;
        }
        return -1;
    }

    private int c(int n2) {
        n2 = ai.b(n2, "Search position");
        boolean bl2 = false;
        int n3 = this.b.length();
        while (!bl2 && n2 < n3) {
            char c2 = this.b.charAt(n2);
            if (p.a(c2)) {
                bl2 = true;
                continue;
            }
            if (p.b(c2)) {
                ++n2;
                continue;
            }
            if (p.c(c2)) {
                throw new aa("Tokens without separator (pos " + n2 + "): " + this.b);
            }
            throw new aa("Invalid character after token (pos " + n2 + "): " + this.b);
        }
        return n2;
    }

    private int d(int n2) {
        ai.b(n2, "Search position");
        int n3 = this.b.length();
        ++n2;
        while (n2 < n3 && p.c(this.b.charAt(n2))) {
            ++n2;
        }
        return n2;
    }

    private static boolean a(char c2) {
        return c2 == ',';
    }

    private static boolean b(char c2) {
        return c2 == '\t' || Character.isSpaceChar(c2);
    }

    private static boolean c(char c2) {
        if (Character.isLetterOrDigit(c2)) {
            return true;
        }
        if (Character.isISOControl(c2)) {
            return false;
        }
        return !p.d(c2);
    }

    private static boolean d(char c2) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c2) >= 0;
    }
}

