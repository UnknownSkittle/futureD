/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.internal;

public class GaUtils {
    public static boolean isNotEmpty(String string) {
        return !GaUtils.isEmpty(string);
    }

    public static boolean isEmpty(String string) {
        return string == null || string.trim().length() == 0;
    }

    public static StringBuilder appendSystemProperty(StringBuilder stringBuilder, String string) {
        if (GaUtils.isNotEmpty(string = System.getProperty(string))) {
            if (GaUtils.isNotEmpty(stringBuilder.toString())) {
                stringBuilder.append("/");
            }
            stringBuilder.append(string);
        }
        return stringBuilder;
    }

    @SafeVarargs
    public static <T> T firstNotNull(T ... TArray) {
        if (TArray != null) {
            for (T t2 : TArray) {
                if (t2 == null) continue;
                return t2;
            }
        }
        return null;
    }

    public static boolean isBlank(String string) {
        return string == null || string.trim().length() == 0;
    }
}

