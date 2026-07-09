/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.beust.jcommander;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Inherited
public @interface Parameters {
    public String resourceBundle() default "";

    public String separators() default " ";

    public String commandDescription() default "";

    public String commandDescriptionKey() default "";

    public String[] commandNames() default {};

    public boolean hidden() default false;
}

