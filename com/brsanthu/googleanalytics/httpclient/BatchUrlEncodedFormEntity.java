/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.httpclient;

import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.a.b.f.d;
import org.apache.a.g.e;
import org.apache.a.g.g;
import org.apache.a.y;

public class BatchUrlEncodedFormEntity
extends g {
    public BatchUrlEncodedFormEntity(List<List<y>> list) {
        super(BatchUrlEncodedFormEntity.constructCombinedEntityString(list), e.a("application/x-www-form-urlencoded"));
    }

    private static String constructCombinedEntityString(List<List<y>> object) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        while (object.hasNext()) {
            List list = (List)object.next();
            stringBuilder.append(d.a(list, StandardCharsets.UTF_8));
            stringBuilder.append("\r\n");
        }
        return stringBuilder.toString();
    }
}

