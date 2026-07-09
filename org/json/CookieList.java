/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.json;

import org.json.Cookie;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class CookieList {
    public static JSONObject toJSONObject(String string) throws JSONException {
        JSONObject jo2 = new JSONObject();
        JSONTokener x2 = new JSONTokener(string);
        while (x2.more()) {
            String name = Cookie.unescape(x2.nextTo('='));
            x2.next('=');
            jo2.put(name, Cookie.unescape(x2.nextTo(';')));
            x2.next();
        }
        return jo2;
    }

    public static String toString(JSONObject jo2) throws JSONException {
        boolean b2 = false;
        StringBuilder sb = new StringBuilder();
        for (String key : jo2.keySet()) {
            Object value = jo2.opt(key);
            if (JSONObject.NULL.equals(value)) continue;
            if (b2) {
                sb.append(';');
            }
            sb.append(Cookie.escape(key));
            sb.append("=");
            sb.append(Cookie.escape(value.toString()));
            b2 = true;
        }
        return sb.toString();
    }
}

