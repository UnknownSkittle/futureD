/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.io;

import io.jsonwebtoken.io.DecodingException;
import java.util.Arrays;

final class Base64 {
    private static final char[] BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final char[] BASE64URL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    private static final int[] BASE64_IALPHABET = new int[256];
    private static final int[] BASE64URL_IALPHABET = new int[256];
    private static final int IALPHABET_MAX_INDEX = BASE64_IALPHABET.length - 1;
    static final Base64 DEFAULT;
    static final Base64 URL_SAFE;
    private final boolean urlsafe;
    private final char[] ALPHABET;
    private final int[] IALPHABET;

    private Base64(boolean urlsafe) {
        this.urlsafe = urlsafe;
        this.ALPHABET = urlsafe ? BASE64URL_ALPHABET : BASE64_ALPHABET;
        this.IALPHABET = urlsafe ? BASE64URL_IALPHABET : BASE64_IALPHABET;
    }

    private String getName() {
        return this.urlsafe ? "base64url" : "base64";
    }

    private char[] encodeToChar(byte[] sArr, boolean lineSep) {
        int sLen;
        int n2 = sLen = sArr != null ? sArr.length : 0;
        if (sLen == 0) {
            return new char[0];
        }
        int eLen = sLen / 3 * 3;
        int left = sLen - eLen;
        int cCnt = (sLen - 1) / 3 + 1 << 2;
        int dLen = cCnt + (lineSep ? (cCnt - 1) / 76 << 1 : 0);
        int padCount = 0;
        if (left == 2) {
            padCount = 1;
        } else if (left == 1) {
            padCount = 2;
        }
        char[] dArr = new char[this.urlsafe ? dLen - padCount : dLen];
        int s2 = 0;
        int d2 = 0;
        int cc2 = 0;
        while (s2 < eLen) {
            int i2 = (sArr[s2++] & 0xFF) << 16 | (sArr[s2++] & 0xFF) << 8 | sArr[s2++] & 0xFF;
            dArr[d2++] = this.ALPHABET[i2 >>> 18 & 0x3F];
            dArr[d2++] = this.ALPHABET[i2 >>> 12 & 0x3F];
            dArr[d2++] = this.ALPHABET[i2 >>> 6 & 0x3F];
            dArr[d2++] = this.ALPHABET[i2 & 0x3F];
            if (!lineSep || ++cc2 != 19 || d2 >= dLen - 2) continue;
            dArr[d2++] = 13;
            dArr[d2++] = 10;
            cc2 = 0;
        }
        if (left > 0) {
            int i3 = (sArr[eLen] & 0xFF) << 10 | (left == 2 ? (sArr[sLen - 1] & 0xFF) << 2 : 0);
            dArr[dLen - 4] = this.ALPHABET[i3 >> 12];
            dArr[dLen - 3] = this.ALPHABET[i3 >>> 6 & 0x3F];
            if (left == 2) {
                dArr[dLen - 2] = this.ALPHABET[i3 & 0x3F];
            } else if (!this.urlsafe) {
                dArr[dLen - 2] = 61;
            }
            if (!this.urlsafe) {
                dArr[dLen - 1] = 61;
            }
        }
        return dArr;
    }

    private int ctoi(char c2) {
        int i2;
        int n2 = i2 = c2 > IALPHABET_MAX_INDEX ? -1 : this.IALPHABET[c2];
        if (i2 < 0) {
            String msg = "Illegal " + this.getName() + " character: '" + c2 + "'";
            throw new DecodingException(msg);
        }
        return i2;
    }

    final byte[] decodeFast(char[] sArr) throws DecodingException {
        int sIx;
        int sLen;
        int n2 = sLen = sArr != null ? sArr.length : 0;
        if (sLen == 0) {
            return new byte[0];
        }
        int eIx = sLen - 1;
        for (sIx = 0; sIx < eIx && this.IALPHABET[sArr[sIx]] < 0; ++sIx) {
        }
        while (eIx > 0 && this.IALPHABET[sArr[eIx]] < 0) {
            --eIx;
        }
        int pad = sArr[eIx] == '=' ? (sArr[eIx - 1] == '=' ? 2 : 1) : 0;
        int cCnt = eIx - sIx + 1;
        int sepCnt = sLen > 76 ? (sArr[76] == '\r' ? cCnt / 78 : 0) << 1 : 0;
        int len = ((cCnt - sepCnt) * 6 >> 3) - pad;
        byte[] dArr = new byte[len];
        int d2 = 0;
        int cc2 = 0;
        int eLen = len / 3 * 3;
        while (d2 < eLen) {
            int i2 = this.ctoi(sArr[sIx++]) << 18 | this.ctoi(sArr[sIx++]) << 12 | this.ctoi(sArr[sIx++]) << 6 | this.ctoi(sArr[sIx++]);
            dArr[d2++] = (byte)(i2 >> 16);
            dArr[d2++] = (byte)(i2 >> 8);
            dArr[d2++] = (byte)i2;
            if (sepCnt <= 0 || ++cc2 != 19) continue;
            sIx += 2;
            cc2 = 0;
        }
        if (d2 < len) {
            int i3 = 0;
            int j2 = 0;
            while (sIx <= eIx - pad) {
                i3 |= this.ctoi(sArr[sIx++]) << 18 - j2 * 6;
                ++j2;
            }
            int r2 = 16;
            while (d2 < len) {
                dArr[d2++] = (byte)(i3 >> r2);
                r2 -= 8;
            }
        }
        return dArr;
    }

    final String encodeToString(byte[] sArr, boolean lineSep) {
        return new String(this.encodeToChar(sArr, lineSep));
    }

    static {
        Arrays.fill(BASE64_IALPHABET, -1);
        System.arraycopy(BASE64_IALPHABET, 0, BASE64URL_IALPHABET, 0, BASE64_IALPHABET.length);
        int iS = BASE64_ALPHABET.length;
        for (int i2 = 0; i2 < iS; ++i2) {
            Base64.BASE64_IALPHABET[Base64.BASE64_ALPHABET[i2]] = i2;
            Base64.BASE64URL_IALPHABET[Base64.BASE64URL_ALPHABET[i2]] = i2;
        }
        Base64.BASE64_IALPHABET[61] = 0;
        Base64.BASE64URL_IALPHABET[61] = 0;
        DEFAULT = new Base64(false);
        URL_SAFE = new Base64(true);
    }
}

