/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.impactdevelopment.simpletweaker.argument;

import io.github.impactdevelopment.simpletweaker.argument.Argument;
import java.util.List;

public final class SingularArgument
implements Argument {
    private final String value;

    SingularArgument(String value) {
        this.value = value;
    }

    @Override
    public final void addToList(List<String> arguments) {
        arguments.add(this.value);
    }

    @Override
    public final boolean conflicts(Argument argument) {
        if (!(argument instanceof SingularArgument)) {
            return false;
        }
        return ((SingularArgument)argument).value.equals(this.value);
    }
}

