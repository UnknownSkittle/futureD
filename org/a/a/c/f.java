/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.c;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f {
    private static final Map<String, String> a = f.a();
    private static final Pattern b = Pattern.compile("^&#[Xx]?");

    public static String a(String string) {
        Object object = b.matcher(string);
        if (((Matcher)object).find()) {
            int n2 = ((Matcher)object).end() == 2 ? 10 : 16;
            try {
                int n3 = Integer.parseInt(string.substring(((Matcher)object).end(), string.length() - 1), n2);
                if (n3 == 0) {
                    return "\ufffd";
                }
                return new String(Character.toChars(n3));
            } catch (IllegalArgumentException illegalArgumentException) {
                return "\ufffd";
            }
        }
        String string2 = string.substring(1, string.length() - 1);
        object = a.get(string2);
        if (object != null) {
            return object;
        }
        return string;
    }

    private static Map<String, String> a() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        Closeable closeable = f.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties");
        Object object = Charset.forName("UTF-8");
        try {
            closeable = new BufferedReader(new InputStreamReader((InputStream)closeable, (Charset)object));
            object = null;
            try {
                String string;
                while ((string = ((BufferedReader)closeable).readLine()) != null) {
                    if (string.length() == 0) continue;
                    int n2 = string.indexOf("=");
                    String string2 = string.substring(0, n2);
                    string = string.substring(n2 + 1);
                    hashMap.put(string2, string);
                }
            } catch (Throwable throwable) {
                try {
                    Throwable throwable2 = throwable;
                    object = throwable;
                    throw throwable2;
                } catch (Throwable throwable3) {
                    if (object != null) {
                        try {
                            ((BufferedReader)closeable).close();
                        } catch (Throwable throwable4) {
                            ((Throwable)object).addSuppressed(throwable4);
                        }
                    } else {
                        ((BufferedReader)closeable).close();
                    }
                    throw throwable3;
                }
            }
            ((BufferedReader)closeable).close();
        } catch (IOException iOException) {
            throw new IllegalStateException("Failed reading data for HTML named character references", iOException);
        }
        hashMap.put("NewLine", "\n");
        return hashMap;
    }
}

