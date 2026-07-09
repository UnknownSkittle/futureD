/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.asn1.av;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.e.k;

public class i
extends u {
    protected byte[] a;

    i(byte[] byArray) {
        this.a = byArray;
    }

    public final String b() {
        String string = k.b(this.a);
        if (string.charAt(string.length() - 1) == 'Z') {
            return string.substring(0, string.length() - 1) + "GMT+00:00";
        }
        int n2 = string.length() - 5;
        char c2 = string.charAt(n2);
        if (c2 == '-' || c2 == '+') {
            int n3 = n2;
            return string.substring(0, n2) + "GMT" + string.substring(n3, n3 + 3) + ":" + string.substring(n2 + 3);
        }
        n2 = string.length() - 3;
        c2 = string.charAt(n2);
        if (c2 == '-' || c2 == '+') {
            return string.substring(0, n2) + "GMT" + string.substring(n2) + ":00";
        }
        return string + this.k();
    }

    private String k() {
        String string = "+";
        Object object = TimeZone.getDefault();
        int n2 = ((TimeZone)object).getRawOffset();
        if (n2 < 0) {
            string = "-";
            n2 = -n2;
        }
        int n3 = n2 / 3600000;
        n2 = (n2 - n3 * 60 * 60 * 1000) / 60000;
        try {
            if (((TimeZone)object).useDaylightTime()) {
                TimeZone timeZone = object;
                object = this;
                Object object2 = k.b(((i)object).a);
                String string2 = object2;
                if (((String)object2).endsWith("Z")) {
                    object2 = ((i)object).c() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : (((i)object).d() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : (((i)object).i() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'")));
                    ((DateFormat)object2).setTimeZone(new SimpleTimeZone(0, "Z"));
                } else if (((String)object2).indexOf(45) > 0 || ((String)object2).indexOf(43) > 0) {
                    string2 = ((i)object).b();
                    object2 = ((i)object).c() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : (((i)object).d() ? new SimpleDateFormat("yyyyMMddHHmmssz") : (((i)object).i() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz")));
                    ((DateFormat)object2).setTimeZone(new SimpleTimeZone(0, "Z"));
                } else {
                    object2 = ((i)object).c() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : (((i)object).d() ? new SimpleDateFormat("yyyyMMddHHmmss") : (((i)object).i() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH")));
                    ((DateFormat)object2).setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
                }
                if (((i)object).c()) {
                    char c2;
                    int n4;
                    object = string2.substring(14);
                    for (n4 = 1; n4 < ((String)object).length() && '0' <= (c2 = ((String)object).charAt(n4)) && c2 <= '9'; ++n4) {
                    }
                    if (n4 - 1 > 3) {
                        object = ((String)object).substring(0, 4) + ((String)object).substring(n4);
                        string2 = string2.substring(0, 14) + (String)object;
                    } else if (n4 - 1 == 1) {
                        object = ((String)object).substring(0, n4) + "00" + ((String)object).substring(n4);
                        string2 = string2.substring(0, 14) + (String)object;
                    } else if (n4 - 1 == 2) {
                        object = ((String)object).substring(0, n4) + "0" + ((String)object).substring(n4);
                        string2 = string2.substring(0, 14) + (String)object;
                    }
                }
                if (timeZone.inDaylightTime(((DateFormat)object2).parse(string2))) {
                    n3 += string.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException parseException) {}
        return "GMT" + string + i.a(n3) + ":" + i.a(n2);
    }

    private static String a(int n2) {
        if (n2 < 10) {
            return "0".concat(String.valueOf(n2));
        }
        return Integer.toString(n2);
    }

    protected final boolean c() {
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            if (this.a[i2] != 46 || i2 != 14) continue;
            return true;
        }
        return false;
    }

    protected final boolean d() {
        return this.b(12) && this.b(13);
    }

    protected final boolean i() {
        return this.b(10) && this.b(11);
    }

    private boolean b(int n2) {
        return this.a.length > n2 && this.a[n2] >= 48 && this.a[n2] <= 57;
    }

    final boolean a() {
        return false;
    }

    int e() {
        int n2 = this.a.length;
        return 1 + bz.a(n2) + n2;
    }

    void a(r r2) {
        r2.a(24, this.a);
    }

    final u f() {
        return new av(this.a);
    }

    final boolean a(u u2) {
        if (!(u2 instanceof i)) {
            return false;
        }
        return org.bouncycastle.e.a.a(this.a, ((i)u2).a);
    }

    public int hashCode() {
        return org.bouncycastle.e.a.c(this.a);
    }
}

