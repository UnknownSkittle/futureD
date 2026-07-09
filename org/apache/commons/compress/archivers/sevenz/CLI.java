/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.File;
import org.apache.commons.compress.archivers.sevenz.f;
import org.apache.commons.compress.archivers.sevenz.w;
import org.apache.commons.compress.archivers.sevenz.x;

public class CLI {
    public static void main(String[] object) {
        if (((String[])object).length == 0) {
            System.out.println("Parameters: archive-name [list|extract]");
            return;
        }
        Object object2 = object;
        object2 = ((String[])object).length < 2 ? f.a : Enum.valueOf(f.class, object2[1].toUpperCase());
        System.out.println(((f)((Object)object2)).a() + " " + object[0]);
        object = new File(object[0]);
        if (!((File)object).isFile()) {
            System.err.println(object + " doesn't exist or is a directory");
        }
        object = new x((File)object, 0);
        Throwable throwable = null;
        try {
            w w2;
            while ((w2 = ((x)object).a()) != null) {
                ((f)((Object)object2)).a((x)object, w2);
            }
            ((x)object).close();
            return;
        } catch (Throwable throwable2) {
            try {
                Throwable throwable3 = throwable2;
                throwable = throwable2;
                throw throwable3;
            } catch (Throwable throwable4) {
                if (throwable != null) {
                    try {
                        ((x)object).close();
                    } catch (Throwable throwable5) {
                        throwable.addSuppressed(throwable5);
                    }
                } else {
                    ((x)object).close();
                }
                throw throwable4;
            }
        }
    }
}

