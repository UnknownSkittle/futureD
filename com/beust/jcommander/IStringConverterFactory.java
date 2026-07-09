/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IStringConverter;

public interface IStringConverterFactory {
    public <T> Class<? extends IStringConverter<T>> getConverter(Class<T> var1);
}

