/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.IValueValidator;
import com.beust.jcommander.converters.CommaParameterSplitter;
import com.beust.jcommander.converters.IParameterSplitter;
import com.beust.jcommander.converters.NoConverter;
import com.beust.jcommander.validators.NoValidator;
import com.beust.jcommander.validators.NoValueValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD, ElementType.METHOD})
public @interface Parameter {
    public static final int DEFAULT_ARITY = -1;

    public String[] names() default {};

    public String description() default "";

    public boolean required() default false;

    public String descriptionKey() default "";

    public int arity() default -1;

    public boolean password() default false;

    public Class<? extends IStringConverter<?>> converter() default NoConverter.class;

    public Class<? extends IStringConverter<?>> listConverter() default NoConverter.class;

    public boolean hidden() default false;

    public Class<? extends IParameterValidator>[] validateWith() default {NoValidator.class};

    public Class<? extends IValueValidator>[] validateValueWith() default {NoValueValidator.class};

    public boolean variableArity() default false;

    public Class<? extends IParameterSplitter> splitter() default CommaParameterSplitter.class;

    public boolean echoInput() default false;

    public boolean help() default false;

    public boolean forceNonOverwritable() default false;

    public int order() default -1;
}

