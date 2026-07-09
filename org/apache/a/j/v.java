/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.j;

public final class v {
    private final int a;
    private final int b;
    private int c;

    public v(int n2, int n3) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.a = n2;
        this.b = n3;
        this.c = n2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final void a(int n2) {
        if (n2 < this.a) {
            throw new IndexOutOfBoundsException("pos: " + n2 + " < lowerBound: " + this.a);
        }
        if (n2 > this.b) {
            throw new IndexOutOfBoundsException("pos: " + n2 + " > upperBound: " + this.b);
        }
        this.c = n2;
    }

    public final boolean c() {
        return this.c >= this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(Integer.toString(this.a));
        stringBuilder.append('>');
        stringBuilder.append(Integer.toString(this.c));
        stringBuilder.append('>');
        stringBuilder.append(Integer.toString(this.b));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

