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
@Target(value={ElementType.TYPE})
public @interface 7D {
    public static final boolean \u2005\u200c\u2004\u200e\u2008\u2006\u2002\u200c;

    public String[] 0();

    public String 1();
}

