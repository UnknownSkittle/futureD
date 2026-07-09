/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.at;

final class l
implements as {
    private final Charset a;
    private final boolean b;
    private static final byte[] c = new byte[]{63};
    private static final String d = "?";
    private static final char[] e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    l(Charset charset, boolean bl2) {
        this.a = charset;
        this.b = bl2;
    }

    @Override
    public final boolean a(String string) {
        return super.a().canEncode(string);
    }

    @Override
    public final ByteBuffer b(String charSequence) {
        CharsetEncoder charsetEncoder = this.a();
        charSequence = CharBuffer.wrap(charSequence);
        CharBuffer charBuffer = null;
        int n2 = ((Buffer)((Object)charSequence)).remaining();
        Object object = charsetEncoder;
        float f2 = ((CharsetEncoder)object).maxBytesPerChar();
        float f3 = (float)(n2 - 1) * ((CharsetEncoder)object).averageBytesPerChar();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)Math.ceil(f2 + f3));
        while (((Buffer)((Object)charSequence)).remaining() > 0) {
            int n3;
            CoderResult coderResult = charsetEncoder.encode((CharBuffer)charSequence, byteBuffer, false);
            if (coderResult.isUnmappable() || coderResult.isMalformed()) {
                if (l.a(charsetEncoder, 6 * coderResult.length()) > byteBuffer.remaining()) {
                    int n4;
                    n3 = 0;
                    for (n4 = ((Buffer)((Object)charSequence)).position(); n4 < ((Buffer)((Object)charSequence)).limit(); ++n4) {
                        n3 += !charsetEncoder.canEncode(((CharBuffer)charSequence).get(n4)) ? 6 : 1;
                    }
                    n4 = l.a(charsetEncoder, n3);
                    byteBuffer = at.a(byteBuffer, n4 - byteBuffer.remaining());
                }
                if (charBuffer == null) {
                    charBuffer = CharBuffer.allocate(6);
                }
                for (n3 = 0; n3 < coderResult.length(); ++n3) {
                    n2 = ((CharBuffer)charSequence).get();
                    object = charBuffer;
                    ((CharBuffer)object).position(0).limit(6);
                    ((CharBuffer)object).put('%');
                    ((CharBuffer)object).put('U');
                    ((CharBuffer)object).put(e[n2 >> 12 & 0xF]);
                    ((CharBuffer)object).put(e[n2 >> 8 & 0xF]);
                    ((CharBuffer)object).put(e[n2 >> 4 & 0xF]);
                    ((CharBuffer)object).put(e[n2 & 0xF]);
                    ((CharBuffer)object).flip();
                    Object object2 = object;
                    object = charsetEncoder;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    while (((Buffer)object2).hasRemaining()) {
                        if (!((CharsetEncoder)object).encode((CharBuffer)object2, byteBuffer2, false).isOverflow()) continue;
                        int n5 = l.a((CharsetEncoder)object, ((Buffer)object2).remaining());
                        byteBuffer2 = at.a(byteBuffer2, n5);
                    }
                    byteBuffer = byteBuffer2;
                }
                continue;
            }
            if (!coderResult.isOverflow()) continue;
            n3 = l.a(charsetEncoder, ((Buffer)((Object)charSequence)).remaining());
            byteBuffer = at.a(byteBuffer, n3);
        }
        charsetEncoder.encode((CharBuffer)charSequence, byteBuffer, true);
        ByteBuffer byteBuffer3 = byteBuffer;
        byteBuffer3.limit(byteBuffer3.position());
        byteBuffer.rewind();
        return byteBuffer;
    }

    @Override
    public final String a(byte[] byArray) {
        l l2 = this;
        return (!l2.b ? l2.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT) : l2.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith(d)).decode(ByteBuffer.wrap(byArray)).toString();
    }

    private CharsetEncoder a() {
        if (this.b) {
            return this.a.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith(c);
        }
        return this.a.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    }

    private static int a(CharsetEncoder charsetEncoder, int n2) {
        return (int)Math.ceil((float)n2 * charsetEncoder.averageBytesPerChar());
    }
}

