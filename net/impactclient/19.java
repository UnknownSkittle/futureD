/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface 19 {
    public static final boolean \u2002\u2009\u2008\u200d\u2006\u2000\u200e\u200e\u2005;

    public String 2() default "";

    public String[] 1() default {};

    public String[] 0() default {};
}

