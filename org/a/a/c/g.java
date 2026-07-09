/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.a.a.c;

public final class g {
    public static int a = 4;

    public static int a(int n2) {
        return 4 - n2 % 4;
    }

    public static int a(char c2, CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        while (n2 < n3) {
            if (charSequence.charAt(n2) == c2) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static boolean a(CharSequence charSequence) {
        int n2;
        block4: {
            int n3 = charSequence.length();
            block3: for (int i2 = 0; i2 < n3; ++i2) {
                switch (charSequence.charAt(i2)) {
                    case '\t': 
                    case '\n': 
                    case '\u000b': 
                    case '\f': 
                    case '\r': 
                    case ' ': {
                        continue block3;
                    }
                    default: {
                        n2 = i2;
                        break block4;
                    }
                }
            }
            n2 = -1;
        }
        return n2 == -1;
    }

    public static boolean a(CharSequence charSequence, int n2) {
        return Character.isLetter(Character.codePointAt(charSequence, n2));
    }

    public static boolean b(CharSequence charSequence, int n2) {
        if (n2 < charSequence.length()) {
            switch (charSequence.charAt(n2)) {
                case '\t': 
                case ' ': {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence b(CharSequence charSequence) {
        StringBuilder stringBuilder = null;
        int n2 = charSequence.length();
        block3: for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            switch (c2) {
                case '\u0000': {
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(n2);
                        stringBuilder.append(charSequence, 0, i2);
                    }
                    stringBuilder.append('\ufffd');
                    continue block3;
                }
                default: {
                    if (stringBuilder == null) continue block3;
                    stringBuilder.append(c2);
                }
            }
        }
        if (stringBuilder != null) {
            return stringBuilder.toString();
        }
        return charSequence;
    }

    public static int a(char c2, CharSequence charSequence, int n2, int n3) {
        while (n2 < n3) {
            if (charSequence.charAt(n2) != c2) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static int a(CharSequence charSequence, int n2, int n3) {
        while (n2 >= n3) {
            if (charSequence.charAt(n2) != '#') {
                return n2;
            }
            --n2;
        }
        return n3 - 1;
    }

    public static int b(CharSequence charSequence, int n2, int n3) {
        while (n2 < n3) {
            switch (charSequence.charAt(n2)) {
                case '\t': 
                case ' ': {
                    break;
                }
                default: {
                    return n2;
                }
            }
            ++n2;
        }
        return n3;
    }

    public static int c(CharSequence charSequence, int n2, int n3) {
        while (n2 >= n3) {
            switch (charSequence.charAt(n2)) {
                case '\t': 
                case ' ': {
                    break;
                }
                default: {
                    return n2;
                }
            }
            --n2;
        }
        return n3 - 1;
    }
}

