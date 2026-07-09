/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.lang;

import io.jsonwebtoken.lang.Assert;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormats {
    private static final String ISO_8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String ISO_8601_MILLIS_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final ThreadLocal<DateFormat> ISO_8601 = new ThreadLocal<DateFormat>(){

        @Override
        protected DateFormat initialValue() {
            SimpleDateFormat format = new SimpleDateFormat(DateFormats.ISO_8601_PATTERN);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            return format;
        }
    };
    private static final ThreadLocal<DateFormat> ISO_8601_MILLIS = new ThreadLocal<DateFormat>(){

        @Override
        protected DateFormat initialValue() {
            SimpleDateFormat format = new SimpleDateFormat(DateFormats.ISO_8601_MILLIS_PATTERN);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            return format;
        }
    };

    public static String formatIso8601(Date date) {
        return DateFormats.formatIso8601(date, true);
    }

    public static String formatIso8601(Date date, boolean includeMillis) {
        if (includeMillis) {
            return ISO_8601_MILLIS.get().format(date);
        }
        return ISO_8601.get().format(date);
    }

    public static Date parseIso8601Date(String s2) throws ParseException {
        Assert.notNull(s2, "String argument cannot be null.");
        if (s2.lastIndexOf(46) > -1) {
            return ISO_8601_MILLIS.get().parse(s2);
        }
        return ISO_8601.get().parse(s2);
    }
}

