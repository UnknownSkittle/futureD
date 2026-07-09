/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.d;

import com.a.a.b.w;
import com.a.a.d.b;
import com.a.a.d.c;
import com.a.a.d.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class a
implements Closeable {
    private static final char[] b = ")]}'\n".toCharArray();
    private final Reader c;
    private boolean d = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    int a = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    public a(Reader reader) {
        this.m[this.n++] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.c = reader;
    }

    public final void a(boolean bl2) {
        this.d = bl2;
    }

    public final boolean q() {
        return this.d;
    }

    public void a() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 3) {
            this.a(1);
            this.p[this.n - 1] = 0;
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + (Object)((Object)this.f()) + this.s());
    }

    public void b() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 4) {
            --this.n;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + (Object)((Object)this.f()) + this.s());
    }

    public void c() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 1) {
            this.a(3);
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + (Object)((Object)this.f()) + this.s());
    }

    public void d() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 2) {
            --this.n;
            this.o[this.n] = null;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            this.a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + (Object)((Object)this.f()) + this.s());
    }

    public boolean e() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        return n2 != 2 && n2 != 4;
    }

    public c f() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        switch (n2) {
            case 1: {
                return com.a.a.d.c.c;
            }
            case 2: {
                return com.a.a.d.c.d;
            }
            case 3: {
                return com.a.a.d.c.a;
            }
            case 4: {
                return com.a.a.d.c.b;
            }
            case 12: 
            case 13: 
            case 14: {
                return com.a.a.d.c.e;
            }
            case 5: 
            case 6: {
                return com.a.a.d.c.h;
            }
            case 7: {
                return com.a.a.d.c.i;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return com.a.a.d.c.f;
            }
            case 15: 
            case 16: {
                return com.a.a.d.c.g;
            }
            case 17: {
                return com.a.a.d.c.j;
            }
        }
        throw new AssertionError();
    }

    final int r() {
        int n2;
        block45: {
            block47: {
                block46: {
                    block44: {
                        n2 = this.m[this.n - 1];
                        if (n2 != 1) break block44;
                        this.m[this.n - 1] = 2;
                        break block45;
                    }
                    if (n2 != 2) break block46;
                    switch (this.b(true)) {
                        case 93: {
                            this.a = 4;
                            return 4;
                        }
                        case 59: {
                            this.v();
                        }
                        case 44: {
                            break block45;
                        }
                        default: {
                            throw this.b("Unterminated array");
                        }
                    }
                }
                if (n2 == 3 || n2 == 5) {
                    this.m[this.n - 1] = 4;
                    if (n2 == 5) {
                        switch (this.b(true)) {
                            case 125: {
                                this.a = 2;
                                return 2;
                            }
                            case 59: {
                                this.v();
                            }
                            case 44: {
                                break;
                            }
                            default: {
                                throw this.b("Unterminated object");
                            }
                        }
                    }
                    int n3 = this.b(true);
                    switch (n3) {
                        case 34: {
                            this.a = 13;
                            return 13;
                        }
                        case 39: {
                            this.v();
                            this.a = 12;
                            return 12;
                        }
                        case 125: {
                            if (n2 != 5) {
                                this.a = 2;
                                return 2;
                            }
                            throw this.b("Expected name");
                        }
                    }
                    this.v();
                    --this.f;
                    if (this.a((char)n3)) {
                        this.a = 14;
                        return 14;
                    }
                    throw this.b("Expected name");
                }
                if (n2 != 4) break block47;
                this.m[this.n - 1] = 5;
                switch (this.b(true)) {
                    case 58: {
                        break block45;
                    }
                    case 61: {
                        this.v();
                        if ((this.f < this.g || this.b(1)) && this.e[this.f] == '>') {
                            ++this.f;
                        }
                        break block45;
                    }
                    default: {
                        throw this.b("Expected ':'");
                    }
                }
            }
            if (n2 == 6) {
                if (this.d) {
                    this.y();
                }
                this.m[this.n - 1] = 7;
            } else if (n2 == 7) {
                if (this.b(false) == -1) {
                    this.a = 17;
                    return 17;
                }
                this.v();
                --this.f;
            } else if (n2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        switch (this.b(true)) {
            case 93: {
                if (n2 == 1) {
                    this.a = 4;
                    return 4;
                }
            }
            case 44: 
            case 59: {
                if (n2 == 1 || n2 == 2) {
                    this.v();
                    --this.f;
                    this.a = 7;
                    return 7;
                }
                throw this.b("Unexpected value");
            }
            case 39: {
                this.v();
                this.a = 8;
                return 8;
            }
            case 34: {
                this.a = 9;
                return 9;
            }
            case 91: {
                this.a = 3;
                return 3;
            }
            case 123: {
                this.a = 1;
                return 1;
            }
        }
        --this.f;
        n2 = this.o();
        if (n2 != 0) {
            return n2;
        }
        n2 = this.t();
        if (n2 != 0) {
            return n2;
        }
        a a2 = this;
        if (!a2.a(a2.e[this.f])) {
            throw this.b("Expected value");
        }
        this.v();
        this.a = 10;
        return 10;
    }

    private int o() {
        int n2;
        String string;
        String string2;
        char c2 = this.e[this.f];
        if (c2 == 't' || c2 == 'T') {
            string2 = "true";
            string = "TRUE";
            n2 = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            string2 = "false";
            string = "FALSE";
            n2 = 6;
        } else if (c2 == 'n' || c2 == 'N') {
            string2 = "null";
            string = "NULL";
            n2 = 7;
        } else {
            return 0;
        }
        int n3 = string2.length();
        for (int i2 = 1; i2 < n3; ++i2) {
            if (this.f + i2 >= this.g && !this.b(i2 + 1)) {
                return 0;
            }
            c2 = this.e[this.f + i2];
            if (c2 == string2.charAt(i2) || c2 == string.charAt(i2)) continue;
            return 0;
        }
        if (this.f + n3 < this.g || this.b(n3 + 1)) {
            a a2 = this;
            if (a2.a(a2.e[this.f + n3])) {
                return 0;
            }
        }
        this.f += n3;
        this.a = n2;
        return this.a;
    }

    private int t() {
        char[] cArray = this.e;
        int n2 = this.f;
        int n3 = this.g;
        long l2 = 0L;
        boolean bl2 = false;
        boolean bl3 = true;
        int n4 = 0;
        int n5 = 0;
        block6: while (true) {
            if (n2 + n5 == n3) {
                if (n5 == 1024) {
                    return 0;
                }
                if (!this.b(n5 + 1)) break;
                n2 = this.f;
                n3 = this.g;
            }
            char c2 = cArray[n2 + n5];
            switch (c2) {
                case '-': {
                    if (n4 == 0) {
                        bl2 = true;
                        n4 = 1;
                        break;
                    }
                    if (n4 == 5) {
                        n4 = 6;
                        break;
                    }
                    return 0;
                }
                case '+': {
                    if (n4 == 5) {
                        n4 = 6;
                        break;
                    }
                    return 0;
                }
                case 'E': 
                case 'e': {
                    if (n4 == 2 || n4 == 4) {
                        n4 = 5;
                        break;
                    }
                    return 0;
                }
                case '.': {
                    if (n4 == 2) {
                        n4 = 3;
                        break;
                    }
                    return 0;
                }
                default: {
                    if (c2 < '0' || c2 > '9') {
                        if (!this.a(c2)) break block6;
                        return 0;
                    }
                    if (n4 == 1 || n4 == 0) {
                        l2 = -(c2 - 48);
                        n4 = 2;
                        break;
                    }
                    if (n4 == 2) {
                        if (l2 == 0L) {
                            return 0;
                        }
                        long l3 = l2 * 10L - (long)(c2 - 48);
                        bl3 &= l2 > -922337203685477580L || l2 == -922337203685477580L && l3 < l2;
                        l2 = l3;
                        break;
                    }
                    if (n4 == 3) {
                        n4 = 4;
                        break;
                    }
                    if (n4 != 5 && n4 != 6) break;
                    n4 = 7;
                }
            }
            ++n5;
        }
        if (!(n4 != 2 || !bl3 || l2 == Long.MIN_VALUE && !bl2 || l2 == 0L && bl2)) {
            this.j = bl2 ? l2 : -l2;
            this.f += n5;
            this.a = 15;
            return 15;
        }
        if (n4 == 2 || n4 == 4 || n4 == 7) {
            this.k = n5;
            this.a = 16;
            return 16;
        }
        return 0;
    }

    private boolean a(char c2) {
        switch (c2) {
            case '#': 
            case '/': 
            case ';': 
            case '=': 
            case '\\': {
                this.v();
            }
            case '\t': 
            case '\n': 
            case '\f': 
            case '\r': 
            case ' ': 
            case ',': 
            case ':': 
            case '[': 
            case ']': 
            case '{': 
            case '}': {
                return false;
            }
        }
        return true;
    }

    public String g() {
        String string;
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 14) {
            string = this.u();
        } else if (n2 == 12) {
            string = this.b('\'');
        } else if (n2 == 13) {
            string = this.b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + (Object)((Object)this.f()) + this.s());
        }
        this.a = 0;
        this.o[this.n - 1] = string;
        return string;
    }

    public String h() {
        String string;
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 10) {
            string = this.u();
        } else if (n2 == 8) {
            string = this.b('\'');
        } else if (n2 == 9) {
            string = this.b('\"');
        } else if (n2 == 11) {
            string = this.l;
            this.l = null;
        } else if (n2 == 15) {
            string = Long.toString(this.j);
        } else if (n2 == 16) {
            string = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else {
            throw new IllegalStateException("Expected a string but was " + (Object)((Object)this.f()) + this.s());
        }
        this.a = 0;
        int n3 = this.n - 1;
        this.p[n3] = this.p[n3] + 1;
        return string;
    }

    public boolean i() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 5) {
            this.a = 0;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            return true;
        }
        if (n2 == 6) {
            this.a = 0;
            int n4 = this.n - 1;
            this.p[n4] = this.p[n4] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + (Object)((Object)this.f()) + this.s());
    }

    public void j() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 7) {
            this.a = 0;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + (Object)((Object)this.f()) + this.s());
    }

    public double k() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 15) {
            this.a = 0;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            return this.j;
        }
        if (n2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (n2 == 8 || n2 == 9) {
            this.l = this.b(n2 == 8 ? (char)'\'' : '\"');
        } else if (n2 == 10) {
            this.l = this.u();
        } else if (n2 != 11) {
            throw new IllegalStateException("Expected a double but was " + (Object)((Object)this.f()) + this.s());
        }
        this.a = 11;
        double d2 = Double.parseDouble(this.l);
        if (!this.d && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new e("JSON forbids NaN and infinities: " + d2 + this.s());
        }
        this.l = null;
        this.a = 0;
        int n4 = this.n - 1;
        this.p[n4] = this.p[n4] + 1;
        return d2;
    }

    public long l() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 15) {
            this.a = 0;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            return this.j;
        }
        if (n2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (n2 == 8 || n2 == 9 || n2 == 10) {
            this.l = n2 == 10 ? this.u() : this.b(n2 == 8 ? (char)'\'' : '\"');
            try {
                long l2 = Long.parseLong(this.l);
                this.a = 0;
                int n4 = this.n - 1;
                this.p[n4] = this.p[n4] + 1;
                return l2;
            } catch (NumberFormatException numberFormatException) {}
        } else {
            throw new IllegalStateException("Expected a long but was " + (Object)((Object)this.f()) + this.s());
        }
        this.a = 11;
        double d2 = Double.parseDouble(this.l);
        long l3 = (long)d2;
        if ((double)l3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.l + this.s());
        }
        this.l = null;
        this.a = 0;
        int n5 = this.n - 1;
        this.p[n5] = this.p[n5] + 1;
        return l3;
    }

    private String b(char c2) {
        char[] cArray = this.e;
        StringBuilder stringBuilder = null;
        block0: while (true) {
            int n2;
            int n3 = this.f;
            int n4 = this.g;
            int n5 = n3;
            while (n3 < n4) {
                if ((n2 = cArray[n3++]) == c2) {
                    this.f = n3;
                    n3 = n3 - n5 - 1;
                    if (stringBuilder == null) {
                        return new String(cArray, n5, n3);
                    }
                    stringBuilder.append(cArray, n5, n3);
                    return stringBuilder.toString();
                }
                if (n2 == 92) {
                    this.f = n3;
                    n3 = n3 - n5 - 1;
                    if (stringBuilder == null) {
                        int n6 = n3 + 1 << 1;
                        stringBuilder = new StringBuilder(Math.max(n6, 16));
                    }
                    stringBuilder.append(cArray, n5, n3);
                    stringBuilder.append(this.x());
                    continue block0;
                }
                if (n2 != 10) continue;
                ++this.h;
                this.i = n3;
            }
            if (stringBuilder == null) {
                n2 = n3 - n5 << 1;
                stringBuilder = new StringBuilder(Math.max(n2, 16));
            }
            stringBuilder.append(cArray, n5, n3 - n5);
            this.f = n3;
            if (!this.b(1)) break;
        }
        throw this.b("Unterminated string");
    }

    private String u() {
        CharSequence charSequence = null;
        int n2 = 0;
        block4: while (true) {
            if (this.f + n2 < this.g) {
                switch (this.e[this.f + n2]) {
                    case '#': 
                    case '/': 
                    case ';': 
                    case '=': 
                    case '\\': {
                        this.v();
                    }
                    case '\t': 
                    case '\n': 
                    case '\f': 
                    case '\r': 
                    case ' ': 
                    case ',': 
                    case ':': 
                    case '[': 
                    case ']': 
                    case '{': 
                    case '}': {
                        break block4;
                    }
                    default: {
                        ++n2;
                        break;
                    }
                }
                continue;
            }
            if (n2 < 1024) {
                if (!this.b(n2 + 1)) break;
                continue;
            }
            if (charSequence == null) {
                charSequence = new StringBuilder(Math.max(n2, 16));
            }
            charSequence.append(this.e, this.f, n2);
            this.f += n2;
            n2 = 0;
            if (!this.b(1)) break;
        }
        charSequence = charSequence == null ? new String(this.e, this.f, n2) : charSequence.append(this.e, this.f, n2).toString();
        this.f += n2;
        return charSequence;
    }

    private void c(char c2) {
        char[] cArray = this.e;
        block0: while (true) {
            int n2 = this.f;
            int n3 = this.g;
            while (n2 < n3) {
                char c3;
                if ((c3 = cArray[n2++]) == c2) {
                    this.f = n2;
                    return;
                }
                if (c3 == '\\') {
                    this.f = n2;
                    this.x();
                    continue block0;
                }
                if (c3 != '\n') continue;
                ++this.h;
                this.i = n2;
            }
            this.f = n2;
            if (!this.b(1)) break;
        }
        throw this.b("Unterminated string");
    }

    public int m() {
        int n2 = this.a;
        if (n2 == 0) {
            n2 = this.r();
        }
        if (n2 == 15) {
            n2 = (int)this.j;
            if (this.j != (long)n2) {
                throw new NumberFormatException("Expected an int but was " + this.j + this.s());
            }
            this.a = 0;
            int n3 = this.n - 1;
            this.p[n3] = this.p[n3] + 1;
            return n2;
        }
        if (n2 == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (n2 == 8 || n2 == 9 || n2 == 10) {
            this.l = n2 == 10 ? this.u() : this.b(n2 == 8 ? (char)'\'' : '\"');
            try {
                n2 = Integer.parseInt(this.l);
                this.a = 0;
                int n4 = this.n - 1;
                this.p[n4] = this.p[n4] + 1;
                return n2;
            } catch (NumberFormatException numberFormatException) {}
        } else {
            throw new IllegalStateException("Expected an int but was " + (Object)((Object)this.f()) + this.s());
        }
        this.a = 11;
        double d2 = Double.parseDouble(this.l);
        n2 = (int)d2;
        if ((double)n2 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.l + this.s());
        }
        this.l = null;
        this.a = 0;
        int n5 = this.n - 1;
        this.p[n5] = this.p[n5] + 1;
        return n2;
    }

    @Override
    public void close() {
        this.a = 0;
        this.m[0] = 8;
        this.n = 1;
        this.c.close();
    }

    public void n() {
        int n2 = 0;
        do {
            block23: {
                int n3;
                if ((n3 = this.a) == 0) {
                    n3 = this.r();
                }
                if (n3 == 3) {
                    this.a(1);
                    ++n2;
                } else if (n3 == 1) {
                    this.a(3);
                    ++n2;
                } else if (n3 == 4) {
                    --this.n;
                    --n2;
                } else if (n3 == 2) {
                    --this.n;
                    --n2;
                } else if (n3 == 14 || n3 == 10) {
                    a a2 = this;
                    do {
                        int n4 = 0;
                        while (a2.f + n4 < a2.g) {
                            switch (a2.e[a2.f + n4]) {
                                case '#': 
                                case '/': 
                                case ';': 
                                case '=': 
                                case '\\': {
                                    a2.v();
                                }
                                case '\t': 
                                case '\n': 
                                case '\f': 
                                case '\r': 
                                case ' ': 
                                case ',': 
                                case ':': 
                                case '[': 
                                case ']': 
                                case '{': 
                                case '}': {
                                    a2.f += n4;
                                    break block23;
                                }
                                default: {
                                    ++n4;
                                    break;
                                }
                            }
                        }
                        a2.f += n4;
                    } while (a2.b(1));
                } else if (n3 == 8 || n3 == 12) {
                    this.c('\'');
                } else if (n3 == 9 || n3 == 13) {
                    this.c('\"');
                } else if (n3 == 16) {
                    this.f += this.k;
                }
            }
            this.a = 0;
        } while (n2 != 0);
        int n5 = this.n - 1;
        this.p[n5] = this.p[n5] + 1;
        this.o[this.n - 1] = "null";
    }

    private void a(int n2) {
        if (this.n == this.m.length) {
            int[] nArray = new int[this.n << 1];
            int[] nArray2 = new int[this.n << 1];
            String[] stringArray = new String[this.n << 1];
            System.arraycopy(this.m, 0, nArray, 0, this.n);
            System.arraycopy(this.p, 0, nArray2, 0, this.n);
            System.arraycopy(this.o, 0, stringArray, 0, this.n);
            this.m = nArray;
            this.p = nArray2;
            this.o = stringArray;
        }
        this.m[this.n++] = n2;
    }

    private boolean b(int n2) {
        int n3;
        char[] cArray = this.e;
        this.i -= this.f;
        if (this.g != this.f) {
            this.g -= this.f;
            System.arraycopy(cArray, this.f, cArray, 0, this.g);
        } else {
            this.g = 0;
        }
        this.f = 0;
        while ((n3 = this.c.read(cArray, this.g, 1024 - this.g)) != -1) {
            this.g += n3;
            if (this.h == 0 && this.i == 0 && this.g > 0 && cArray[0] == '\ufeff') {
                ++this.f;
                ++this.i;
                ++n2;
            }
            if (this.g < n2) continue;
            return true;
        }
        return false;
    }

    private int b(boolean bl2) {
        block12: {
            char c2;
            char[] cArray = this.e;
            int n2 = this.f;
            int n3 = this.g;
            block4: while (true) {
                if (n2 == n3) {
                    this.f = n2;
                    if (!this.b(1)) break block12;
                    n2 = this.f;
                    n3 = this.g;
                }
                if ((c2 = cArray[n2++]) == '\n') {
                    ++this.h;
                    this.i = n2;
                    continue;
                }
                if (c2 == ' ' || c2 == '\r' || c2 == '\t') continue;
                if (c2 == '/') {
                    this.f = n2;
                    if (n2 == n3) {
                        --this.f;
                        n2 = this.b(2) ? 1 : 0;
                        ++this.f;
                        if (n2 == 0) {
                            return c2;
                        }
                    }
                    this.v();
                    switch (cArray[this.f]) {
                        case '*': {
                            ++this.f;
                            if (!this.a("*/")) {
                                throw this.b("Unterminated comment");
                            }
                            n2 = this.f + 2;
                            n3 = this.g;
                            continue block4;
                        }
                        case '/': {
                            ++this.f;
                            this.w();
                            n2 = this.f;
                            n3 = this.g;
                            continue block4;
                        }
                    }
                    return c2;
                }
                if (c2 != '#') break;
                this.f = n2;
                this.v();
                this.w();
                n2 = this.f;
                n3 = this.g;
            }
            this.f = n2;
            return c2;
        }
        if (bl2) {
            throw new EOFException("End of input" + this.s());
        }
        return -1;
    }

    private void v() {
        if (!this.d) {
            throw this.b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() {
        while (this.f < this.g || this.b(1)) {
            char c2;
            if ((c2 = this.e[this.f++]) == '\n') {
                ++this.h;
                this.i = this.f;
                return;
            }
            if (c2 != '\r') continue;
        }
    }

    private boolean a(String string) {
        int n2 = string.length();
        while (this.f + n2 <= this.g || this.b(n2)) {
            block5: {
                if (this.e[this.f] == '\n') {
                    ++this.h;
                    this.i = this.f + 1;
                } else {
                    for (int i2 = 0; i2 < n2; ++i2) {
                        if (this.e[this.f + i2] == string.charAt(i2)) {
                            continue;
                        }
                        break block5;
                    }
                    return true;
                }
            }
            ++this.f;
        }
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName() + this.s();
    }

    final String s() {
        int n2 = this.h + 1;
        int n3 = this.f - this.i + 1;
        return " at line " + n2 + " column " + n3 + " path " + this.p();
    }

    public String p() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int n2 = this.n;
        block4: for (int i2 = 0; i2 < n2; ++i2) {
            switch (this.m[i2]) {
                case 1: 
                case 2: {
                    stringBuilder.append('[').append(this.p[i2]).append(']');
                    continue block4;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder.append('.');
                    if (this.o[i2] == null) continue block4;
                    stringBuilder.append(this.o[i2]);
                }
            }
        }
        return stringBuilder.toString();
    }

    private char x() {
        if (this.f == this.g && !this.b(1)) {
            throw this.b("Unterminated escape sequence");
        }
        char c2 = this.e[this.f++];
        switch (c2) {
            case 'u': {
                int n2;
                if (this.f + 4 > this.g && !this.b(4)) {
                    throw this.b("Unterminated escape sequence");
                }
                c2 = '\u0000';
                int n3 = n2 + 4;
                for (n2 = this.f; n2 < n3; ++n2) {
                    char c3 = this.e[n2];
                    c2 = (char)(c2 << 4);
                    if (c3 >= '0' && c3 <= '9') {
                        c2 = (char)(c2 + (c3 - 48));
                        continue;
                    }
                    if (c3 >= 'a' && c3 <= 'f') {
                        c2 = (char)(c2 + (c3 - 97 + 10));
                        continue;
                    }
                    if (c3 >= 'A' && c3 <= 'F') {
                        c2 = (char)(c2 + (c3 - 65 + 10));
                        continue;
                    }
                    throw new NumberFormatException("\\u" + new String(this.e, this.f, 4));
                }
                this.f += 4;
                return c2;
            }
            case 't': {
                return '\t';
            }
            case 'b': {
                return '\b';
            }
            case 'n': {
                return '\n';
            }
            case 'r': {
                return '\r';
            }
            case 'f': {
                return '\f';
            }
            case '\n': {
                ++this.h;
                this.i = this.f;
            }
            case '\"': 
            case '\'': 
            case '/': 
            case '\\': {
                return c2;
            }
        }
        throw this.b("Invalid escape sequence");
    }

    private IOException b(String string) {
        throw new e(string + this.s());
    }

    private void y() {
        this.b(true);
        --this.f;
        if (this.f + b.length > this.g && !this.b(b.length)) {
            return;
        }
        for (int i2 = 0; i2 < b.length; ++i2) {
            if (this.e[this.f + i2] == b[i2]) continue;
            return;
        }
        this.f += b.length;
    }

    static {
        w.a = new b();
    }
}

