/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;

public class CharArrayConverter
implements IStringConverter<char[]> {
    @Override
    public char[] convert(String string) {
        return string.toCharArray();
    }
}

