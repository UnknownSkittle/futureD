/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.DateFormats;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class JwtMap
implements Map<String, Object> {
    private final Map<String, Object> map = new LinkedHashMap<String, Object>();

    public JwtMap() {
    }

    public JwtMap(Map<String, Object> map) {
        this();
        Assert.notNull(map, "Map argument cannot be null.");
        this.putAll((Map<? extends String, ?>)map);
    }

    protected String getString(String name) {
        Object v2 = this.get(name);
        return v2 != null ? String.valueOf(v2) : null;
    }

    protected static Date toDate(Object v2, String name) {
        if (v2 == null) {
            return null;
        }
        if (v2 instanceof Date) {
            return (Date)v2;
        }
        if (v2 instanceof Calendar) {
            return ((Calendar)v2).getTime();
        }
        if (v2 instanceof Number) {
            long millis = ((Number)v2).longValue();
            return new Date(millis);
        }
        if (v2 instanceof String) {
            return JwtMap.parseIso8601Date((String)v2, name);
        }
        throw new IllegalStateException("Cannot create Date from '" + name + "' value '" + v2 + "'.");
    }

    private static Date parseIso8601Date(String s2, String name) throws IllegalArgumentException {
        try {
            return DateFormats.parseIso8601Date(s2);
        } catch (ParseException e2) {
            String msg = "'" + name + "' value does not appear to be ISO-8601-formatted: " + s2;
            throw new IllegalArgumentException(msg, e2);
        }
    }

    protected static Date toSpecDate(Object v2, String name) {
        if (v2 == null) {
            return null;
        }
        if (v2 instanceof Number) {
            long seconds = ((Number)v2).longValue();
            v2 = seconds * 1000L;
        } else if (v2 instanceof String) {
            try {
                long seconds = Long.parseLong((String)v2);
                v2 = seconds * 1000L;
            } catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return JwtMap.toDate(v2, name);
    }

    protected void setValue(String name, Object v2) {
        if (v2 == null) {
            this.map.remove(name);
        } else {
            this.map.put(name, v2);
        }
    }

    @Deprecated
    protected void setDate(String name, Date d2) {
        if (d2 == null) {
            this.map.remove(name);
        } else {
            long seconds = d2.getTime() / 1000L;
            this.map.put(name, seconds);
        }
    }

    protected Object setDateAsSeconds(String name, Date d2) {
        if (d2 == null) {
            return this.map.remove(name);
        }
        long seconds = d2.getTime() / 1000L;
        return this.map.put(name, seconds);
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean containsKey(Object o2) {
        return this.map.containsKey(o2);
    }

    @Override
    public boolean containsValue(Object o2) {
        return this.map.containsValue(o2);
    }

    @Override
    public Object get(Object o2) {
        return this.map.get(o2);
    }

    @Override
    public Object put(String s2, Object o2) {
        if (o2 == null) {
            return this.map.remove(s2);
        }
        return this.map.put(s2, o2);
    }

    @Override
    public Object remove(Object o2) {
        return this.map.remove(o2);
    }

    @Override
    public void putAll(Map<? extends String, ?> m2) {
        if (m2 == null) {
            return;
        }
        for (String string : m2.keySet()) {
            this.put(string, m2.get(string));
        }
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    public String toString() {
        return this.map.toString();
    }

    @Override
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.map.equals(obj);
    }
}

