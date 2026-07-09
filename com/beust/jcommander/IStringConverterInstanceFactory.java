/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.Parameter;

public interface IStringConverterInstanceFactory {
    public IStringConverter<?> getConverterInstance(Parameter var1, Class<?> var2, String var3);
}

