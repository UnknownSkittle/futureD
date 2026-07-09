/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.spongepowered.asm.mixin.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.spongepowered.asm.mixin.injection.At;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface Slice {
    public String id() default "";

    public At from() default @At(value="HEAD");

    public At to() default @At(value="TAIL");
}

