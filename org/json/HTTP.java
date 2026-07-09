/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.json;

import java.util.Locale;
import org.json.HTTPTokener;
import org.json.JSONException;
import org.json.JSONObject;

public class HTTP {
    public static final String CRLF = "\r\n";

    public static JSONObject toJSONObject(String string) throws JSONException {
        JSONObject jo2 = new JSONObject();
        HTTPTokener x2 = new HTTPTokener(string);
        String token = x2.nextToken();
        if (token.toUpperCase(Locale.ROOT).startsWith("HTTP")) {
            jo2.put("HTTP-Version", token);
            jo2.put("Status-Code", x2.nextToken());
            jo2.put("Reason-Phrase", x2.nextTo('\u0000'));
            x2.next();
        } else {
            jo2.put("Method", token);
            jo2.put("Request-URI", x2.nextToken());
            jo2.put("HTTP-Version", x2.nextToken());
        }
        while (x2.more()) {
            String name = x2.nextTo(':');
            x2.next(':');
            jo2.put(name, x2.nextTo('\u0000'));
            x2.next();
        }
        return jo2;
    }

    public static String toString(JSONObject jo2) throws JSONException {
        StringBuilder sb = new StringBuilder();
        if (jo2.has("Status-Code") && jo2.has("Reason-Phrase")) {
            sb.append(jo2.getString("HTTP-Version"));
            sb.append(' ');
            sb.append(jo2.getString("Status-Code"));
            sb.append(' ');
            sb.append(jo2.getString("Reason-Phrase"));
        } else if (jo2.has("Method") && jo2.has("Request-URI")) {
            sb.append(jo2.getString("Method"));
            sb.append(' ');
            sb.append('\"');
            sb.append(jo2.getString("Request-URI"));
            sb.append('\"');
            sb.append(' ');
            sb.append(jo2.getString("HTTP-Version"));
        } else {
            throw new JSONException("Not enough material for an HTTP header.");
        }
        sb.append(CRLF);
        for (String key : jo2.keySet()) {
            String value = jo2.optString(key);
            if ("HTTP-Version".equals(key) || "Status-Code".equals(key) || "Reason-Phrase".equals(key) || "Method".equals(key) || "Request-URI".equals(key) || JSONObject.NULL.equals(value)) continue;
            sb.append(key);
            sb.append(": ");
            sb.append(jo2.optString(key));
            sb.append(CRLF);
        }
        sb.append(CRLF);
        return sb.toString();
    }
}

