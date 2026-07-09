/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathConverter
implements IStringConverter<Path> {
    @Override
    public Path convert(String string) {
        return Paths.get(string, new String[0]);
    }
}

