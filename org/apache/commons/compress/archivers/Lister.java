/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;
import org.apache.commons.compress.archivers.e;
import org.apache.commons.compress.archivers.sevenz.w;
import org.apache.commons.compress.archivers.sevenz.x;

public final class Lister {
    private static final e a = new e();

    public static void main(String[] stringArray) {
        String string;
        if (stringArray.length == 0) {
            System.out.println("Parameters: archive-name [archive-type]");
            return;
        }
        System.out.println("Analysing " + stringArray[0]);
        File file = new File(stringArray[0]);
        if (!file.isFile()) {
            System.err.println(file + " doesn't exist or is a directory");
        }
        String string2 = string = stringArray.length > 1 ? stringArray[1] : Lister.a(file);
        if ("7z".equalsIgnoreCase(string)) {
            Lister.b(file);
            return;
        }
        Lister.a(file, stringArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(File object, String[] object2) {
        block15: {
            object = new BufferedInputStream(Files.newInputStream(((File)object).toPath(), new OpenOption[0]));
            Throwable throwable = null;
            try {
                Object object3 = object;
                object2 = ((Object)object2).length > 1 ? a.a((String)object2[1], (InputStream)object3) : a.a((InputStream)object3);
                object3 = null;
                try {
                    a a2;
                    System.out.println("Created " + object2.toString());
                    while ((a2 = ((c)object2).a()) != null) {
                        System.out.println(a2.getName());
                    }
                    if (object2 == null) break block15;
                } catch (Throwable throwable2) {
                    try {
                        Throwable throwable3 = throwable2;
                        object3 = throwable2;
                        throw throwable3;
                    } catch (Throwable throwable4) {
                        if (object2 == null) throw throwable4;
                        if (object3 == null) {
                            ((InputStream)object2).close();
                            throw throwable4;
                        }
                        try {
                            ((InputStream)object2).close();
                            throw throwable4;
                        } catch (Throwable throwable5) {
                            ((Throwable)object3).addSuppressed(throwable5);
                            throw throwable4;
                        }
                    }
                }
                ((InputStream)object2).close();
            } catch (Throwable throwable6) {
                try {
                    object2 = throwable6;
                    throwable = throwable6;
                    throw object2;
                } catch (Throwable throwable7) {
                    if (throwable == null) {
                        ((InputStream)object).close();
                        throw throwable7;
                    }
                    try {
                        ((InputStream)object).close();
                        throw throwable7;
                    } catch (Throwable throwable8) {
                        throwable.addSuppressed(throwable8);
                        throw throwable7;
                    }
                }
            }
        }
        ((InputStream)object).close();
    }

    private static String a(File object) {
        String string;
        object = new BufferedInputStream(Files.newInputStream(((File)object).toPath(), new OpenOption[0]));
        Throwable throwable = null;
        try {
            string = e.b((InputStream)object);
        } catch (Throwable throwable2) {
            try {
                Throwable throwable3 = throwable2;
                throwable = throwable2;
                throw throwable3;
            } catch (Throwable throwable4) {
                if (throwable != null) {
                    try {
                        ((InputStream)object).close();
                    } catch (Throwable throwable5) {
                        throwable.addSuppressed(throwable5);
                    }
                } else {
                    ((InputStream)object).close();
                }
                throw throwable4;
            }
        }
        ((InputStream)object).close();
        return string;
    }

    private static void b(File object) {
        object = new x((File)object, 0);
        Throwable throwable = null;
        try {
            w w2;
            System.out.println("Created " + ((x)object).toString());
            while ((w2 = ((x)object).a()) != null) {
                System.out.println(w2.getName());
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

