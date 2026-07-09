/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.FuzzyMap$IKey;
import java.util.Iterator;
import java.util.List;

final class JCommander$ProgramName
implements FuzzyMap$IKey {
    private final String name;
    private final List<String> aliases;

    JCommander$ProgramName(String string, List<String> list) {
        this.name = string;
        this.aliases = list;
    }

    @Override
    public final String getName() {
        return this.name;
    }

    private String getDisplayName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        if (!this.aliases.isEmpty()) {
            stringBuilder.append("(");
            Iterator<String> iterator = this.aliases.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuilder.append(",");
            }
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return 31 + (this.name == null ? 0 : this.name.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (JCommander$ProgramName)object;
        return !(this.name == null ? ((JCommander$ProgramName)object).name != null : !this.name.equals(((JCommander$ProgramName)object).name));
    }

    public final String toString() {
        return this.getDisplayName();
    }

    static /* synthetic */ String access$1000(JCommander$ProgramName jCommander$ProgramName) {
        return jCommander$ProgramName.name;
    }

    static /* synthetic */ String access$1500(JCommander$ProgramName jCommander$ProgramName) {
        return jCommander$ProgramName.getDisplayName();
    }
}

