/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a;

import com.a.a.b.ai;
import java.io.Serializable;

public class ac
implements Serializable,
Cloneable {
    private String a;
    protected final int c;
    protected final int d;

    public ac(String string, int n2, int n3) {
        this.a = ai.a(string, "Protocol name");
        this.c = ai.b(n2, "Protocol minor version");
        this.d = ai.b(n3, "Protocol minor version");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public ac a(int n2, int n3) {
        if (n2 == this.c && n3 == this.d) {
            return this;
        }
        return new ac(this.a, n2, n3);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.c * 100000 ^ this.d;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ac)) {
            return false;
        }
        object = (ac)object;
        return this.a.equals(((ac)object).a) && this.c == ((ac)object).c && this.d == ((ac)object).d;
    }

    public final boolean a(ac object) {
        ac ac2 = object;
        ac ac3 = this;
        if (ac2 != null && ac3.a.equals(ac2.a)) {
            ac2 = object;
            ac3 = this;
            ai.a(ac2, "Protocol version");
            Object[] objectArray = new Object[]{ac3, ac2};
            object = "Versions for different protocols cannot be compared: %s %s";
            if (!ac3.a.equals(ac2.a)) {
                throw new IllegalArgumentException(String.format((String)object, objectArray));
            }
            int n2 = ac3.c - ac2.c;
            if (n2 == 0) {
                n2 = ac3.d - ac2.d;
            }
            if (n2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('/');
        stringBuilder.append(Integer.toString(this.c));
        stringBuilder.append('.');
        stringBuilder.append(Integer.toString(this.d));
        return stringBuilder.toString();
    }

    public Object clone() {
        return super.clone();
    }
}

