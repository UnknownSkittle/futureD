/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.github.ImpactDevelopment.installer.utils;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class Fetcher$1
implements X509TrustManager {
    Fetcher$1() {
    }

    @Override
    public final X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override
    public final void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public final void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }
}

