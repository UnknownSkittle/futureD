/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.DeserializationException;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class OrgJsonDeserializer
implements Deserializer<Object> {
    @Override
    public Object deserialize(byte[] bytes) throws DeserializationException {
        Assert.notNull(bytes, "JSON byte array cannot be null");
        if (bytes.length == 0) {
            throw new DeserializationException("Invalid JSON: zero length byte array.");
        }
        try {
            String s2 = new String(bytes, Strings.UTF_8);
            return this.parse(s2);
        } catch (Exception e2) {
            String msg = "Invalid JSON: " + e2.getMessage();
            throw new DeserializationException(msg, e2);
        }
    }

    private Object parse(String json) throws JSONException {
        JSONTokener tokener = new JSONTokener(json);
        char c2 = tokener.nextClean();
        tokener.back();
        if (c2 == '{') {
            JSONObject o2 = new JSONObject(tokener);
            return this.toMap(o2);
        }
        if (c2 == '[') {
            JSONArray a2 = new JSONArray(tokener);
            return this.toList(a2);
        }
        Object value = tokener.nextValue();
        return this.convertIfNecessary(value);
    }

    private Map<String, Object> toMap(JSONObject o2) {
        LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
        Iterator<String> iterator = o2.keys();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = o2.get(key);
            value = this.convertIfNecessary(value);
            map.put(key, value);
        }
        return map;
    }

    private List<Object> toList(JSONArray a2) {
        int length = a2.length();
        ArrayList<Object> list = new ArrayList<Object>(length);
        for (int i2 = 0; i2 < length; ++i2) {
            Object value = a2.get(i2);
            value = this.convertIfNecessary(value);
            list.add(value);
        }
        return list;
    }

    private Object convertIfNecessary(Object v2) {
        List<Object> value = v2;
        if (JSONObject.NULL.equals(value)) {
            value = null;
        } else if (value instanceof JSONArray) {
            value = this.toList((JSONArray)((Object)value));
        } else if (value instanceof JSONObject) {
            value = this.toMap((JSONObject)((Object)value));
        }
        return value;
    }
}

