/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Iterator;
import org.apache.commons.compress.archivers.g.as;
import org.apache.commons.compress.archivers.g.l;

public abstract class at {
    static final as a = at.a("UTF8");

    public static as a(String string) {
        boolean bl2;
        Charset charset;
        block7: {
            charset = Charset.defaultCharset();
            if (string != null) {
                try {
                    charset = Charset.forName(string);
                } catch (UnsupportedCharsetException unsupportedCharsetException) {}
            }
            if ((string = charset.name()) == null) {
                string = Charset.defaultCharset().name();
            }
            if (StandardCharsets.UTF_8.name().equalsIgnoreCase(string)) {
                bl2 = true;
            } else {
                Iterator<String> iterator = StandardCharsets.UTF_8.aliases().iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().equalsIgnoreCase(string)) continue;
                    bl2 = true;
                    break block7;
                }
                bl2 = false;
            }
        }
        boolean bl3 = bl2;
        return new l(charset, bl3);
    }

    static ByteBuffer a(ByteBuffer byteBuffer, int n2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.limit(byteBuffer2.position());
        byteBuffer.rewind();
        ByteBuffer byteBuffer3 = ByteBuffer.allocate(byteBuffer.capacity() + n2);
        byteBuffer3.put(byteBuffer);
        return byteBuffer3;
    }
}

