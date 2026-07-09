/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b;

public final class v {
    private static final int a;

    private static int a(String stringArray) {
        try {
            stringArray = stringArray.split("[._]");
            int n2 = Integer.parseInt(stringArray[0]);
            if (n2 == 1 && stringArray.length > 1) {
                return Integer.parseInt(stringArray[1]);
            }
            return n2;
        } catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    private static int b(String string) {
        try {
            char c2;
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 0; i2 < string.length() && Character.isDigit(c2 = string.charAt(i2)); ++i2) {
                stringBuilder.append(c2);
            }
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public static int a() {
        return a;
    }

    public static boolean b() {
        return a >= 9;
    }

    static {
        String string = System.getProperty("java.version");
        int n2 = v.a(string);
        if (n2 == -1) {
            n2 = v.b(string);
        }
        a = n2 == -1 ? 6 : n2;
    }
}

