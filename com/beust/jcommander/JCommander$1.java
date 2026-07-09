/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.IStringConverterFactory;
import com.beust.jcommander.IStringConverterInstanceFactory;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import java.lang.reflect.InvocationTargetException;

class JCommander$1
implements IStringConverterInstanceFactory {
    final /* synthetic */ IStringConverterFactory val$converterFactory;
    final /* synthetic */ JCommander this$0;

    JCommander$1(JCommander jCommander, IStringConverterFactory iStringConverterFactory) {
        this.this$0 = jCommander;
        this.val$converterFactory = iStringConverterFactory;
    }

    @Override
    public IStringConverter<?> getConverterInstance(Parameter parameter, Class<?> clazz, String string) {
        clazz = this.val$converterFactory.getConverter(clazz);
        try {
            if (string == null) {
                String string2 = string = parameter.names().length > 0 ? parameter.names()[0] : "[Main class]";
            }
            if (clazz != null) {
                return (IStringConverter)JCommander.access$1900(string, clazz);
            }
            return null;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new ParameterException(reflectiveOperationException);
        }
    }
}

