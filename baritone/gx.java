/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 */
package baritone;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gx {
    public final int a;
    private final byte[] a;
    public final int b;

    private gx(int n2) {
        this.a = n2;
        this.a = gx.a(this.a);
        this.b = this.a.length;
    }

    private static byte[] a(int n2) {
        ByteArrayList byteArrayList = new ByteArrayList();
        while ((n2 & 0x80) != 0) {
            byteArrayList.add((byte)(n2 & 0x7F | 0x80));
            n2 >>>= 7;
        }
        byteArrayList.add((byte)n2);
        return byteArrayList.toByteArray();
    }

    public static gx a(byte[] byArray, int n2) {
        byte by2;
        int n3 = 0;
        int n4 = 0;
        do {
            by2 = byArray[n2++];
            n3 |= (by2 & 0x7F) << n4++ * 7;
            if (n4 <= 5) continue;
            throw new IllegalArgumentException("VarInt size cannot exceed 5 bytes");
        } while ((by2 & 0x80) != 0);
        return new gx(n3);
    }
}

