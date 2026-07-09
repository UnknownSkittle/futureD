/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.converters.IParameterSplitter;
import java.util.Arrays;
import java.util.List;

public class CommaParameterSplitter
implements IParameterSplitter {
    @Override
    public List<String> split(String string) {
        return Arrays.asList(string.split(","));
    }
}

