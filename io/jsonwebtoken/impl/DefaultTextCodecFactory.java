/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.impl.AndroidBase64Codec;
import io.jsonwebtoken.impl.Base64Codec;
import io.jsonwebtoken.impl.TextCodec;
import io.jsonwebtoken.impl.TextCodecFactory;

@Deprecated
public class DefaultTextCodecFactory
implements TextCodecFactory {
    protected String getSystemProperty(String key) {
        return System.getProperty(key);
    }

    protected boolean isAndroid() {
        String name = this.getSystemProperty("java.vm.name");
        if (name != null) {
            String lcase = name.toLowerCase();
            return lcase.contains("dalvik");
        }
        name = this.getSystemProperty("java.vm.vendor");
        if (name != null) {
            String lcase = name.toLowerCase();
            return lcase.contains("android");
        }
        return false;
    }

    @Override
    public TextCodec getTextCodec() {
        if (this.isAndroid()) {
            return new AndroidBase64Codec();
        }
        return new Base64Codec();
    }
}

