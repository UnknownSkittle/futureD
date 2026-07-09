/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.IValueValidator;
import com.beust.jcommander.validators.NoValidator;
import com.beust.jcommander.validators.NoValueValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface DynamicParameter {
    public String[] names() default {};

    public boolean required() default false;

    public String description() default "";

    public String descriptionKey() default "";

    public boolean hidden() default false;

    public Class<? extends IParameterValidator>[] validateWith() default {NoValidator.class};

    public String assignment() default "=";

    public Class<? extends IValueValidator>[] validateValueWith() default {NoValueValidator.class};
}

