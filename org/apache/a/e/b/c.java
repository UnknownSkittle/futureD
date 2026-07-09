/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.b;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.a.e.b.a;
import org.apache.a.n;

public final class c
implements a {
    private static c a = new c();

    public static c b() {
        return a;
    }

    @Override
    public final Socket a() {
        return new Socket();
    }

    @Override
    public final Socket a(int n2, Socket socket, n n3, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        Socket socket2 = socket = socket != null ? socket : new Socket();
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, n2);
        } catch (IOException iOException) {
            try {
                socket.close();
            } catch (IOException iOException2) {}
            throw iOException;
        }
        return socket;
    }
}

