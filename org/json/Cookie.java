/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.json;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Cookie {
    public static String escape(String string) {
        String s2 = string.trim();
        int length = s2.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; ++i2) {
            char c2 = s2.charAt(i2);
            if (c2 < ' ' || c2 == '+' || c2 == '%' || c2 == '=' || c2 == ';') {
                sb.append('%');
                sb.append(Character.forDigit((char)(c2 >>> 4 & 0xF), 16));
                sb.append(Character.forDigit((char)(c2 & 0xF), 16));
                continue;
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject toJSONObject(String string) throws JSONException {
        JSONObject jo2 = new JSONObject();
        JSONTokener x2 = new JSONTokener(string);
        jo2.put("name", x2.nextTo('='));
        x2.next('=');
        jo2.put("value", x2.nextTo(';'));
        x2.next();
        while (x2.more()) {
            Object value;
            String name = Cookie.unescape(x2.nextTo("=;"));
            if (x2.next() != '=') {
                if (!name.equals("secure")) throw x2.syntaxError("Missing '=' in cookie parameter.");
                value = Boolean.TRUE;
            } else {
                value = Cookie.unescape(x2.nextTo(';'));
                x2.next();
            }
            jo2.put(name, value);
        }
        return jo2;
    }

    public static String toString(JSONObject jo2) throws JSONException {
        StringBuilder sb = new StringBuilder();
        sb.append(Cookie.escape(jo2.getString("name")));
        sb.append("=");
        sb.append(Cookie.escape(jo2.getString("value")));
        if (jo2.has("expires")) {
            sb.append(";expires=");
            sb.append(jo2.getString("expires"));
        }
        if (jo2.has("domain")) {
            sb.append(";domain=");
            sb.append(Cookie.escape(jo2.getString("domain")));
        }
        if (jo2.has("path")) {
            sb.append(";path=");
            sb.append(Cookie.escape(jo2.getString("path")));
        }
        if (jo2.optBoolean("secure")) {
            sb.append(";secure");
        }
        return sb.toString();
    }

    public static String unescape(String string) {
        int length = string.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '+') {
                c2 = ' ';
            } else if (c2 == '%' && i2 + 2 < length) {
                int d2 = JSONTokener.dehexchar(string.charAt(i2 + 1));
                int e2 = JSONTokener.dehexchar(string.charAt(i2 + 2));
                if (d2 >= 0 && e2 >= 0) {
                    c2 = (char)(d2 * 16 + e2);
                    i2 += 2;
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }
}

