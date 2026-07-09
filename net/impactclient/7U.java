/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 7U {
    public static final boolean \u2004\u2009\u200d\u200b\u200f;
    private final InputStream 0;

    /*
     * Enabled aggressive block sorting
     */
    public 7U(InputStream inputStream) {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2009\u200d\u200b\u200f;
                if (bl2 || bl2) break block2;
                this.0 = inputStream;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String 0() {
        StringJoiner stringJoiner;
        block3: {
            block2: {
                boolean bl2 = \u2004\u2009\u200d\u200b\u200f;
                if (bl2 || bl2) break block2;
                stringJoiner = new StringJoiner(0rB$1f.XNZw("\u0ad4", -390517260));
                if (bl2 || bl2) break block2;
                this.1().forEach(stringJoiner::add);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return stringJoiner.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<String> 1() {
        boolean bl2 = \u2004\u2009\u200d\u200b\u200f;
        if (bl2) return null;
        try {
            if (bl2) return null;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.0));
            List<String> list = bufferedReader.lines().collect(Collectors.toList());
            if (bl2 || bl2) return null;
            bufferedReader.close();
            if (bl2 || bl2) return null;
            return list;
        } catch (IOException iOException) {
            if (bl2 || bl2) return null;
            return new ArrayList<String>();
        }
    }
}

