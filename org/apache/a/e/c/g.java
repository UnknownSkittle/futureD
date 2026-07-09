/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.c;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.security.auth.x500.X500Principal;
import org.apache.a.e.b.b;
import org.apache.a.e.c.d;
import org.apache.a.e.d.f;
import org.apache.a.n;
import org.apache.commons.c.a;
import org.apache.commons.c.c;

public final class g
implements b {
    private final a a = org.apache.commons.c.c.b(this.getClass());
    private final SSLSocketFactory b;
    private final HostnameVerifier c;
    private final String[] d;
    private final String[] e;

    private static HostnameVerifier c() {
        return new d(f.a());
    }

    public static g b() {
        return new g(ai.a(), g.c());
    }

    public g(SSLContext sSLContext, HostnameVerifier hostnameVerifier) {
        this(ai.a(sSLContext, "SSL context").getSocketFactory(), hostnameVerifier);
    }

    private g(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.b = ai.a(sSLSocketFactory, "SSL socket factory");
        this.d = null;
        this.e = null;
        this.c = hostnameVerifier != null ? hostnameVerifier : g.c();
    }

    @Override
    public final Socket a() {
        return SocketFactory.getDefault().createSocket();
    }

    @Override
    public final Socket a(int n2, Socket socket, n n3, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        ai.a(n3, "HTTP host");
        ai.a(inetSocketAddress, "Remote address");
        Socket socket2 = socket = socket != null ? socket : SocketFactory.getDefault().createSocket();
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            if (n2 > 0 && socket.getSoTimeout() == 0) {
                socket.setSoTimeout(n2);
            }
            if (this.a.a()) {
                this.a.a("Connecting socket to " + inetSocketAddress + " with timeout " + n2);
            }
            socket.connect(inetSocketAddress, n2);
        } catch (IOException iOException) {
            try {
                socket.close();
            } catch (IOException iOException2) {}
            throw iOException;
        }
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket)socket;
            this.a.a("Starting handshake");
            sSLSocket.startHandshake();
            this.a(sSLSocket, n3.a());
            return socket;
        }
        return this.a(socket, n3.a(), inetSocketAddress.getPort());
    }

    @Override
    public final Socket a(Socket socket, String string, int n2) {
        socket = (SSLSocket)this.b.createSocket(socket, string, n2, true);
        String[] stringArray = ((SSLSocket)socket).getEnabledProtocols();
        ArrayList<String> arrayList = new ArrayList<String>(stringArray.length);
        for (String string2 : stringArray) {
            if (string2.startsWith("SSL")) continue;
            arrayList.add(string2);
        }
        if (!arrayList.isEmpty()) {
            ArrayList<String> arrayList2 = arrayList;
            ((SSLSocket)socket).setEnabledProtocols(arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (this.a.a()) {
            this.a.a("Enabled protocols: " + Arrays.asList(((SSLSocket)socket).getEnabledProtocols()));
            this.a.a("Enabled cipher suites:" + Arrays.asList(((SSLSocket)socket).getEnabledCipherSuites()));
        }
        this.a.a("Starting handshake");
        ((SSLSocket)socket).startHandshake();
        this.a((SSLSocket)socket, string);
        return socket;
    }

    private void a(SSLSocket sSLSocket, String string) {
        try {
            List list2;
            SSLSession sSLSession = sSLSocket.getSession();
            if (sSLSession == null) {
                sSLSocket.getInputStream().available();
                sSLSession = sSLSocket.getSession();
                if (sSLSession == null) {
                    sSLSocket.startHandshake();
                    sSLSession = sSLSocket.getSession();
                }
            }
            if (sSLSession == null) {
                throw new SSLHandshakeException("SSL session not available");
            }
            if (this.a.a()) {
                this.a.a("Secure session established");
                this.a.a(" negotiated protocol: " + sSLSession.getProtocol());
                this.a.a(" negotiated cipher suite: " + sSLSession.getCipherSuite());
                try {
                    Serializable serializable;
                    X509Certificate x509Certificate = (X509Certificate)sSLSession.getPeerCertificates()[0];
                    list2 = x509Certificate.getSubjectX500Principal();
                    this.a.a(" peer principal: " + ((X500Principal)((Object)list2)).toString());
                    list2 = x509Certificate.getSubjectAlternativeNames();
                    if (list2 != null) {
                        serializable = new ArrayList();
                        for (ArrayList<String> arrayList : list2) {
                            if (arrayList.isEmpty()) continue;
                            serializable.add((String)arrayList.get(1));
                        }
                        this.a.a(" peer alternative names: ".concat(String.valueOf(serializable)));
                    }
                    serializable = x509Certificate.getIssuerX500Principal();
                    this.a.a(" issuer principal: " + ((X500Principal)serializable).toString());
                    list2 = x509Certificate.getIssuerAlternativeNames();
                    if (list2 != null) {
                        ArrayList<String> arrayList;
                        arrayList = new ArrayList<String>();
                        for (List list2 : list2) {
                            if (list2.isEmpty()) continue;
                            arrayList.add((String)list2.get(1));
                        }
                        this.a.a(" issuer alternative names: ".concat(String.valueOf(arrayList)));
                    }
                } catch (Exception exception) {}
            }
            if (!this.c.verify(string, sSLSession)) {
                list2 = org.apache.a.e.c.d.a((X509Certificate)sSLSession.getPeerCertificates()[0]);
                throw new SSLPeerUnverifiedException("Certificate for <" + string + "> doesn't match any of the subject alternative names: " + list2);
            }
            return;
        } catch (IOException iOException) {
            try {
                sSLSocket.close();
            } catch (Exception exception) {}
            throw iOException;
        }
    }
}

