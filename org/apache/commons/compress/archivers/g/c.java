/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.g.d;

final class c {
    private final int[] a;

    private c(int n2) {
        this.a = new int[(1 << n2 + 1) - 1];
        Arrays.fill(this.a, -1);
    }

    private void a(int n2, int n3, int n4, int n5) {
        while (true) {
            if (n4 == 0) {
                if (this.a[n2] == -1) {
                    this.a[n2] = n5;
                    return;
                }
                throw new IllegalArgumentException("Tree value at index " + n2 + " has already been assigned (" + this.a[n2] + ")");
            }
            this.a[n2] = -2;
            n2 = 2 * n2 + 1 + (n3 & 1);
            --n4;
            n3 >>>= 1;
        }
    }

    public final int a(d d2) {
        int n2;
        int n3;
        int n4 = 0;
        while (true) {
            if ((n3 = (int)d2.a(1)) == -1) {
                return -1;
            }
            int n5 = 2 * n4 + 1 + n3;
            n2 = this.a[n5];
            if (n2 != -2) break;
            n4 = n5;
        }
        if (n2 != -1) {
            return n2;
        }
        throw new IOException("The child " + n3 + " of node at index " + n4 + " is not defined");
    }

    static c a(InputStream inputStream, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = inputStream.read() + 1;
        if (n6 == 0) {
            throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
        }
        Object[] objectArray = new byte[n6];
        new DataInputStream(inputStream).readFully((byte[])objectArray);
        int n7 = 0;
        int[] nArray = new int[n2];
        int n8 = 0;
        for (int i2 = 0; i2 < n6; ++i2) {
            n5 = objectArray[i2];
            n4 = ((n5 & 0xF0) >> 4) + 1;
            n3 = (n5 & 0xF) + 1;
            for (int i3 = 0; i3 < n4; ++i3) {
                nArray[n8++] = n3;
            }
            n7 = Math.max(n7, n3);
        }
        objectArray = new int[nArray.length];
        n6 = 0;
        while (n6 < objectArray.length) {
            int n9 = n6++;
            objectArray[n9] = n9;
        }
        n6 = 0;
        int[] nArray2 = new int[nArray.length];
        for (n5 = 0; n5 < nArray.length; ++n5) {
            for (n4 = 0; n4 < nArray.length; ++n4) {
                if (nArray[n4] != n5) continue;
                nArray2[n6] = n5;
                objectArray[n6] = n4;
                ++n6;
            }
        }
        n5 = 0;
        n4 = 0;
        n3 = 0;
        int[] nArray3 = new int[n2];
        --n2;
        while (n2 >= 0) {
            n5 += n4;
            if (nArray2[n2] != n3) {
                n3 = nArray2[n2];
                n4 = 1 << 16 - n3;
            }
            nArray3[objectArray[n2]] = n5;
            --n2;
        }
        c c2 = new c(n7);
        for (n7 = 0; n7 < nArray3.length; ++n7) {
            n6 = nArray[n7];
            if (n6 <= 0) continue;
            c2.a(0, Integer.reverse(nArray3[n7] << 16), n6, n7);
        }
        return c2;
    }
}

