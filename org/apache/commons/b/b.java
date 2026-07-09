/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.b;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.apache.commons.b.a.a;

public final class b {
    private static void a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection)uRLConnection).disconnect();
        }
    }

    public static byte[] a(InputStream object) {
        a a2 = new a();
        Throwable throwable = null;
        try {
            b.a((InputStream)object, a2);
            object = a2.a();
            a2.close();
            return object;
        } catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            } catch (Throwable throwable3) {
                if (throwable != null) {
                    try {
                        a2.close();
                    } catch (Throwable throwable4) {
                        throwable.addSuppressed(throwable4);
                    }
                } else {
                    a2.close();
                }
                throw throwable3;
            }
        }
    }

    public static byte[] a(URI uRI) {
        return b.a(uRI.toURL());
    }

    private static byte[] a(URL object) {
        object = ((URL)object).openConnection();
        try {
            byte[] byArray = b.b((URLConnection)object);
            return byArray;
        } finally {
            b.a((URLConnection)object);
        }
    }

    private static byte[] b(URLConnection object) {
        byte[] byArray;
        block9: {
            object = ((URLConnection)object).getInputStream();
            Throwable throwable = null;
            try {
                byArray = b.a((InputStream)object);
                if (object == null) break block9;
            } catch (Throwable throwable2) {
                try {
                    Throwable throwable3 = throwable2;
                    throwable = throwable2;
                    throw throwable3;
                } catch (Throwable throwable4) {
                    if (object != null) {
                        if (throwable != null) {
                            try {
                                ((InputStream)object).close();
                            } catch (Throwable throwable5) {
                                throwable.addSuppressed(throwable5);
                            }
                        } else {
                            ((InputStream)object).close();
                        }
                    }
                    throw throwable4;
                }
            }
            ((InputStream)object).close();
        }
        return byArray;
    }

    public static String a(InputStream object, Charset object2) {
        org.apache.commons.b.a.b b2 = new org.apache.commons.b.a.b();
        Throwable throwable = null;
        try {
            Charset charset = object2;
            object2 = b2;
            b.a(new InputStreamReader((InputStream)object, org.apache.commons.b.a.a(charset)), (Writer)object2, new char[4096]);
            object = b2.toString();
            b2.close();
            return object;
        } catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            } catch (Throwable throwable3) {
                if (throwable != null) {
                    try {
                        b2.close();
                    } catch (Throwable throwable4) {
                        throwable.addSuppressed(throwable4);
                    }
                } else {
                    b2.close();
                }
                throw throwable3;
            }
        }
    }

    public static String a(URI uRI, Charset charset) {
        return b.a(uRI.toURL(), org.apache.commons.b.a.a(charset));
    }

    private static String a(URL object, Charset object2) {
        block9: {
            object = ((URL)object).openStream();
            Throwable throwable = null;
            try {
                object2 = b.a((InputStream)object, (Charset)object2);
                if (object == null) break block9;
            } catch (Throwable throwable2) {
                try {
                    object2 = throwable2;
                    throwable = throwable2;
                    throw object2;
                } catch (Throwable throwable3) {
                    if (object != null) {
                        if (throwable != null) {
                            try {
                                ((InputStream)object).close();
                            } catch (Throwable throwable4) {
                                throwable.addSuppressed(throwable4);
                            }
                        } else {
                            ((InputStream)object).close();
                        }
                    }
                    throw throwable3;
                }
            }
            ((InputStream)object).close();
        }
        return object2;
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long l2 = b.b(inputStream, outputStream);
        if (l2 > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l2;
    }

    private static long b(InputStream inputStream, OutputStream outputStream) {
        int n2;
        byte[] byArray = new byte[4096];
        long l2 = 0L;
        while (-1 != (n2 = inputStream.read(byArray))) {
            outputStream.write(byArray, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    private static long a(Reader reader, Writer writer, char[] cArray) {
        int n2;
        long l2 = 0L;
        while (-1 != (n2 = reader.read(cArray))) {
            writer.write(cArray, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    static {
        org.apache.commons.b.a.b b2 = new org.apache.commons.b.a.b(0);
        Throwable throwable = null;
        try {
            PrintWriter printWriter = new PrintWriter(b2);
            Throwable throwable2 = null;
            try {
                printWriter.println();
                printWriter.close();
            } catch (Throwable throwable3) {
                try {
                    Throwable throwable4 = throwable3;
                    throwable2 = throwable3;
                    throw throwable4;
                } catch (Throwable throwable5) {
                    if (throwable2 != null) {
                        try {
                            printWriter.close();
                        } catch (Throwable throwable6) {
                            throwable2.addSuppressed(throwable6);
                        }
                    } else {
                        printWriter.close();
                    }
                    throw throwable5;
                }
            }
            b2.close();
            return;
        } catch (Throwable throwable7) {
            try {
                Throwable throwable8 = throwable7;
                throwable = throwable7;
                throw throwable8;
            } catch (Throwable throwable9) {
                if (throwable != null) {
                    try {
                        b2.close();
                    } catch (Throwable throwable10) {
                        throwable.addSuppressed(throwable10);
                    }
                } else {
                    b2.close();
                }
                throw throwable9;
            }
        }
    }
}

