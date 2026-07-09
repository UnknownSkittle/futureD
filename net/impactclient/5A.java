/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  org.lwjgl.BufferUtils
 */
package net.impactclient;

import java.nio.IntBuffer;
import java.util.function.BiFunction;
import net.impactclient.1A;
import net.impactclient.7b;
import org.lwjgl.BufferUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5A {
    public final int 0;
    final int 1;
    public static final boolean \u2001\u2005\u2005\u2006\u2006\u2004;
    final int 2;

    /*
     * Enabled aggressive block sorting
     */
    private 5A(int n2, int n3, int n4) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2005\u2005\u2006\u2006\u2004;
                if (bl2 || bl2) break block2;
                this.0 = n2;
                if (bl2 || bl2) break block2;
                this.1 = n3;
                if (bl2 || bl2) break block2;
                this.2 = n4;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static 5A 0(BiFunction<Integer, Integer, Integer> biFunction) {
        int[] nArray;
        boolean bl2;
        block2: {
            bl2 = \u2001\u2005\u2005\u2006\u2006\u2004;
            if (bl2) return null;
            if (bl2) return null;
            biFunction = biFunction.andThen(1A::0);
            if (bl2) return null;
            if (bl2) return null;
            nArray = new int[(int)((long)-1918373049 ^ (long)-1918414377)];
            if (bl2) return null;
            int n2 = (int)((long)-1390029952 ^ (long)-1390029952);
            String[] stringArray = 7b.0();
            if (bl2) return null;
            do {
                block4: {
                    block3: {
                        if (bl2) return null;
                        if (n2 >= (int)((long)-40284980 ^ (long)-40285184)) break block2;
                        if (bl2) return null;
                        if (bl2) return null;
                        int n3 = (int)((long)1617954744 ^ (long)1617954744);
                        if (bl2) return null;
                        do {
                            if (bl2) return null;
                            if (n3 >= (int)((long)-2001028367 ^ (long)-2001028547)) break block3;
                            if (bl2) return null;
                            if (bl2) return null;
                            nArray[n3 * (int)((long)-815437695 ^ (long)-815437747) + n2] = biFunction.apply(n2, n3);
                            if (bl2) return null;
                            if (bl2) return null;
                            ++n3;
                            if (bl2) return null;
                            if (stringArray == null) break block4;
                            if (bl2) return null;
                        } while (stringArray != null);
                        if (bl2) return null;
                    }
                    if (bl2) return null;
                    ++n2;
                    if (bl2) return null;
                }
                if (bl2) return null;
            } while (stringArray != null);
            if (bl2) return null;
        }
        if (bl2) return null;
        return new 5A(nArray, (int)((long)-1738603111 ^ (long)-1738603179), (int)((long)1328033272 ^ (long)1328033076));
    }

    public 5A(int[] object, int n2, int n3) {
        boolean bl2 = \u2001\u2005\u2005\u2006\u2006\u2004;
        this(bus.A(), n2, n3);
        object = (IntBuffer)BufferUtils.createIntBuffer((int)(n2 * n3)).put((int[])object).flip();
        bus.i((int)this.0);
        bus.b((int)((int)((long)41898951 ^ (long)41901606)), (int)((int)((long)1363883749 ^ (long)1363877604)), (int)((int)((long)-671120737 ^ (long)-671112034)));
        bus.b((int)((int)((long)724081697 ^ (long)724079040)), (int)((int)((long)-623734449 ^ (long)-623724209)), (int)((int)((long)-261027743 ^ (long)-261018016)));
        bus.b((int)((int)((long)743936863 ^ (long)743939774)), (int)((int)((long)-1507755551 ^ (long)-1507765789)), (int)((int)((long)-1004920733 ^ (long)-1004926622)));
        bus.b((int)((int)((long)-1562953009 ^ (long)-1562953938)), (int)((int)((long)670680583 ^ (long)670690820)), (int)((int)((long)-1319002349 ^ (long)-1318996462)));
        bus.g((int)((int)((long)-1007804930 ^ (long)-1007808245)), (int)((int)((long)-1433119789 ^ (long)-1433119790)));
        bus.a((int)((int)((long)1129780306 ^ (long)1129781683)), (int)((int)((long)619959171 ^ (long)619959171)), (int)((int)((long)1681220073 ^ (long)1681252785)), (int)n2, (int)n3, (int)((int)((long)1062434669 ^ (long)1062434669)), (int)((int)((long)2137538102 ^ (long)2137532222)), (int)((int)((long)-850601553 ^ (long)-850604626)), (IntBuffer)object);
        bus.i((int)((int)((long)-841558789 ^ (long)-841558789)));
    }
}

