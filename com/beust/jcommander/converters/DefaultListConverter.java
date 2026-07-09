/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander.converters;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.converters.IParameterSplitter;
import com.beust.jcommander.internal.Lists;
import java.util.List;

public class DefaultListConverter<T>
implements IStringConverter<List<T>> {
    private final IParameterSplitter splitter;
    private final IStringConverter<T> converter;

    public DefaultListConverter(IParameterSplitter iParameterSplitter, IStringConverter<T> iStringConverter) {
        this.splitter = iParameterSplitter;
        this.converter = iStringConverter;
    }

    @Override
    public List<T> convert(String object) {
        List list = Lists.newArrayList();
        for (String string : this.splitter.split((String)object)) {
            list.add(this.converter.convert(string));
        }
        return list;
    }
}

