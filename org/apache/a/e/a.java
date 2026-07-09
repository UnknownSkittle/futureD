/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.Arrays;
import org.apache.a.n;

public class a
extends InterruptedIOException {
    private final n a;

    public a() {
        this.a = null;
    }

    public a(String string) {
        super(string);
        this.a = null;
    }

    public a(IOException iOException, n n2, InetAddress ... inetAddressArray) {
        super("Connect to " + (n2 != null ? n2.e() : "remote host") + (inetAddressArray != null && inetAddressArray.length > 0 ? " " + Arrays.asList(inetAddressArray) : "") + (iOException.getMessage() != null ? " failed: " + iOException.getMessage() : " timed out"));
        this.a = n2;
        this.initCause(iOException);
    }
}

