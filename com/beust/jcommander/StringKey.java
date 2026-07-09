/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.FuzzyMap$IKey;

public class StringKey
implements FuzzyMap$IKey {
    private String name;

    public StringKey(String string) {
        this.name = string;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public int hashCode() {
        return 31 + (this.name == null ? 0 : this.name.hashCode());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (StringKey)object;
        return !(this.name == null ? ((StringKey)object).name != null : !this.name.equals(((StringKey)object).name));
    }
}

