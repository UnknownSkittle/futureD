/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a;

import org.a.a.c.g;
import org.a.a.w;
import org.a.a.x;
import org.a.b.c;
import org.a.b.o;
import org.a.b.p;
import org.a.b.r;
import org.a.c.a.a;
import org.a.c.a.b;
import org.a.c.a.f;

public final class u
extends b {
    private final o a;
    private boolean b;
    private int c;

    public u(o o2) {
        this.a = o2;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean a(org.a.b.a a2) {
        if (a2 instanceof p) {
            if (this.b && this.c == 1) {
                this.a.a(false);
                this.b = false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final org.a.b.a b() {
        return this.a;
    }

    @Override
    public final a a(f f2) {
        if (f2.g()) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            ++this.c;
        }
        return org.a.c.a.a.a(f2.c());
    }

    private static boolean a(CharSequence charSequence, int n2) {
        if (n2 < charSequence.length()) {
            switch (charSequence.charAt(n2)) {
                case '\t': 
                case ' ': {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    static /* synthetic */ w a(CharSequence charSequence, int n2, int n3, boolean bl2) {
        int n4;
        int n5;
        int n6;
        Object object;
        int n7 = n2;
        Object object2 = charSequence;
        int n8 = object2.charAt(n7);
        block0 : switch (n8) {
            case 42: 
            case 43: 
            case 45: {
                if (u.a((CharSequence)object2, n7 + 1)) {
                    object2 = new c();
                    ((c)object2).a((char)n8);
                    object = new x((o)object2, n7 + 1);
                    break;
                }
                object = null;
                break;
            }
            default: {
                n8 = 0;
                n6 = object2.length();
                block7: for (n5 = n7; n5 < n6; ++n5) {
                    char c2 = object2.charAt(n5);
                    switch (c2) {
                        case '0': 
                        case '1': 
                        case '2': 
                        case '3': 
                        case '4': 
                        case '5': 
                        case '6': 
                        case '7': 
                        case '8': 
                        case '9': {
                            if (++n8 <= 9) continue block7;
                            break block7;
                        }
                        case ')': 
                        case '.': {
                            if (n8 > 0 && u.a((CharSequence)object2, n5 + 1)) {
                                object2 = object2.subSequence(n7, n5).toString();
                                r r2 = new r();
                                r2.a(Integer.parseInt((String)object2));
                                r2.a(c2);
                                object = new x(r2, n5 + 1);
                                break block0;
                            }
                            object = null;
                            break block0;
                        }
                        default: {
                            object = null;
                            break block0;
                        }
                    }
                }
                object = object2 = null;
            }
        }
        if (object == null) {
            return null;
        }
        o o2 = ((x)object2).a;
        n2 = n4 - n2;
        n3 = n2 = n3 + n2;
        n8 = 0;
        n6 = charSequence.length();
        for (n4 = ((x)object2).b; n4 < n6; ++n4) {
            char c3 = charSequence.charAt(n4);
            n5 = c3;
            if (c3 == '\t') {
                int n9 = n3;
                n3 = n9 + g.a(n9);
                continue;
            }
            if (n5 == 32) {
                ++n3;
                continue;
            }
            n8 = 1;
            break;
        }
        if (bl2) {
            if (o2 instanceof r && ((r)o2).c() != 1) {
                return null;
            }
            if (n8 == 0) {
                return null;
            }
        }
        if (n8 == 0 || n3 - n2 > g.a) {
            n3 = n2 + 1;
        }
        return new w(o2, n3);
    }

    static /* synthetic */ boolean a(o o2, o o3) {
        if (o2 instanceof c && o3 instanceof c) {
            return u.a(Character.valueOf(((c)o2).c()), Character.valueOf(((c)o3).c()));
        }
        if (o2 instanceof r && o3 instanceof r) {
            return u.a(Character.valueOf(((r)o2).f()), Character.valueOf(((r)o3).f()));
        }
        return false;
    }
}

