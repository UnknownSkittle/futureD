/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.impactdevelopment.simpletweaker.argument;

import java.util.List;

public interface Argument {
    public void addToList(List<String> var1);

    public boolean conflicts(Argument var1);
}

