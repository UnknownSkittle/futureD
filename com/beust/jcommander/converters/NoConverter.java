/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;

public class NoConverter
implements IStringConverter<String> {
    @Override
    public String convert(String string) {
        throw new UnsupportedOperationException();
    }
}

