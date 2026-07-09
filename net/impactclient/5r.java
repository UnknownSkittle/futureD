/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
package net.impactclient;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import net.impactclient.5d;
import org.apache.commons.io.IOUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5r {
    public final byte[] 1;
    public final short 0;
    public static final boolean \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T> T 0(Type type) {
        boolean bl2 = \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return 5d.0(this.0(), type);
        } catch (JsonSyntaxException | IllegalStateException | NullPointerException runtimeException) {
            if (bl2 || bl2) return null;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JsonElement 1() {
        boolean bl2 = \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return 5d.0(this.0());
        } catch (JsonSyntaxException | IllegalStateException | NullPointerException runtimeException) {
            if (bl2 || bl2) return null;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 5r(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        block8: {
            block7: {
                boolean bl2 = \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;
                if (bl2 || bl2) break block7;
                this.0 = (short)httpURLConnection.getResponseCode();
                if (!bl2 && !bl2) break block8;
            }
            return;
        }
        if (httpURLConnection.getErrorStream() != null) {
            inputStream = httpURLConnection.getErrorStream();
            if (\u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001) {
                throw null;
            }
        } else {
            inputStream = httpURLConnection.getInputStream();
        }
        this.1 = IOUtils.toByteArray((InputStream)inputStream);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T> T 0(Class<T> clazz) {
        boolean bl2 = \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return 5d.0(this.0(), clazz);
        } catch (JsonSyntaxException | IllegalStateException | NullPointerException runtimeException) {
            if (bl2 || bl2) return null;
            return null;
        }
    }

    public final String 0() {
        boolean bl2 = \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return new String(this.1, StandardCharsets.UTF_8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 2() {
        boolean bl2 = \u200a\u2007\u2007\u2008\u200c\u2004\u200f\u200e\u2001;
        if (bl2 || bl2) return true;
        if (this.0 / (int)((long)-38572489 ^ (long)-38572461) == (int)((long)876748635 ^ (long)876748633)) {
            if (bl2) return true;
            return (int)((long)-1867121257 ^ (long)-1867121258) != 0;
        }
        if (!bl2) return (int)((long)-1023282398 ^ (long)-1023282398) != 0;
        return true;
    }
}

