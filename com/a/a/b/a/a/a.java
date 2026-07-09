/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a.a;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class a {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    /*
     * WARNING - void declaration
     */
    public static Date a(String string, ParsePosition parsePosition) {
        void var2_12;
        try {
            TimeZone timeZone;
            int n2 = parsePosition.getIndex();
            int n3 = com.a.a.b.a.a.a.a(string, n2, n2 += 4);
            if (com.a.a.b.a.a.a.a(string, n2, '-')) {
                // empty if block
            }
            int n4 = com.a.a.b.a.a.a.a(string, ++n2, n2 += 2);
            if (com.a.a.b.a.a.a.a(string, n2, '-')) {
                // empty if block
            }
            int n5 = com.a.a.b.a.a.a.a(string, ++n2, n2 += 2);
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            int n10 = com.a.a.b.a.a.a.a(string, n2, 'T');
            if (n10 == 0 && string.length() <= n2) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(n3, n4 - 1, n5);
                parsePosition.setIndex(n2);
                return gregorianCalendar.getTime();
            }
            if (n10 != 0) {
                n6 = com.a.a.b.a.a.a.a(string, ++n2, n2 += 2);
                if (com.a.a.b.a.a.a.a(string, n2, ':')) {
                    // empty if block
                }
                n7 = com.a.a.b.a.a.a.a(string, ++n2, n2 += 2);
                if (com.a.a.b.a.a.a.a(string, n2, ':')) {
                    ++n2;
                }
                if (string.length() > n2 && (n10 = string.charAt(n2)) != 90 && n10 != 43 && n10 != 45) {
                    if ((n8 = com.a.a.b.a.a.a.a(string, n2, n2 += 2)) > 59 && n8 < 63) {
                        n8 = 59;
                    }
                    if (com.a.a.b.a.a.a.a(string, n2, '.')) {
                        n10 = com.a.a.b.a.a.a.a(string, ++n2 + 1);
                        int n11 = Math.min(n10, n2 + 3);
                        int n12 = com.a.a.b.a.a.a.a(string, n2, n11);
                        switch (n11 - n2) {
                            case 2: {
                                n9 = n12 * 10;
                                break;
                            }
                            case 1: {
                                n9 = n12 * 100;
                                break;
                            }
                            default: {
                                n9 = n12;
                            }
                        }
                        n2 = n10;
                    }
                }
            }
            if (string.length() <= n2) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            n10 = string.charAt(n2);
            if (n10 == 90) {
                timeZone = a;
                ++n2;
            } else if (n10 == 43 || n10 == 45) {
                String string2 = string.substring(n2);
                string2 = string2.length() >= 5 ? string2 : string2 + "00";
                n2 += string2.length();
                if ("+0000".equals(string2) || "+00:00".equals(string2)) {
                    timeZone = a;
                } else {
                    String string3 = "GMT".concat(String.valueOf(string2));
                    timeZone = TimeZone.getTimeZone(string3);
                    if (!(string2 = timeZone.getID()).equals(string3) && !string2.replace(":", "").equals(string3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + string3 + " given, resolves to " + timeZone.getID());
                    }
                }
            } else {
                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + (char)n10 + "'");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, n3);
            gregorianCalendar.set(2, n4 - 1);
            gregorianCalendar.set(5, n5);
            gregorianCalendar.set(11, n6);
            gregorianCalendar.set(12, n7);
            gregorianCalendar.set(13, n8);
            gregorianCalendar.set(14, n9);
            parsePosition.setIndex(n2);
            return gregorianCalendar.getTime();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        } catch (NumberFormatException numberFormatException) {
        } catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        String string4 = string == null ? null : "\"" + string + '\"';
        String string5 = var2_12.getMessage();
        if (string5 == null || string5.isEmpty()) {
            string5 = "(" + var2_12.getClass().getName() + ")";
        }
        ParseException parseException = new ParseException("Failed to parse date [" + string4 + "]: " + string5, parsePosition.getIndex());
        parseException.initCause((Throwable)var2_12);
        throw parseException;
    }

    private static boolean a(String string, int n2, char c2) {
        return n2 < string.length() && string.charAt(n2) == c2;
    }

    private static int a(String string, int n2, int n3) {
        int n4;
        if (n2 < 0 || n3 > string.length() || n2 > n3) {
            throw new NumberFormatException(string);
        }
        int n5 = n2;
        int n6 = 0;
        if (n5 < n3) {
            if ((n4 = Character.digit(string.charAt(n5++), 10)) < 0) {
                throw new NumberFormatException("Invalid number: " + string.substring(n2, n3));
            }
            n6 = -n4;
        }
        while (n5 < n3) {
            if ((n4 = Character.digit(string.charAt(n5++), 10)) < 0) {
                throw new NumberFormatException("Invalid number: " + string.substring(n2, n3));
            }
            n6 = n6 * 10 - n4;
        }
        return -n6;
    }

    private static int a(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (c2 < '0' || c2 > '9') {
                return n2;
            }
            ++n2;
        }
        return string.length();
    }
}

