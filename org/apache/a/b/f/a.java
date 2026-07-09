/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.f;

import com.a.a.b.ai;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.apache.a.b.f.b;

public final class a {
    private static final String[] a = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private static final Date b;
    private static TimeZone c;

    public static Date a(String string, String[] stringArray) {
        ai.a(string, "Date value");
        stringArray = stringArray != null ? stringArray : a;
        Date date = b;
        if (string.length() > 1 && string.startsWith("'") && string.endsWith("'")) {
            string = string.substring(1, string.length() - 1);
        }
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Cloneable cloneable = org.apache.a.b.f.b.a(stringArray[i2]);
            cloneable.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            cloneable = cloneable.parse(string, parsePosition);
            if (parsePosition.getIndex() == 0) continue;
            return cloneable;
        }
        return null;
    }

    static {
        c = TimeZone.getTimeZone("GMT");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(c);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        b = calendar.getTime();
    }
}

