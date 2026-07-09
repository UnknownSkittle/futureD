/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.UnaryOperator;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2A
implements UnaryOperator<String> {
    private final int 2;
    private final int 1;
    public static final boolean \u2006;
    private final int 0;

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object apply(Object object) {
        StringBuilder stringBuilder;
        boolean bl2;
        block3: {
            bl2 = \u2006;
            if (bl2) return null;
            if (bl2) return null;
            Object object2 = (String)object;
            object = this;
            if (bl2) return null;
            if (bl2) return null;
            stringBuilder = new StringBuilder();
            if (bl2) return null;
            char[] cArray = ((String)object2).toCharArray();
            object2 = cArray;
            int n2 = cArray.length;
            String[] stringArray = 7b.0();
            if (bl2) return null;
            int n3 = (int)((long)-1709434596 ^ (long)-1709434596);
            if (bl2) return null;
            do {
                block5: {
                    Object object3;
                    block4: {
                        if (bl2) return null;
                        if (n3 >= n2) break block3;
                        if (bl2) return null;
                        object3 = object2[n3];
                        if (object3 < ((2A)object).1) break block4;
                        if (bl2) return null;
                        if (object3 > ((2A)object).0) break block4;
                        if (bl2) return null;
                        if (bl2) return null;
                        stringBuilder.append((char)(object3 + ((2A)object).2));
                        if (bl2) return null;
                        if (stringArray != null) break block5;
                        if (bl2) return null;
                    }
                    if (bl2) return null;
                    stringBuilder.append((char)object3);
                    if (bl2) return null;
                }
                if (bl2) return null;
                ++n3;
                if (bl2) return null;
            } while (stringArray != null);
            if (bl2) return null;
        }
        if (bl2) return null;
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private 2A(int n2, int n3, int n4) {
        block3: {
            block2: {
                boolean bl2 = \u2006;
                if (bl2 || bl2) break block2;
                this.1 = n2;
                if (bl2 || bl2) break block2;
                this.0 = n3;
                if (bl2 || bl2) break block2;
                this.2 = n4;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /* synthetic */ 2A(int n2, int n3, int n4, byte by2) {
        boolean bl2 = \u2006;
        this(n2, n3, n4);
    }
}

