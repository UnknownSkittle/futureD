/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.a.a.b.a;

import com.a.a.ag;
import com.a.a.b.a.au;
import com.a.a.d.a;
import java.sql.Timestamp;
import java.util.Date;

final class av
extends ag<Timestamp> {
    private /* synthetic */ ag a;
    private /* synthetic */ au b;

    av(au au2, ag ag2) {
        this.b = au2;
        this.a = ag2;
    }

    @Override
    public final /* synthetic */ Object read(a object) {
        if ((object = (Date)this.a.read((a)object)) != null) {
            return new Timestamp(((Date)object).getTime());
        }
        return null;
    }
}

