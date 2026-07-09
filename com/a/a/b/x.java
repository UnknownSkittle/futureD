/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import java.math.BigDecimal;

public final class x
extends Number {
    private final String a;

    public x(String string) {
        this.a = string;
    }

    @Override
    public final int intValue() {
        try {
            return Integer.parseInt(this.a);
        } catch (NumberFormatException numberFormatException) {
            try {
                return (int)Long.parseLong(this.a);
            } catch (NumberFormatException numberFormatException2) {
                return new BigDecimal(this.a).intValue();
            }
        }
    }

    @Override
    public final long longValue() {
        try {
            return Long.parseLong(this.a);
        } catch (NumberFormatException numberFormatException) {
            return new BigDecimal(this.a).longValue();
        }
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    public final String toString() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof x) {
            object = (x)object;
            return this.a == ((x)object).a || this.a.equals(((x)object).a);
        }
        return false;
    }
}

