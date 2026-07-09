/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

import com.a.a.ac;
import com.a.a.b.a.ab;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.d.e;
import com.a.a.v;
import com.a.a.w;
import com.a.a.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import org.apache.a.e.c.h;
import org.apache.a.k;
import org.apache.a.k.c;

@Deprecated
public final class ai {
    private final Field a;

    public static v a(a a2) {
        boolean bl2 = true;
        try {
            a2.f();
            bl2 = false;
            return ab.A.read(a2);
        } catch (EOFException eOFException) {
            if (bl2) {
                return x.a;
            }
            throw new ac(eOFException);
        } catch (e e2) {
            throw new ac(e2);
        } catch (IOException iOException) {
            throw new w(iOException);
        } catch (NumberFormatException numberFormatException) {
            throw new ac(numberFormatException);
        }
    }

    public static void a(v v2, d d2) {
        ab.A.write(d2, v2);
    }

    public ai(Field field) {
        ai.a(field);
        this.a = field;
    }

    public static <T> T a(T t2) {
        if (t2 == null) {
            throw new NullPointerException();
        }
        return t2;
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new IllegalArgumentException();
        }
    }

    public static DateFormat a(int n2, int n3) {
        String string;
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        switch (n2) {
            case 3: {
                string2 = "M/d/yy";
                break;
            }
            case 2: {
                string2 = "MMM d, yyyy";
                break;
            }
            case 1: {
                string2 = "MMMM d, yyyy";
                break;
            }
            case 0: {
                string2 = "EEEE, MMMM d, yyyy";
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(n2)));
            }
        }
        StringBuilder stringBuilder2 = stringBuilder.append(string2).append(" ");
        n2 = n3;
        switch (n2) {
            case 3: {
                string = "h:mm a";
                break;
            }
            case 2: {
                string = "h:mm:ss a";
                break;
            }
            case 0: 
            case 1: {
                string = "h:mm:ss a z";
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(n2)));
            }
        }
        String string3 = stringBuilder2.append(string).toString();
        return new SimpleDateFormat(string3, Locale.US);
    }

    public static <T> T b(T object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Cloneable) {
            GenericDeclaration genericDeclaration = object.getClass();
            try {
                genericDeclaration = ((Class)genericDeclaration).getMethod("clone", null);
            } catch (NoSuchMethodException noSuchMethodException) {
                throw new NoSuchMethodError(noSuchMethodException.getMessage());
            }
            try {
                return (T)((Method)genericDeclaration).invoke(object, null);
            } catch (InvocationTargetException invocationTargetException) {
                object = invocationTargetException.getCause();
                if (object instanceof CloneNotSupportedException) {
                    throw (CloneNotSupportedException)object;
                }
                throw new Error("Unexpected exception", (Throwable)object);
            } catch (IllegalAccessException illegalAccessException) {
                throw new IllegalAccessError(illegalAccessException.getMessage());
            }
        }
        throw new CloneNotSupportedException();
    }

    public static org.apache.a.ac a(c object) {
        ai.a(object, "HTTP parameters");
        object = object.a("http.protocol.version");
        if (object == null) {
            return org.apache.a.v.b;
        }
        return (org.apache.a.ac)object;
    }

    public static SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new h(noSuchAlgorithmException.getMessage(), noSuchAlgorithmException);
        } catch (KeyManagementException keyManagementException) {
            throw new h(keyManagementException.getMessage(), keyManagementException);
        }
    }

    public static void a(boolean bl2, String string) {
        if (!bl2) {
            throw new IllegalArgumentException(string);
        }
    }

    public static <T> T a(T t2, String string) {
        if (t2 == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        return t2;
    }

    public static <T extends CharSequence> T a(T t2, String string) {
        if (t2 == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        if (ai.a(t2)) {
            throw new IllegalArgumentException(string + " may not be empty");
        }
        return t2;
    }

    public static <T extends CharSequence> T b(T t2, String string) {
        if (t2 == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        if (ai.b(t2)) {
            throw new IllegalArgumentException(string + " may not be blank");
        }
        return t2;
    }

    public static <E, T extends Collection<E>> T a(T t2, String string) {
        if (t2 == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        if (t2.isEmpty()) {
            throw new IllegalArgumentException(string + " may not be empty");
        }
        return t2;
    }

    public static int a(int n2, String string) {
        if (n2 <= 0) {
            throw new IllegalArgumentException(string + " may not be negative or zero");
        }
        return n2;
    }

    public static int b(int n2, String string) {
        if (n2 < 0) {
            throw new IllegalArgumentException(string + " may not be negative");
        }
        return n2;
    }

    public static long a(long l2, String string) {
        if (l2 < 0L) {
            throw new IllegalArgumentException(string + " may not be negative");
        }
        return l2;
    }

    public static Charset a(String string) {
        try {
            return Charset.forName(string);
        } catch (UnsupportedCharsetException unsupportedCharsetException) {
            return null;
        }
    }

    public static byte[] a(String string, String string2) {
        ai.a(string, "Input");
        ai.a(string2, "Charset");
        try {
            return string.getBytes(string2);
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    public static void a(k object) {
        if (object == null) {
            return;
        }
        if (object.isStreaming() && (object = object.getContent()) != null) {
            ((InputStream)object).close();
        }
    }

    public static int a(int n2, boolean bl2) {
        bl2 = bl2;
        return n2 * 37 + bl2;
    }

    public static int a(int n2, Object object) {
        int n3 = object != null ? object.hashCode() : 0;
        return n2 * 37 + n3;
    }

    public static boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static boolean a(Object[] objectArray, Object[] objectArray2) {
        if (objectArray == null) {
            return objectArray2 == null;
        }
        if (objectArray2 != null && objectArray.length == objectArray2.length) {
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                if (ai.a(objectArray[i2], objectArray2[i2])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static void a(StringBuilder stringBuilder, SocketAddress socketAddress) {
        ai.a(stringBuilder, "Buffer");
        ai.a(socketAddress, "Socket address");
        if (socketAddress instanceof InetSocketAddress) {
            InetAddress inetAddress = ((InetSocketAddress)(socketAddress = (InetSocketAddress)socketAddress)).getAddress();
            stringBuilder.append(inetAddress != null ? inetAddress.getHostAddress() : inetAddress).append(':').append(((InetSocketAddress)socketAddress).getPort());
            return;
        }
        stringBuilder.append(socketAddress);
    }

    public static boolean a(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        return charSequence.length() == 0;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (Character.isWhitespace(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (!Character.isWhitespace(charSequence.charAt(i2))) continue;
            return true;
        }
        return false;
    }
}

