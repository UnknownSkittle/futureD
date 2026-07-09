/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.io.SerializationException;
import io.jsonwebtoken.io.Serializer;
import io.jsonwebtoken.lang.Classes;
import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.lang.DateFormats;
import io.jsonwebtoken.lang.Objects;
import io.jsonwebtoken.lang.Strings;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class OrgJsonSerializer<T>
implements Serializer<T> {
    private static final String JSON_WRITER_CLASS_NAME = "org.json.JSONWriter";
    private static final Class[] VALUE_TO_STRING_ARG_TYPES = new Class[]{Object.class};
    private static final String JSON_STRING_CLASS_NAME = "org.json.JSONString";
    private static final Class JSON_STRING_CLASS = Classes.isAvailable("org.json.JSONString") ? Classes.forName("org.json.JSONString") : null;

    @Override
    public byte[] serialize(T t2) throws SerializationException {
        try {
            Object o2 = this.toJSONInstance(t2);
            return this.toBytes(o2);
        } catch (SerializationException se) {
            throw se;
        } catch (Exception e2) {
            String msg = "Unable to serialize object of type " + t2.getClass().getName() + " to JSON: " + e2.getMessage();
            throw new SerializationException(msg, e2);
        }
    }

    private static boolean isJSONString(Object o2) {
        if (JSON_STRING_CLASS != null) {
            return JSON_STRING_CLASS.isInstance(o2);
        }
        return false;
    }

    private Object toJSONInstance(Object object) {
        if (object == null) {
            return JSONObject.NULL;
        }
        if (object instanceof JSONObject || object instanceof JSONArray || JSONObject.NULL.equals(object) || OrgJsonSerializer.isJSONString(object) || object instanceof Byte || object instanceof Character || object instanceof Short || object instanceof Integer || object instanceof Long || object instanceof Boolean || object instanceof Float || object instanceof Double || object instanceof String || object instanceof BigInteger || object instanceof BigDecimal || object instanceof Enum) {
            return object;
        }
        if (object instanceof Calendar) {
            object = ((Calendar)object).getTime();
        }
        if (object instanceof Date) {
            Date date = (Date)object;
            return DateFormats.formatIso8601(date);
        }
        if (object instanceof byte[]) {
            return Encoders.BASE64.encode((byte[])object);
        }
        if (object instanceof char[]) {
            return new String((char[])object);
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            return this.toJSONObject(map);
        }
        if (object instanceof Collection) {
            Collection coll = (Collection)object;
            return this.toJSONArray(coll);
        }
        if (Objects.isArray(object)) {
            List c2 = Collections.arrayToList(object);
            return this.toJSONArray(c2);
        }
        String msg = "Unable to serialize object of type " + object.getClass().getName() + " to JSON using known heuristics.";
        throw new SerializationException(msg);
    }

    private JSONObject toJSONObject(Map<?, ?> m2) {
        JSONObject obj = new JSONObject();
        for (Map.Entry<?, ?> entry : m2.entrySet()) {
            Object k2 = entry.getKey();
            Object value = entry.getValue();
            String key = String.valueOf(k2);
            value = this.toJSONInstance(value);
            obj.put(key, value);
        }
        return obj;
    }

    private JSONArray toJSONArray(Collection c2) {
        JSONArray array = new JSONArray();
        for (Object o2 : c2) {
            o2 = this.toJSONInstance(o2);
            array.put(o2);
        }
        return array;
    }

    protected byte[] toBytes(Object o2) {
        String s2 = o2 instanceof JSONObject ? o2.toString() : (String)Classes.invokeStatic(JSON_WRITER_CLASS_NAME, "valueToString", VALUE_TO_STRING_ARG_TYPES, o2);
        return s2.getBytes(Strings.UTF_8);
    }
}

